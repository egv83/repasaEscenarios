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

public class PaymentsFormForm{
	public static final Payment payment = Singleton.getInstance(Payment.class);
	public static final PaymentMethod paymentMethod = Singleton.getInstance(PaymentMethod.class);

	private PaymentsFormForm() {
		throw new IllegalStateException("PaymentsFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTLNSPRZYK05 cmdCommand1IdCMTLNSPRZYK05 = Singleton.getInstance(CmdCommand1IdCMTLNSPRZYK05.class);
		
		public static class CmdCommand1IdCMTLNSPRZYK05 extends COBISButton{
			public CmdCommand1IdCMTLNSPRZYK05 () {
				this.init("CM_TLNSPRZY_K05", "Guardar");
			}
		}
	
		public static final CmdCommand2IdCMTLNSPRZY10 cmdCommand2IdCMTLNSPRZY10 = Singleton.getInstance(CmdCommand2IdCMTLNSPRZY10.class);
		
		public static class CmdCommand2IdCMTLNSPRZY10 extends COBISButton{
			public CmdCommand2IdCMTLNSPRZY10 () {
				this.init("CM_TLNSPRZY_1_0", "Procesar");
			}
		}
	
		public static final CmdCommand3IdCMTLNSPRZYN35 cmdCommand3IdCMTLNSPRZYN35 = Singleton.getInstance(CmdCommand3IdCMTLNSPRZYN35.class);
		
		public static class CmdCommand3IdCMTLNSPRZYN35 extends COBISButton{
			public CmdCommand3IdCMTLNSPRZYN35 () {
				this.init("CM_TLNSPRZY_N35", "Cancelar");
			}
		}
	
		public static final CmdCommand4IdCMTLNSPRZYRL6 cmdCommand4IdCMTLNSPRZYRL6 = Singleton.getInstance(CmdCommand4IdCMTLNSPRZYRL6.class);
		
		public static class CmdCommand4IdCMTLNSPRZYRL6 extends COBISButton{
			public CmdCommand4IdCMTLNSPRZYRL6 () {
				this.init("CM_TLNSPRZY_RL6", "Salir");
			}
		}
	

	}
	

	public static class Payment {
	
		private Payment() {
			throw new IllegalStateException("PaymentsFormForm is a utility class");
		}
		
		public static final Date date = Singleton.getInstance(Date.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final PaymentsTypes paymentsTypes = Singleton.getInstance(PaymentsTypes.class);
		public static final Value value = Singleton.getInstance(Value.class);
		public static final Customer customer = Singleton.getInstance(Customer.class);
		public static final Reference reference = Singleton.getInstance(Reference.class);
		public static final Notes notes = Singleton.getInstance(Notes.class);

		public static class Date extends COBISDatePicker {
			public Date() {
				this.init("VA_DATEPQRPPIHOWWB_162199","Fecha");
			}
		}			

		public static class Currency extends COBISComboBox {
			public Currency() {
				this.init("VA_CURRENCYXLRJUPE_746199","Moneda");
			}
		}			

		public static class PaymentsTypes extends COBISComboBox {
			public PaymentsTypes() {
				this.init("VA_PAYMENTSTYPESSS_684199","FormadePago");
			}
		}			

		public static class Value extends COBISInputValue {
			public Value() {
				this.init("VA_VALUEXDSHNMADTK_664199","Monto");
			}
		}			

		public static class Customer extends COBISInputTextButton {
			public Customer() {
				this.init("VA_CUSTOMERMUPBSTT_916199","Cobrara");
			}
		}			

		public static class Reference extends COBISInputTextButton {
			public Reference() {
				this.init("VA_REFERENCEUFYFMY_654199","Referencia");
			}
		}			

		public static class Notes extends COBISInputValue {
			public Notes() {
				this.init("VA_NOTESGZRCIQVEYN_753199","Descripcion");
			}
		}			
	}

	public static class PaymentMethod {
	
		private PaymentMethod() {
			throw new IllegalStateException("PaymentsFormForm is a utility class");
		}
		
	}
}
