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

public class LoanLinesCreateForm{

	private LoanLinesCreateForm() {
		throw new IllegalStateException("LoanLinesCreateForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroupLayout1740IdGLOANLINEEE881461 lytGroupLayout1740IdGLOANLINEEE881461 = Singleton.getInstance(LytGroupLayout1740IdGLOANLINEEE881461.class);
		
		public static class LytGroupLayout1740IdGLOANLINEEE881461 extends COBISTab {
			public LytGroupLayout1740IdGLOANLINEEE881461(){
				this.init("G_LOANLINEEE_881461", "Datos de la Línea");
			}
		}
		
		public static final LytGroup1328IdGLOANLINACR870461 lytGroup1328IdGLOANLINACR870461 = Singleton.getInstance(LytGroup1328IdGLOANLINACR870461.class);
		
		public static class LytGroup1328IdGLOANLINACR870461 extends COBISTab {
			public LytGroup1328IdGLOANLINACR870461(){
				this.init("G_LOANLINACR_870461", "Distribución por Miembros");
			}
		}
		
		public static final LytGroup1384IdGLOANLINRER722461 lytGroup1384IdGLOANLINRER722461 = Singleton.getInstance(LytGroup1384IdGLOANLINRER722461.class);
		
		public static class LytGroup1384IdGLOANLINRER722461 extends COBISTab {
			public LytGroup1384IdGLOANLINRER722461(){
				this.init("G_LOANLINRER_722461", "Distribución por Producto");
			}
		}
		
		public static final LytGroup1505IdGLOANLINTRE952461 lytGroup1505IdGLOANLINTRE952461 = Singleton.getInstance(LytGroup1505IdGLOANLINTRE952461.class);
		
		public static class LytGroup1505IdGLOANLINTRE952461 extends COBISTab {
			public LytGroup1505IdGLOANLINTRE952461(){
				this.init("G_LOANLINTRE_952461", "Garantías de la Línea");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	
}
