/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.scoutsfev.cudu.db.tables.CargoAsociado;


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
public class CargoAsociadoRecord extends UpdatableRecordImpl<CargoAsociadoRecord> implements Record2<Integer, Integer> {

	private static final long serialVersionUID = 867606178;

	/**
	 * Setter for <code>public.cargo_asociado.cargo_id</code>.
	 */
	public void setCargoId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.cargo_asociado.cargo_id</code>.
	 */
	public Integer getCargoId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.cargo_asociado.asociado_id</code>.
	 */
	public void setAsociadoId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.cargo_asociado.asociado_id</code>.
	 */
	public Integer getAsociadoId() {
		return (Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return CargoAsociado.CARGO_ASOCIADO.CARGO_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return CargoAsociado.CARGO_ASOCIADO.ASOCIADO_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getCargoId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getAsociadoId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CargoAsociadoRecord value1(Integer value) {
		setCargoId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CargoAsociadoRecord value2(Integer value) {
		setAsociadoId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CargoAsociadoRecord values(Integer value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CargoAsociadoRecord
	 */
	public CargoAsociadoRecord() {
		super(CargoAsociado.CARGO_ASOCIADO);
	}

	/**
	 * Create a detached, initialised CargoAsociadoRecord
	 */
	public CargoAsociadoRecord(Integer cargoId, Integer asociadoId) {
		super(CargoAsociado.CARGO_ASOCIADO);

		setValue(0, cargoId);
		setValue(1, asociadoId);
	}
}