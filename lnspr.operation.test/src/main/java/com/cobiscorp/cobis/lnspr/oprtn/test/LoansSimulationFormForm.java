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

public class LoansSimulationFormForm{
	public static final GeneralParametersQuery generalParametersQuery = Singleton.getInstance(GeneralParametersQuery.class);
	public static final OperationEntity operationEntity = Singleton.getInstance(OperationEntity.class);
	public static final AmortizationFormEntity amortizationFormEntity = Singleton.getInstance(AmortizationFormEntity.class);
	public static final OperationCRUDFormEntity operationCRUDFormEntity = Singleton.getInstance(OperationCRUDFormEntity.class);

	public static final GridSyndicatedList gridSyndicatedList = Singleton.getInstance(GridSyndicatedList.class);
	public static final GridDebtorEntity gridDebtorEntity = Singleton.getInstance(GridDebtorEntity.class);
	public static final GridAmortizationEntity gridAmortizationEntity = Singleton.getInstance(GridAmortizationEntity.class);
	public static final GridOperationItemsList gridOperationItemsList = Singleton.getInstance(GridOperationItemsList.class);
	private LoansSimulationFormForm() {
		throw new IllegalStateException("LoansSimulationFormForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytViewContainerBaseIdVCMWEGHJFEQQ170626 lytViewContainerBaseIdVCMWEGHJFEQQ170626 = Singleton.getInstance(LytViewContainerBaseIdVCMWEGHJFEQQ170626.class);
		
		public static class LytViewContainerBaseIdVCMWEGHJFEQQ170626 extends COBISTab {
			public LytViewContainerBaseIdVCMWEGHJFEQQ170626(){
				this.init("VC_MWEGHJFEQQ_170626", "Información General");
			}
		}
		
		public static final LytViewContainerBaseIdVCFUAFKEKXSW812626 lytViewContainerBaseIdVCFUAFKEKXSW812626 = Singleton.getInstance(LytViewContainerBaseIdVCFUAFKEKXSW812626.class);
		
		public static class LytViewContainerBaseIdVCFUAFKEKXSW812626 extends COBISTab {
			public LytViewContainerBaseIdVCFUAFKEKXSW812626(){
				this.init("VC_FUAFKEKXSW_812626", "Rubros");
			}
		}
		
		public static final LytViewContainerBaseIdVCTPJGHFAFBF762626 lytViewContainerBaseIdVCTPJGHFAFBF762626 = Singleton.getInstance(LytViewContainerBaseIdVCTPJGHFAFBF762626.class);
		
		public static class LytViewContainerBaseIdVCTPJGHFAFBF762626 extends COBISTab {
			public LytViewContainerBaseIdVCTPJGHFAFBF762626(){
				this.init("VC_TPJGHFAFBF_762626", "Parámetros Generales");
			}
		}
		
		public static final LytViewContainerBaseIdVCGIMALDPDEW251626 lytViewContainerBaseIdVCGIMALDPDEW251626 = Singleton.getInstance(LytViewContainerBaseIdVCGIMALDPDEW251626.class);
		
		public static class LytViewContainerBaseIdVCGIMALDPDEW251626 extends COBISTab {
			public LytViewContainerBaseIdVCGIMALDPDEW251626(){
				this.init("VC_GIMALDPDEW_251626", "Amortización");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTLNSPRTZRRO cmdCommand1IdCMTLNSPRTZRRO = Singleton.getInstance(CmdCommand1IdCMTLNSPRTZRRO.class);
		
		public static class CmdCommand1IdCMTLNSPRTZRRO extends COBISButton{
			public CmdCommand1IdCMTLNSPRTZRRO () {
				this.init("CM_TLNSPRTZ_RRO", "Finalizar");
			}
		}
	
		public static final BtnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221 btnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221 = Singleton.getInstance(BtnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221.class);
		
		public static class BtnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221 extends COBISButton{
			public BtnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221 () {
				this.init("VA_VABUTTONXCGGMOI_839221", "Crear");
			}
		}
	
		public static final BtnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587 btnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587 = Singleton.getInstance(BtnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587.class);
		
		public static class BtnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587 extends COBISButton{
			public BtnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587 () {
				this.init("VA_VAVABUTTONTR__P_260587", "Guardar");
			}
		}
	
		public static final BtnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309 btnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309 = Singleton.getInstance(BtnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309.class);
		
		public static class BtnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309 extends COBISButton{
			public BtnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309 () {
				this.init("VA_VABUTTONFIRPTAQ_308309", "Guardar");
			}
		}
	
		public static final BtnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198 btnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198 = Singleton.getInstance(BtnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198.class);
		
		public static class BtnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198 extends COBISButton{
			public BtnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198 () {
				this.init("VA_VAVABUTTONRDGI5_636198", "Calcular");
			}
		}
	
		public static final BtnVAVAVABUTTONNXJJ482198IdVAVAVABUTTONNXJJ482198 btnVAVAVABUTTONNXJJ482198IdVAVAVABUTTONNXJJ482198 = Singleton.getInstance(BtnVAVAVABUTTONNXJJ482198IdVAVAVABUTTONNXJJ482198.class);
		
		public static class BtnVAVAVABUTTONNXJJ482198IdVAVAVABUTTONNXJJ482198 extends COBISButton{
			public BtnVAVAVABUTTONNXJJ482198IdVAVAVABUTTONNXJJ482198 () {
				this.init("VA_VAVABUTTONNXJJ__482198", "Adicional");
			}
		}
	
		public static final BtnVAVAVABUTTONZDFPF173198IdVAVAVABUTTONZDFPF173198 btnVAVAVABUTTONZDFPF173198IdVAVAVABUTTONZDFPF173198 = Singleton.getInstance(BtnVAVAVABUTTONZDFPF173198IdVAVAVABUTTONZDFPF173198.class);
		
		public static class BtnVAVAVABUTTONZDFPF173198IdVAVAVABUTTONZDFPF173198 extends COBISButton{
			public BtnVAVAVABUTTONZDFPF173198IdVAVAVABUTTONZDFPF173198 () {
				this.init("VA_VAVABUTTONZDFPF_173198", "Gracia");
			}
		}
	
		public static final BtnVAVAVABUTTONOH3FZ246198IdVAVAVABUTTONOH3FZ246198 btnVAVAVABUTTONOH3FZ246198IdVAVAVABUTTONOH3FZ246198 = Singleton.getInstance(BtnVAVAVABUTTONOH3FZ246198IdVAVAVABUTTONOH3FZ246198.class);
		
		public static class BtnVAVAVABUTTONOH3FZ246198IdVAVAVABUTTONOH3FZ246198 extends COBISButton{
			public BtnVAVAVABUTTONOH3FZ246198IdVAVAVABUTTONOH3FZ246198 () {
				this.init("VA_VAVABUTTONOH3FZ_246198", "Recalcular");
			}
		}
	
		public static final BtnVAVAVABUTTONNPM2987198IdVAVAVABUTTONNPM2987198 btnVAVAVABUTTONNPM2987198IdVAVAVABUTTONNPM2987198 = Singleton.getInstance(BtnVAVAVABUTTONNPM2987198IdVAVAVABUTTONNPM2987198.class);
		
		public static class BtnVAVAVABUTTONNPM2987198IdVAVAVABUTTONNPM2987198 extends COBISButton{
			public BtnVAVAVABUTTONNPM2987198IdVAVAVABUTTONNPM2987198 () {
				this.init("VA_VAVABUTTONNPM_2_987198", "Guardar");
			}
		}
	
		public static final BtnVAVAVABUTTONVJFY0286198IdVAVAVABUTTONVJFY0286198 btnVAVAVABUTTONVJFY0286198IdVAVAVABUTTONVJFY0286198 = Singleton.getInstance(BtnVAVAVABUTTONVJFY0286198IdVAVAVABUTTONVJFY0286198.class);
		
		public static class BtnVAVAVABUTTONVJFY0286198IdVAVAVABUTTONVJFY0286198 extends COBISButton{
			public BtnVAVAVABUTTONVJFY0286198IdVAVAVABUTTONVJFY0286198 () {
				this.init("VA_VAVABUTTONVJFY0_286198", "Imprimir");
			}
		}
	
		public static final BtnVAVAVABUTTONPJ080778198IdVAVAVABUTTONPJ080778198 btnVAVAVABUTTONPJ080778198IdVAVAVABUTTONPJ080778198 = Singleton.getInstance(BtnVAVAVABUTTONPJ080778198IdVAVAVABUTTONPJ080778198.class);
		
		public static class BtnVAVAVABUTTONPJ080778198IdVAVAVABUTTONPJ080778198 extends COBISButton{
			public BtnVAVAVABUTTONPJ080778198IdVAVAVABUTTONPJ080778198 () {
				this.init("VA_VAVABUTTONPJ080_778198", "Imprimir desembolso");
			}
		}
	
		public static final BtnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309 btnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309 = Singleton.getInstance(BtnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309.class);
		
		public static class BtnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309 extends COBISButton{
			public BtnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309 () {
				this.init("VA_VABUTTONOHXRHAO_106309", "Establecer");
			}
		}
	
		public static final BtnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221 btnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221 = Singleton.getInstance(BtnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221.class);
		
		public static class BtnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221 extends COBISButton{
			public BtnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221 () {
				this.init("VA_VABUTTONVLCBANL_971221", "Añadir");
			}
		}
	

	}
	

	public static class GeneralParametersQuery {
	
		private GeneralParametersQuery() {
			throw new IllegalStateException("LoansSimulationFormForm is a utility class");
		}
		
		public static final PaymentMethod paymentMethod = Singleton.getInstance(PaymentMethod.class);
		public static final AllowsRenewal allowsRenewal = Singleton.getInstance(AllowsRenewal.class);
		public static final Readjustable readjustable = Singleton.getInstance(Readjustable.class);
		public static final Restructuring restructuring = Singleton.getInstance(Restructuring.class);
		public static final Periodicity periodicity = Singleton.getInstance(Periodicity.class);
		public static final CalculatesNetRate calculatesNetRate = Singleton.getInstance(CalculatesNetRate.class);
		public static final InterestPayment interestPayment = Singleton.getInstance(InterestPayment.class);
		public static final AcceptAdditionalPayment acceptAdditionalPayment = Singleton.getInstance(AcceptAdditionalPayment.class);
		public static final KindPayment kindPayment = Singleton.getInstance(KindPayment.class);
		public static final PayFullFee payFullFee = Singleton.getInstance(PayFullFee.class);
		public static final TypePayment typePayment = Singleton.getInstance(TypePayment.class);
		public static final CashPayments cashPayments = Singleton.getInstance(CashPayments.class);

		public static class PaymentMethod extends COBISDropDownList {
			public PaymentMethod() {
				this.init("VA_PAYMENTMETHODDD_220309","FormadePago");
			}
		}			

		public static class AllowsRenewal extends COBISRadioButtonList {
			public AllowsRenewal() {
				this.init("VA_ALLOWSRENEWALLL_150309","PermiteRenovacion");
			}
		}			

		public static class Readjustable extends COBISRadioButtonList {
			public Readjustable() {
				this.init("VA_READJUSTABLELXP_279309","Reajustable");
			}
		}			

		public static class Restructuring extends COBISRadioButtonList {
			public Restructuring() {
				this.init("VA_RESTRUCTURINGGG_731309","PermiteReestructuracion");
			}
		}			

		public static class Periodicity extends COBISInputValue {
			public Periodicity() {
				this.init("VA_PERIODICITYEHNN_689309","PeriodoReajuste");
			}
		}			

		public static class CalculatesNetRate extends COBISRadioButtonList {
			public CalculatesNetRate() {
				this.init("VA_CALCULATESNEEER_784309","CalcularValordeDevolucionIntAnticipado");
			}
		}			

		public static class InterestPayment extends COBISRadioButtonList {
			public InterestPayment() {
				this.init("VA_INTERESTPAYMNNE_508309","InterestPayment");
			}
		}			

		public static class AcceptAdditionalPayment extends COBISRadioButtonList {
			public AcceptAdditionalPayment() {
				this.init("VA_ACCEPTADDITIYNN_323309","SeAceptanPagosAdicionales");
			}
		}			

		public static class KindPayment extends COBISRadioButtonList {
			public KindPayment() {
				this.init("VA_KINDPAYMENTDUCW_586309","KindPayment");
			}
		}			

		public static class PayFullFee extends COBISRadioButtonList {
			public PayFullFee() {
				this.init("VA_PAYFULLFEEVHEVU_441309","SoloPagosdeCuotaCompleta");
			}
		}			

		public static class TypePayment extends COBISRadioButtonList {
			public TypePayment() {
				this.init("VA_TYPEPAYMENTNPPY_513309","TypePayment");
			}
		}			

		public static class CashPayments extends COBISRadioButtonList {
			public CashPayments() {
				this.init("VA_CASHPAYMENTSUUG_169309","PermitePagoporCaja");
			}
		}			
	}

	public static class OperationEntity {
	
		private OperationEntity() {
			throw new IllegalStateException("LoansSimulationFormForm is a utility class");
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

	public static class AmortizationFormEntity {
	
		private AmortizationFormEntity() {
			throw new IllegalStateException("LoansSimulationFormForm is a utility class");
		}
		
		public static final NumOperation numOperation = Singleton.getInstance(NumOperation.class);
		public static final OperationType operationType = Singleton.getInstance(OperationType.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final ValueDate valueDate = Singleton.getInstance(ValueDate.class);
		public static final Interest interest = Singleton.getInstance(Interest.class);
		public static final Fee fee = Singleton.getInstance(Fee.class);
		public static final TermType termType = Singleton.getInstance(TermType.class);
		public static final Term term = Singleton.getInstance(Term.class);
		public static final TypeFee typeFee = Singleton.getInstance(TypeFee.class);
		public static final FirstDueDate firstDueDate = Singleton.getInstance(FirstDueDate.class);
		public static final FixedPayementDay fixedPayementDay = Singleton.getInstance(FixedPayementDay.class);
		public static final PaymentDay paymentDay = Singleton.getInstance(PaymentDay.class);
		public static final TermInterest termInterest = Singleton.getInstance(TermInterest.class);
		public static final TermCapital termCapital = Singleton.getInstance(TermCapital.class);
		public static final ExtendedPaymentDate extendedPaymentDate = Singleton.getInstance(ExtendedPaymentDate.class);
		public static final DaysGraceDefault daysGraceDefault = Singleton.getInstance(DaysGraceDefault.class);
		public static final MonthGrace monthGrace = Singleton.getInstance(MonthGrace.class);
		public static final TermGraceCapital termGraceCapital = Singleton.getInstance(TermGraceCapital.class);
		public static final TermGraceInterest termGraceInterest = Singleton.getInstance(TermGraceInterest.class);
		public static final BaseInterestCalculation baseInterestCalculation = Singleton.getInstance(BaseInterestCalculation.class);
		public static final TypeAmortization typeAmortization = Singleton.getInstance(TypeAmortization.class);
		public static final AvoidHolidays avoidHolidays = Singleton.getInstance(AvoidHolidays.class);
		public static final Capital capital = Singleton.getInstance(Capital.class);
		public static final TypeGrace typeGrace = Singleton.getInstance(TypeGrace.class);
		public static final RandomGrace randomGrace = Singleton.getInstance(RandomGrace.class);
		public static final GenerateInsurance generateInsurance = Singleton.getInstance(GenerateInsurance.class);
		public static final InitialInterestRest initialInterestRest = Singleton.getInstance(InitialInterestRest.class);
		public static final RediscountDate rediscountDate = Singleton.getInstance(RediscountDate.class);
		public static final Solidarity solidarity = Singleton.getInstance(Solidarity.class);
		public static final Iva iva = Singleton.getInstance(Iva.class);
		public static final SafeTerm safeTerm = Singleton.getInstance(SafeTerm.class);
		public static final ChargeIn chargeIn = Singleton.getInstance(ChargeIn.class);
		public static final EqualDues equalDues = Singleton.getInstance(EqualDues.class);
		public static final CalculatesNetRate calculatesNetRate = Singleton.getInstance(CalculatesNetRate.class);

		public static class NumOperation extends COBISInputValue {
			public NumOperation() {
				this.init("VA_NUMOPERATIONRWY_828198","NumOperacion");
			}
		}			

		public static class OperationType extends COBISInputValue {
			public OperationType() {
				this.init("VA_OPERATIONTYPEEE_239198","TipoOperacion");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTEWSEJLOSB_545198","Monto");
			}
		}			

		public static class ValueDate extends COBISDatePicker {
			public ValueDate() {
				this.init("VA_VALUEDATEKMJLVF_161198","FechaValor");
			}
		}			

		public static class Interest extends COBISInputValue {
			public Interest() {
				this.init("VA_INTERESTBRXDBGI_239198","TasaTotal");
			}
		}			

		public static class Fee extends COBISInputValue {
			public Fee() {
				this.init("VA_FEEOFWVFIUKFNPP_635198","Cuota");
			}
		}			

		public static class TermType extends COBISDropDownList {
			public TermType() {
				this.init("VA_TERMTYPEOWIDGEH_595198","TipoPlazo");
			}
		}			

		public static class Term extends COBISInputValue {
			public Term() {
				this.init("VA_TERMMUMJBESVPSA_498198","Plazo");
			}
		}			

		public static class TypeFee extends COBISComboBox {
			public TypeFee() {
				this.init("VA_TYPEFEEARBRJCKA_414198","Tipocuota");
			}
		}			

		public static class FirstDueDate extends COBISDatePicker {
			public FirstDueDate() {
				this.init("VA_FIRSTDUEDATEACN_138198","Fechade1ervencimiento");
			}
		}			

		public static class FixedPayementDay extends COBISCheckBox {
			public FixedPayementDay() {
				this.init("VA_FIXEDPAYEMENYTY_637198","Fechadepagofija");
			}
		}			

		public static class PaymentDay extends COBISComboBox {
			public PaymentDay() {
				this.init("VA_PAYMENTDAYEFRJN_549198","Diapago");
			}
		}			

		public static class TermInterest extends COBISInputValue {
			public TermInterest() {
				this.init("VA_TERMINTERESTGWH_345198","Pint");
			}
		}			

		public static class TermCapital extends COBISInputValue {
			public TermCapital() {
				this.init("VA_TERMCAPITALLSSH_857198","Pcap");
			}
		}			

		public static class ExtendedPaymentDate extends COBISDatePicker {
			public ExtendedPaymentDate() {
				this.init("VA_EXTENDEDPAYMEDA_710198","Fechadepagoextendido");
			}
		}			

		public static class DaysGraceDefault extends COBISInputValue {
			public DaysGraceDefault() {
				this.init("VA_DAYSGRACEDEFUUU_853198","Diasgraciamora");
			}
		}			

		public static class MonthGrace extends COBISDropDownList {
			public MonthGrace() {
				this.init("VA_MONTHGRACEFIJFA_429198","Mesdegracia");
			}
		}			

		public static class TermGraceCapital extends COBISInputValue {
			public TermGraceCapital() {
				this.init("VA_TERMGRACECAPTAT_881198","Pergraciacapital");
			}
		}			

		public static class TermGraceInterest extends COBISInputValue {
			public TermGraceInterest() {
				this.init("VA_TERMGRACEINTTET_849198","Pergraciainteres");
			}
		}			

		public static class BaseInterestCalculation extends COBISRadioButtonList {
			public BaseInterestCalculation() {
				this.init("VA_BASEINTERESTAAC_534198","Basedecalculo");
			}
		}			

		public static class TypeAmortization extends COBISRadioButtonList {
			public TypeAmortization() {
				this.init("VA_TYPEAMORTIZATTN_681198","TipoAmortizacion");
			}
		}			

		public static class AvoidHolidays extends COBISRadioButtonList {
			public AvoidHolidays() {
				this.init("VA_AVOIDHOLIDAYSSS_789198","EvitarDiaFeriado");
			}
		}			

		public static class Capital extends COBISInputValue {
			public Capital() {
				this.init("VA_CAPITALBRCXRING_620198","Capital");
			}
		}			

		public static class TypeGrace extends COBISRadioButtonList {
			public TypeGrace() {
				this.init("VA_TYPEGRACEBHAAVJ_350198","FormaCobroGracia");
			}
		}			

		public static class RandomGrace extends COBISInputValue {
			public RandomGrace() {
				this.init("VA_RANDOMGRACEYJOS_359198","RandomGrace");
			}
		}			

		public static class GenerateInsurance extends COBISCheckBox {
			public GenerateInsurance() {
				this.init("VA_GENERATEINSUENC_694198","Generarseguros");
			}
		}			

		public static class InitialInterestRest extends COBISInputValue {
			public InitialInterestRest() {
				this.init("VA_INITIALINTERTSE_643198","CuotainicialINT");
			}
		}			

		public static class RediscountDate extends COBISInputValue {
			public RediscountDate() {
				this.init("VA_REDISCOUNTDAEET_581198","Fecharedescuento");
			}
		}			

		public static class Solidarity extends COBISCheckBox {
			public Solidarity() {
				this.init("VA_SOLIDARITYTOGWR_286198","Pagoleydesolidaridad");
			}
		}			

		public static class Iva extends COBISInputValue {
			public Iva() {
				this.init("VA_IVASDFHAPWJFULF_560198","TasaIVA");
			}
		}			

		public static class SafeTerm extends COBISInputValue {
			public SafeTerm() {
				this.init("VA_SAFETERMQSRJKFI_159198","Plazoseguro");
			}
		}			

		public static class ChargeIn extends COBISRadioButtonList {
			public ChargeIn() {
				this.init("VA_CHARGEINMGHTCCS_980198","Cobraren");
			}
		}			

		public static class EqualDues extends COBISCheckBox {
			public EqualDues() {
				this.init("VA_EQUALDUESIHOKFF_533198","Cuotasiguales");
			}
		}			

		public static class CalculatesNetRate extends COBISCheckBox {
			public CalculatesNetRate() {
				this.init("VA_CALCULATESNEETT_218198","Calculatasaneta");
			}
		}			
	}

	public static class OperationCRUDFormEntity {
	
		private OperationCRUDFormEntity() {
			throw new IllegalStateException("LoansSimulationFormForm is a utility class");
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
	
	public static class GridAmortizationEntity extends COBISGrid {
		public GridAmortizationEntity() {
			this.init("QV_ECPR_JAA30", "QV_ECPR_JAA30");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QVECPRJAA30396 btnGridCommandIdCEQV201QVECPRJAA30396 = Singleton.getInstance(BtnGridCommandIdCEQV201QVECPRJAA30396.class);

		public static class BtnGridCommandIdCEQV201QVECPRJAA30396 extends COBISButton {
			public BtnGridCommandIdCEQV201QVECPRJAA30396() {
				this.init("CEQV_201QV_ECPR_JAA30_396","Nuevo");
			}
		}
	}
		public static final Dividend dividend = Singleton.getInstance(Dividend.class);
		public static final ExpirationDate expirationDate = Singleton.getInstance(ExpirationDate.class);
		public static final BalanceCapital balanceCapital = Singleton.getInstance(BalanceCapital.class);
		public static final DynamicField1 dynamicField1 = Singleton.getInstance(DynamicField1.class);
		public static final DynamicField2 dynamicField2 = Singleton.getInstance(DynamicField2.class);
		public static final DynamicField3 dynamicField3 = Singleton.getInstance(DynamicField3.class);
		public static final DynamicField4 dynamicField4 = Singleton.getInstance(DynamicField4.class);
		public static final DynamicField5 dynamicField5 = Singleton.getInstance(DynamicField5.class);
		public static final DynamicField6 dynamicField6 = Singleton.getInstance(DynamicField6.class);
		public static final DynamicField7 dynamicField7 = Singleton.getInstance(DynamicField7.class);
		public static final DynamicField8 dynamicField8 = Singleton.getInstance(DynamicField8.class);
		public static final DynamicField9 dynamicField9 = Singleton.getInstance(DynamicField9.class);
		public static final DynamicField10 dynamicField10 = Singleton.getInstance(DynamicField10.class);
		public static final DynamicField11 dynamicField11 = Singleton.getInstance(DynamicField11.class);
		public static final DynamicField12 dynamicField12 = Singleton.getInstance(DynamicField12.class);
		public static final DynamicField13 dynamicField13 = Singleton.getInstance(DynamicField13.class);
		public static final DynamicField14 dynamicField14 = Singleton.getInstance(DynamicField14.class);
		public static final DynamicField15 dynamicField15 = Singleton.getInstance(DynamicField15.class);
		public static final DynamicField16 dynamicField16 = Singleton.getInstance(DynamicField16.class);
		public static final DynamicField17 dynamicField17 = Singleton.getInstance(DynamicField17.class);
		public static final DynamicField18 dynamicField18 = Singleton.getInstance(DynamicField18.class);
		public static final DynamicField19 dynamicField19 = Singleton.getInstance(DynamicField19.class);
		public static final DynamicField20 dynamicField20 = Singleton.getInstance(DynamicField20.class);
		public static final Fee fee = Singleton.getInstance(Fee.class);

		public static class Dividend extends COBISInputValue {
			public Dividend() {
				this.init("VA_DIVIDENDJQEBXYL_179198","Dividendo");
			}
		}			

		public static class ExpirationDate extends COBISDatePicker {
			public ExpirationDate() {
				this.init("VA_EXPIRATIONDATTE_941198","VENCIMIENTO");
			}
		}			

		public static class BalanceCapital extends COBISInputValue {
			public BalanceCapital() {
				this.init("VA_BALANCECAPITLLL_258198","Saldocap");
			}
		}			

		public static class DynamicField1 extends COBISInputValue {
			public DynamicField1() {
				this.init("VA_DYNAMICFIELD111_201198","DynamicField1");
			}
		}			

		public static class DynamicField2 extends COBISInputValue {
			public DynamicField2() {
				this.init("VA_DYNAMICFIELD222_976198","DynamicField2");
			}
		}			

		public static class DynamicField3 extends COBISInputValue {
			public DynamicField3() {
				this.init("VA_DYNAMICFIELD333_680198","DynamicField3");
			}
		}			

		public static class DynamicField4 extends COBISInputValue {
			public DynamicField4() {
				this.init("VA_DYNAMICFIELD444_619198","DynamicField4");
			}
		}			

		public static class DynamicField5 extends COBISInputValue {
			public DynamicField5() {
				this.init("VA_DYNAMICFIELD555_803198","DynamicField5");
			}
		}			

		public static class DynamicField6 extends COBISInputValue {
			public DynamicField6() {
				this.init("VA_DYNAMICFIELD666_861198","DynamicField6");
			}
		}			

		public static class DynamicField7 extends COBISInputValue {
			public DynamicField7() {
				this.init("VA_DYNAMICFIELD777_256198","DynamicField7");
			}
		}			

		public static class DynamicField8 extends COBISInputValue {
			public DynamicField8() {
				this.init("VA_DYNAMICFIELD888_910198","DynamicField8");
			}
		}			

		public static class DynamicField9 extends COBISInputValue {
			public DynamicField9() {
				this.init("VA_DYNAMICFIELD999_904198","DynamicField9");
			}
		}			

		public static class DynamicField10 extends COBISInputValue {
			public DynamicField10() {
				this.init("VA_DYNAMICFIELD011_387198","DynamicField10");
			}
		}			

		public static class DynamicField11 extends COBISInputValue {
			public DynamicField11() {
				this.init("VA_DYNAMICFIELD111_909198","DynamicField11");
			}
		}			

		public static class DynamicField12 extends COBISInputValue {
			public DynamicField12() {
				this.init("VA_DYNAMICFIELD121_508198","DynamicField12");
			}
		}			

		public static class DynamicField13 extends COBISInputValue {
			public DynamicField13() {
				this.init("VA_DYNAMICFIELD311_753198","DynamicField13");
			}
		}			

		public static class DynamicField14 extends COBISInputValue {
			public DynamicField14() {
				this.init("VA_DYNAMICFIELD411_866198","DynamicField14");
			}
		}			

		public static class DynamicField15 extends COBISInputValue {
			public DynamicField15() {
				this.init("VA_DYNAMICFIELD551_120198","DynamicField15");
			}
		}			

		public static class DynamicField16 extends COBISInputValue {
			public DynamicField16() {
				this.init("VA_DYNAMICFIELD111_346198","DynamicField16");
			}
		}			

		public static class DynamicField17 extends COBISInputValue {
			public DynamicField17() {
				this.init("VA_DYNAMICFIELD777_257198","DynamicField17");
			}
		}			

		public static class DynamicField18 extends COBISInputValue {
			public DynamicField18() {
				this.init("VA_DYNAMICFIELD181_740198","DynamicField18");
			}
		}			

		public static class DynamicField19 extends COBISInputValue {
			public DynamicField19() {
				this.init("VA_DYNAMICFIELD911_217198","DynamicField19");
			}
		}			

		public static class DynamicField20 extends COBISInputValue {
			public DynamicField20() {
				this.init("VA_DYNAMICFIELD000_944198","DynamicField20");
			}
		}			

		public static class Fee extends COBISInputValue {
			public Fee() {
				this.init("VA_FEEOLAUUHKGPDCB_657198","Cuota");
			}
		}			
	}
	
	public static class GridOperationItemsList extends COBISGrid {
		public GridOperationItemsList() {
			this.init("QV_MC21_OVS27", "QV_MC21_OVS27");
		} 

		public static final Item item = Singleton.getInstance(Item.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final TypeItem typeItem = Singleton.getInstance(TypeItem.class);
		public static final OtherRates otherRates = Singleton.getInstance(OtherRates.class);
		public static final PaymentMethod paymentMethod = Singleton.getInstance(PaymentMethod.class);
		public static final Signo signo = Singleton.getInstance(Signo.class);
		public static final Priority priority = Singleton.getInstance(Priority.class);
		public static final Factor factor = Singleton.getInstance(Factor.class);
		public static final Reference reference = Singleton.getInstance(Reference.class);
		public static final SignReadjustment signReadjustment = Singleton.getInstance(SignReadjustment.class);
		public static final ReferenceReadjustment referenceReadjustment = Singleton.getInstance(ReferenceReadjustment.class);
		public static final FactorReadjustment factorReadjustment = Singleton.getInstance(FactorReadjustment.class);
		public static final CalculationBase calculationBase = Singleton.getInstance(CalculationBase.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final Percentage percentage = Singleton.getInstance(Percentage.class);
		public static final PayArrears payArrears = Singleton.getInstance(PayArrears.class);
		public static final Cause cause = Singleton.getInstance(Cause.class);
		public static final Points points = Singleton.getInstance(Points.class);
		public static final TypePoints typePoints = Singleton.getInstance(TypePoints.class);
		public static final TotalRate totalRate = Singleton.getInstance(TotalRate.class);
		public static final NegotiatedRate negotiatedRate = Singleton.getInstance(NegotiatedRate.class);
		public static final AnnualRate annualRate = Singleton.getInstance(AnnualRate.class);
		public static final PointsReadjustment pointsReadjustment = Singleton.getInstance(PointsReadjustment.class);
		public static final Grace grace = Singleton.getInstance(Grace.class);
		public static final Receivable receivable = Singleton.getInstance(Receivable.class);
		public static final WarrantyType warrantyType = Singleton.getInstance(WarrantyType.class);
		public static final WarrantyAccount warrantyAccount = Singleton.getInstance(WarrantyAccount.class);
		public static final WarrantyCoverage warrantyCoverage = Singleton.getInstance(WarrantyCoverage.class);
		public static final WarrantyValue warrantyValue = Singleton.getInstance(WarrantyValue.class);
		public static final DividendType dividendType = Singleton.getInstance(DividendType.class);
		public static final InterestPeriods interestPeriods = Singleton.getInstance(InterestPeriods.class);
		public static final Financed financed = Singleton.getInstance(Financed.class);
		public static final MinRate minRate = Singleton.getInstance(MinRate.class);
		public static final MaxRate maxRate = Singleton.getInstance(MaxRate.class);
		public static final Associate associate = Singleton.getInstance(Associate.class);
		public static final AssociateValue associateValue = Singleton.getInstance(AssociateValue.class);

		public static class Item extends COBISInputValue {
			public Item() {
				this.init("VA_ITEMWXVWWWSCMKV_983587","Rubro");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_DESCRIPTIONRKNO_269587","Descripcion");
			}
		}			

		public static class TypeItem extends COBISInputValue {
			public TypeItem() {
				this.init("VA_TYPEITEMJIPMXHQ_437587","Tipo");
			}
		}			

		public static class OtherRates extends COBISInputValue {
			public OtherRates() {
				this.init("VA_OTHERRATESSNGBH_206587","OtherRates");
			}
		}			

		public static class PaymentMethod extends COBISInputValue {
			public PaymentMethod() {
				this.init("VA_PAYMENTMETHODDD_439587","FormaPago");
			}
		}			

		public static class Signo extends COBISInputValue {
			public Signo() {
				this.init("VA_SIGNOPVGZZIPUAD_330587","Signo");
			}
		}			

		public static class Priority extends COBISInputValue {
			public Priority() {
				this.init("VA_PRIORITYKZVVIRF_388587","Prioridad");
			}
		}			

		public static class Factor extends COBISInputValue {
			public Factor() {
				this.init("VA_FACTORFVQAPPLTX_853587","Factor");
			}
		}			

		public static class Reference extends COBISInputValue {
			public Reference() {
				this.init("VA_REFERENCEGBROYB_738587","Referencial");
			}
		}			

		public static class SignReadjustment extends COBISInputValue {
			public SignReadjustment() {
				this.init("VA_SIGNREADJUSTNEN_335587","SignoReajuste");
			}
		}			

		public static class ReferenceReadjustment extends COBISInputValue {
			public ReferenceReadjustment() {
				this.init("VA_REFERENCEREANET_690587","RefReajuste");
			}
		}			

		public static class FactorReadjustment extends COBISInputValue {
			public FactorReadjustment() {
				this.init("VA_FACTORREADJUTET_483587","FactorReajuste");
			}
		}			

		public static class CalculationBase extends COBISInputValue {
			public CalculationBase() {
				this.init("VA_CALCULATIONBASA_240587","BasedeCalculo");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTJGMPZXMXY_754587","Valor");
			}
		}			

		public static class Percentage extends COBISInputValue {
			public Percentage() {
				this.init("VA_PERCENTAGEJLTCZ_260587","Tasa");
			}
		}			

		public static class PayArrears extends COBISInputValue {
			public PayArrears() {
				this.init("VA_PAYARREARSBOUUR_140587","PayArrears");
			}
		}			

		public static class Cause extends COBISInputValue {
			public Cause() {
				this.init("VA_CAUSEUVCCDEPMIA_289587","Cause");
			}
		}			

		public static class Points extends COBISInputValue {
			public Points() {
				this.init("VA_POINTSTESVMWKGH_733587","Points");
			}
		}			

		public static class TypePoints extends COBISInputValue {
			public TypePoints() {
				this.init("VA_TYPEPOINTSDTBQI_258587","TypePoints");
			}
		}			

		public static class TotalRate extends COBISInputValue {
			public TotalRate() {
				this.init("VA_TOTALRATEOPJMMR_803587","TotalRate");
			}
		}			

		public static class NegotiatedRate extends COBISInputValue {
			public NegotiatedRate() {
				this.init("VA_NEGOTIATEDRAETT_876587","NegotiatedRate");
			}
		}			

		public static class AnnualRate extends COBISInputValue {
			public AnnualRate() {
				this.init("VA_ANNUALRATESVRXQ_786587","AnnualRate");
			}
		}			

		public static class PointsReadjustment extends COBISInputValue {
			public PointsReadjustment() {
				this.init("VA_POINTSREADJUTTS_146587","PointsReadjustment");
			}
		}			

		public static class Grace extends COBISInputValue {
			public Grace() {
				this.init("VA_GRACEGYKAMZUODA_972587","Grace");
			}
		}			

		public static class Receivable extends COBISInputValue {
			public Receivable() {
				this.init("VA_RECEIVABLEUNHZR_405587","Receivable");
			}
		}			

		public static class WarrantyType extends COBISInputValue {
			public WarrantyType() {
				this.init("VA_WARRANTYTYPETIJ_651587","WarrantyType");
			}
		}			

		public static class WarrantyAccount extends COBISInputValue {
			public WarrantyAccount() {
				this.init("VA_WARRANTYACCOUUU_368587","WarrantyAccount");
			}
		}			

		public static class WarrantyCoverage extends COBISInputValue {
			public WarrantyCoverage() {
				this.init("VA_WARRANTYCOVEREG_147587","WarrantyCoverage");
			}
		}			

		public static class WarrantyValue extends COBISInputValue {
			public WarrantyValue() {
				this.init("VA_WARRANTYVALUEEE_381587","WarrantyValue");
			}
		}			

		public static class DividendType extends COBISInputValue {
			public DividendType() {
				this.init("VA_DIVIDENDTYPEOCS_467587","DividendType");
			}
		}			

		public static class InterestPeriods extends COBISInputValue {
			public InterestPeriods() {
				this.init("VA_INTERESTPERIDDD_253587","InterestPeriods");
			}
		}			

		public static class Financed extends COBISDropDownList {
			public Financed() {
				this.init("VA_FINANCEDWVNAAPN_415587","Financiado");
			}
		}			

		public static class MinRate extends COBISInputValue {
			public MinRate() {
				this.init("VA_MINRATEJNRPYQJS_276587","TasaMin");
			}
		}			

		public static class MaxRate extends COBISInputValue {
			public MaxRate() {
				this.init("VA_MAXRATENSHCMIGD_796587","TasaMax");
			}
		}			

		public static class Associate extends COBISInputValue {
			public Associate() {
				this.init("VA_TEXTINPUTBOXNAY_879587","RefAsociada");
			}
		}			

		public static class AssociateValue extends COBISInputValue {
			public AssociateValue() {
				this.init("VA_TEXTINPUTBOXXQV_567587","ValorRefAsociada");
			}
		}			
	}
}
