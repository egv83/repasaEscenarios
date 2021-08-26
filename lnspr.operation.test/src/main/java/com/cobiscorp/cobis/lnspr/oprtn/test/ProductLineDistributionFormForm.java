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

public class ProductLineDistributionFormForm{
	public static final ProductLineDistribution productLineDistribution = Singleton.getInstance(ProductLineDistribution.class);

	public static final GridProductLineDistributionList gridProductLineDistributionList = Singleton.getInstance(GridProductLineDistributionList.class);
	private ProductLineDistributionFormForm() {
		throw new IllegalStateException("ProductLineDistributionFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVABUTTONUYPWWXE933676IdVAVABUTTONUYPWWXE933676 btnVAVABUTTONUYPWWXE933676IdVAVABUTTONUYPWWXE933676 = Singleton.getInstance(BtnVAVABUTTONUYPWWXE933676IdVAVABUTTONUYPWWXE933676.class);
		
		public static class BtnVAVABUTTONUYPWWXE933676IdVAVABUTTONUYPWWXE933676 extends COBISButton{
			public BtnVAVABUTTONUYPWWXE933676IdVAVABUTTONUYPWWXE933676 () {
				this.init("VA_VABUTTONUYPWWXE_933676", "Guardar");
			}
		}
	
		public static final BtnVAVABUTTONDMJEJKM762676IdVAVABUTTONDMJEJKM762676 btnVAVABUTTONDMJEJKM762676IdVAVABUTTONDMJEJKM762676 = Singleton.getInstance(BtnVAVABUTTONDMJEJKM762676IdVAVABUTTONDMJEJKM762676.class);
		
		public static class BtnVAVABUTTONDMJEJKM762676IdVAVABUTTONDMJEJKM762676 extends COBISButton{
			public BtnVAVABUTTONDMJEJKM762676IdVAVABUTTONDMJEJKM762676 () {
				this.init("VA_VABUTTONDMJEJKM_762676", "Cancelar");
			}
		}
	

	}
	

	public static class ProductLineDistribution {
	
		private ProductLineDistribution() {
			throw new IllegalStateException("ProductLineDistributionFormForm is a utility class");
		}
		
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final CodLine codLine = Singleton.getInstance(CodLine.class);
		public static final Product product = Singleton.getInstance(Product.class);
		public static final ClientCod clientCod = Singleton.getInstance(ClientCod.class);
		public static final OpTypeAc opTypeAc = Singleton.getInstance(OpTypeAc.class);
		public static final OpTypePas opTypePas = Singleton.getInstance(OpTypePas.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final ControlsAmount controlsAmount = Singleton.getInstance(ControlsAmount.class);
		public static final Observations observations = Singleton.getInstance(Observations.class);
		public static final Used used = Singleton.getInstance(Used.class);
		public static final Available available = Singleton.getInstance(Available.class);

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_SEQUENTIALRWTZC_418676","Secuencial");
			}
		}			

		public static class CodLine extends COBISInputValue {
			public CodLine() {
				this.init("VA_CODLINEGMBTNMUY_339676","CodLinea");
			}
		}			

		public static class Product extends COBISDropDownList {
			public Product() {
				this.init("VA_PRODUCTWKWZPDFA_211676","Producto");
			}
		}			

		public static class ClientCod extends COBISDropDownList {
			public ClientCod() {
				this.init("VA_CLIENTCODHNEWWJ_288676","MiembroCliente");
			}
		}			

		public static class OpTypeAc extends COBISDropDownList {
			public OpTypeAc() {
				this.init("VA_OPTYPEACPEUXTGS_100676","TipoOperacion");
			}
		}			

		public static class OpTypePas extends COBISDropDownList {
			public OpTypePas() {
				this.init("VA_OPTYPEPASINULZZ_450676","TipoOperacion");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTCLGEIWQXX_908676","Monto");
			}
		}			

		public static class Currency extends COBISDropDownList {
			public Currency() {
				this.init("VA_CURRENCYIMFFWXD_243676","Moneda");
			}
		}			

		public static class ControlsAmount extends COBISCheckBox {
			public ControlsAmount() {
				this.init("VA_CONTROLSAMOUNTN_330676","ControlaMonto");
			}
		}			

		public static class Observations extends COBISInputValue {
			public Observations() {
				this.init("VA_OBSERVATIONSKUR_930676","Observaciones");
			}
		}			

		public static class Used extends COBISInputValue {
			public Used() {
				this.init("VA_USEDMINHMVRYCUI_522676","Utilizado");
			}
		}			

		public static class Available extends COBISInputValue {
			public Available() {
				this.init("VA_AVAILABLECGSSBD_703676","Disponible");
			}
		}			
	}
	
	public static class GridProductLineDistributionList extends COBISGrid {
		public GridProductLineDistributionList() {
			this.init("QV_QF17_TGN52", "QV_QF17_TGN52");
		} 

		public static final Product product = Singleton.getInstance(Product.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final ClientCod clientCod = Singleton.getInstance(ClientCod.class);
		public static final OpType opType = Singleton.getInstance(OpType.class);
		public static final CodCurrency codCurrency = Singleton.getInstance(CodCurrency.class);
		public static final DescCurrency descCurrency = Singleton.getInstance(DescCurrency.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final Used used = Singleton.getInstance(Used.class);
		public static final Available available = Singleton.getInstance(Available.class);
		public static final ControlsAmount controlsAmount = Singleton.getInstance(ControlsAmount.class);
		public static final Observations observations = Singleton.getInstance(Observations.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);

		public static class Product extends COBISInputValue {
			public Product() {
				this.init("VA_TEXTINPUTBOXGPM_735676","Producto");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_TEXTINPUTBOXQDQ_710676","Cliente");
			}
		}			

		public static class ClientCod extends COBISInputValue {
			public ClientCod() {
				this.init("VA_TEXTINPUTBOXXWZ_991676","MiembroCliente");
			}
		}			

		public static class OpType extends COBISInputValue {
			public OpType() {
				this.init("VA_TEXTINPUTBOXTMQ_302676","TipoOperacion");
			}
		}			

		public static class CodCurrency extends COBISDropDownList {
			public CodCurrency() {
				this.init("VA_TEXTINPUTBOXYAX_314676","Moneda");
			}
		}			

		public static class DescCurrency extends COBISInputValue {
			public DescCurrency() {
				this.init("VA_TEXTINPUTBOXWUH_488676","Moneda");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXFSY_298676","Monto");
			}
		}			

		public static class Used extends COBISInputValue {
			public Used() {
				this.init("VA_TEXTINPUTBOXGAX_318676","Utilizado");
			}
		}			

		public static class Available extends COBISInputValue {
			public Available() {
				this.init("VA_TEXTINPUTBOXMJV_319676","Disponible");
			}
		}			

		public static class ControlsAmount extends COBISInputValue {
			public ControlsAmount() {
				this.init("VA_TEXTINPUTBOXJDM_289676","ControlaMonto");
			}
		}			

		public static class Observations extends COBISInputValue {
			public Observations() {
				this.init("VA_TEXTINPUTBOXNPR_928676","Observaciones");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXZYV_184676","Sequential");
			}
		}			
	}
}
