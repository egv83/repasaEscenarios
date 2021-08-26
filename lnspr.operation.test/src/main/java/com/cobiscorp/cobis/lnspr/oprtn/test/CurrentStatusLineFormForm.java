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

public class CurrentStatusLineFormForm{

	public static final GridSummaryStatus gridSummaryStatus = Singleton.getInstance(GridSummaryStatus.class);
	private CurrentStatusLineFormForm() {
		throw new IllegalStateException("CurrentStatusLineFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	
	
	public static class GridSummaryStatus extends COBISGrid {
		public GridSummaryStatus() {
			this.init("QV_HQ80_NZX99", "QV_HQ80_NZX99");
		} 

		public static final Product product = Singleton.getInstance(Product.class);
		public static final CodMoney codMoney = Singleton.getInstance(CodMoney.class);
		public static final DescMoney descMoney = Singleton.getInstance(DescMoney.class);
		public static final Approved approved = Singleton.getInstance(Approved.class);
		public static final Used used = Singleton.getInstance(Used.class);
		public static final Available available = Singleton.getInstance(Available.class);
		public static final CurrencyQuote currencyQuote = Singleton.getInstance(CurrencyQuote.class);

		public static class Product extends COBISInputValue {
			public Product() {
				this.init("VA_TEXTINPUTBOXEXF_996928","Producto");
			}
		}			

		public static class CodMoney extends COBISDropDownList {
			public CodMoney() {
				this.init("VA_TEXTINPUTBOXSPG_308928","Moneda");
			}
		}			

		public static class DescMoney extends COBISInputValue {
			public DescMoney() {
				this.init("VA_TEXTINPUTBOXIDH_851928","Moneda");
			}
		}			

		public static class Approved extends COBISInputValue {
			public Approved() {
				this.init("VA_TEXTINPUTBOXQRS_250928","Aprobado");
			}
		}			

		public static class Used extends COBISInputValue {
			public Used() {
				this.init("VA_TEXTINPUTBOXURM_280928","Utilizado");
			}
		}			

		public static class Available extends COBISInputValue {
			public Available() {
				this.init("VA_TEXTINPUTBOXDMY_107928","Disponible");
			}
		}			

		public static class CurrencyQuote extends COBISInputValue {
			public CurrencyQuote() {
				this.init("VA_TEXTINPUTBOXDDA_394928","CotizM");
			}
		}			
	}
}
