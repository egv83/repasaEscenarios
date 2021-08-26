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

public class LoansDistributionMembersForm{
	public static final Members members = Singleton.getInstance(Members.class);

	public static final GridMemberDetail gridMemberDetail = Singleton.getInstance(GridMemberDetail.class);
	private LoansDistributionMembersForm() {
		throw new IllegalStateException("LoansDistributionMembersForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnmGuardarIdVAVABUTTONQQAURTL245520 btnmGuardarIdVAVABUTTONQQAURTL245520 = Singleton.getInstance(BtnmGuardarIdVAVABUTTONQQAURTL245520.class);
		
		public static class BtnmGuardarIdVAVABUTTONQQAURTL245520 extends COBISButton{
			public BtnmGuardarIdVAVABUTTONQQAURTL245520 () {
				this.init("VA_VABUTTONQQAURTL_245520", "Guardar");
			}
		}
	
		public static final BtnmCancelarIdVAVABUTTONBPDWGMJ893520 btnmCancelarIdVAVABUTTONBPDWGMJ893520 = Singleton.getInstance(BtnmCancelarIdVAVABUTTONBPDWGMJ893520.class);
		
		public static class BtnmCancelarIdVAVABUTTONBPDWGMJ893520 extends COBISButton{
			public BtnmCancelarIdVAVABUTTONBPDWGMJ893520 () {
				this.init("VA_VABUTTONBPDWGMJ_893520", "Cancelar");
			}
		}
	

	}
	

	public static class Members {
	
		private Members() {
			throw new IllegalStateException("LoansDistributionMembersForm is a utility class");
		}
		
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final CodLine codLine = Singleton.getInstance(CodLine.class);
		public static final Member member = Singleton.getInstance(Member.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final Observations observations = Singleton.getInstance(Observations.class);
		public static final Control control = Singleton.getInstance(Control.class);
		public static final Used used = Singleton.getInstance(Used.class);
		public static final Available available = Singleton.getInstance(Available.class);

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_3652TDZPJASKRXR_211520","Secuencial");
			}
		}			

		public static class CodLine extends COBISInputValue {
			public CodLine() {
				this.init("VA_9075VUUFEHIMVFN_360520","CodigodeLinea");
			}
		}			

		public static class Member extends COBISDropDownList {
			public Member() {
				this.init("VA_MEMBERXNGXBGLEO_835520","Miembro");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_9266VJWWMPOMJFN_898520","Monto");
			}
		}			

		public static class Currency extends COBISDropDownList {
			public Currency() {
				this.init("VA_3878VMYWQJKGBUI_207520","Moneda");
			}
		}			

		public static class Observations extends COBISInputValue {
			public Observations() {
				this.init("VA_3194SGDCRJRKSEZ_549520","Observaciones");
			}
		}			

		public static class Control extends COBISCheckBox {
			public Control() {
				this.init("VA_9291FBOEQJGPPQK_733520","ControlaMonto");
			}
		}			

		public static class Used extends COBISInputValue {
			public Used() {
				this.init("VA_2MABOJDXJMANZRD_284520","Utilizado");
			}
		}			

		public static class Available extends COBISInputValue {
			public Available() {
				this.init("VA_3EZYKBGVYATGWHR_161520","Disponible");
			}
		}			
	}
	
	public static class GridMemberDetail extends COBISGrid {
		public GridMemberDetail() {
			this.init("QV_NW92_QCN40", "QV_NW92_QCN40");
		} 

		public static final Member member = Singleton.getInstance(Member.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final Used used = Singleton.getInstance(Used.class);
		public static final Available available = Singleton.getInstance(Available.class);
		public static final ControlAmount controlAmount = Singleton.getInstance(ControlAmount.class);
		public static final Observations observations = Singleton.getInstance(Observations.class);
		public static final CodeMember codeMember = Singleton.getInstance(CodeMember.class);

		public static class Member extends COBISInputValue {
			public Member() {
				this.init("VA_TEXTINPUTBOXLAB_524520","Miembro");
			}
		}			

		public static class Currency extends COBISInputValue {
			public Currency() {
				this.init("VA_TEXTINPUTBOXDRG_443520","Moneda");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXOYO_569520","Monto");
			}
		}			

		public static class Used extends COBISInputValue {
			public Used() {
				this.init("VA_TEXTINPUTBOXSNW_442520","Utilizado");
			}
		}			

		public static class Available extends COBISInputValue {
			public Available() {
				this.init("VA_TEXTINPUTBOXNMX_649520","Disponible");
			}
		}			

		public static class ControlAmount extends COBISInputValue {
			public ControlAmount() {
				this.init("VA_TEXTINPUTBOXOXC_144520","ControlaMonto");
			}
		}			

		public static class Observations extends COBISInputValue {
			public Observations() {
				this.init("VA_TEXTINPUTBOXQNR_943520","Observaciones");
			}
		}			

		public static class CodeMember extends COBISInputValue {
			public CodeMember() {
				this.init("VA_TEXTINPUTBOXXXZ_656520","CodeMember");
			}
		}			
	}
}
