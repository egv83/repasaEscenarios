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

public class GeneralInformationLineForm{

	private GeneralInformationLineForm() {
		throw new IllegalStateException("GeneralInformationLineForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroupLayout1285IdGGENERALIEI329243 lytGroupLayout1285IdGGENERALIEI329243 = Singleton.getInstance(LytGroupLayout1285IdGGENERALIEI329243.class);
		
		public static class LytGroupLayout1285IdGGENERALIEI329243 extends COBISTab {
			public LytGroupLayout1285IdGGENERALIEI329243(){
				this.init("G_GENERALIEI_329243", "Estado Actual");
			}
		}
		
		public static final LytGroup1825IdGGENERALOIA538243 lytGroup1825IdGGENERALOIA538243 = Singleton.getInstance(LytGroup1825IdGGENERALOIA538243.class);
		
		public static class LytGroup1825IdGGENERALOIA538243 extends COBISTab {
			public LytGroup1825IdGGENERALOIA538243(){
				this.init("G_GENERALOIA_538243", "Información de Linea");
			}
		}
		
		public static final LytGroup1190IdGGENERALEIN751243 lytGroup1190IdGGENERALEIN751243 = Singleton.getInstance(LytGroup1190IdGGENERALEIN751243.class);
		
		public static class LytGroup1190IdGGENERALEIN751243 extends COBISTab {
			public LytGroup1190IdGGENERALEIN751243(){
				this.init("G_GENERALEIN_751243", "Distribución por Miembros");
			}
		}
		
		public static final LytGroup1330IdGGENERALTIN333243 lytGroup1330IdGGENERALTIN333243 = Singleton.getInstance(LytGroup1330IdGGENERALTIN333243.class);
		
		public static class LytGroup1330IdGGENERALTIN333243 extends COBISTab {
			public LytGroup1330IdGGENERALTIN333243(){
				this.init("G_GENERALTIN_333243", "Distribución por Producto");
			}
		}
		
		public static final LytGroup1222IdGGENERALNLN510243 lytGroup1222IdGGENERALNLN510243 = Singleton.getInstance(LytGroup1222IdGGENERALNLN510243.class);
		
		public static class LytGroup1222IdGGENERALNLN510243 extends COBISTab {
			public LytGroup1222IdGGENERALNLN510243(){
				this.init("G_GENERALNLN_510243", "Garantías de la Línea");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	
}
