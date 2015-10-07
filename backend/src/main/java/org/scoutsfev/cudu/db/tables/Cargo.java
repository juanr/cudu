/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.scoutsfev.cudu.db.Keys;
import org.scoutsfev.cudu.db.Public;
import org.scoutsfev.cudu.db.tables.records.CargoRecord;


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
public class Cargo extends TableImpl<CargoRecord> {

	private static final long serialVersionUID = -1068622952;

	/**
	 * The reference instance of <code>public.cargo</code>
	 */
	public static final Cargo CARGO = new Cargo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CargoRecord> getRecordType() {
		return CargoRecord.class;
	}

	/**
	 * The column <code>public.cargo.id</code>.
	 */
	public final TableField<CargoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.cargo.etiqueta</code>.
	 */
	public final TableField<CargoRecord, String> ETIQUETA = createField("etiqueta", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>public.cargo.ambito</code>.
	 */
	public final TableField<CargoRecord, String> AMBITO = createField("ambito", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.cargo.unico</code>.
	 */
	public final TableField<CargoRecord, Boolean> UNICO = createField("unico", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.cargo.puntos</code>.
	 */
	public final TableField<CargoRecord, Integer> PUNTOS = createField("puntos", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.cargo</code> table reference
	 */
	public Cargo() {
		this("cargo", null);
	}

	/**
	 * Create an aliased <code>public.cargo</code> table reference
	 */
	public Cargo(String alias) {
		this(alias, CARGO);
	}

	private Cargo(String alias, Table<CargoRecord> aliased) {
		this(alias, aliased, null);
	}

	private Cargo(String alias, Table<CargoRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<CargoRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CARGO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CargoRecord> getPrimaryKey() {
		return Keys.PK_CARGO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CargoRecord>> getKeys() {
		return Arrays.<UniqueKey<CargoRecord>>asList(Keys.PK_CARGO);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Cargo as(String alias) {
		return new Cargo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Cargo rename(String name) {
		return new Cargo(name, null);
	}
}