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

public class ProjectOtherChargesForm{
	public static final OtherCharges otherCharges = Singleton.getInstance(OtherCharges.class);

	private ProjectOtherChargesForm() {
		throw new IllegalStateException("ProjectOtherChargesForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMPROJECTON34 cmdCommand1IdCMPROJECTON34 = Singleton.getInstance(CmdCommand1IdCMPROJECTON34.class);
		
		public static class CmdCommand1IdCMPROJECTON34 extends COBISButton{
			public CmdCommand1IdCMPROJECTON34 () {
				this.init("CM_PROJECTO_N34", "Procesar");
			}
		}
	
		public static final CmdCommand2IdCMPROJECTOTRS cmdCommand2IdCMPROJECTOTRS = Singleton.getInstance(CmdCommand2IdCMPROJECTOTRS.class);
		
		public static class CmdCommand2IdCMPROJECTOTRS extends COBISButton{
			public CmdCommand2IdCMPROJECTOTRS () {
				this.init("CM_PROJECTO_TRS", "Cancelar");
			}
		}
	

	}
	

	public static class OtherCharges {
	
		private OtherCharges() {
			throw new IllegalStateException("ProjectOtherChargesForm is a utility class");
		}
		
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final Concept concept = Singleton.getInstance(Concept.class);
		public static final Value value = Singleton.getInstance(Value.class);
		public static final IniDiv iniDiv = Singleton.getInstance(IniDiv.class);
		public static final DivUp divUp = Singleton.getInstance(DivUp.class);
		public static final BaseCalculation baseCalculation = Singleton.getInstance(BaseCalculation.class);
		public static final Commentary commentary = Singleton.getInstance(Commentary.class);

		public static class Currency extends COBISDropDownList {
			public Currency() {
				this.init("VA_CURRENCYTRTBCCA_970696","Moneda");
			}
		}			

		public static class Concept extends COBISDropDownList {
			public Concept() {
				this.init("VA_CONCEPTFHEMXUHJ_108696","Concepto");
			}
		}			

		public static class Value extends COBISInputValue {
			public Value() {
				this.init("VA_VALUENGWHVWDDNU_188696","Valor");
			}
		}			

		public static class IniDiv extends COBISInputValue {
			public IniDiv() {
				this.init("VA_INIDIVYCRRTXBCX_837696","CuotaDesde");
			}
		}			

		public static class DivUp extends COBISInputValue {
			public DivUp() {
				this.init("VA_DIVUPYMACQXCZMH_148696","CuotaHasta");
			}
		}			

		public static class BaseCalculation extends COBISInputValue {
			public BaseCalculation() {
				this.init("VA_BASECALCULATOII_165696","BasedeCalculo");
			}
		}			

		public static class Commentary extends COBISInputValue {
			public Commentary() {
				this.init("VA_COMMENTARYNUYIB_733696","Comentario");
			}
		}			
	}
}
