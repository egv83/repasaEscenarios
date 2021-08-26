package com.cobiscorp.cobis.lnspr.oprtn.test;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.COBISButton;
import com.cobiscorp.cobis.utils.controls.impl.COBISInputValue;

public class CostumerSearchFormManu {
	private CostumerSearchFormManu(){
		throw new IllegalStateException("CostumerSearchFormManu is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final FiltradoPorEntidad filtradoPorEntidad = Singleton.getInstance(FiltradoPorEntidad.class);
		public static class FiltradoPorEntidad extends COBISButton {
			public FiltradoPorEntidad(){
				this.init("","FiltadoPorCliente", "//*[@id='dropdown-']");
			}
		}
		
		public static final FiltradoPorEntidadCliente filtradoPorEntidadCliente = Singleton.getInstance(FiltradoPorEntidadCliente.class);
		public static class FiltradoPorEntidadCliente extends COBISButton {
			public FiltradoPorEntidadCliente(){
				this.init("","filtradoPorClienteCliente", "//*[@id='drop-cliente']/ul/li[1]/a[contains(@class,'ng-binding')]");
			}
		}
		
		public static final FiltradoPorEntidadProspecto filtradoPorEntidadProspecto = Singleton.getInstance(FiltradoPorEntidadProspecto.class);
		public static class FiltradoPorEntidadProspecto extends COBISButton {
			public FiltradoPorEntidadProspecto(){
				this.init("","FiltradoPorClienteProspecto", "//*[@id='drop-cliente']/ul/li[2]/a[contains(@class,'ng-binding')]");
			}
		}
		
		public static final FiltradoPorTipo filtradoPorTipo = Singleton.getInstance(FiltradoPorTipo.class);
		public static class FiltradoPorTipo extends COBISButton{
			public FiltradoPorTipo(){
				this.init("","FiltradoPorTipo", "//*[@id='filters']/div[3]/div/div/button");
			}
		}

		public static final FiltradoPorTipoPN filtradoPorTipoPN = Singleton.getInstance(FiltradoPorTipoPN.class);
		public static class FiltradoPorTipoPN extends COBISButton{
			public FiltradoPorTipoPN(){
				this.init("","FiltradoPorTipoPN", "//*[@id='filters']/div[3]/div/div/ul/li[1]/a[contains(@class,'ng-binding')]");
			}
		}
		
		public static final FiltradoPorTipoPJ filtradoPorTipoPJ = Singleton.getInstance(FiltradoPorTipoPJ.class);
		public static class FiltradoPorTipoPJ extends COBISButton{
			public FiltradoPorTipoPJ(){
				this.init("","FiltradoPorTipoPJ", "//*[@id='filters']/div[3]/div/div/ul/li[2]/a[contains(@class,'ng-binding')]");
			}
		}
		
		public static final FiltradoPorBuscarPor filtradoPorBuscarPor = Singleton.getInstance(FiltradoPorBuscarPor.class);
		public static class FiltradoPorBuscarPor extends COBISButton{
			public FiltradoPorBuscarPor(){
				this.init("","FiltradoPorBuscarPor","//*[@id='filters']/div[4]/div/div/button[contains(@class,'btn btn-link ng-binding')]");
			}
		}
		
		public static final FiltradoPorBuscarPorIdentificacion filtradoPorBuscarPorIdentificacion = Singleton.getInstance(FiltradoPorBuscarPorIdentificacion.class);
		public static class FiltradoPorBuscarPorIdentificacion extends COBISButton{
			public FiltradoPorBuscarPorIdentificacion(){
				this.init("","FiltradoPorBuscarPorIdentificacion", "//*[@id='filters']/div[4]/div/div/ul/li[1]/a[contains(@class,'ng-binding')]");
			}
		}
		
		public static final FiltradoPorBuscarPorNombre filtradoPorBuscarPorNombre = Singleton.getInstance(FiltradoPorBuscarPorNombre.class);
		public static class FiltradoPorBuscarPorNombre extends COBISButton{
			public FiltradoPorBuscarPorNombre(){
				this.init("","FiltradoPorBuscarPorNombre", "//*[@id='filters']/div[4]/div/div/ul/li[2]/a[contains(@class,'ng-binding')]");
			}
		}
		
		public static final FiltradoPorBuscarPorCodigo filtradoPorBuscarPorCodigo = Singleton.getInstance(FiltradoPorBuscarPorCodigo.class);
		public static class FiltradoPorBuscarPorCodigo extends COBISButton{
			public FiltradoPorBuscarPorCodigo(){
				this.init("","FiltradoPorBuscarPorCodigo", "//*[@id='filters']/div[4]/div/div/ul/li[3]/a[contains(@class,'ng-binding')]");
			}
		}
		
		public static final ButtonSearch buttonSearch = Singleton.getInstance(ButtonSearch.class);
		public static class ButtonSearch extends COBISButton{
			public ButtonSearch(){
				this.init("","ButtonSearch", "//*[@id='organizer']/div/div/div[2]/div/div[1]/div/div[3]/div/div/button[contains(@class,'btn btn-primary btn-lg')]");
			}
		}
		
		public static final ButtonSeleccionar buttonSeleccionar = Singleton.getInstance(ButtonSeleccionar.class);
		public static class ButtonSeleccionar extends COBISButton{
			public ButtonSeleccionar(){
				this.init("","ButtonSeleccionar", "//*[@id='organizer']/div/div/div[3]/div/div[4]/button[contains(text(),'Seleccionar')]");
			}
		}
	}

	public static class InputValue{
		private InputValue(){
			throw new IllegalStateException("InputValue is a utility class");
		}
		public static final InputIdentificacion inputIdentificacion = Singleton.getInstance(InputIdentificacion.class);
		public static class InputIdentificacion extends COBISInputValue{
			public InputIdentificacion(){
				this.init("","InputIdentificacion", "//*[@id='organizer']/div/div/div[2]/div/div[1]/div/div[2]/div/div/input[contains(@class,'form-control input-lg')]");
			}
		}
		
		public static final InputNombre inputNombre = Singleton.getInstance(InputNombre.class);
		public static class InputNombre extends COBISInputValue{
			public InputNombre(){
				this.init("","InputNombre", "//*[@id='autoCompleteControl']");
			}
		}
		
		public static final InputCodigo inputCodigo = Singleton.getInstance(InputCodigo.class);
		public static class InputCodigo extends COBISInputValue{
			public InputCodigo(){
				this.init("","InputCodigo", "//*[@id='secuencial']");
			}
		}
	}

	public static class Grid{
		private Grid(){
			throw new IllegalStateException("Grid is a utility class");
		}
		public static final GridPrimer gridPrimer = Singleton.getInstance(GridPrimer.class);
		public static class GridPrimer extends COBISButton{
			public GridPrimer(){
				this.init("","GridPrimer", "//*[@id='gridNaturalId']//table/tbody/tr");
			}
		}
		public static final GridPrimerCompany gridPrimerCompany = Singleton.getInstance(GridPrimerCompany.class);
		public static class GridPrimerCompany extends COBISButton{
			public GridPrimerCompany(){
				this.init("","GridPrimer", "//*[@id='gridCompanyId']//table/tbody/tr");
			}
		}
	}
}