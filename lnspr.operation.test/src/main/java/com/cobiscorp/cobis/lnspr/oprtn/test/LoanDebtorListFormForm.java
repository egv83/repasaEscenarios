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

public class LoanDebtorListFormForm{

	public static final GridDebtorList gridDebtorList = Singleton.getInstance(GridDebtorList.class);
	private LoanDebtorListFormForm() {
		throw new IllegalStateException("LoanDebtorListFormForm is a utility class");
	}
	
	public static class GridDebtorList extends COBISGrid {
		public GridDebtorList() {
			this.init("QV_VI44_NQR57", "QV_VI44_NQR57");
		} 

		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final Client client = Singleton.getInstance(Client.class);
		public static final ClientRol clientRol = Singleton.getInstance(ClientRol.class);
		public static final ClientId clientId = Singleton.getInstance(ClientId.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final CentralRisk centralRisk = Singleton.getInstance(CentralRisk.class);
		public static final SysUser sysUser = Singleton.getInstance(SysUser.class);
		public static final ClientMainId clientMainId = Singleton.getInstance(ClientMainId.class);
		public static final ClientOperation clientOperation = Singleton.getInstance(ClientOperation.class);
		public static final SysSession sysSession = Singleton.getInstance(SysSession.class);
		public static final ClientMain clientMain = Singleton.getInstance(ClientMain.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final ClientMainName clientMainName = Singleton.getInstance(ClientMainName.class);

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXCUD_128445","Sequential");
			}
		}			

		public static class Client extends COBISInputValue {
			public Client() {
				this.init("VA_TEXTINPUTBOXILW_913445","CodCliente");
			}
		}			

		public static class ClientRol extends COBISInputValue {
			public ClientRol() {
				this.init("VA_TEXTINPUTBOXHWA_904445","Rol");
			}
		}			

		public static class ClientId extends COBISInputValue {
			public ClientId() {
				this.init("VA_TEXTINPUTBOXKKE_296445","CedulaRuc");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_TEXTINPUTBOXMAG_163445","NombreCliente");
			}
		}			

		public static class CentralRisk extends COBISInputValue {
			public CentralRisk() {
				this.init("VA_TEXTINPUTBOXFHG_165445","CentralRisk");
			}
		}			

		public static class SysUser extends COBISInputValue {
			public SysUser() {
				this.init("VA_TEXTINPUTBOXUCB_292445","SysUser");
			}
		}			

		public static class ClientMainId extends COBISInputValue {
			public ClientMainId() {
				this.init("VA_TEXTINPUTBOXIAA_403445","ClientMainId");
			}
		}			

		public static class ClientOperation extends COBISInputValue {
			public ClientOperation() {
				this.init("VA_TEXTINPUTBOXIZR_364445","ClientOperation");
			}
		}			

		public static class SysSession extends COBISInputValue {
			public SysSession() {
				this.init("VA_TEXTINPUTBOXMIH_434445","SysSession");
			}
		}			

		public static class ClientMain extends COBISInputValue {
			public ClientMain() {
				this.init("VA_TEXTINPUTBOXTQG_927445","ClientMain");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_TEXTINPUTBOXEYS_414445","Operation");
			}
		}			

		public static class ClientMainName extends COBISInputValue {
			public ClientMainName() {
				this.init("VA_TEXTINPUTBOXTEO_163445","ClientMainName");
			}
		}			
	}
}
