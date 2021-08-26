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

public class MembersLineFormForm{

	public static final GridSummaryMembers gridSummaryMembers = Singleton.getInstance(GridSummaryMembers.class);
	private MembersLineFormForm() {
		throw new IllegalStateException("MembersLineFormForm is a utility class");
	}
	
	public static class GridSummaryMembers extends COBISGrid {
		public GridSummaryMembers() {
			this.init("QV_HR68_RLL81", "QV_HR68_RLL81");
		} 

		public static final NameMember nameMember = Singleton.getInstance(NameMember.class);
		public static final DesMoney desMoney = Singleton.getInstance(DesMoney.class);
		public static final Approved approved = Singleton.getInstance(Approved.class);
		public static final Used used = Singleton.getInstance(Used.class);
		public static final Available available = Singleton.getInstance(Available.class);
		public static final Quote quote = Singleton.getInstance(Quote.class);
		public static final CodMember codMember = Singleton.getInstance(CodMember.class);
		public static final CodMoney codMoney = Singleton.getInstance(CodMoney.class);

		public static class NameMember extends COBISInputValue {
			public NameMember() {
				this.init("VA_TEXTINPUTBOXRWN_542602","Miembro");
			}
		}			

		public static class DesMoney extends COBISInputValue {
			public DesMoney() {
				this.init("VA_TEXTINPUTBOXUWI_692602","Moneda");
			}
		}			

		public static class Approved extends COBISInputValue {
			public Approved() {
				this.init("VA_TEXTINPUTBOXBLS_253602","Aprobado");
			}
		}			

		public static class Used extends COBISInputValue {
			public Used() {
				this.init("VA_TEXTINPUTBOXIKN_498602","Utilizado");
			}
		}			

		public static class Available extends COBISInputValue {
			public Available() {
				this.init("VA_TEXTINPUTBOXWUO_764602","Disponible");
			}
		}			

		public static class Quote extends COBISInputValue {
			public Quote() {
				this.init("VA_TEXTINPUTBOXWXT_462602","CotizM");
			}
		}			

		public static class CodMember extends COBISInputValue {
			public CodMember() {
				this.init("VA_TEXTINPUTBOXMXI_812602","CodMember");
			}
		}			

		public static class CodMoney extends COBISInputValue {
			public CodMoney() {
				this.init("VA_TEXTINPUTBOXJUI_443602","CodMoney");
			}
		}			
	}
}
