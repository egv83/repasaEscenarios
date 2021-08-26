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

public class LoanSearchFormForm{
	public static final LoanSearchFilter loanSearchFilter = Singleton.getInstance(LoanSearchFilter.class);
	public static final ReadjustmentMEntity readjustmentMEntity = Singleton.getInstance(ReadjustmentMEntity.class);

	public static final GridMassiveCommissions gridMassiveCommissions = Singleton.getInstance(GridMassiveCommissions.class);
	public static final GridReadjustmenMList gridReadjustmenMList = Singleton.getInstance(GridReadjustmenMList.class);
	public static final GridMassivePayments gridMassivePayments = Singleton.getInstance(GridMassivePayments.class);
	public static final GridLoanList gridLoanList = Singleton.getInstance(GridLoanList.class);
	private LoanSearchFormForm() {
		throw new IllegalStateException("LoanSearchFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdBtnGuardarIdCMLOANSEARR04 cmdBtnGuardarIdCMLOANSEARR04 = Singleton.getInstance(CmdBtnGuardarIdCMLOANSEARR04.class);
		
		public static class CmdBtnGuardarIdCMLOANSEARR04 extends COBISButton{
			public CmdBtnGuardarIdCMLOANSEARR04 () {
				this.init("CM_LOANSEAR_R04", "Guardar");
			}
		}
	
		public static final CmdCommand1IdCMLOANSEARPN2 cmdCommand1IdCMLOANSEARPN2 = Singleton.getInstance(CmdCommand1IdCMLOANSEARPN2.class);
		
		public static class CmdCommand1IdCMLOANSEARPN2 extends COBISButton{
			public CmdCommand1IdCMLOANSEARPN2 () {
				this.init("CM_LOANSEAR_PN2", "Aplicar");
			}
		}
	
		public static final CmdCommand3IdCMTLNSPRMF9NN cmdCommand3IdCMTLNSPRMF9NN = Singleton.getInstance(CmdCommand3IdCMTLNSPRMF9NN.class);
		
		public static class CmdCommand3IdCMTLNSPRMF9NN extends COBISButton{
			public CmdCommand3IdCMTLNSPRMF9NN () {
				this.init("CM_TLNSPRMF_9NN", "Procesar");
			}
		}
	
		public static final CmdCommand5IdCMTLNSPRMFJP1 cmdCommand5IdCMTLNSPRMFJP1 = Singleton.getInstance(CmdCommand5IdCMTLNSPRMFJP1.class);
		
		public static class CmdCommand5IdCMTLNSPRMFJP1 extends COBISButton{
			public CmdCommand5IdCMTLNSPRMFJP1 () {
				this.init("CM_TLNSPRMF_JP1", "Guardar");
			}
		}
	
		public static final CmdCommand5IdCMTLNSPRMFNMS cmdCommand5IdCMTLNSPRMFNMS = Singleton.getInstance(CmdCommand5IdCMTLNSPRMFNMS.class);
		
		public static class CmdCommand5IdCMTLNSPRMFNMS extends COBISButton{
			public CmdCommand5IdCMTLNSPRMFNMS () {
				this.init("CM_TLNSPRMF_NMS", "Limpiar");
			}
		}
	
		public static final CmdCommand6IdCMTLNSPRMF22S cmdCommand6IdCMTLNSPRMF22S = Singleton.getInstance(CmdCommand6IdCMTLNSPRMF22S.class);
		
		public static class CmdCommand6IdCMTLNSPRMF22S extends COBISButton{
			public CmdCommand6IdCMTLNSPRMF22S () {
				this.init("CM_TLNSPRMF_22S", "Procesar");
			}
		}
	
		public static final CmdCommand8IdCMTLNSPRMFTP8 cmdCommand8IdCMTLNSPRMFTP8 = Singleton.getInstance(CmdCommand8IdCMTLNSPRMFTP8.class);
		
		public static class CmdCommand8IdCMTLNSPRMFTP8 extends COBISButton{
			public CmdCommand8IdCMTLNSPRMFTP8 () {
				this.init("CM_TLNSPRMF_TP8", "Cancelar");
			}
		}
	
		public static final CmdCommand9IdCMTLNSPRMF3SN cmdCommand9IdCMTLNSPRMF3SN = Singleton.getInstance(CmdCommand9IdCMTLNSPRMF3SN.class);
		
		public static class CmdCommand9IdCMTLNSPRMF3SN extends COBISButton{
			public CmdCommand9IdCMTLNSPRMF3SN () {
				this.init("CM_TLNSPRMF_3SN", "Limpiar");
			}
		}
	
		public static final BtnVAVAVABUTTONNJ9LB637423IdVAVAVABUTTONNJ9LB637423 btnVAVAVABUTTONNJ9LB637423IdVAVAVABUTTONNJ9LB637423 = Singleton.getInstance(BtnVAVAVABUTTONNJ9LB637423IdVAVAVABUTTONNJ9LB637423.class);
		
		public static class BtnVAVAVABUTTONNJ9LB637423IdVAVAVABUTTONNJ9LB637423 extends COBISButton{
			public BtnVAVAVABUTTONNJ9LB637423IdVAVAVABUTTONNJ9LB637423 () {
				this.init("VA_VAVABUTTONNJ9LB_637423", "Buscar");
			}
		}
	
		public static final BtnVA174423IdVA174423 btnVA174423IdVA174423 = Singleton.getInstance(BtnVA174423IdVA174423.class);
		
		public static class BtnVA174423IdVA174423 extends COBISButton{
			public BtnVA174423IdVA174423 () {
				this.init("VA__174423", "Buscar");
			}
		}
	

	}
	

	public static class LoanSearchFilter {
	
		private LoanSearchFilter() {
			throw new IllegalStateException("LoanSearchFormForm is a utility class");
		}
		
		public static final NumIdentification numIdentification = Singleton.getInstance(NumIdentification.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final NumProcedures numProcedures = Singleton.getInstance(NumProcedures.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final CodCurrency codCurrency = Singleton.getInstance(CodCurrency.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final NextReadjDate nextReadjDate = Singleton.getInstance(NextReadjDate.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final MigratedOperation migratedOperation = Singleton.getInstance(MigratedOperation.class);
		public static final TypeOperation typeOperation = Singleton.getInstance(TypeOperation.class);
		public static final AvanceSearch avanceSearch = Singleton.getInstance(AvanceSearch.class);
		public static final Condition condition = Singleton.getInstance(Condition.class);
		public static final SeleccionarTodo seleccionarTodo = Singleton.getInstance(SeleccionarTodo.class);
		public static final Archivo archivo = Singleton.getInstance(Archivo.class);

		public static class NumIdentification extends COBISInputTextButton {
			public NumIdentification() {
				this.init("VA_NUMIDENTIFICTII_228423","CodigoCliente");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_OPERATIONIPSSEI_652423","NumPrestamo");
			}
		}			

		public static class NumProcedures extends COBISInputValue {
			public NumProcedures() {
				this.init("VA_NUMPROCEDURESSS_844423","NumTramite");
			}
		}			

		public static class Office extends COBISComboBox {
			public Office() {
				this.init("VA_OFFICERVXRGASBK_236423","Oficina");
			}
		}			

		public static class CodCurrency extends COBISComboBox {
			public CodCurrency() {
				this.init("VA_CODCURRENCYORMA_221423","Moneda");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DISBURSEMENTDTE_672423","FechaDesembolso");
			}
		}			

		public static class NextReadjDate extends COBISDatePicker {
			public NextReadjDate() {
				this.init("VA_NEXTREADJDATEEE_737423","ProximoReajuste");
			}
		}			

		public static class State extends COBISComboBox {
			public State() {
				this.init("VA_STATEGXSFXFHGCB_183423","EstadoPrestamo");
			}
		}			

		public static class MigratedOperation extends COBISInputValue {
			public MigratedOperation() {
				this.init("VA_MIGRATEDOPERITA_354423","PrestamoMigrado");
			}
		}			

		public static class TypeOperation extends COBISComboBox {
			public TypeOperation() {
				this.init("VA_TYPEOPERATIONNN_501423","TipoOperacion");
			}
		}			

		public static class AvanceSearch extends COBISCheckBox {
			public AvanceSearch() {
				this.init("VA_AVANCESEARCHFOE_865423","CriteriosSecundarios");
			}
		}			

		public static class Condition extends COBISCheckBox {
			public Condition() {
				this.init("VA_CONDITIONLQYMCH_855423","Reajustables");
			}
		}			

		public static class SeleccionarTodo extends COBISCheckBox {
			public SeleccionarTodo() {
				this.init("VA_SELECCIONARTOOD_173423","SeleccionarDeseleccionarTodo");
			}
		}			

		public static class Archivo extends COBISFileUpload {
			public Archivo() {
				this.init("VA_ARCHIVOJFAGWZSQ_219423","CargarArchivo");
			}
		}			
	}

	public static class ReadjustmentMEntity {
	
		private ReadjustmentMEntity() {
			throw new IllegalStateException("LoanSearchFormForm is a utility class");
		}
		
		public static final Item item = Singleton.getInstance(Item.class);
		public static final ReadjustDate readjustDate = Singleton.getInstance(ReadjustDate.class);
		public static final Referencial referencial = Singleton.getInstance(Referencial.class);
		public static final Sign sign = Singleton.getInstance(Sign.class);
		public static final Factor factor = Singleton.getInstance(Factor.class);
		public static final Percentage percentage = Singleton.getInstance(Percentage.class);

		public static class Item extends COBISComboBox {
			public Item() {
				this.init("VA_ITEMUMGHQQCSAYX_466423","Rubro");
			}
		}			

		public static class ReadjustDate extends COBISDatePicker {
			public ReadjustDate() {
				this.init("VA_READJUSTDATEHXG_933423","Reajustarel");
			}
		}			

		public static class Referencial extends COBISInputTextButton {
			public Referencial() {
				this.init("VA_REFERENCIALHVKA_159423","Referencial");
			}
		}			

		public static class Sign extends COBISComboBox {
			public Sign() {
				this.init("VA_SIGNKLSEFBDNEKD_114423","Signo");
			}
		}			

		public static class Factor extends COBISInputValue {
			public Factor() {
				this.init("VA_FACTORGZZGBQQEQ_812423","Factor");
			}
		}			

		public static class Percentage extends COBISInputValue {
			public Percentage() {
				this.init("VA_PERCENTAGEJSRSR_369423","Porcentaje");
			}
		}			
	}
	
	public static class GridMassiveCommissions extends COBISGrid {
		public GridMassiveCommissions() {
			this.init("QV_PY15_EUR25", "COMISIONESMASIVAS");
		} 

		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final AmountPaid amountPaid = Singleton.getInstance(AmountPaid.class);
		public static final Heading heading = Singleton.getInstance(Heading.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final BaseCalculation baseCalculation = Singleton.getInstance(BaseCalculation.class);
		public static final Lot lot = Singleton.getInstance(Lot.class);
		public static final EndLote endLote = Singleton.getInstance(EndLote.class);
		public static final File file = Singleton.getInstance(File.class);
		public static final Mistake mistake = Singleton.getInstance(Mistake.class);

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_TEXTINPUTBOXNAP_479423","Operacion");
			}
		}			

		public static class Currency extends COBISInputValue {
			public Currency() {
				this.init("VA_TEXTINPUTBOXHUJ_355423","Moneda");
			}
		}			

		public static class AmountPaid extends COBISInputValue {
			public AmountPaid() {
				this.init("VA_TEXTINPUTBOXIZW_235423","ValoraPagar");
			}
		}			

		public static class Heading extends COBISInputValue {
			public Heading() {
				this.init("VA_TEXTINPUTBOXLND_495423","Concepto");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXSAP_633423","Comentario");
			}
		}			

		public static class BaseCalculation extends COBISInputValue {
			public BaseCalculation() {
				this.init("VA_TEXTINPUTBOXQIX_670423","BaseCalculation");
			}
		}			

		public static class Lot extends COBISInputValue {
			public Lot() {
				this.init("VA_TEXTINPUTBOXWTY_968423","Lot");
			}
		}			

		public static class EndLote extends COBISInputValue {
			public EndLote() {
				this.init("VA_TEXTINPUTBOXIUJ_559423","EndLote");
			}
		}			

		public static class File extends COBISInputValue {
			public File() {
				this.init("VA_TEXTINPUTBOXGMN_332423","File");
			}
		}			

		public static class Mistake extends COBISInputValue {
			public Mistake() {
				this.init("VA_TEXTINPUTBOXHVO_846423","Error");
			}
		}			
	}
	
	public static class GridReadjustmenMList extends COBISGrid {
		public GridReadjustmenMList() {
			this.init("QV_PG40_VCD65", "QV_PG40_VCD65");
		} 

		public static final Seleccion seleccion = Singleton.getInstance(Seleccion.class);
		public static final ReadjDate readjDate = Singleton.getInstance(ReadjDate.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final Client client = Singleton.getInstance(Client.class);
		public static final Referencial referencial = Singleton.getInstance(Referencial.class);
		public static final Sign sign = Singleton.getInstance(Sign.class);
		public static final Factor factor = Singleton.getInstance(Factor.class);
		public static final Percentage percentage = Singleton.getInstance(Percentage.class);
		public static final SpecialAdjust specialAdjust = Singleton.getInstance(SpecialAdjust.class);

		public static class Seleccion extends COBISCheckBox {
			public Seleccion() {
				this.init("VA_CHECKBOXYLXHRAO_645423","Seleccione");
			}
		}			

		public static class ReadjDate extends COBISDatePicker {
			public ReadjDate() {
				this.init("VA_READJDATEDUBRMY_599423","Fecha");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_OPERATIONWBWFDW_554423","Operacion");
			}
		}			

		public static class Client extends COBISInputValue {
			public Client() {
				this.init("VA_CLIENTDRURGMIBT_221423","Nombre");
			}
		}			

		public static class Referencial extends COBISInputTextButton {
			public Referencial() {
				this.init("VA_REFERENCIALFBOE_516423","Referencia");
			}
		}			

		public static class Sign extends COBISComboBox {
			public Sign() {
				this.init("VA_SIGNHCAEEHGEZFU_341423","Signo");
			}
		}			

		public static class Factor extends COBISInputValue {
			public Factor() {
				this.init("VA_FACTORQMDATIIWI_708423","Factor");
			}
		}			

		public static class Percentage extends COBISInputValue {
			public Percentage() {
				this.init("VA_PERCENTAGEDNCBC_389423","Porcentaje");
			}
		}			

		public static class SpecialAdjust extends COBISInputValue {
			public SpecialAdjust() {
				this.init("VA_SPECIALADJUSTTT_888423","Especial");
			}
		}			
	}
	
	public static class GridMassivePayments extends COBISGrid {
		public GridMassivePayments() {
			this.init("QV_BZ71_NGV26", "PAGOS_MASIVOS");
		} 

		public static final DatePayment datePayment = Singleton.getInstance(DatePayment.class);
		public static final NumberBank numberBank = Singleton.getInstance(NumberBank.class);
		public static final CustomerName customerName = Singleton.getInstance(CustomerName.class);
		public static final CurrencyPayment currencyPayment = Singleton.getInstance(CurrencyPayment.class);
		public static final FormPayment formPayment = Singleton.getInstance(FormPayment.class);
		public static final ValuePay valuePay = Singleton.getInstance(ValuePay.class);
		public static final NumberAccount numberAccount = Singleton.getInstance(NumberAccount.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final Error error = Singleton.getInstance(Error.class);
		public static final LotePM lotePM = Singleton.getInstance(LotePM.class);
		public static final EndLotePM endLotePM = Singleton.getInstance(EndLotePM.class);
		public static final FilePM filePM = Singleton.getInstance(FilePM.class);

		public static class DatePayment extends COBISDatePicker {
			public DatePayment() {
				this.init("VA_DATEFIELDNOTRWJ_671423","FechadePago");
			}
		}			

		public static class NumberBank extends COBISInputValue {
			public NumberBank() {
				this.init("VA_TEXTINPUTBOXEAB_650423","Operacion");
			}
		}			

		public static class CustomerName extends COBISInputValue {
			public CustomerName() {
				this.init("VA_TEXTINPUTBOXLVV_423423","Cliente");
			}
		}			

		public static class CurrencyPayment extends COBISInputValue {
			public CurrencyPayment() {
				this.init("VA_TEXTINPUTBOXEOH_280423","Moneda");
			}
		}			

		public static class FormPayment extends COBISInputValue {
			public FormPayment() {
				this.init("VA_TEXTINPUTBOXFYA_582423","FormadePago");
			}
		}			

		public static class ValuePay extends COBISInputValue {
			public ValuePay() {
				this.init("VA_TEXTINPUTBOXAZC_151423","ValoraPagar");
			}
		}			

		public static class NumberAccount extends COBISInputValue {
			public NumberAccount() {
				this.init("VA_TEXTINPUTBOXIGN_255423","NoCuenta");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXDWU_875423","Descripcion");
			}
		}			

		public static class Error extends COBISInputValue {
			public Error() {
				this.init("VA_TEXTINPUTBOXMIE_662423","Error");
			}
		}			

		public static class LotePM extends COBISInputValue {
			public LotePM() {
				this.init("VA_TEXTINPUTBOXECM_879423","LotePM");
			}
		}			

		public static class EndLotePM extends COBISInputValue {
			public EndLotePM() {
				this.init("VA_TEXTINPUTBOXZXV_947423","EndLotePM");
			}
		}			

		public static class FilePM extends COBISInputValue {
			public FilePM() {
				this.init("VA_TEXTINPUTBOXTFR_779423","FilePM");
			}
		}			
	}
	
	public static class GridLoanList extends COBISGrid {
		public GridLoanList() {
			this.init("QV_EF50_UVK53", "OPERACIONES");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QVEF50UVK53197 btnGridCommandIdCEQV201QVEF50UVK53197 = Singleton.getInstance(BtnGridCommandIdCEQV201QVEF50UVK53197.class);

		public static class BtnGridCommandIdCEQV201QVEF50UVK53197 extends COBISButton {
			public BtnGridCommandIdCEQV201QVEF50UVK53197() {
				this.init("CEQV_201QV_EF50_UVK53_197","IngresoComisionesMasivas");
			}
		}

		public static final BtnGridCommandIdCEQV201QVEF50UVK53388 btnGridCommandIdCEQV201QVEF50UVK53388 = Singleton.getInstance(BtnGridCommandIdCEQV201QVEF50UVK53388.class);

		public static class BtnGridCommandIdCEQV201QVEF50UVK53388 extends COBISButton {
			public BtnGridCommandIdCEQV201QVEF50UVK53388() {
				this.init("CEQV_201QV_EF50_UVK53_388","IngresoPagosMasivos");
			}
		}

		public static final BtnGridCommandIdCEQV201QVEF50UVK53351 btnGridCommandIdCEQV201QVEF50UVK53351 = Singleton.getInstance(BtnGridCommandIdCEQV201QVEF50UVK53351.class);

		public static class BtnGridCommandIdCEQV201QVEF50UVK53351 extends COBISButton {
			public BtnGridCommandIdCEQV201QVEF50UVK53351() {
				this.init("CEQV_201QV_EF50_UVK53_351","IngresoCambiodeTasaMasivos");
			}
		}
	}
		public static final Seleccion seleccion = Singleton.getInstance(Seleccion.class);
		public static final DesOperationType desOperationType = Singleton.getInstance(DesOperationType.class);
		public static final LoanBankID loanBankID = Singleton.getInstance(LoanBankID.class);
		public static final ClientCode clientCode = Singleton.getInstance(ClientCode.class);
		public static final Client client = Singleton.getInstance(Client.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final ExpirationDate expirationDate = Singleton.getInstance(ExpirationDate.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final NumProcedure numProcedure = Singleton.getInstance(NumProcedure.class);
		public static final Group group = Singleton.getInstance(Group.class);
		public static final CategoryGroup categoryGroup = Singleton.getInstance(CategoryGroup.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final ConcessionDate concessionDate = Singleton.getInstance(ConcessionDate.class);
		public static final Officer officer = Singleton.getInstance(Officer.class);
		public static final PreviousOption previousOption = Singleton.getInstance(PreviousOption.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final CreditLine creditLine = Singleton.getInstance(CreditLine.class);
		public static final MigratedOperation migratedOperation = Singleton.getInstance(MigratedOperation.class);
		public static final Process process = Singleton.getInstance(Process.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final SpecialAdjust specialAdjust = Singleton.getInstance(SpecialAdjust.class);
		public static final TypeClass typeClass = Singleton.getInstance(TypeClass.class);
		public static final AnswList answList = Singleton.getInstance(AnswList.class);
		public static final AnswerOut answerOut = Singleton.getInstance(AnswerOut.class);
		public static final BalanceOperation balanceOperation = Singleton.getInstance(BalanceOperation.class);
		public static final PastDueBalance pastDueBalance = Singleton.getInstance(PastDueBalance.class);
		public static final SeqGrid seqGrid = Singleton.getInstance(SeqGrid.class);
		public static final LastProcessDate lastProcessDate = Singleton.getInstance(LastProcessDate.class);
		public static final Product product = Singleton.getInstance(Product.class);
		public static final IsDisbursment isDisbursment = Singleton.getInstance(IsDisbursment.class);
		public static final DescriptionMistake descriptionMistake = Singleton.getInstance(DescriptionMistake.class);
		public static final Lote lote = Singleton.getInstance(Lote.class);

		public static class Seleccion extends COBISCheckBox {
			public Seleccion() {
				this.init("VA_SELECCIONBGDZXY_881423","Seleccione");
			}
		}			

		public static class DesOperationType extends COBISInputValue {
			public DesOperationType() {
				this.init("VA_DESOPERATIONPET_303423","TipoPrestamo");
			}
		}			

		public static class LoanBankID extends COBISInputValue {
			public LoanBankID() {
				this.init("VA_LOANBANKIDXGAED_699423","NumPrestamo");
			}
		}			

		public static class ClientCode extends COBISInputValue {
			public ClientCode() {
				this.init("VA_CLIENTCODEKFARH_334423","CodCliente");
			}
		}			

		public static class Client extends COBISInputValue {
			public Client() {
				this.init("VA_CLIENTCNBTMRZFQ_816423","NombreCliente");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTOMLDDIZJA_910423","MontoPrestamo");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_STATECMEFWCTNQD_519423","Estado");
			}
		}			

		public static class ExpirationDate extends COBISDatePicker {
			public ExpirationDate() {
				this.init("VA_EXPIRATIONDAEET_350423","Fechavencimiento");
			}
		}			

		public static class Currency extends COBISInputValue {
			public Currency() {
				this.init("VA_CURRENCYUOUYUTG_117423","CodMoneda");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DISBURSEMENTAED_963423","FechaDesembolso");
			}
		}			

		public static class NumProcedure extends COBISInputValue {
			public NumProcedure() {
				this.init("VA_NUMPROCEDUREUXI_497423","NumTramite");
			}
		}			

		public static class Group extends COBISInputValue {
			public Group() {
				this.init("VA_GROUPPPCOZMDTSO_374423","Grupo");
			}
		}			

		public static class CategoryGroup extends COBISInputValue {
			public CategoryGroup() {
				this.init("VA_CATEGORYGROUPPP_422423","Categoria");
			}
		}			

		public static class Type extends COBISInputValue {
			public Type() {
				this.init("VA_TYPEMIYEHJZFDDT_677423","Type");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_OPERATIONOIFFBE_520423","Operation");
			}
		}			

		public static class ConcessionDate extends COBISInputValue {
			public ConcessionDate() {
				this.init("VA_CONCESSIONDAEEE_555423","ConcessionDate");
			}
		}			

		public static class Officer extends COBISInputValue {
			public Officer() {
				this.init("VA_OFFICERFQANMBBQ_857423","Officer");
			}
		}			

		public static class PreviousOption extends COBISInputValue {
			public PreviousOption() {
				this.init("VA_PREVIOUSOPTINNN_560423","PreviousOption");
			}
		}			

		public static class Office extends COBISInputValue {
			public Office() {
				this.init("VA_OFFICEXYAVVNIJY_706423","Office");
			}
		}			

		public static class CreditLine extends COBISInputValue {
			public CreditLine() {
				this.init("VA_CREDITLINEYXAKJ_608423","CreditLine");
			}
		}			

		public static class MigratedOperation extends COBISInputValue {
			public MigratedOperation() {
				this.init("VA_MIGRATEDOPERNOO_259423","MigratedOperation");
			}
		}			

		public static class Process extends COBISInputValue {
			public Process() {
				this.init("VA_PROCESSHJNFZIFU_810423","Process");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_SEQUENTIALNFVSX_217423","Sequential");
			}
		}			

		public static class SpecialAdjust extends COBISInputValue {
			public SpecialAdjust() {
				this.init("VA_SPECIALADJUSTTT_208423","SpecialAdjust");
			}
		}			

		public static class TypeClass extends COBISInputValue {
			public TypeClass() {
				this.init("VA_TYPECLASSLMKNJF_781423","TypeClass");
			}
		}			

		public static class AnswList extends COBISInputValue {
			public AnswList() {
				this.init("VA_ANSWLISTFFFWPYH_106423","AnswList");
			}
		}			

		public static class AnswerOut extends COBISInputValue {
			public AnswerOut() {
				this.init("VA_ANSWEROUTINRACZ_747423","AnswerOut");
			}
		}			

		public static class BalanceOperation extends COBISInputValue {
			public BalanceOperation() {
				this.init("VA_BALANCEOPERAONO_218423","BalanceOperation");
			}
		}			

		public static class PastDueBalance extends COBISInputValue {
			public PastDueBalance() {
				this.init("VA_PASTDUEBALANECE_114423","PastDueBalance");
			}
		}			

		public static class SeqGrid extends COBISInputValue {
			public SeqGrid() {
				this.init("VA_SEQGRIDGTCFLYFS_468423","SeqGrid");
			}
		}			

		public static class LastProcessDate extends COBISInputValue {
			public LastProcessDate() {
				this.init("VA_LASTPROCESSDAEA_774423","LastProcessDate");
			}
		}			

		public static class Product extends COBISInputValue {
			public Product() {
				this.init("VA_PRODUCTUNYIPQZJ_264423","Product");
			}
		}			

		public static class IsDisbursment extends COBISInputValue {
			public IsDisbursment() {
				this.init("VA_ISDISBURSMENTTT_772423","IsDisbursment");
			}
		}			

		public static class DescriptionMistake extends COBISInputValue {
			public DescriptionMistake() {
				this.init("VA_TEXTINPUTBOXDXE_141423","Error");
			}
		}			

		public static class Lote extends COBISInputValue {
			public Lote() {
				this.init("VA_TEXTINPUTBOXYPO_875423","Lote");
			}
		}			
	}
}
