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

public class LoansLineGuaranteesFormForm{
	public static final LoansLineGuarantee loansLineGuarantee = Singleton.getInstance(LoansLineGuarantee.class);

	public static final GridLineGuaranteesAssociatedList gridLineGuaranteesAssociatedList = Singleton.getInstance(GridLineGuaranteesAssociatedList.class);
	public static final GridLineGuaranteesList gridLineGuaranteesList = Singleton.getInstance(GridLineGuaranteesList.class);
	private LoansLineGuaranteesFormForm() {
		throw new IllegalStateException("LoansLineGuaranteesFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVABUTTONQHVCNPG174308IdVAVABUTTONQHVCNPG174308 btnVAVABUTTONQHVCNPG174308IdVAVABUTTONQHVCNPG174308 = Singleton.getInstance(BtnVAVABUTTONQHVCNPG174308IdVAVABUTTONQHVCNPG174308.class);
		
		public static class BtnVAVABUTTONQHVCNPG174308IdVAVABUTTONQHVCNPG174308 extends COBISButton{
			public BtnVAVABUTTONQHVCNPG174308IdVAVABUTTONQHVCNPG174308 () {
				this.init("VA_VABUTTONQHVCNPG_174308", "Buscar");
			}
		}
	
		public static final BtnVAVABUTTONZLYUQVN789308IdVAVABUTTONZLYUQVN789308 btnVAVABUTTONZLYUQVN789308IdVAVABUTTONZLYUQVN789308 = Singleton.getInstance(BtnVAVABUTTONZLYUQVN789308IdVAVABUTTONZLYUQVN789308.class);
		
		public static class BtnVAVABUTTONZLYUQVN789308IdVAVABUTTONZLYUQVN789308 extends COBISButton{
			public BtnVAVABUTTONZLYUQVN789308IdVAVABUTTONZLYUQVN789308 () {
				this.init("VA_VABUTTONZLYUQVN_789308", "Guardar");
			}
		}
	
		public static final BtnVAVABUTTONUIUNGEV823308IdVAVABUTTONUIUNGEV823308 btnVAVABUTTONUIUNGEV823308IdVAVABUTTONUIUNGEV823308 = Singleton.getInstance(BtnVAVABUTTONUIUNGEV823308IdVAVABUTTONUIUNGEV823308.class);
		
		public static class BtnVAVABUTTONUIUNGEV823308IdVAVABUTTONUIUNGEV823308 extends COBISButton{
			public BtnVAVABUTTONUIUNGEV823308IdVAVABUTTONUIUNGEV823308 () {
				this.init("VA_VABUTTONUIUNGEV_823308", "Cancelar");
			}
		}
	

	}
	

	public static class LoansLineGuarantee {
	
		private LoansLineGuarantee() {
			throw new IllegalStateException("LoansLineGuaranteesFormForm is a utility class");
		}
		
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final CodLine codLine = Singleton.getInstance(CodLine.class);
		public static final Client client = Singleton.getInstance(Client.class);
		public static final GuaranteeStatus guaranteeStatus = Singleton.getInstance(GuaranteeStatus.class);
		public static final GuaranteeType guaranteeType = Singleton.getInstance(GuaranteeType.class);
		public static final Guarantee guarantee = Singleton.getInstance(Guarantee.class);
		public static final GuaranteeValue guaranteeValue = Singleton.getInstance(GuaranteeValue.class);
		public static final Type type = Singleton.getInstance(Type.class);

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_1KMHECYCXJEZNWD_230308","Secuencial");
			}
		}			

		public static class CodLine extends COBISInputValue {
			public CodLine() {
				this.init("VA_2HMXCLNCVZZGRKJ_472308","CodLinea");
			}
		}			

		public static class Client extends COBISInputTextButton {
			public Client() {
				this.init("VA_1SNQSNEUKHHSXYG_701308","ClienteGrupo");
			}
		}			

		public static class GuaranteeStatus extends COBISDropDownList {
			public GuaranteeStatus() {
				this.init("VA_2DTPWYLEZNXCMEX_633308","EstadoGarantia");
			}
		}			

		public static class GuaranteeType extends COBISInputTextButton {
			public GuaranteeType() {
				this.init("VA_3IGDRVHQOABVMRS_328308","TipoGarantia");
			}
		}			

		public static class Guarantee extends COBISInputValue {
			public Guarantee() {
				this.init("VA_2MHEKWJSAITISFC_217308","Garantia");
			}
		}			

		public static class GuaranteeValue extends COBISInputValue {
			public GuaranteeValue() {
				this.init("VA_3BMLOOJQDKPUCNG_275308","ValorGarantia");
			}
		}			

		public static class Type extends COBISInputValue {
			public Type() {
				this.init("VA_4VRXBTCJQMVISRJ_539308","Tipo");
			}
		}			
	}
	
	public static class GridLineGuaranteesAssociatedList extends COBISGrid {
		public GridLineGuaranteesAssociatedList() {
			this.init("QV_ZZ84_YVC22", "QV_ZZ84_YVC22");
		} 

		public static final Transact transact = Singleton.getInstance(Transact.class);
		public static final Guarantee guarantee = Singleton.getInstance(Guarantee.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final AdmissionDate admissionDate = Singleton.getInstance(AdmissionDate.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final InitialValue initialValue = Singleton.getInstance(InitialValue.class);
		public static final CurrentValue currentValue = Singleton.getInstance(CurrentValue.class);
		public static final ValueMN valueMN = Singleton.getInstance(ValueMN.class);
		public static final Code code = Singleton.getInstance(Code.class);

		public static class Transact extends COBISInputValue {
			public Transact() {
				this.init("VA_TEXTINPUTBOXFNK_583308","Tramite");
			}
		}			

		public static class Guarantee extends COBISInputValue {
			public Guarantee() {
				this.init("VA_TEXTINPUTBOXYRN_976308","Garantia");
			}
		}			

		public static class Type extends COBISInputValue {
			public Type() {
				this.init("VA_TEXTINPUTBOXCZA_315308","Tipo");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_TEXTINPUTBOXPVD_927308","Estado");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXTHN_169308","Descripcion");
			}
		}			

		public static class AdmissionDate extends COBISDatePicker {
			public AdmissionDate() {
				this.init("VA_DATEFIELDIIIDFM_537308","FechaIngreso");
			}
		}			

		public static class Currency extends COBISInputValue {
			public Currency() {
				this.init("VA_TEXTINPUTBOXBGA_566308","Moneda");
			}
		}			

		public static class InitialValue extends COBISInputValue {
			public InitialValue() {
				this.init("VA_TEXTINPUTBOXVXS_189308","ValorInicial");
			}
		}			

		public static class CurrentValue extends COBISInputValue {
			public CurrentValue() {
				this.init("VA_TEXTINPUTBOXYQI_664308","ValorActual");
			}
		}			

		public static class ValueMN extends COBISInputValue {
			public ValueMN() {
				this.init("VA_TEXTINPUTBOXNMO_402308","ValorMN");
			}
		}			

		public static class Code extends COBISInputValue {
			public Code() {
				this.init("VA_TEXTINPUTBOXXRE_135308","Codigo");
			}
		}			
	}
	
	public static class GridLineGuaranteesList extends COBISGrid {
		public GridLineGuaranteesList() {
			this.init("QV_KB20_UZG21", "QV_KB20_UZG21");
		} 

		public static final Guarantee guarantee = Singleton.getInstance(Guarantee.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final AdmissionDate admissionDate = Singleton.getInstance(AdmissionDate.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final InitialValue initialValue = Singleton.getInstance(InitialValue.class);
		public static final CurrentValue currentValue = Singleton.getInstance(CurrentValue.class);
		public static final MinimumValue minimumValue = Singleton.getInstance(MinimumValue.class);
		public static final Code code = Singleton.getInstance(Code.class);
		public static final Clase clase = Singleton.getInstance(Clase.class);
		public static final ClientGar clientGar = Singleton.getInstance(ClientGar.class);

		public static class Guarantee extends COBISInputValue {
			public Guarantee() {
				this.init("VA_TEXTINPUTBOXRLW_788308","Garantia");
			}
		}			

		public static class Type extends COBISInputValue {
			public Type() {
				this.init("VA_TEXTINPUTBOXIXG_172308","Tipo");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXWDS_313308","Descripcion");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_TEXTINPUTBOXLHS_787308","Estado");
			}
		}			

		public static class AdmissionDate extends COBISDatePicker {
			public AdmissionDate() {
				this.init("VA_DATEFIELDPDUQJV_399308","FechaIngreso");
			}
		}			

		public static class Currency extends COBISInputValue {
			public Currency() {
				this.init("VA_TEXTINPUTBOXWFD_785308","Moneda");
			}
		}			

		public static class InitialValue extends COBISInputValue {
			public InitialValue() {
				this.init("VA_TEXTINPUTBOXPEK_638308","ValorInicial");
			}
		}			

		public static class CurrentValue extends COBISInputValue {
			public CurrentValue() {
				this.init("VA_TEXTINPUTBOXEJK_944308","ValorActual");
			}
		}			

		public static class MinimumValue extends COBISInputValue {
			public MinimumValue() {
				this.init("VA_TEXTINPUTBOXMEW_983308","ValorMN");
			}
		}			

		public static class Code extends COBISInputValue {
			public Code() {
				this.init("VA_TEXTINPUTBOXEPV_806308","Codigo");
			}
		}			

		public static class Clase extends COBISInputValue {
			public Clase() {
				this.init("VA_TEXTINPUTBOXBNW_850308","Clase");
			}
		}			

		public static class ClientGar extends COBISInputValue {
			public ClientGar() {
				this.init("VA_TEXTINPUTBOXBIA_696308","CodCliente");
			}
		}			
	}
}
