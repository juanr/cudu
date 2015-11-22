package org.scoutsfev.cudu.services;

import org.scoutsfev.cudu.domain.*;
import org.scoutsfev.cudu.domain.AsociadoParaAutorizar;
import org.scoutsfev.cudu.storage.AsociadoStorage;
import org.scoutsfev.cudu.storage.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("auth")
public class AuthorizationService {

    private final GrupoRepository grupoRepository;
    private final AsociadoStorage asociadoStorage;

    @Autowired
    public AuthorizationService(AsociadoStorage asociadoStorage, GrupoRepository grupoRepository) {
        this.asociadoStorage = asociadoStorage;
        this.grupoRepository = grupoRepository;
    }

    public boolean puedeEditarAsociado(Integer idAsociado, Usuario usuario) {
        if (idAsociado == null || usuario == null)
            return false;
        AsociadoParaAutorizar asociado = asociadoStorage.obtenerAsociadoParaEvaluarAutorizacion(idAsociado);
        return puedeEditarAsociado(asociado, usuario);
    }

    public boolean puedeEditarAsociado(Asociado asociado, Usuario usuario) {
        if (asociado == null || usuario == null)
            return false;
        AsociadoParaAutorizar asociadoParaAutorizar = new AsociadoParaAutorizar(asociado.getId(), asociado.getGrupoId(), null,
                asociado.isRamaColonia(), asociado.isRamaManada(), asociado.isRamaExploradores(), asociado.isRamaExpedicion(), asociado.isRamaRuta());
        return puedeEditarAsociado(asociadoParaAutorizar, usuario);
    }

    public boolean puedeEditarAsociado(AsociadoParaAutorizar asociado, Usuario usuario) {
        if (asociado == null || usuario == null || usuario.getRestricciones() == null || !usuario.isUsuarioActivo())
            return false;

        if (usuario.getId().equals(asociado.getId()))
            return true;

        if (usuario.getRestricciones().isSoloLectura())
            return false;

        if (esTecnico(usuario)) {
            //noinspection SimplifiableIfStatement
            if (usuario.getAmbitoEdicion() == AmbitoEdicion.Federacion)
                return true;
            return usuario.getAmbitoEdicion() == AmbitoEdicion.Asociacion
                && usuario.getRestricciones() != null && asociado.getAsociacionId() != null && usuario.getRestricciones().getRestriccionAsociacion() != null
                && asociado.getAsociacionId().equals(usuario.getRestricciones().getRestriccionAsociacion().getId());
        }

        // Si no tiene restricciones de rama, comprobar que es del mismo grupo únicamente
        boolean mismoGrupo = asociado.getGrupoId() != null && asociado.getGrupoId().equals(usuario.getGrupo().getId());
        if (usuario.getRestricciones() == null || !usuario.getRestricciones().isNoPuedeEditarOtrasRamas())
            return mismoGrupo;

        // En caso contrario, comprobar que todas las ramas del usuario coinciden con las del asociado
        boolean mismasRamas = usuario.isRamaColonia() == asociado.isRamaColonia()
                && usuario.isRamaManada() == asociado.isRamaManada()
                && usuario.isRamaExploradores() == asociado.isRamaExploradores()
                && usuario.isRamaExpedicion() == asociado.isRamaExpedicion()
                && usuario.isRamaRuta() == asociado.isRamaRuta();

        return mismoGrupo && mismasRamas;
    }

    public boolean puedeEditarUsuariosDelGrupo(String grupoId, Usuario usuario) {
        if (usuario == null || grupoId == null || !usuario.isUsuarioActivo())
            return false;

        if (usuario.getTipo() == TipoAsociado.Tecnico)
        {
            Asociacion restriccionAsociacion = usuario.getRestricciones().getRestriccionAsociacion();
            if (restriccionAsociacion == null)
                return true;

            Grupo grupo = grupoRepository.findOne(grupoId);
            return grupo != null && grupo.getAsociacion() == restriccionAsociacion;
        }

        return (usuario.getTipo() == TipoAsociado.Comite || usuario.getTipo() == TipoAsociado.Kraal)
            && (usuario.getGrupo() != null)
            && !(usuario.getRestricciones() != null && usuario.getRestricciones().tieneAlgunaRestriccion())
            && (grupoId.equals(usuario.getGrupo().getId()));
    }

    public boolean puedeEditarGrupo(Grupo grupo, Usuario usuario) {
        return grupo != null && usuario != null
            && usuario.getGrupo() != null && usuario.getGrupo().getId().equals(grupo.getId())
            && !usuario.getRestricciones().isNoPuedeEditarDatosDelGrupo();
    }

    public boolean puedeAccederLluerna(Usuario usuario) {
        return !(usuario == null || !usuario.isUsuarioActivo() || usuario.getAmbitoEdicion() == null || usuario.getTipo() == null || usuario.getTipo() != TipoAsociado.Tecnico)
            && ((usuario.getAmbitoEdicion() == AmbitoEdicion.Escuela) || (usuario.getAmbitoEdicion() == AmbitoEdicion.Federacion && usuario.getRestricciones() != null && usuario.getRestricciones().getRestriccionAsociacion() == null));
    }

    public boolean esTecnico(Usuario usuario) {
        return !(usuario == null || !usuario.isUsuarioActivo() || usuario.getTipo() == null || usuario.getAmbitoEdicion() == null || usuario.getTipo() != TipoAsociado.Tecnico)
             && (usuario.getAmbitoEdicion() == AmbitoEdicion.Asociacion || usuario.getAmbitoEdicion() == AmbitoEdicion.Federacion);
    }
}
