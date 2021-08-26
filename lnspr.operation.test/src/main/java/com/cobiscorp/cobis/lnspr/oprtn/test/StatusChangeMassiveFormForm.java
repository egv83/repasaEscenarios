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

public class StatusChangeMassiveFormForm{
	public static final LoanSearchFilter loanSearchFilter = Singleton.getInstance(LoanSearchFilter.class);
	public static final StatesAssetsLoan statesAssetsLoan = Singleton.getInstance(StatesAssetsLoan.class);

	public static final GridLoanList gridLoanList = Singleton.getInstance(GridLoanList.class);
	private StatusChangeMassiveFormForm() {
		throw new IllegalStateException("StatusChangeMassiveFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTLNSPRDNB0D cmdCommand1IdCMTLNSPRDNB0D = Singleton.getInstance(CmdCommand1IdCMTLNSPRDNB0D.class);
		
		public static class CmdCommand1IdCMTLNSPRDNB0D extends COBISButton{
			public CmdCommand1IdCMTLNSPRDNB0D () {
				this.init("CM_TLNSPRDN_B0D", "Procesar");
			}
		}
	
		public static final CmdCommand2IdCMTLNSPRDNTRO cmdCommand2IdCMTLNSPRDNTRO = Singleton.getInstance(CmdCommand2IdCMTLNSPRDNTRO.class);
		
		public static class CmdCommand2IdCMTLNSPRDNTRO extends COBISButton{
			public CmdCommand2IdCMTLNSPRDNTRO () {
				this.init("CM_TLNSPRDN_TRO", "Limpiar");
			}
		}
	
		public static final BtnVAVABUTTONUSCBRTC509293IdVAVABUTTONUSCBRTC509293 btnVAVABUTTONUSCBRTC509293IdVAVABUTTONUSCBRTC509293 = Singleton.getInstance(BtnVAVABUTTONUSCBRTC509293IdVAVABUTTONUSCBRTC509293.class);
		
		public static class BtnVAVABUTTONUSCBRTC509293IdVAVABUTTONUSCBRTC509293 extends COBISButton{
			public BtnVAVABUTTONUSCBRTC509293IdVAVABUTTONUSCBRTC509293 () {
				this.init("VA_VABUTTONUSCBRTC_509293", "Buscar");
			}
		}
	

	}
	

	public static class LoanSearchFilter {
	
		private LoanSearchFilter() {
			throw new IllegalStateException("StatusChangeMassiveFormForm is a utility class");
		}
		
		public static final NumIdentification numIdentification = Singleton.getInstance(NumIdentification.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final NumProcedures numProcedures = Singleton.getInstance(NumProcedures.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final CodCurrency codCurrency = Singleton.getInstance(CodCurrency.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final MigratedOperation migratedOperation = Singleton.getInstance(MigratedOperation.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final AvanceSearch avanceSearch = Singleton.getInstance(AvanceSearch.class);
		public static final Archivo archivo = Singleton.getInstance(Archivo.class);
		public static final SeleccionarTodo seleccionarTodo = Singleton.getInstance(SeleccionarTodo.class);

		public static class NumIdentification extends COBISInputTextButton {
			public NumIdentification() {
				this.init("VA_CODCLIENTZHOTEY_615293","CodCliente");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_OPERATIONPFEVYE_478293","NumPrestamo");
			}
		}			

		public static class NumProcedures extends COBISInputValue {
			public NumProcedures() {
				this.init("VA_NUMPROCEDURESSS_610293","NumTramite");
			}
		}			

		public static class Office extends COBISDropDownList {
			public Office() {
				this.init("VA_OFFICEOKJCKNOJM_266293","Oficina");
			}
		}			

		public static class CodCurrency extends COBISDropDownList {
			public CodCurrency() {
				this.init("VA_CODCURRENCYNEWR_137293","Moneda");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DISBURSEMENTETD_259293","FechaDesembolso");
			}
		}			

		public static class State extends COBISDropDownList {
			public State() {
				this.init("VA_STATESICWPQOPFM_485293","EstadoPrestamo");
			}
		}			

		public static class MigratedOperation extends COBISInputValue {
			public MigratedOperation() {
				this.init("VA_MIGRATEDOPERIAA_938293","PrestamoMigrado");
			}
		}			

		public static class Type extends COBISDropDownList {
			public Type() {
				this.init("VA_TYPEFPEZUZQRCCT_308293","TipoOperacion");
			}
		}			

		public static class AvanceSearch extends COBISCheckBox {
			public AvanceSearch() {
				this.init("VA_AVANCESEARCHXGS_321293","CriteriosSecundarios");
			}
		}			

		public static class Archivo extends COBISFileUpload {
			public Archivo() {
				this.init("VA_ARCHIVOEWNXRMQG_617293","CargarArchivo");
			}
		}			

		public static class SeleccionarTodo extends COBISCheckBox {
			public SeleccionarTodo() {
				this.init("VA_SELECCIONARTOOD_122293","SeleccionarDeseleccionarTodo");
			}
		}			
	}

	public static class StatesAssetsLoan {
	
		private StatesAssetsLoan() {
			throw new IllegalStateException("StatusChangeMassiveFormForm is a utility class");
		}
		
		public static final DescStatus descStatus = Singleton.getInstance(DescStatus.class);

		public static class DescStatus extends COBISDropDownList {
			public DescStatus() {
				this.init("VA_DESCSTATUSKOPMT_184293","EstadoNuevo");
			}
		}			
	}
	
	public static class GridLoanList extends COBISGrid {
		public GridLoanList() {
			this.init("QV_TP50_URT26", "QV_TP50_URT26");
		} 

		public static final Seleccion seleccion = Singleton.getInstance(Seleccion.class);
		public static final DesOperationType desOperationType = Singleton.getInstance(DesOperationType.class);
		public static final LoanBankID loanBankID = Singleton.getInstance(LoanBankID.class);
		public static final ClientCode clientCode = Singleton.getInstance(ClientCode.class);
		public static final Client client = Singleton.getInstance(Client.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final NumProcedure numProcedure = Singleton.getInstance(NumProcedure.class);
		public static final DescriptionMistake descriptionMistake = Singleton.getInstance(DescriptionMistake.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final BalanceOperation balanceOperation = Singleton.getInstance(BalanceOperation.class);
		public static final ExpirationDate expirationDate = Singleton.getInstance(ExpirationDate.class);
		public static final AnswerOut answerOut = Singleton.getInstance(AnswerOut.class);
		public static final MigratedOperation migratedOperation = Singleton.getInstance(MigratedOperation.class);
		public static final SpecialAdjust specialAdjust = Singleton.getInstance(SpecialAdjust.class);
		public static final LastProcessDate lastProcessDate = Singleton.getInstance(LastProcessDate.class);
		public static final PastDueBalance pastDueBalance = Singleton.getInstance(PastDueBalance.class);
		public static final Product product = Singleton.getInstance(Product.class);
		public static final Officer officer = Singleton.getInstance(Officer.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final PreviousOption previousOption = Singleton.getInstance(PreviousOption.class);
		public static final AnswList answList = Singleton.getInstance(AnswList.class);
		public static final Group group = Singleton.getInstance(Group.class);
		public static final SeqGrid seqGrid = Singleton.getInstance(SeqGrid.class);
		public static final ConcessionDate concessionDate = Singleton.getInstance(ConcessionDate.class);
		public static final TypeClass typeClass = Singleton.getInstance(TypeClass.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final IsDisbursment isDisbursment = Singleton.getInstance(IsDisbursment.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final CreditLine creditLine = Singleton.getInstance(CreditLine.class);
		public static final Process process = Singleton.getInstance(Process.class);
		public static final Lote lote = Singleton.getInstance(Lote.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final CategoryGroup categoryGroup = Singleton.getInstance(CategoryGroup.class);

		public static class Seleccion extends COBISCheckBox {
			public Seleccion() {
				this.init("VA_CHECKBOXDANDSPV_892293","Seleccione");
			}
		}			

		public static class DesOperationType extends COBISInputValue {
			public DesOperationType() {
				this.init("VA_TEXTINPUTBOXZSM_763293","TipoPrestamo");
			}
		}			

		public static class LoanBankID extends COBISInputValue {
			public LoanBankID() {
				this.init("VA_TEXTINPUTBOXHFD_192293","NumPrestamo");
			}
		}			

		public static class ClientCode extends COBISInputValue {
			public ClientCode() {
				this.init("VA_TEXTINPUTBOXBLY_505293","CodCliente");
			}
		}			

		public static class Client extends COBISInputValue {
			public Client() {
				this.init("VA_TEXTINPUTBOXGED_407293","NombreCliente");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXDJF_550293","MontoPrestamo");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_TEXTINPUTBOXRKM_748293","Estado");
			}
		}			

		public static class Currency extends COBISInputValue {
			public Currency() {
				this.init("VA_TEXTINPUTBOXELE_418293","Moneda");
			}
		}			

		public static class NumProcedure extends COBISInputValue {
			public NumProcedure() {
				this.init("VA_TEXTINPUTBOXVHW_271293","NumTramite");
			}
		}			

		public static class DescriptionMistake extends COBISInputValue {
			public DescriptionMistake() {
				this.init("VA_TEXTINPUTBOXRUJ_835293","Error");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DATEFIELDBJADME_417293","FechaDesembolso");
			}
		}			

		public static class BalanceOperation extends COBISInputValue {
			public BalanceOperation() {
				this.init("VA_TEXTINPUTBOXMII_142293","BalanceOperation");
			}
		}			

		public static class ExpirationDate extends COBISInputValue {
			public ExpirationDate() {
				this.init("VA_TEXTINPUTBOXSYN_901293","FechaVencimiento");
			}
		}			

		public static class AnswerOut extends COBISInputValue {
			public AnswerOut() {
				this.init("VA_TEXTINPUTBOXMWU_426293","AnswerOut");
			}
		}			

		public static class MigratedOperation extends COBISInputValue {
			public MigratedOperation() {
				this.init("VA_TEXTINPUTBOXEBW_670293","MigratedOperation");
			}
		}			

		public static class SpecialAdjust extends COBISInputValue {
			public SpecialAdjust() {
				this.init("VA_TEXTINPUTBOXAIU_494293","SpecialAdjust");
			}
		}			

		public static class LastProcessDate extends COBISInputValue {
			public LastProcessDate() {
				this.init("VA_TEXTINPUTBOXSTD_964293","LastProcessDate");
			}
		}			

		public static class PastDueBalance extends COBISInputValue {
			public PastDueBalance() {
				this.init("VA_TEXTINPUTBOXPGO_294293","PastDueBalance");
			}
		}			

		public static class Product extends COBISInputValue {
			public Product() {
				this.init("VA_TEXTINPUTBOXHBN_215293","Product");
			}
		}			

		public static class Officer extends COBISInputValue {
			public Officer() {
				this.init("VA_TEXTINPUTBOXQDM_301293","Officer");
			}
		}			

		public static class Office extends COBISInputValue {
			public Office() {
				this.init("VA_TEXTINPUTBOXLAY_437293","Office");
			}
		}			

		public static class PreviousOption extends COBISInputValue {
			public PreviousOption() {
				this.init("VA_TEXTINPUTBOXNOG_130293","PreviousOption");
			}
		}			

		public static class AnswList extends COBISInputValue {
			public AnswList() {
				this.init("VA_TEXTINPUTBOXVKK_878293","AnswList");
			}
		}			

		public static class Group extends COBISInputValue {
			public Group() {
				this.init("VA_TEXTINPUTBOXVIE_725293","Group");
			}
		}			

		public static class SeqGrid extends COBISInputValue {
			public SeqGrid() {
				this.init("VA_TEXTINPUTBOXFVX_602293","SeqGrid");
			}
		}			

		public static class ConcessionDate extends COBISInputValue {
			public ConcessionDate() {
				this.init("VA_TEXTINPUTBOXJKU_978293","ConcessionDate");
			}
		}			

		public static class TypeClass extends COBISInputValue {
			public TypeClass() {
				this.init("VA_TEXTINPUTBOXBKF_421293","TypeClass");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXEKP_363293","Sequential");
			}
		}			

		public static class IsDisbursment extends COBISInputValue {
			public IsDisbursment() {
				this.init("VA_TEXTINPUTBOXBLT_685293","IsDisbursment");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_TEXTINPUTBOXELM_645293","Operation");
			}
		}			

		public static class CreditLine extends COBISInputValue {
			public CreditLine() {
				this.init("VA_TEXTINPUTBOXGOB_291293","CreditLine");
			}
		}			

		public static class Process extends COBISInputValue {
			public Process() {
				this.init("VA_TEXTINPUTBOXTBB_163293","Process");
			}
		}			

		public static class Lote extends COBISInputValue {
			public Lote() {
				this.init("VA_TEXTINPUTBOXIPK_211293","Lote");
			}
		}			

		public static class Type extends COBISInputValue {
			public Type() {
				this.init("VA_TEXTINPUTBOXDEC_769293","Type");
			}
		}			

		public static class CategoryGroup extends COBISInputValue {
			public CategoryGroup() {
				this.init("VA_TEXTINPUTBOXNXZ_792293","CategoryGroup");
			}
		}			
	}
}
