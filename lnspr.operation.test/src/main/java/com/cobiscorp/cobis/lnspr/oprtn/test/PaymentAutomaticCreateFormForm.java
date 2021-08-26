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

public class PaymentAutomaticCreateFormForm{
	public static final PaymentAutomatic paymentAutomatic = Singleton.getInstance(PaymentAutomatic.class);

	public static final GridPaymentAutomaticList gridPaymentAutomaticList = Singleton.getInstance(GridPaymentAutomaticList.class);
	private PaymentAutomaticCreateFormForm() {
		throw new IllegalStateException("PaymentAutomaticCreateFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTLNSPRACPNS cmdCommand1IdCMTLNSPRACPNS = Singleton.getInstance(CmdCommand1IdCMTLNSPRACPNS.class);
		
		public static class CmdCommand1IdCMTLNSPRACPNS extends COBISButton{
			public CmdCommand1IdCMTLNSPRACPNS () {
				this.init("CM_TLNSPRAC_PNS", "Guardar");
			}
		}
	
		public static final CmdCommand2IdCMTLNSPRAC4P9 cmdCommand2IdCMTLNSPRAC4P9 = Singleton.getInstance(CmdCommand2IdCMTLNSPRAC4P9.class);
		
		public static class CmdCommand2IdCMTLNSPRAC4P9 extends COBISButton{
			public CmdCommand2IdCMTLNSPRAC4P9 () {
				this.init("CM_TLNSPRAC_4P9", "Cancelar");
			}
		}
	
		public static final BtnVAVABUTTONXOCQZHP695232IdVAVABUTTONXOCQZHP695232 btnVAVABUTTONXOCQZHP695232IdVAVABUTTONXOCQZHP695232 = Singleton.getInstance(BtnVAVABUTTONXOCQZHP695232IdVAVABUTTONXOCQZHP695232.class);
		
		public static class BtnVAVABUTTONXOCQZHP695232IdVAVABUTTONXOCQZHP695232 extends COBISButton{
			public BtnVAVABUTTONXOCQZHP695232IdVAVABUTTONXOCQZHP695232 () {
				this.init("VA_VABUTTONXOCQZHP_695232", "Añadir");
			}
		}
	
		public static final BtnVAVABUTTONNVDIOQB352232IdVAVABUTTONNVDIOQB352232 btnVAVABUTTONNVDIOQB352232IdVAVABUTTONNVDIOQB352232 = Singleton.getInstance(BtnVAVABUTTONNVDIOQB352232IdVAVABUTTONNVDIOQB352232.class);
		
		public static class BtnVAVABUTTONNVDIOQB352232IdVAVABUTTONNVDIOQB352232 extends COBISButton{
			public BtnVAVABUTTONNVDIOQB352232IdVAVABUTTONNVDIOQB352232 () {
				this.init("VA_VABUTTONNVDIOQB_352232", "Limpiar");
			}
		}
	

	}
	

	public static class PaymentAutomatic {
	
		private PaymentAutomatic() {
			throw new IllegalStateException("PaymentAutomaticCreateFormForm is a utility class");
		}
		
		public static final BancoId bancoId = Singleton.getInstance(BancoId.class);
		public static final PaymentMethod paymentMethod = Singleton.getInstance(PaymentMethod.class);
		public static final Institution institution = Singleton.getInstance(Institution.class);
		public static final InstitutionName institutionName = Singleton.getInstance(InstitutionName.class);
		public static final Client client = Singleton.getInstance(Client.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final Percentage percentage = Singleton.getInstance(Percentage.class);
		public static final Account account = Singleton.getInstance(Account.class);
		public static final Comments comments = Singleton.getInstance(Comments.class);

		public static class BancoId extends COBISInputValue {
			public BancoId() {
				this.init("VA_OPERATIONZJOYBJ_414232","Operacion");
			}
		}			

		public static class PaymentMethod extends COBISInputValue {
			public PaymentMethod() {
				this.init("VA_PAYMENTMETHODDD_177232","FormaPago");
			}
		}			

		public static class Institution extends COBISInputTextButton {
			public Institution() {
				this.init("VA_INSTITUTIONNKHZ_389232","CodInstitucion");
			}
		}			

		public static class InstitutionName extends COBISInputValue {
			public InstitutionName() {
				this.init("VA_INSTITUTIONNEAE_518232","NombreInstitucion");
			}
		}			

		public static class Client extends COBISInputTextButton {
			public Client() {
				this.init("VA_CLIENTNIXWOQDSD_193232","CodCliente");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_CLIENTNAMEXIYOK_944232","NombreCliente");
			}
		}			

		public static class Percentage extends COBISInputValue {
			public Percentage() {
				this.init("VA_PERCENTAGERSSPP_386232","Porcentaje");
			}
		}			

		public static class Account extends COBISInputTextButton {
			public Account() {
				this.init("VA_ACCOUNTEPABOHPV_776232","NroCuenta");
			}
		}			

		public static class Comments extends COBISInputValue {
			public Comments() {
				this.init("VA_COMMENTSACNWUMM_854232","Comentario");
			}
		}			
	}
	
	public static class GridPaymentAutomaticList extends COBISGrid {
		public GridPaymentAutomaticList() {
			this.init("QV_WX74_OJZ40", "QV_WX74_OJZ40");
		} 

		public static final Account account = Singleton.getInstance(Account.class);
		public static final Percentage percentage = Singleton.getInstance(Percentage.class);
		public static final ClientRole clientRole = Singleton.getInstance(ClientRole.class);
		public static final Client client = Singleton.getInstance(Client.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final PaymentMethod paymentMethod = Singleton.getInstance(PaymentMethod.class);
		public static final PaymentName paymentName = Singleton.getInstance(PaymentName.class);
		public static final Institution institution = Singleton.getInstance(Institution.class);
		public static final InstitutionName institutionName = Singleton.getInstance(InstitutionName.class);

		public static class Account extends COBISInputValue {
			public Account() {
				this.init("VA_TEXTINPUTBOXSSG_996232","Cuentas");
			}
		}			

		public static class Percentage extends COBISInputValue {
			public Percentage() {
				this.init("VA_TEXTINPUTBOXPVU_726232","Porcentaje");
			}
		}			

		public static class ClientRole extends COBISInputValue {
			public ClientRole() {
				this.init("VA_TEXTINPUTBOXVWX_985232","Rol");
			}
		}			

		public static class Client extends COBISInputValue {
			public Client() {
				this.init("VA_TEXTINPUTBOXRUK_881232","Cliente");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_TEXTINPUTBOXCQZ_584232","NombreCliente");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_TEXTINPUTBOXKIV_434232","Operation");
			}
		}			

		public static class PaymentMethod extends COBISInputValue {
			public PaymentMethod() {
				this.init("VA_TEXTINPUTBOXSEI_725232","FormaPago");
			}
		}			

		public static class PaymentName extends COBISInputValue {
			public PaymentName() {
				this.init("VA_TEXTINPUTBOXPQU_368232","PaymentName");
			}
		}			

		public static class Institution extends COBISInputValue {
			public Institution() {
				this.init("VA_TEXTINPUTBOXGWF_154232","Institution");
			}
		}			

		public static class InstitutionName extends COBISInputValue {
			public InstitutionName() {
				this.init("VA_TEXTINPUTBOXGMQ_949232","Institucion");
			}
		}			
	}
}
