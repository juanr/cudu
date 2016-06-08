/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;
import org.scoutsfev.cudu.db.Public;


/**
 * Convenience access to all sequences in public
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.actividad_id_seq</code>
	 */
	public static final Sequence<Long> ACTIVIDAD_ID_SEQ = new SequenceImpl<Long>("actividad_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.asociado_id_seq</code>
	 */
	public static final Sequence<Long> ASOCIADO_ID_SEQ = new SequenceImpl<Long>("asociado_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.cargo_id_seq</code>
	 */
	public static final Sequence<Long> CARGO_ID_SEQ = new SequenceImpl<Long>("cargo_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.curso_id_seq</code>
	 */
	public static final Sequence<Long> CURSO_ID_SEQ = new SequenceImpl<Long>("curso_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.curso_participante_secuencia_inscripcion_seq</code>
	 */
	public static final Sequence<Long> CURSO_PARTICIPANTE_SECUENCIA_INSCRIPCION_SEQ = new SequenceImpl<Long>("curso_participante_secuencia_inscripcion_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.ficha_id_seq</code>
	 */
	public static final Sequence<Long> FICHA_ID_SEQ = new SequenceImpl<Long>("ficha_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.liquidacion_id_seq</code>
	 */
	public static final Sequence<Long> LIQUIDACION_ID_SEQ = new SequenceImpl<Long>("liquidacion_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
