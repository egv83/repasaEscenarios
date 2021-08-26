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

public class LoanLineCreationForm{
	public static final LoanLinesCreation loanLinesCreation = Singleton.getInstance(LoanLinesCreation.class);

	private LoanLineCreationForm() {
		throw new IllegalStateException("LoanLineCreationForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVABUTTONBWOPFCN144412IdVAVABUTTONBWOPFCN144412 btnVAVABUTTONBWOPFCN144412IdVAVABUTTONBWOPFCN144412 = Singleton.getInstance(BtnVAVABUTTONBWOPFCN144412IdVAVABUTTONBWOPFCN144412.class);
		
		public static class BtnVAVABUTTONBWOPFCN144412IdVAVABUTTONBWOPFCN144412 extends COBISButton{
			public BtnVAVABUTTONBWOPFCN144412IdVAVABUTTONBWOPFCN144412 () {
				this.init("VA_VABUTTONBWOPFCN_144412", "Guardar");
			}
		}
	

	}
	

	public static class LoanLinesCreation {
	
		private LoanLinesCreation() {
			throw new IllegalStateException("LoanLineCreationForm is a utility class");
		}
		
		public static final Nature nature = Singleton.getInstance(Nature.class);
		public static final TramitNumber tramitNumber = Singleton.getInstance(TramitNumber.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final LineCode lineCode = Singleton.getInstance(LineCode.class);
		public static final Estado estado = Singleton.getInstance(Estado.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final Official official = Singleton.getInstance(Official.class);
		public static final Ubication ubication = Singleton.getInstance(Ubication.class);
		public static final CustomerName customerName = Singleton.getInstance(CustomerName.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final Coin coin = Singleton.getInstance(Coin.class);
		public static final StartDate startDate = Singleton.getInstance(StartDate.class);
		public static final DaysNumber daysNumber = Singleton.getInstance(DaysNumber.class);
		public static final DueDate dueDate = Singleton.getInstance(DueDate.class);
		public static final Rotary rotary = Singleton.getInstance(Rotary.class);
		public static final Sector sector = Singleton.getInstance(Sector.class);
		public static final Used used = Singleton.getInstance(Used.class);
		public static final Available available = Singleton.getInstance(Available.class);

		public static class Nature extends COBISRadioButtonList {
			public Nature() {
				this.init("VA_NATURALEZAOPFBV_807412","Naturaleza");
			}
		}			

		public static class TramitNumber extends COBISInputValue {
			public TramitNumber() {
				this.init("VA_TRAMITNUMBEROVG_770412","NumerodeTramite");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_SECUENCIALIFYOH_707412","Secuencial");
			}
		}			

		public static class LineCode extends COBISInputValue {
			public LineCode() {
				this.init("VA_CUPOMXKFKFAVAGK_116412","CodLinea");
			}
		}			

		public static class Estado extends COBISDropDownList {
			public Estado() {
				this.init("VA_ESTADOOBXCIHITT_296412","Estado");
			}
		}			

		public static class Office extends COBISDropDownList {
			public Office() {
				this.init("VA_OFICINASKKBEPJX_241412","Oficina");
			}
		}			

		public static class Official extends COBISDropDownList {
			public Official() {
				this.init("VA_OFFICIALWHTPNAJ_913412","Oficial");
			}
		}			

		public static class Ubication extends COBISDropDownList {
			public Ubication() {
				this.init("VA_UBICATIONVMLBHG_987412","Ubicacion");
			}
		}			

		public static class CustomerName extends COBISInputTextButton {
			public CustomerName() {
				this.init("VA_CLIENTENOMBREEE_802412","Fondeador");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_MONTODKGETQZTDK_858412","Monto");
			}
		}			

		public static class Coin extends COBISDropDownList {
			public Coin() {
				this.init("VA_MONEDADESCEXVAJ_622412","Moneda");
			}
		}			

		public static class StartDate extends COBISDatePicker {
			public StartDate() {
				this.init("VA_FECHAAPROBACIOO_814412","FechaInicio");
			}
		}			

		public static class DaysNumber extends COBISInputValue {
			public DaysNumber() {
				this.init("VA_NUMDIASKUFOWPOC_532412","NroDias");
			}
		}			

		public static class DueDate extends COBISDatePicker {
			public DueDate() {
				this.init("VA_FECHAVENCIMINOT_231412","FechaVencimiento");
			}
		}			

		public static class Rotary extends COBISDropDownList {
			public Rotary() {
				this.init("VA_ROTATIVAEYDZXHU_984412","Rotativa");
			}
		}			

		public static class Sector extends COBISDropDownList {
			public Sector() {
				this.init("VA_SECTORZLUFUQKJE_186412","Sector");
			}
		}			

		public static class Used extends COBISInputValue {
			public Used() {
				this.init("VA_MONTOUTILIZADDO_817412","Utilizado");
			}
		}			

		public static class Available extends COBISInputValue {
			public Available() {
				this.init("VA_AVAILABLEPJSKML_987412","Disponible");
			}
		}			
	}
}
