package com.cobiscorp.cobis.lnspr.test.impl.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.lnspr.oprtn.test.LoansCreateFormForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansUpdateFormForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansUpdateFormManual;
import com.cobiscorp.cobis.lnspr.oprtn.test.ModalOperationItemsForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.OperationItemsForm;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;

import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class ActualizacionDeOperacionesStepDefinitions {
	String Rublo = "";

	@Cuando("realiza la busqueda por {string} con {string}")
	public void realiza_la_busqueda_por_con(String buscarPor, String numeroOperacion) {
	    FormActions.selectByText(LoansUpdateFormManual.Buttons.searchByButton, buscarPor);
	    if(buscarPor.equals("Num. Préstamo")){
	    	FormActions.enterText(LoansUpdateFormManual.LoansUpdate.inputSearchByNumPres, numeroOperacion);
	    }	    
	    else if(buscarPor.equals("Cliente")){
//	    	FormActions.clickTextButton(LoansUpdateFormManual.LoansUpdate.inputSearchByCostumer);
	    	FormActions.enterText(LoansUpdateFormManual.LoansUpdate.inputSearchByCostumer, numeroOperacion);
	    	
	    }
	    FormActions.clickOn(LoansUpdateFormManual.Buttons.cmdCommandVA_VAIMAGEBUTTONNN_614498);
	    GridActions.selectRecord(LoansUpdateFormManual.gridLoansUpdate, 1);
	}

	@Cuando("selecciona la pestaña {string}, boton {string} ingresar {string} y {string}, presionamos boton {string}")
	public void selecciona_la_pestaña_boton_ingresar_y_presionamos_boton(String tab, String botonGrid, String campoRublo, String campoTasa, String boton) {
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
		// Tab Rubros
		if(tab.equals("Rubros")){ FormActions.clickLayout(LoansUpdateFormForm.Layouts.lytViewContainerBaseIdVCCZFQNEQAQF253908); }
		if(botonGrid.equals("Nuevo")){ GridActions.clickNewRecord(OperationItemsForm.gridOperationItemsList); }
		if(campoRublo.length()>0){
			FormActions.selectByText(ModalOperationItemsForm.OperationItemsList.item, campoRublo); 
			this.Rublo = campoRublo;
		}
		if(campoTasa.length()>0){ FormActions.enterText(ModalOperationItemsForm.OperationItemsList.percentage, campoTasa); }
		// Boton Guardar Modal
		FormActions.clickOn(ModalOperationItemsForm.Buttons.cmdCommand1IdCMMODALOPENNN);
		FormActions.scrollTotheEndOfThePage();
		FormActions.waitUntilElementIsEnabledAndClickable(OperationItemsForm.Buttons.btnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587, 3);
		if(boton.equals("Guardar")){ FormActions.clickOn(OperationItemsForm.Buttons.btnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587); }   
		FormActions.scrollToPercentage(20);
		GridActions.scrollToLeft(OperationItemsForm.gridOperationItemsList);
		BaseActions.takeScreenshot();
	}
	
	@Cuando("selecciona la pestaña {string} se visualiza la tabla")
	public void selecciona_la_pestaña_se_valida_en_la_tabla(String tab) {
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
		// Tab Rubros
		if(tab.equals("Amortización")){ FormActions.clickLayout(LoansUpdateFormForm.Layouts.lytViewContainerBaseIdVCUTMLTUSZMJ714908); }
		FormActions.scrollToPercentage(36);
		BaseActions.takeScreenshot();
		GridActions.scrollToRight(LoansCreateFormForm.gridAmortizationEntity);
		BaseActions.takeScreenshot();
	}


	@Cuando("presionar el boton de {string}")
	public void presionar_el_boton_de(String boton) {
		// Transmitir
				FormActions.scrollTotheEndOfThePage();
				switch(boton){
					case "Transmitir": 
						BaseActions.waitUntilElementIsPresent(LoansUpdateFormForm.Buttons.cmdCommand1IdCMTLNSPRVJ776, 10);
						FormActions.clickOn(LoansUpdateFormForm.Buttons.cmdCommand1IdCMTLNSPRVJ776);
						break;
					case "Guardar":
						BaseActions.waitUntilElementIsPresent(LoansUpdateFormForm.Buttons.btnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587, 5);
						FormActions.clickOn(LoansUpdateFormForm.Buttons.btnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587);
						break;
				}
	}
	
	@Cuando("se despliega los mensajes de alerta {string}")
	public void se_despliega_los_mensajes_de_alerta(String message) {
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 10);
		ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, message);
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
	}
	
	@Cuando("selecciona la pestaña {string} se selecciona el rubro {string}, se presiona boton {string}")
	public void selecciona_la_pestaña_se_selecciona_el_rubro_se_presiona_boton(String tab, String rubroName, String boton) {
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
		// Tab Rubros
		if(tab.equals("Rubros")){ FormActions.clickLayout(LoansUpdateFormForm.Layouts.lytViewContainerBaseIdVCCZFQNEQAQF253908); }
		FormActions.scrollTotheEndOfThePage();
		if(boton.equals("Eliminar")){
			System.out.println("Enter DELETE");
			GridActions.clickDeleteRecordByColumnAndText(OperationItemsForm.gridOperationItemsList, 1, rubroName); 
			GridActions.clickConfirmDelete(true);
		}
		//Boton Guardar
		FormActions.scrollTotheEndOfThePage();
		FormActions.clickOn(OperationItemsForm.Buttons.btnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587);
		FormActions.scrollToPercentage(20);
		GridActions.scrollToLeft(OperationItemsForm.gridOperationItemsList);
		BaseActions.takeScreenshot();
	}
	
	@Cuando("selecciona la pestaña {string}, en rubro {string} boton {string} campo {string} se ingresa {string}, presionar boton {string} y se valida la modificación de la tasa en la pestaña de {string}")
	public void selecciona_la_pestaña_en_rubro_boton_campo_se_ingresa_presionar_boton_y_se_valida_la_modificación_de_la_tasa_en_la_pestaña_de(String tab, String rubroName, String botonGrid, String campo, String tasa, String boton, String tabValidacion) {
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
		// Tab Rubros
		if(tab.equals("Rubros")){ FormActions.clickLayout(LoansUpdateFormForm.Layouts.lytViewContainerBaseIdVCCZFQNEQAQF253908); }
		FormActions.scrollTotheEndOfThePage();
		if(botonGrid.equals("Editar")){ 
			if(rubroName.equals("INT")){ GridActions.clickEditRecordByColumnAndText(OperationItemsForm.gridOperationItemsList, 1, rubroName); }
		}
		else if(botonGrid.equals("Nuevo")){ GridActions.clickNewRecord(OperationItemsForm.gridOperationItemsList); }
		if(campo.equals("Tasa")){ 
			FormActions.enterText(ModalOperationItemsForm.OperationItemsList.percentage, tasa);
			// Boton Guardar Modal
			FormActions.clickOn(ModalOperationItemsForm.Buttons.cmdCommand1IdCMMODALOPENNN);
		}
		FormActions.scrollTotheEndOfThePage();
		FormActions.waitUntilElementIsEnabledAndClickable(OperationItemsForm.Buttons.btnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587, 3);
		if(boton.equals("Guardar")){ FormActions.clickOn(OperationItemsForm.Buttons.btnVAVAVABUTTONTRP260587IdVAVAVABUTTONTRP260587); }
		// Tab Rubros
		if(tabValidacion.equals("Amortización")){ 
			FormActions.scrollToBeginingOfThePage();
			FormActions.clickLayout(LoansUpdateFormForm.Layouts.lytViewContainerBaseIdVCUTMLTUSZMJ714908);
			FormActions.scrollTotheEndOfThePage();
			FormActions.clickOn(LoansUpdateFormForm.Buttons.btnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198);
			FormActions.scrollToBeginingOfThePage();
			String Value = BaseActions.getValue(LoansUpdateFormForm.AmortizationFormEntity.interest);
			
			if(Value.equals(tasa)){
				System.out.println("Value readable: "+ Value);
			}else{
				System.out.println("Value readable: "+ Value);
				ValidationActions.isEquals(LoansUpdateFormForm.AmortizationFormEntity.interest.getTarget(), tasa);
			}
		}
		FormActions.scrollToPercentage(36);
		BaseActions.takeScreenshot();
		GridActions.scrollToRight(LoansCreateFormForm.gridAmortizationEntity);
		BaseActions.takeScreenshot();
	}

	@Cuando("seleccionar la pestaña {string} el campo {string}, {string}, {string}, {string}, {string} y presionar {string}")
	public void seleccionar_la_pestaña_el_campo_y_presionar(String tab, String reajustable, String PeriodoReajustable, String PagoIntereses, String PagoPor, String PagoNorExt, String boton) {
		FormActions.scrollToBeginingOfThePage();
		BaseActions.waitUntilElementIsPresent(LoansUpdateFormForm.Layouts.lytViewContainerBaseIdVCSLGEFSJAUA161908, 5);
		if(tab.equals("Parámetros Generales")){ FormActions.clickLayout(LoansUpdateFormForm.Layouts.lytViewContainerBaseIdVCSLGEFSJAUA161908); }
		
		if(reajustable.length()>0){
			FormActions.selectRadioButtonValue(LoansUpdateFormForm.GeneralParametersQuery.readjustable, reajustable.toUpperCase());
			FormActions.enterText(LoansUpdateFormForm.GeneralParametersQuery.periodicity, PeriodoReajustable);
		}
		else if(PagoIntereses.length()>0){
			FormActions.scrollTotheEndOfThePage();
			PagoIntereses = PagoIntereses.toLowerCase();
			String valor="";
			switch(PagoIntereses){
				case "paga intereses acumulados?":
					valor = "Paga Intereses acumulados?"; break;
				case "paga intereses proyectados?": 
					valor = "Paga Intereses Proyectados?"; break;
				case "paga intereses en valor presente?":
					valor = "Paga Intereses en Valor Presente?"; break;
			}
			FormActions.selectRadioButtonValue(LoansUpdateFormForm.GeneralParametersQuery.interestPayment, valor);
		}
		else if(PagoPor.length()>0){
			FormActions.scrollTotheEndOfThePage();
			PagoPor = PagoPor.toLowerCase();
			String valor="";
			switch(PagoPor){
				case "pagos por cuota":
					valor = "Pagos por Cuota"; break;
				case "pagos por rubro": 
					valor = "Pagos por Rubro"; break;
			}
			FormActions.selectRadioButtonValue(LoansUpdateFormForm.GeneralParametersQuery.kindPayment, valor);
		}
		else if(PagoNorExt.length()>0){
			FormActions.scrollTotheEndOfThePage();
			PagoNorExt = PagoNorExt.toLowerCase();
			System.out.println("Valor PagoNorExt: "+PagoNorExt);
			String valor="";
			switch(PagoNorExt){
				case "pago normal":
					valor = "Pago Normal"; break;
				case "pago extraordinario con reducción de cuota ": 
					valor = "Pago Extraordinario con Reducción de Cuota "; break;
				case "pago extraordinario con reducción de tiempo":
					valor = "Pago Extraordinario con Reducción de Tiempo"; break;
			}
			System.out.println("Valor Asignado: "+valor);
			FormActions.selectRadioButtonValue(LoansUpdateFormForm.GeneralParametersQuery.typePayment, valor);
		}
		FormActions.takeScreenshot();
		FormActions.scrollTotheEndOfThePage();
		if(boton.equals("Guardar")){FormActions.clickOn(LoansUpdateFormForm.Buttons.btnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309);}
	}

	@Cuando("en pestaña {string} ingresar {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} y presionar {string}")
	public void en_pestaña_ingresar_y_presionar(String tab, String FechaValor, String TasaTotal, String Cuota, String TipoPlazo, String Plazo, String TipoCuota, String FechaVencimiento, String FechaDePagoFija, String DiaDePago, String Pint, String Pcap, String FechaDePagoExtendido, String GraciaMora, String MesGracia, String PerGraciaCapital, String PerGraciaInteres, String BaseCalculo, String TipoAmortizacion, String boton) {
		if(tab.equals("Amortización")){ FormActions.clickLayout(LoansUpdateFormForm.Layouts.lytViewContainerBaseIdVCUTMLTUSZMJ714908); }
		if(FechaValor.length()>0){ FormActions.setDate(LoansUpdateFormForm.AmortizationFormEntity.valueDate, FechaValor); }
		if(TasaTotal.length()>0){ FormActions.enterText(LoansUpdateFormForm.AmortizationFormEntity.interest, TasaTotal); }
		if(Cuota.length()>0){ FormActions.enterText(LoansUpdateFormForm.AmortizationFormEntity.fee, Cuota); }
		if(TipoPlazo.length()>0){ FormActions.selectByText(LoansUpdateFormForm.AmortizationFormEntity.termType, TipoPlazo); }
		if(Plazo.length()>0){ FormActions.enterText(LoansUpdateFormForm.AmortizationFormEntity.term, Plazo); }
		if(TipoCuota.length()>0){ FormActions.selectByText(LoansUpdateFormForm.AmortizationFormEntity.typeFee, TipoCuota); }
		if(FechaVencimiento.length()>0){ FormActions.setDate(LoansUpdateFormForm.AmortizationFormEntity.firstDueDate, FechaVencimiento); }
		if(FechaDePagoFija.toLowerCase().equals("x")){ //&& FormActions.getCheckBoxValue(LoansCreateFormForm.AmortizationFormEntity.fixedPayementDay) 
			String clases = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(LoansUpdateFormForm.AmortizationFormEntity.fixedPayementDay.getId())).getAttribute("class");
			if (clases.contains("ng-touched") || clases.contains("ng-empty")){
				FormActions.clickOn(LoansUpdateFormForm.AmortizationFormEntity.fixedPayementDay); 				
			}
		}
		if(DiaDePago.length()>0){ FormActions.selectByText(LoansUpdateFormForm.AmortizationFormEntity.paymentDay, DiaDePago); }		
		if(Pint.length()>0){ FormActions.enterText(LoansUpdateFormForm.AmortizationFormEntity.termInterest, Pint); }
		if(Pcap.length()>0){ FormActions.enterText(LoansUpdateFormForm.AmortizationFormEntity.termCapital, Pcap); }
		if(FechaDePagoExtendido.length()>0){
			FormActions.scrollToPercentage(10);
			FormActions.setDate(LoansUpdateFormForm.AmortizationFormEntity.extendedPaymentDate, FechaDePagoExtendido);
		}
		if(GraciaMora.length()>0){ FormActions.enterText(LoansUpdateFormForm.AmortizationFormEntity.daysGraceDefault, GraciaMora); }		
		if(MesGracia.length()>0){ FormActions.selectByText(LoansUpdateFormForm.AmortizationFormEntity.monthGrace, MesGracia); }
		if(PerGraciaCapital.length()>0){ FormActions.enterText(LoansUpdateFormForm.AmortizationFormEntity.termGraceCapital, PerGraciaCapital); }
		if(PerGraciaInteres.length()>0){ FormActions.enterText(LoansUpdateFormForm.AmortizationFormEntity.termGraceInterest, PerGraciaInteres); }
		if(BaseCalculo.length()>0){
			BaseCalculo = BaseCalculo.toUpperCase();
			switch(BaseCalculo){
				case "COMERCIAL": 
					FormActions.selectRadioButtonValue(LoansUpdateFormForm.AmortizationFormEntity.baseInterestCalculation, "COMERCIAL"); break;
				case "REAL": 
					FormActions.selectRadioButtonValue(LoansUpdateFormForm.AmortizationFormEntity.baseInterestCalculation, "REAL"); break;
			}
		}
		if(TipoAmortizacion.length()>0){
			TipoAmortizacion = TipoAmortizacion.substring(0,1).toUpperCase() + TipoAmortizacion.substring(1);
			switch(TipoAmortizacion){
				case "Alemana": 
					FormActions.selectRadioButtonValue(LoansUpdateFormForm.AmortizationFormEntity.typeAmortization, "Alemana"); break;
				case "Francesa": 
					FormActions.selectRadioButtonValue(LoansUpdateFormForm.AmortizationFormEntity.typeAmortization, "Francesa"); break;
				case "Manual": 
					FormActions.selectRadioButtonValue(LoansUpdateFormForm.AmortizationFormEntity.typeAmortization, "Manual"); break;
			}
		}
		FormActions.takeScreenshot();
		if(boton.length()>0){
			FormActions.scrollTotheEndOfThePage();
			FormActions.clickOn(LoansUpdateFormForm.Buttons.btnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198);
		}
		FormActions.scrollToPercentage(36);
		BaseActions.takeScreenshot();
	}
	
	@Cuando("en pestaña {string} ingresar valores de Tipo de Amortizacion {string} y presionar {string}")
	public void en_pestaña_ingresar_valores_de_Tipo_de_Amortizacion_y_presionar(String tab, String TipoAmortizacion, String boton) {
		FormActions.scrollToBeginingOfThePage();
		if(tab.equals("Amortización")){ FormActions.clickLayout(LoansUpdateFormForm.Layouts.lytViewContainerBaseIdVCUTMLTUSZMJ714908); }
		FormActions.scrollToPercentage(15);
		if(TipoAmortizacion.length()>0){
			TipoAmortizacion = TipoAmortizacion.substring(0,1).toUpperCase() + TipoAmortizacion.substring(1);
			switch(TipoAmortizacion){
				case "Alemana": 
					FormActions.selectRadioButtonValue(LoansUpdateFormForm.AmortizationFormEntity.typeAmortization, "Alemana"); break;
				case "Francesa": 
					FormActions.selectRadioButtonValue(LoansUpdateFormForm.AmortizationFormEntity.typeAmortization, "Francesa"); break;
				case "Manual": 
					FormActions.selectRadioButtonValue(LoansUpdateFormForm.AmortizationFormEntity.typeAmortization, "Manual"); break;
			}
		}
		BaseActions.takeScreenshot();
		if(boton.equals("Calcular")){
			FormActions.scrollTotheEndOfThePage();
			FormActions.clickOn(LoansUpdateFormForm.Buttons.btnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198);
		}
		FormActions.scrollToPercentage(36);
		BaseActions.takeScreenshot();
		if(TipoAmortizacion.equals("Francesa")){
			GridActions.scrollToRight(LoansUpdateFormForm.gridAmortizationEntity);
			BaseActions.takeScreenshot();
		}
	}

}
