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

public class ModalReferentialFormForm{

	public static final GridModalTasaEntity gridModalTasaEntity = Singleton.getInstance(GridModalTasaEntity.class);
	private ModalReferentialFormForm() {
		throw new IllegalStateException("ModalReferentialFormForm is a utility class");
	}
	
	public static class GridModalTasaEntity extends COBISGrid {
		public GridModalTasaEntity() {
			this.init("QV_CU83_UDH39", "QV_CU83_UDH39");
		} 

		public static final Identificador identificador = Singleton.getInstance(Identificador.class);
		public static final Descripcion descripcion = Singleton.getInstance(Descripcion.class);
		public static final Clase clase = Singleton.getInstance(Clase.class);
		public static final TasaPIT tasaPIT = Singleton.getInstance(TasaPIT.class);

		public static class Identificador extends COBISInputValue {
			public Identificador() {
				this.init("VA_TEXTINPUTBOXFMX_713451","Identificador");
			}
		}			

		public static class Descripcion extends COBISInputValue {
			public Descripcion() {
				this.init("VA_TEXTINPUTBOXMLD_237451","Descripcion");
			}
		}			

		public static class Clase extends COBISInputValue {
			public Clase() {
				this.init("VA_TEXTINPUTBOXMFU_598451","Clase");
			}
		}			

		public static class TasaPIT extends COBISInputValue {
			public TasaPIT() {
				this.init("VA_TEXTINPUTBOXXNE_889451","TasaPIT");
			}
		}			
	}
}
