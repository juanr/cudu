package org.scoutsfev.cudu.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertFalse;

public class AsociadoTests {

    private Grupo grupo;
    private Asociado asociado;

    @Before
    public void setUp() throws Exception {
        grupo = new Grupo("TEST", Asociacion.MEV, "Placeholder", "ABCDEF", 46015, "Valencia", "963400000", "test@example.com");
        asociado = new Asociado(grupo, TipoAsociado.Joven, "Mike", "Wazowski", new Date());
    }

    @Test
    public void por_defecto_un_usuario_esta_activado() throws Exception {
        Assert.assertTrue(asociado.isActivo());
    }

    @Test
    public void por_defecto_un_asociado_no_esta_en_ninguna_rama() throws Exception {
        assertFalse(asociado.isRamaCastores());
        assertFalse(asociado.isRamaLobatos());
        assertFalse(asociado.isRamaExploradores());
        assertFalse(asociado.isRamaPioneros());
        assertFalse(asociado.isRamaRuta());
    }

    @Test
    public void usando_el_ctor_por_defecto_un_usuario_esta_activado() throws Exception {
        Asociado asociado = new Asociado();
        Assert.assertTrue(asociado.isActivo());
    }
}
