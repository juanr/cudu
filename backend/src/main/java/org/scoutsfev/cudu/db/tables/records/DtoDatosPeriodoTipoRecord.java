/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.scoutsfev.cudu.db.tables.DtoDatosPeriodoTipo;


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
public class DtoDatosPeriodoTipoRecord extends TableRecordImpl<DtoDatosPeriodoTipoRecord> implements Record4<Integer, Long, Long, Long> {

	private static final long serialVersionUID = 1345586799;

	/**
	 * Setter for <code>public.dto_datos_periodo_tipo.periodo</code>.
	 */
	public void setPeriodo(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.dto_datos_periodo_tipo.periodo</code>.
	 */
	public Integer getPeriodo() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.dto_datos_periodo_tipo.jovenes</code>.
	 */
	public void setJovenes(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.dto_datos_periodo_tipo.jovenes</code>.
	 */
	public Long getJovenes() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>public.dto_datos_periodo_tipo.voluntarios</code>.
	 */
	public void setVoluntarios(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.dto_datos_periodo_tipo.voluntarios</code>.
	 */
	public Long getVoluntarios() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>public.dto_datos_periodo_tipo.total</code>.
	 */
	public void setTotal(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.dto_datos_periodo_tipo.total</code>.
	 */
	public Long getTotal() {
		return (Long) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Long, Long, Long> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Long, Long, Long> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return DtoDatosPeriodoTipo.DTO_DATOS_PERIODO_TIPO.PERIODO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return DtoDatosPeriodoTipo.DTO_DATOS_PERIODO_TIPO.JOVENES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return DtoDatosPeriodoTipo.DTO_DATOS_PERIODO_TIPO.VOLUNTARIOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return DtoDatosPeriodoTipo.DTO_DATOS_PERIODO_TIPO.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getPeriodo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getJovenes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getVoluntarios();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoDatosPeriodoTipoRecord value1(Integer value) {
		setPeriodo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoDatosPeriodoTipoRecord value2(Long value) {
		setJovenes(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoDatosPeriodoTipoRecord value3(Long value) {
		setVoluntarios(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoDatosPeriodoTipoRecord value4(Long value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DtoDatosPeriodoTipoRecord values(Integer value1, Long value2, Long value3, Long value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DtoDatosPeriodoTipoRecord
	 */
	public DtoDatosPeriodoTipoRecord() {
		super(DtoDatosPeriodoTipo.DTO_DATOS_PERIODO_TIPO);
	}

	/**
	 * Create a detached, initialised DtoDatosPeriodoTipoRecord
	 */
	public DtoDatosPeriodoTipoRecord(Integer periodo, Long jovenes, Long voluntarios, Long total) {
		super(DtoDatosPeriodoTipo.DTO_DATOS_PERIODO_TIPO);

		setValue(0, periodo);
		setValue(1, jovenes);
		setValue(2, voluntarios);
		setValue(3, total);
	}
}