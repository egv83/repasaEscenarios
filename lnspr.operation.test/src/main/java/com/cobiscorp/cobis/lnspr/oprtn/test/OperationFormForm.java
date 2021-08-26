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

public class OperationFormForm{
	public static final OperationEntity operationEntity = Singleton.getInstance(OperationEntity.class);
	public static final OperationCRUDFormEntity operationCRUDFormEntity = Singleton.getInstance(OperationCRUDFormEntity.class);

	public static final GridSyndicatedList gridSyndicatedList = Singleton.getInstance(GridSyndicatedList.class);
	public static final GridDebtorEntity gridDebtorEntity = Singleton.getInstance(GridDebtorEntity.class);
	private OperationFormForm() {
		throw new IllegalStateException("OperationFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221 btnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221 = Singleton.getInstance(BtnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221.class);
		
		public static class BtnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221 extends COBISButton{
			public BtnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221 () {
				this.init("VA_VABUTTONXCGGMOI_839221", "Crear");
			}
		}
	
		public static final BtnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221 btnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221 = Singleton.getInstance(BtnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221.class);
		
		public static class BtnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221 extends COBISButton{
			public BtnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221 () {
				this.init("VA_VABUTTONVLCBANL_971221", "Añadir");
			}
		}
	

	}
	

	public static class OperationEntity {
	
		private OperationEntity() {
			throw new IllegalStateException("OperationFormForm is a utility class");
		}
		
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final TypeOperation typeOperation = Singleton.getInstance(TypeOperation.class);
		public static final Money money = Singleton.getInstance(Money.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final AmountApproved amountApproved = Singleton.getInstance(AmountApproved.class);
		public static final FinancialDestination financialDestination = Singleton.getInstance(FinancialDestination.class);
		public static final EconomicActivity economicActivity = Singleton.getInstance(EconomicActivity.class);
		public static final Official official = Singleton.getInstance(Official.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final Ubication ubication = Singleton.getInstance(Ubication.class);
		public static final CreationDate creationDate = Singleton.getInstance(CreationDate.class);
		public static final PlazoDescripcion plazoDescripcion = Singleton.getInstance(PlazoDescripcion.class);
		public static final Plazo plazo = Singleton.getInstance(Plazo.class);
		public static final FirstDueDate firstDueDate = Singleton.getInstance(FirstDueDate.class);
		public static final CreditLine creditLine = Singleton.getInstance(CreditLine.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final ExpirationDate expirationDate = Singleton.getInstance(ExpirationDate.class);
		public static final Syndicated syndicated = Singleton.getInstance(Syndicated.class);
		public static final TypeSyndicated typeSyndicated = Singleton.getInstance(TypeSyndicated.class);

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_OPERATIONABVDTC_278221","Operacion");
			}
		}			

		public static class TypeOperation extends COBISComboBox {
			public TypeOperation() {
				this.init("VA_TYPEOPERATIONNN_788221","TipoOperacion");
			}
		}			

		public static class Money extends COBISComboBox {
			public Money() {
				this.init("VA_MONEYWCCBPJYWVL_470221","Moneda");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTPCRKOKHWA_216221","Monto");
			}
		}			

		public static class AmountApproved extends COBISInputValue {
			public AmountApproved() {
				this.init("VA_AMOUNTAPPROVEDE_512221","MontoAprobado");
			}
		}			

		public static class FinancialDestination extends COBISComboBox {
			public FinancialDestination() {
				this.init("VA_FINANCIALDESINN_226221","DestinoFinanciero");
			}
		}			

		public static class EconomicActivity extends COBISComboBox {
			public EconomicActivity() {
				this.init("VA_ECONOMICACTITIV_812221","DestinoEconomico");
			}
		}			

		public static class Official extends COBISComboBox {
			public Official() {
				this.init("VA_OFFICIALHKVNOOZ_385221","Oficial");
			}
		}			

		public static class Office extends COBISComboBox {
			public Office() {
				this.init("VA_OFFICELAHOKRIFT_376221","Oficina");
			}
		}			

		public static class Ubication extends COBISComboBox {
			public Ubication() {
				this.init("VA_UBICATIONZGLTDO_878221","Ubicacion");
			}
		}			

		public static class CreationDate extends COBISDatePicker {
			public CreationDate() {
				this.init("VA_CREATIONDATENDE_311221","FechaCreacion");
			}
		}			

		public static class PlazoDescripcion extends COBISComboBox {
			public PlazoDescripcion() {
				this.init("VA_PLAZODESCRIPCNN_983221","TipoPlazo");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_PLAZOZIDUKVMULY_474221","Plazo");
			}
		}			

		public static class FirstDueDate extends COBISDatePicker {
			public FirstDueDate() {
				this.init("VA_FIRSTDUEDATEQLK_849221","Fechade1erVencimiento");
			}
		}			

		public static class CreditLine extends COBISInputTextButton {
			public CreditLine() {
				this.init("VA_CREDITLINEUOUCM_252221","LineadeCredito");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_STATEPNKYZHKSQM_913221","Estado");
			}
		}			

		public static class ExpirationDate extends COBISDatePicker {
			public ExpirationDate() {
				this.init("VA_EXPIRATIONDATET_448221","FechaVencimiento");
			}
		}			

		public static class Syndicated extends COBISCheckBox {
			public Syndicated() {
				this.init("VA_SYNDICATEDMLJZC_821221","Sindicado");
			}
		}			

		public static class TypeSyndicated extends COBISRadioButtonList {
			public TypeSyndicated() {
				this.init("VA_TYPESYNDICATEEE_795221","TipoSindicado");
			}
		}			
	}

	public static class OperationCRUDFormEntity {
	
		private OperationCRUDFormEntity() {
			throw new IllegalStateException("OperationFormForm is a utility class");
		}
		
		public static final Code code = Singleton.getInstance(Code.class);
		public static final FullName fullName = Singleton.getInstance(FullName.class);
		public static final Role role = Singleton.getInstance(Role.class);

		public static class Code extends COBISInputTextButton {
			public Code() {
				this.init("VA_CODEWKXBYDDSGNQ_399221","CodCliente");
			}
		}			

		public static class FullName extends COBISInputValue {
			public FullName() {
				this.init("VA_FULLNAMENVMNPEV_901221","NombreCliente");
			}
		}			

		public static class Role extends COBISCheckBox {
			public Role() {
				this.init("VA_ROLEGMHNCTPDKZE_265221","DeudorPrincipal");
			}
		}			
	}
	
	public static class GridSyndicatedList extends COBISGrid {
		public GridSyndicatedList() {
			this.init("QV_VE29_XZB37", "QV_VE29_XZB37");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QVVE29XZB37960 btnGridCommandIdCEQV201QVVE29XZB37960 = Singleton.getInstance(BtnGridCommandIdCEQV201QVVE29XZB37960.class);

		public static class BtnGridCommandIdCEQV201QVVE29XZB37960 extends COBISButton {
			public BtnGridCommandIdCEQV201QVVE29XZB37960() {
				this.init("CEQV_201QV_VE29_XZB37_960","IngresoParticipantes");
			}
		}
	}
		public static final CodParticipants codParticipants = Singleton.getInstance(CodParticipants.class);
		public static final NameParticipants nameParticipants = Singleton.getInstance(NameParticipants.class);
		public static final PercentageParticipants percentageParticipants = Singleton.getInstance(PercentageParticipants.class);
		public static final RoleP roleP = Singleton.getInstance(RoleP.class);
		public static final Mail mail = Singleton.getInstance(Mail.class);
		public static final AmountParticipants amountParticipants = Singleton.getInstance(AmountParticipants.class);

		public static class CodParticipants extends COBISInputValue {
			public CodParticipants() {
				this.init("VA_TEXTINPUTBOXGMY_944221","CodParticipante");
			}
		}			

		public static class NameParticipants extends COBISInputValue {
			public NameParticipants() {
				this.init("VA_TEXTINPUTBOXLLS_457221","Nombre");
			}
		}			

		public static class PercentageParticipants extends COBISInputValue {
			public PercentageParticipants() {
				this.init("VA_CHECKBOXOAJDOYG_553221","Part");
			}
		}			

		public static class RoleP extends COBISInputValue {
			public RoleP() {
				this.init("VA_TEXTINPUTBOXEVS_762221","Rol");
			}
		}			

		public static class Mail extends COBISInputValue {
			public Mail() {
				this.init("VA_TEXTINPUTBOXBBV_472221","Correo");
			}
		}			

		public static class AmountParticipants extends COBISInputValue {
			public AmountParticipants() {
				this.init("VA_TEXTINPUTBOXXUQ_742221","MontoPart");
			}
		}			
	}
	
	public static class GridDebtorEntity extends COBISGrid {
		public GridDebtorEntity() {
			this.init("QV_YWPR_NOE85", "QV_YWPR_NOE85");
		} 

		public static final Role role = Singleton.getInstance(Role.class);
		public static final FullName fullName = Singleton.getInstance(FullName.class);
		public static final IdNumber idNumber = Singleton.getInstance(IdNumber.class);
		public static final Code code = Singleton.getInstance(Code.class);
		public static final Score score = Singleton.getInstance(Score.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final Description description = Singleton.getInstance(Description.class);

		public static class Role extends COBISInputValue {
			public Role() {
				this.init("VA_TEXTINPUTBOXZUG_289221","Rol");
			}
		}			

		public static class FullName extends COBISInputValue {
			public FullName() {
				this.init("VA_TEXTINPUTBOXQZW_792221","Nombre");
			}
		}			

		public static class IdNumber extends COBISInputValue {
			public IdNumber() {
				this.init("VA_TEXTINPUTBOXKNN_822221","CedulaRUC");
			}
		}			

		public static class Code extends COBISInputValue {
			public Code() {
				this.init("VA_TEXTINPUTBOXMWJ_600221","Codigo");
			}
		}			

		public static class Score extends COBISInputValue {
			public Score() {
				this.init("VA_TEXTINPUTBOXPQA_963221","Calificacion");
			}
		}			

		public static class Type extends COBISInputValue {
			public Type() {
				this.init("VA_TEXTINPUTBOXQYS_536221","Tipo");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXARW_788221","Descripcion");
			}
		}			
	}
}
