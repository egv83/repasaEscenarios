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

public class OperationGeneralParametersFormForm{
	public static final GeneralParametersQuery generalParametersQuery = Singleton.getInstance(GeneralParametersQuery.class);

	private OperationGeneralParametersFormForm() {
		throw new IllegalStateException("OperationGeneralParametersFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309 btnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309 = Singleton.getInstance(BtnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309.class);
		
		public static class BtnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309 extends COBISButton{
			public BtnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309 () {
				this.init("VA_VABUTTONFIRPTAQ_308309", "Guardar");
			}
		}
	
		public static final BtnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309 btnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309 = Singleton.getInstance(BtnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309.class);
		
		public static class BtnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309 extends COBISButton{
			public BtnVAVABUTTONOHXRHAO106309IdVAVABUTTONOHXRHAO106309 () {
				this.init("VA_VABUTTONOHXRHAO_106309", "Establecer");
			}
		}
	

	}
	

	public static class GeneralParametersQuery {
	
		private GeneralParametersQuery() {
			throw new IllegalStateException("OperationGeneralParametersFormForm is a utility class");
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
}
