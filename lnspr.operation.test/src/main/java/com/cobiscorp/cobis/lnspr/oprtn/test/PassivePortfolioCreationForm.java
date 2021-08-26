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

public class PassivePortfolioCreationForm{
	public static final OperationEntity operationEntity = Singleton.getInstance(OperationEntity.class);
	public static final OperationCRUDFormEntity operationCRUDFormEntity = Singleton.getInstance(OperationCRUDFormEntity.class);

	public static final GridDebtorEntity gridDebtorEntity = Singleton.getInstance(GridDebtorEntity.class);
	private PassivePortfolioCreationForm() {
		throw new IllegalStateException("PassivePortfolioCreationForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroup2522IdGPASSIVEOLI739899 lytGroup2522IdGPASSIVEOLI739899 = Singleton.getInstance(LytGroup2522IdGPASSIVEOLI739899.class);
		
		public static class LytGroup2522IdGPASSIVEOLI739899 extends COBISCollapsable {
			public LytGroup2522IdGPASSIVEOLI739899(){
				this.init("G_PASSIVEOLI_739899", "Datos Adicionales");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVAVABUTTONWNJI5490899IdVAVAVABUTTONWNJI5490899 btnVAVAVABUTTONWNJI5490899IdVAVAVABUTTONWNJI5490899 = Singleton.getInstance(BtnVAVAVABUTTONWNJI5490899IdVAVAVABUTTONWNJI5490899.class);
		
		public static class BtnVAVAVABUTTONWNJI5490899IdVAVAVABUTTONWNJI5490899 extends COBISButton{
			public BtnVAVAVABUTTONWNJI5490899IdVAVAVABUTTONWNJI5490899 () {
				this.init("VA_VAVABUTTONWNJI5_490899", "Crear");
			}
		}
	
		public static final BtnVAVAVABUTTONTWR88356899IdVAVAVABUTTONTWR88356899 btnVAVAVABUTTONTWR88356899IdVAVAVABUTTONTWR88356899 = Singleton.getInstance(BtnVAVAVABUTTONTWR88356899IdVAVAVABUTTONTWR88356899.class);
		
		public static class BtnVAVAVABUTTONTWR88356899IdVAVAVABUTTONTWR88356899 extends COBISButton{
			public BtnVAVAVABUTTONTWR88356899IdVAVAVABUTTONTWR88356899 () {
				this.init("VA_VAVABUTTONTWR88_356899", "Añadir");
			}
		}
	

	}
	

	public static class OperationEntity {
	
		private OperationEntity() {
			throw new IllegalStateException("PassivePortfolioCreationForm is a utility class");
		}
		
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final TypeOperation typeOperation = Singleton.getInstance(TypeOperation.class);
		public static final Money money = Singleton.getInstance(Money.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final AmountApproved amountApproved = Singleton.getInstance(AmountApproved.class);
		public static final Official official = Singleton.getInstance(Official.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final Ubication ubication = Singleton.getInstance(Ubication.class);
		public static final CreationDate creationDate = Singleton.getInstance(CreationDate.class);
		public static final PlazoDescripcion plazoDescripcion = Singleton.getInstance(PlazoDescripcion.class);
		public static final Plazo plazo = Singleton.getInstance(Plazo.class);
		public static final ExpirationDate expirationDate = Singleton.getInstance(ExpirationDate.class);
		public static final CreditLine creditLine = Singleton.getInstance(CreditLine.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final FirstDueDate firstDueDate = Singleton.getInstance(FirstDueDate.class);
		public static final CreditorType creditorType = Singleton.getInstance(CreditorType.class);
		public static final ContractNumber contractNumber = Singleton.getInstance(ContractNumber.class);
		public static final RegistrationNumber registrationNumber = Singleton.getInstance(RegistrationNumber.class);
		public static final DebtType debtType = Singleton.getInstance(DebtType.class);
		public static final AuthDate authDate = Singleton.getInstance(AuthDate.class);
		public static final AuthNumber authNumber = Singleton.getInstance(AuthNumber.class);
		public static final FormReposition formReposition = Singleton.getInstance(FormReposition.class);
		public static final SubFinancing subFinancing = Singleton.getInstance(SubFinancing.class);
		public static final FinanMarket finanMarket = Singleton.getInstance(FinanMarket.class);
		public static final FacilityNumber facilityNumber = Singleton.getInstance(FacilityNumber.class);

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_OPERATIONYWWUDJ_859899","Operacion");
			}
		}			

		public static class TypeOperation extends COBISDropDownList {
			public TypeOperation() {
				this.init("VA_TYPEOPERATIONNN_137899","TipoOperacion");
			}
		}			

		public static class Money extends COBISDropDownList {
			public Money() {
				this.init("VA_MONEYSNJCKOMHID_471899","Moneda");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTFVWTEWBDA_761899","Monto");
			}
		}			

		public static class AmountApproved extends COBISInputValue {
			public AmountApproved() {
				this.init("VA_AMOUNTAPPROVDEE_937899","MontoAprobado");
			}
		}			

		public static class Official extends COBISDropDownList {
			public Official() {
				this.init("VA_OFFICIALFUSJDJB_630899","Oficial");
			}
		}			

		public static class Office extends COBISDropDownList {
			public Office() {
				this.init("VA_OFFICEFTYXFMUWA_267899","Oficina");
			}
		}			

		public static class Ubication extends COBISDropDownList {
			public Ubication() {
				this.init("VA_UBICATIONEIZYDH_113899","Ubicacion");
			}
		}			

		public static class CreationDate extends COBISDatePicker {
			public CreationDate() {
				this.init("VA_CREATIONDATEDVN_632899","FechaCreacion");
			}
		}			

		public static class PlazoDescripcion extends COBISDropDownList {
			public PlazoDescripcion() {
				this.init("VA_PLAZODESCRIPCNC_494899","TipoPlazo");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_PLAZOAJHVDBJBNP_804899","Plazo");
			}
		}			

		public static class ExpirationDate extends COBISDatePicker {
			public ExpirationDate() {
				this.init("VA_EXPIRATIONDAEET_351899","FechaVencimiento");
			}
		}			

		public static class CreditLine extends COBISInputTextButton {
			public CreditLine() {
				this.init("VA_CREDITLINEGFBUT_718899","LineaFinanciamiento");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_STATELEDEROPZZD_753899","Estado");
			}
		}			

		public static class FirstDueDate extends COBISDatePicker {
			public FirstDueDate() {
				this.init("VA_FIRSTDUEDATEVNP_681899","Fechade1erVencimiento");
			}
		}			

		public static class CreditorType extends COBISDropDownList {
			public CreditorType() {
				this.init("VA_CREDITORTYPEQDV_936899","TipoAcreedor");
			}
		}			

		public static class ContractNumber extends COBISInputValue {
			public ContractNumber() {
				this.init("VA_CONTRACTNUMBEEE_151899","NumeroContrato");
			}
		}			

		public static class RegistrationNumber extends COBISInputValue {
			public RegistrationNumber() {
				this.init("VA_REGISTRATIONUEN_556899","NoRegistro");
			}
		}			

		public static class DebtType extends COBISDropDownList {
			public DebtType() {
				this.init("VA_DEBTTYPELMRNXVE_296899","TipoDeuda");
			}
		}			

		public static class AuthDate extends COBISDatePicker {
			public AuthDate() {
				this.init("VA_AUTHDATEYLPRROK_349899","FechaAutorizacionSB");
			}
		}			

		public static class AuthNumber extends COBISInputValue {
			public AuthNumber() {
				this.init("VA_AUTHNUMBERRKGNG_331899","NoAutorizacionSB");
			}
		}			

		public static class FormReposition extends COBISDropDownList {
			public FormReposition() {
				this.init("VA_REPOSITIONJNYRG_258899","FormaReposicion");
			}
		}			

		public static class SubFinancing extends COBISDropDownList {
			public SubFinancing() {
				this.init("VA_SUBFINANCINGPJK_364899","CausaFinanciamientoSubordinado");
			}
		}			

		public static class FinanMarket extends COBISDropDownList {
			public FinanMarket() {
				this.init("VA_FINANMARKETQOEM_575899","MercadoObjetivodelFinanciamiento");
			}
		}			

		public static class FacilityNumber extends COBISInputValue {
			public FacilityNumber() {
				this.init("VA_FACILITYNUMBEER_954899","FacilityNumber");
			}
		}			
	}

	public static class OperationCRUDFormEntity {
	
		private OperationCRUDFormEntity() {
			throw new IllegalStateException("PassivePortfolioCreationForm is a utility class");
		}
		
		public static final Code code = Singleton.getInstance(Code.class);
		public static final FullName fullName = Singleton.getInstance(FullName.class);

		public static class Code extends COBISInputTextButton {
			public Code() {
				this.init("VA_CODEKUNNZDIHWDU_476899","CodFondeador");
			}
		}			

		public static class FullName extends COBISInputValue {
			public FullName() {
				this.init("VA_FULLNAMEHFSGXTT_914899","NombreFondeador");
			}
		}			
	}
	
	public static class GridDebtorEntity extends COBISGrid {
		public GridDebtorEntity() {
			this.init("QV_MV07_KFL31", "QV_MV07_KFL31");
		} 

		public static final Role role = Singleton.getInstance(Role.class);
		public static final FullName fullName = Singleton.getInstance(FullName.class);
		public static final IdNumber idNumber = Singleton.getInstance(IdNumber.class);
		public static final Code code = Singleton.getInstance(Code.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final Score score = Singleton.getInstance(Score.class);

		public static class Role extends COBISInputValue {
			public Role() {
				this.init("VA_ROLEKRZYEYCGEMZ_493899","Rol");
			}
		}			

		public static class FullName extends COBISInputValue {
			public FullName() {
				this.init("VA_FULLNAMEASFGYGC_205899","Nombre");
			}
		}			

		public static class IdNumber extends COBISInputValue {
			public IdNumber() {
				this.init("VA_IDNUMBEREAURXON_346899","CedulaRuc");
			}
		}			

		public static class Code extends COBISInputValue {
			public Code() {
				this.init("VA_CODEYUQMXPUKHJW_271899","Codigo");
			}
		}			

		public static class Type extends COBISInputValue {
			public Type() {
				this.init("VA_TYPEALOQVQDBAGH_716899","Tipo");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_DESCRIPTIONARHH_765899","Descripcion");
			}
		}			

		public static class Score extends COBISInputValue {
			public Score() {
				this.init("VA_SCOREFNDGTNGQSC_412899","Score");
			}
		}			
	}
}
