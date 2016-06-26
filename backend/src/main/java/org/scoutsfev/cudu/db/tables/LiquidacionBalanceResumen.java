/**
 * This class is generated by jOOQ
 */
package org.scoutsfev.cudu.db.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.scoutsfev.cudu.db.Public;
import org.scoutsfev.cudu.db.tables.records.LiquidacionBalanceResumenRecord;


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
public class LiquidacionBalanceResumen extends TableImpl<LiquidacionBalanceResumenRecord> {

	private static final long serialVersionUID = -792409568;

	/**
	 * The reference instance of <code>public.liquidacion_balance_resumen</code>
	 */
	public static final LiquidacionBalanceResumen LIQUIDACION_BALANCE_RESUMEN = new LiquidacionBalanceResumen();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<LiquidacionBalanceResumenRecord> getRecordType() {
		return LiquidacionBalanceResumenRecord.class;
	}

	/**
	 * The column <code>public.liquidacion_balance_resumen.ronda_id</code>.
	 */
	public final TableField<LiquidacionBalanceResumenRecord, Short> RONDA_ID = createField("ronda_id", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>public.liquidacion_balance_resumen.grupo_id</code>.
	 */
	public final TableField<LiquidacionBalanceResumenRecord, String> GRUPO_ID = createField("grupo_id", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>public.liquidacion_balance_resumen.grupo_nombre</code>.
	 */
	public final TableField<LiquidacionBalanceResumenRecord, String> GRUPO_NOMBRE = createField("grupo_nombre", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>public.liquidacion_balance_resumen.activos</code>.
	 */
	public final TableField<LiquidacionBalanceResumenRecord, Long> ACTIVOS = createField("activos", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.liquidacion_balance_resumen.balance_sin_borradores</code>.
	 */
	public final TableField<LiquidacionBalanceResumenRecord, BigDecimal> BALANCE_SIN_BORRADORES = createField("balance_sin_borradores", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>public.liquidacion_balance_resumen.balance_con_borradores</code>.
	 */
	public final TableField<LiquidacionBalanceResumenRecord, BigDecimal> BALANCE_CON_BORRADORES = createField("balance_con_borradores", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>public.liquidacion_balance_resumen</code> table reference
	 */
	public LiquidacionBalanceResumen() {
		this("liquidacion_balance_resumen", null);
	}

	/**
	 * Create an aliased <code>public.liquidacion_balance_resumen</code> table reference
	 */
	public LiquidacionBalanceResumen(String alias) {
		this(alias, LIQUIDACION_BALANCE_RESUMEN);
	}

	private LiquidacionBalanceResumen(String alias, Table<LiquidacionBalanceResumenRecord> aliased) {
		this(alias, aliased, null);
	}

	private LiquidacionBalanceResumen(String alias, Table<LiquidacionBalanceResumenRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiquidacionBalanceResumen as(String alias) {
		return new LiquidacionBalanceResumen(alias, this);
	}

	/**
	 * Rename this table
	 */
	public LiquidacionBalanceResumen rename(String name) {
		return new LiquidacionBalanceResumen(name, null);
	}
}
