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

public class LoansOperationUpdateForm{
	public static final OperationEntity operationEntity = Singleton.getInstance(OperationEntity.class);

	public static final GridSyndicatedList gridSyndicatedList = Singleton.getInstance(GridSyndicatedList.class);
	private LoansOperationUpdateForm() {
		throw new IllegalStateException("LoansOperationUpdateForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroupLayout1590IdGLOANSOPTET690518 lytGroupLayout1590IdGLOANSOPTET690518 = Singleton.getInstance(LytGroupLayout1590IdGLOANSOPTET690518.class);
		
		public static class LytGroupLayout1590IdGLOANSOPTET690518 extends COBISCollapsable {
			public LytGroupLayout1590IdGLOANSOPTET690518(){
				this.init("G_LOANSOPTET_690518", "Datos Generales");
			}
		}
		
		public static final LytGroup1977IdGLOANSOPEDA286518 lytGroup1977IdGLOANSOPEDA286518 = Singleton.getInstance(LytGroup1977IdGLOANSOPEDA286518.class);
		
		public static class LytGroup1977IdGLOANSOPEDA286518 extends COBISCollapsable {
			public LytGroup1977IdGLOANSOPEDA286518(){
				this.init("G_LOANSOPEDA_286518", "Datos Adicionales");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class OperationEntity {
	
		private OperationEntity() {
			throw new IllegalStateException("LoansOperationUpdateForm is a utility class");
		}
		
		public static final TypeOperation typeOperation = Singleton.getInstance(TypeOperation.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final Money money = Singleton.getInstance(Money.class);
		public static final Subsegment subsegment = Singleton.getInstance(Subsegment.class);
		public static final Sector sector = Singleton.getInstance(Sector.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final AmountApproved amountApproved = Singleton.getInstance(AmountApproved.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final FinancialDestination financialDestination = Singleton.getInstance(FinancialDestination.class);
		public static final EconomicActivity economicActivity = Singleton.getInstance(EconomicActivity.class);
		public static final Official official = Singleton.getInstance(Official.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final CreationDate creationDate = Singleton.getInstance(CreationDate.class);
		public static final ExpirationDate expirationDate = Singleton.getInstance(ExpirationDate.class);
		public static final FirstDueDate firstDueDate = Singleton.getInstance(FirstDueDate.class);
		public static final Syndicated syndicated = Singleton.getInstance(Syndicated.class);
		public static final CreditorType creditorType = Singleton.getInstance(CreditorType.class);
		public static final CreditLine creditLine = Singleton.getInstance(CreditLine.class);
		public static final RegistrationNumber registrationNumber = Singleton.getInstance(RegistrationNumber.class);
		public static final ContractNumber contractNumber = Singleton.getInstance(ContractNumber.class);
		public static final DebtType debtType = Singleton.getInstance(DebtType.class);
		public static final AuthDate authDate = Singleton.getInstance(AuthDate.class);
		public static final AuthNumber authNumber = Singleton.getInstance(AuthNumber.class);
		public static final FormReposition formReposition = Singleton.getInstance(FormReposition.class);
		public static final SubFinancing subFinancing = Singleton.getInstance(SubFinancing.class);
		public static final FinanMarket finanMarket = Singleton.getInstance(FinanMarket.class);
		public static final FacilityNumber facilityNumber = Singleton.getInstance(FacilityNumber.class);

		public static class TypeOperation extends COBISComboBox {
			public TypeOperation() {
				this.init("VA_TYPEOPERATIONNN_178518","Tipooperacion");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_OPERATIONACVLVA_383518","NroOperacion");
			}
		}			

		public static class Money extends COBISComboBox {
			public Money() {
				this.init("VA_MONEYYUNMNTCAPG_708518","Moneda");
			}
		}			

		public static class Subsegment extends COBISComboBox {
			public Subsegment() {
				this.init("VA_SUBSEGMENTIHNRO_703518","Subsegmento");
			}
		}			

		public static class Sector extends COBISComboBox {
			public Sector() {
				this.init("VA_SECTORFUBPMDRRG_875518","Sector");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTQYVZWOGGF_373518","Monto");
			}
		}			

		public static class AmountApproved extends COBISInputValue {
			public AmountApproved() {
				this.init("VA_AMOUNTAPPROVEDD_905518","Montoaprobado");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_STATEDJGEIHUNRY_453518","Estado");
			}
		}			

		public static class FinancialDestination extends COBISComboBox {
			public FinancialDestination() {
				this.init("VA_FINANCIALDESNIO_774518","DestinoFinanciero");
			}
		}			

		public static class EconomicActivity extends COBISComboBox {
			public EconomicActivity() {
				this.init("VA_ECONOMICACTIIVV_350518","DestinoEconomico");
			}
		}			

		public static class Official extends COBISDropDownList {
			public Official() {
				this.init("VA_OFFICIALWGEPOTD_393518","Oficial");
			}
		}			

		public static class Office extends COBISComboBox {
			public Office() {
				this.init("VA_OFFICESTHMPCXJO_201518","Oficina");
			}
		}			

		public static class CreationDate extends COBISDatePicker {
			public CreationDate() {
				this.init("VA_CREATIONDATEPOZ_377518","Fechacreacion");
			}
		}			

		public static class ExpirationDate extends COBISDatePicker {
			public ExpirationDate() {
				this.init("VA_EXPIRATIONDAETE_274518","Fechavencimiento");
			}
		}			

		public static class FirstDueDate extends COBISDatePicker {
			public FirstDueDate() {
				this.init("VA_FIRSTDUEDATEPFW_397518","Fechade1ervencimiento");
			}
		}			

		public static class Syndicated extends COBISCheckBox {
			public Syndicated() {
				this.init("VA_SYNDICATEDRJKWH_210518","Sindicado");
			}
		}			

		public static class CreditorType extends COBISInputValue {
			public CreditorType() {
				this.init("VA_CREDITORTYPEBLZ_645518","TipoAcreedor");
			}
		}			

		public static class CreditLine extends COBISInputValue {
			public CreditLine() {
				this.init("VA_CREDITLINEDUXXM_372518","LineaFinanciamiento");
			}
		}			

		public static class RegistrationNumber extends COBISInputValue {
			public RegistrationNumber() {
				this.init("VA_REGISTRATIONURR_119518","NoRegistro");
			}
		}			

		public static class ContractNumber extends COBISInputValue {
			public ContractNumber() {
				this.init("VA_CONTRACTNUMBERR_842518","NumeroContrato");
			}
		}			

		public static class DebtType extends COBISInputValue {
			public DebtType() {
				this.init("VA_DEBTTYPEANMTYAF_618518","TipoDeuda");
			}
		}			

		public static class AuthDate extends COBISDatePicker {
			public AuthDate() {
				this.init("VA_AUTHDATEMFJNOLR_674518","FechaAutorizacionSB");
			}
		}			

		public static class AuthNumber extends COBISInputValue {
			public AuthNumber() {
				this.init("VA_AUTHNUMBERVDCKC_206518","NoAutorizacionSB");
			}
		}			

		public static class FormReposition extends COBISInputValue {
			public FormReposition() {
				this.init("VA_REPOSITIONXBXIX_294518","FormaReposicion");
			}
		}			

		public static class SubFinancing extends COBISInputValue {
			public SubFinancing() {
				this.init("VA_SUBFINANCINGBDK_943518","CausaFinanciamientoSubordinado");
			}
		}			

		public static class FinanMarket extends COBISInputValue {
			public FinanMarket() {
				this.init("VA_FINANMARKETKWUR_337518","MercadoObjetivodelFinanciamiento");
			}
		}			

		public static class FacilityNumber extends COBISInputValue {
			public FacilityNumber() {
				this.init("VA_FACILITYNUMBEEE_816518","FacilityNumber");
			}
		}			
	}
	
	public static class GridSyndicatedList extends COBISGrid {
		public GridSyndicatedList() {
			this.init("QV_GM97_JJJ11", "QV_GM97_JJJ11");
		} 

		public static final CodParticipants codParticipants = Singleton.getInstance(CodParticipants.class);
		public static final NameParticipants nameParticipants = Singleton.getInstance(NameParticipants.class);
		public static final PercentageParticipants percentageParticipants = Singleton.getInstance(PercentageParticipants.class);
		public static final RoleP roleP = Singleton.getInstance(RoleP.class);
		public static final Mail mail = Singleton.getInstance(Mail.class);
		public static final AmountParticipants amountParticipants = Singleton.getInstance(AmountParticipants.class);

		public static class CodParticipants extends COBISInputValue {
			public CodParticipants() {
				this.init("VA_TEXTINPUTBOXHVY_271518","CodParticipante");
			}
		}			

		public static class NameParticipants extends COBISInputValue {
			public NameParticipants() {
				this.init("VA_TEXTINPUTBOXKXI_794518","Nombre");
			}
		}			

		public static class PercentageParticipants extends COBISInputValue {
			public PercentageParticipants() {
				this.init("VA_TEXTINPUTBOXCTZ_403518","Part");
			}
		}			

		public static class RoleP extends COBISInputValue {
			public RoleP() {
				this.init("VA_TEXTINPUTBOXNKA_174518","Rol");
			}
		}			

		public static class Mail extends COBISInputValue {
			public Mail() {
				this.init("VA_TEXTINPUTBOXPKT_357518","Correo");
			}
		}			

		public static class AmountParticipants extends COBISInputValue {
			public AmountParticipants() {
				this.init("VA_TEXTINPUTBOXKNN_414518","MontoPart");
			}
		}			
	}
}
