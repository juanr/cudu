/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.scoutsfev.cudu.db.tables.LiquidacionGrupos;


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
public class LiquidacionGruposRecord extends TableRecordImpl<LiquidacionGruposRecord> implements Record9<String, Short, String, String, Long, Integer, BigDecimal, Long, Long> {

	private static final long serialVersionUID = -1661256216;

	/**
	 * Setter for <code>public.liquidacion_grupos.ronda_etiqueta</code>.
	 */
	public void setRondaEtiqueta(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.liquidacion_grupos.ronda_etiqueta</code>.
	 */
	public String getRondaEtiqueta() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.liquidacion_grupos.ronda_id</code>.
	 */
	public void setRondaId(Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.liquidacion_grupos.ronda_id</code>.
	 */
	public Short getRondaId() {
		return (Short) getValue(1);
	}

	/**
	 * Setter for <code>public.liquidacion_grupos.grupo_id</code>.
	 */
	public void setGrupoId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.liquidacion_grupos.grupo_id</code>.
	 */
	public String getGrupoId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.liquidacion_grupos.nombre</code>.
	 */
	public void setNombre(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.liquidacion_grupos.nombre</code>.
	 */
	public String getNombre() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.liquidacion_grupos.activos</code>.
	 */
	public void setActivos(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.liquidacion_grupos.activos</code>.
	 */
	public Long getActivos() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>public.liquidacion_grupos.asociacion</code>.
	 */
	public void setAsociacion(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.liquidacion_grupos.asociacion</code>.
	 */
	public Integer getAsociacion() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.liquidacion_grupos.balance</code>.
	 */
	public void setBalance(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.liquidacion_grupos.balance</code>.
	 */
	public BigDecimal getBalance() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>public.liquidacion_grupos.num_liquidaciones</code>.
	 */
	public void setNumLiquidaciones(Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.liquidacion_grupos.num_liquidaciones</code>.
	 */
	public Long getNumLiquidaciones() {
		return (Long) getValue(7);
	}

	/**
	 * Setter for <code>public.liquidacion_grupos.activos_ultima</code>.
	 */
	public void setActivosUltima(Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.liquidacion_grupos.activos_ultima</code>.
	 */
	public Long getActivosUltima() {
		return (Long) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, Short, String, String, Long, Integer, BigDecimal, Long, Long> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, Short, String, String, Long, Integer, BigDecimal, Long, Long> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return LiquidacionGrupos.LIQUIDACION_GRUPOS.RONDA_ETIQUETA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field2() {
		return LiquidacionGrupos.LIQUIDACION_GRUPOS.RONDA_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return LiquidacionGrupos.LIQUIDACION_GRUPOS.GRUPO_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return LiquidacionGrupos.LIQUIDACION_GRUPOS.NOMBRE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return LiquidacionGrupos.LIQUIDACION_GRUPOS.ACTIVOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return LiquidacionGrupos.LIQUIDACION_GRUPOS.ASOCIACION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return LiquidacionGrupos.LIQUIDACION_GRUPOS.BALANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field8() {
		return LiquidacionGrupos.LIQUIDACION_GRUPOS.NUM_LIQUIDACIONES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field9() {
		return LiquidacionGrupos.LIQUIDACION_GRUPOS.ACTIVOS_ULTIMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getRondaEtiqueta();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value2() {
		return getRondaId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getGrupoId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getNombre();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getActivos();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getAsociacion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getBalance();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value8() {
		return getNumLiquidaciones();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value9() {
		return getActivosUltima();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord value1(String value) {
		setRondaEtiqueta(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord value2(Short value) {
		setRondaId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord value3(String value) {
		setGrupoId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord value4(String value) {
		setNombre(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord value5(Long value) {
		setActivos(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord value6(Integer value) {
		setAsociacion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord value7(BigDecimal value) {
		setBalance(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord value8(Long value) {
		setNumLiquidaciones(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord value9(Long value) {
		setActivosUltima(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionGruposRecord values(String value1, Short value2, String value3, String value4, Long value5, Integer value6, BigDecimal value7, Long value8, Long value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LiquidacionGruposRecord
	 */
	public LiquidacionGruposRecord() {
		super(LiquidacionGrupos.LIQUIDACION_GRUPOS);
	}

	/**
	 * Create a detached, initialised LiquidacionGruposRecord
	 */
	public LiquidacionGruposRecord(String rondaEtiqueta, Short rondaId, String grupoId, String nombre, Long activos, Integer asociacion, BigDecimal balance, Long numLiquidaciones, Long activosUltima) {
		super(LiquidacionGrupos.LIQUIDACION_GRUPOS);

		setValue(0, rondaEtiqueta);
		setValue(1, rondaId);
		setValue(2, grupoId);
		setValue(3, nombre);
		setValue(4, activos);
		setValue(5, asociacion);
		setValue(6, balance);
		setValue(7, numLiquidaciones);
		setValue(8, activosUltima);
	}
}