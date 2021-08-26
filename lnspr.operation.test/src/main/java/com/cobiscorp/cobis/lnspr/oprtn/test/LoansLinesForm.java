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

public class LoansLinesForm{
	public static final LoansLines loansLines = Singleton.getInstance(LoansLines.class);

	public static final GridLoansLinesList gridLoansLinesList = Singleton.getInstance(GridLoansLinesList.class);
	private LoansLinesForm() {
		throw new IllegalStateException("LoansLinesForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVAVABUTTONZS600426383IdVAVAVABUTTONZS600426383 btnVAVAVABUTTONZS600426383IdVAVAVABUTTONZS600426383 = Singleton.getInstance(BtnVAVAVABUTTONZS600426383IdVAVAVABUTTONZS600426383.class);
		
		public static class BtnVAVAVABUTTONZS600426383IdVAVAVABUTTONZS600426383 extends COBISButton{
			public BtnVAVAVABUTTONZS600426383IdVAVAVABUTTONZS600426383 () {
				this.init("VA_VAVABUTTONZS600_426383", "Buscar");
			}
		}
	

	}
	

	public static class LoansLines {
	
		private LoansLines() {
			throw new IllegalStateException("LoansLinesForm is a utility class");
		}
		
		public static final Naturaleza naturaleza = Singleton.getInstance(Naturaleza.class);
		public static final ClienteDesc clienteDesc = Singleton.getInstance(ClienteDesc.class);
		public static final NumLinea numLinea = Singleton.getInstance(NumLinea.class);
		public static final NumTramite numTramite = Singleton.getInstance(NumTramite.class);
		public static final Oficina oficina = Singleton.getInstance(Oficina.class);
		public static final Moneda moneda = Singleton.getInstance(Moneda.class);
		public static final DateIni dateIni = Singleton.getInstance(DateIni.class);
		public static final DateVto dateVto = Singleton.getInstance(DateVto.class);
		public static final NumPrestamo numPrestamo = Singleton.getInstance(NumPrestamo.class);
		public static final Estado estado = Singleton.getInstance(Estado.class);
		public static final Criterios criterios = Singleton.getInstance(Criterios.class);

		public static class Naturaleza extends COBISRadioButtonList {
			public Naturaleza() {
				this.init("VA_NATURALEZAEFWDR_861383","Naturaleza");
			}
		}			

		public static class ClienteDesc extends COBISInputTextButton {
			public ClienteDesc() {
				this.init("VA_CLIENTEDESCMPQT_151383","ClienteGrupo");
			}
		}			

		public static class NumLinea extends COBISInputValue {
			public NumLinea() {
				this.init("VA_NUMLINEACKAOJVB_120383","NumLinea");
			}
		}			

		public static class NumTramite extends COBISInputValue {
			public NumTramite() {
				this.init("VA_NUMTRAMITEUFKMW_361383","NumTramite");
			}
		}			

		public static class Oficina extends COBISDropDownList {
			public Oficina() {
				this.init("VA_OFICINANRBOTWYT_467383","Oficina");
			}
		}			

		public static class Moneda extends COBISDropDownList {
			public Moneda() {
				this.init("VA_MONEDAXWNJSQNUF_555383","Moneda");
			}
		}			

		public static class DateIni extends COBISDatePicker {
			public DateIni() {
				this.init("VA_DATEINIHDUJJRBN_500383","FechaInicio");
			}
		}			

		public static class DateVto extends COBISDatePicker {
			public DateVto() {
				this.init("VA_DATEVTOIOLFWTXY_452383","FechaVencimiento");
			}
		}			

		public static class NumPrestamo extends COBISInputValue {
			public NumPrestamo() {
				this.init("VA_NUMPRESTAMORRMP_430383","NumPrestamo");
			}
		}			

		public static class Estado extends COBISDropDownList {
			public Estado() {
				this.init("VA_ESTADOZXSPUMQFP_238383","Estado");
			}
		}			

		public static class Criterios extends COBISCheckBox {
			public Criterios() {
				this.init("VA_CRITERIOSIKUYOI_982383","CriteriosSecundarios");
			}
		}			
	}
	
	public static class GridLoansLinesList extends COBISGrid {
		public GridLoansLinesList() {
			this.init("QV_OS86_OQI18", "QV_OS86_OQI18");
		} 

		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final LineCod lineCod = Singleton.getInstance(LineCod.class);
		public static final Nature nature = Singleton.getInstance(Nature.class);
		public static final CoinDesc coinDesc = Singleton.getInstance(CoinDesc.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final OfficeCod officeCod = Singleton.getInstance(OfficeCod.class);
		public static final NameClient nameClient = Singleton.getInstance(NameClient.class);
		public static final NameGroup nameGroup = Singleton.getInstance(NameGroup.class);

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXIES_988383","Secuencial");
			}
		}			

		public static class LineCod extends COBISInputValue {
			public LineCod() {
				this.init("VA_TEXTINPUTBOXCKC_418383","NumLinea");
			}
		}			

		public static class Nature extends COBISInputValue {
			public Nature() {
				this.init("VA_TEXTINPUTBOXUZJ_528383","Naturaleza");
			}
		}			

		public static class CoinDesc extends COBISInputValue {
			public CoinDesc() {
				this.init("VA_TEXTINPUTBOXGXX_701383","Moneda");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXQJF_429383","Monto");
			}
		}			

		public static class OfficeCod extends COBISInputValue {
			public OfficeCod() {
				this.init("VA_TEXTINPUTBOXDDQ_431383","Oficina");
			}
		}			

		public static class NameClient extends COBISInputValue {
			public NameClient() {
				this.init("VA_TEXTINPUTBOXXUZ_208383","Cliente");
			}
		}			

		public static class NameGroup extends COBISInputValue {
			public NameGroup() {
				this.init("VA_TEXTINPUTBOXSQY_266383","Grupo");
			}
		}			
	}
}
