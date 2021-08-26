/*
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */
package com.cobiscorp.cobis.lnspr.oprtn.test;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.*;

public class AdvancedSearchLoansFormForm{
	public static final LoanSearchFilter loanSearchFilter = Singleton.getInstance(LoanSearchFilter.class);

	private AdvancedSearchLoansFormForm() {
		throw new IllegalStateException("AdvancedSearchLoansFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class LoanSearchFilter {
	
		private LoanSearchFilter() {
			throw new IllegalStateException("AdvancedSearchLoansFormForm is a utility class");
		}
		
		public static final NumProcedures numProcedures = Singleton.getInstance(NumProcedures.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final CodCurrency codCurrency = Singleton.getInstance(CodCurrency.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final MigratedOperation migratedOperation = Singleton.getInstance(MigratedOperation.class);
		public static final Type type = Singleton.getInstance(Type.class);

		public static class NumProcedures extends COBISInputValue {
			public NumProcedures() {
				this.init("VA_NUMPROCEDURESSS_812276","NumTramite");
			}
		}			

		public static class Office extends COBISDropDownList {
			public Office() {
				this.init("VA_OFFICEYONUFLQBK_649276","Oficina");
			}
		}			

		public static class CodCurrency extends COBISDropDownList {
			public CodCurrency() {
				this.init("VA_CODCURRENCYLNFJ_357276","Moneda");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DISBURSEMENTEAE_104276","FechaDesembolso");
			}
		}			

		public static class State extends COBISDropDownList {
			public State() {
				this.init("VA_STATEDKAIXFCWPF_698276","EstadoPrestamo");
			}
		}			

		public static class MigratedOperation extends COBISInputValue {
			public MigratedOperation() {
				this.init("VA_MIGRATEDOPERAII_878276","PrestamoMigrado");
			}
		}			

		public static class Type extends COBISDropDownList {
			public Type() {
				this.init("VA_TYPENAZMALUBWMU_619276","TipoOperacion");
			}
		}			
	}
}
