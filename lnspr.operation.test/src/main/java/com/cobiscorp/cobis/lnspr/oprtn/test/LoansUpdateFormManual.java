package com.cobiscorp.cobis.lnspr.oprtn.test;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.COBISButton;
import com.cobiscorp.cobis.utils.controls.impl.COBISDropDownList;
import com.cobiscorp.cobis.utils.controls.impl.COBISGrid;
import com.cobiscorp.cobis.utils.controls.impl.COBISInputTextButton;
import com.cobiscorp.cobis.utils.controls.impl.COBISInputValue;

public class LoansUpdateFormManual {
	public static final GridLoansUpdate gridLoansUpdate = Singleton.getInstance(GridLoansUpdate.class);
	
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommandVA_VAIMAGEBUTTONNN_614498 cmdCommandVA_VAIMAGEBUTTONNN_614498 = Singleton.getInstance(CmdCommandVA_VAIMAGEBUTTONNN_614498.class);
		
		public static class CmdCommandVA_VAIMAGEBUTTONNN_614498 extends COBISButton{
			public CmdCommandVA_VAIMAGEBUTTONNN_614498 () {
				this.init("VA_VAIMAGEBUTTONNN_614498", "Buscar");
			}
		}
		public static final CmdCommandNumPrestamo cmdCommandNumPrestamo = Singleton.getInstance(CmdCommandNumPrestamo.class);
		
		public static class CmdCommandNumPrestamo extends COBISButton{
			public CmdCommandNumPrestamo () {
				this.init("", "NumPrestamo","//*[@id='VA_OPTIONSRSSAYGFF_943498_DIV']//span[contains(@class, 'k-input ng-scope')]");
			}
		}
		public static final SearchByButton searchByButton = Singleton.getInstance(SearchByButton.class);
		
		public static class SearchByButton extends COBISDropDownList{
			public SearchByButton () {
				this.init("VA_OPTIONSRSSAYGFF_943498", "BuscarPor");
			}
		}
	}
	
	public static class LoansUpdate{
		private LoansUpdate() {
			throw new IllegalStateException("LoansUpdate is a utility class");
		}
		public static final InputSearchByNumPres inputSearchByNumPres = Singleton.getInstance(InputSearchByNumPres.class);
		
		public static class InputSearchByNumPres extends COBISInputValue{
			public InputSearchByNumPres () {
				this.init("VA_OPERATIONNUMRER_544498", "BuscarPorNumPrestamo");
			}
		}
		public static final InputSearchByCostumer inputSearchByCostumer = Singleton.getInstance(InputSearchByCostumer.class);
		
		public static class InputSearchByCostumer extends COBISInputTextButton{
			public InputSearchByCostumer () {
				this.init("VA_CUSTOMERLJUXFJK_520498", "BuscarPorCliente");
			}
		}
		
		
	}

	public static class GridLoansUpdate extends COBISGrid {
		public GridLoansUpdate() {
			this.init("QV_5045_37178", "QV_5045_37178");
		} 
	}
	
	
}
