/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DtoDatosGrupoRama implements Serializable {

	private static final long serialVersionUID = -627841490;

	private final String grupoId;
	private final Long   colonia;
	private final Long   manada;
	private final Long   exploradores;
	private final Long   expedicion;
	private final Long   ruta;

	public DtoDatosGrupoRama(DtoDatosGrupoRama value) {
		this.grupoId = value.grupoId;
		this.colonia = value.colonia;
		this.manada = value.manada;
		this.exploradores = value.exploradores;
		this.expedicion = value.expedicion;
		this.ruta = value.ruta;
	}

	public DtoDatosGrupoRama(
		String grupoId,
		Long   colonia,
		Long   manada,
		Long   exploradores,
		Long   expedicion,
		Long   ruta
	) {
		this.grupoId = grupoId;
		this.colonia = colonia;
		this.manada = manada;
		this.exploradores = exploradores;
		this.expedicion = expedicion;
		this.ruta = ruta;
	}

	public String getGrupoId() {
		return this.grupoId;
	}

	public Long getColonia() {
		return this.colonia;
	}

	public Long getManada() {
		return this.manada;
	}

	public Long getExploradores() {
		return this.exploradores;
	}

	public Long getExpedicion() {
		return this.expedicion;
	}

	public Long getRuta() {
		return this.ruta;
	}
}
