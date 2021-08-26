package com.cobiscorp.cobis.lnspr.test.impl.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cobiscorp.cobis.lnspr.oprtn.test.CostumerSearchFormManu;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansCreateFormForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.ModalOperationItemsForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.OperationItemsForm;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.ContainerActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class CreacionDePrestamoStepDefinitions {
	String PlazoValue = "";
	String Rublo = "";
	
	
	@Cuando("se desea agregar el Cliente en el campo {string}")
	public void se_desea_agregar_el_Cliente_en_el_campo(String boton) {
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.operationCRUDFormEntity.code, 5);
	    FormActions.clickTextButton(LoansCreateFormForm.operationCRUDFormEntity.code);
	}

	@Cuando("se busca el {string} por {string}, {string}, {string}, luego se {string} Deudor Principal y se presiona boton {string}")
	public void se_busca_el_por_Tipo_Buscar_por_luego_se_Deudor_Principal_y_se_presiona_boton(String cliente, String entidad, String tipo, String buscarPor, String DeudorPrincipal, String boton) {
		if(entidad.length()>0){
//			if(entidad.equals("Cliente")){FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorEntidadCliente);}
			if(entidad.equals("Prospecto")){
				FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorEntidad);
				FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorEntidadProspecto);
			}
		}
		if(tipo.length()>0){
//			if(tipo.equals("Persona Natural")){FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorTipoPN);}
			if(tipo.equals("Persona Jurídica")){
				FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorTipo);
				FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorTipoPJ);
			}
		}
		if(buscarPor.length()>0){
			FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorBuscarPor);
			if(buscarPor.equals("Identificación")){
				FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorBuscarPorIdentificacion);
				FormActions.enterText(CostumerSearchFormManu.InputValue.inputIdentificacion, cliente);
			}
			else if(buscarPor.equals("Nombre")){
				FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorBuscarPorNombre);
				FormActions.enterText(CostumerSearchFormManu.InputValue.inputNombre, cliente);
			}
			else if(buscarPor.equals("Código")){
				FormActions.clickOn(CostumerSearchFormManu.Buttons.filtradoPorBuscarPorCodigo);
				FormActions.enterText(CostumerSearchFormManu.InputValue.inputCodigo, cliente);
			}
		}
		FormActions.clickOn(CostumerSearchFormManu.Buttons.buttonSearch);
		if(tipo.equals("Persona Jurídica")){ FormActions.clickOn(CostumerSearchFormManu.Grid.gridPrimerCompany); }
		else{ FormActions.clickOn(CostumerSearchFormManu.Grid.gridPrimer); }
		FormActions.clickOn(CostumerSearchFormManu.Buttons.buttonSeleccionar);
		
		if(DeudorPrincipal.length()>0){ FormActions.clickOn(LoansCreateFormForm.OperationCRUDFormEntity.role); }
		if(boton.length()>0){ FormActions.clickOn(LoansCreateFormForm.Buttons.btnVAVABUTTONVLCBANL971221IdVAVABUTTONVLCBANL971221); }
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.OperationEntity.operation, 10);
	}

	@Cuando("en el formulario de Creacion de Prestamo ingresar los campos {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string} y presionar el boton {string} se despliega el mensaje {string} y se genera numero de operacion")
	public void en_el_formulario_de_Creacion_de_Prestamo_ingresar_los_campos_y_presionar_el_boton_se_despliega_el_mensaje_y_se_genera_numero_de_operacion(String TipoOperacion, String Moneda, String Monto, String MontoAprobado, String DestinoFinanciero, String DestinoEconomico, String Oficial, String Oficina, String Ubicacion, String FechaCreacion, String TipoPlazo, String Plazo, String FechaPrimerVencimiento, String boton, String message) {
		if(TipoOperacion.length()>0){ FormActions.selectByText(LoansCreateFormForm.OperationEntity.typeOperation, TipoOperacion); }
		if(Moneda.length()>0){FormActions.selectByText(LoansCreateFormForm.OperationEntity.money, Moneda); }
		if(Monto.length()>0){ FormActions.enterText(LoansCreateFormForm.OperationEntity.amount, Monto); }
		if(MontoAprobado.length()>0){ FormActions.enterText(LoansCreateFormForm.OperationEntity.amountApproved, MontoAprobado); }
		if(DestinoFinanciero.length()>0){ FormActions.selectByText(LoansCreateFormForm.OperationEntity.financialDestination, DestinoFinanciero); }
		if(DestinoEconomico.length()>0){ FormActions.selectByText(LoansCreateFormForm.OperationEntity.economicActivity, DestinoEconomico); }
		if(Oficial.length()>0){ FormActions.selectByText(LoansCreateFormForm.OperationEntity.official, Oficial); }
		if(Oficina.length()>0){ FormActions.selectByText(LoansCreateFormForm.OperationEntity.office, Oficina); }
		FormActions.scrollTotheEndOfThePage();
		if(Ubicacion.length()>0){ FormActions.selectByText(LoansCreateFormForm.OperationEntity.ubication, Ubicacion); }
		if(FechaCreacion.length()>0){ 
			FormActions.setDate(LoansCreateFormForm.OperationEntity.creationDate, FechaCreacion); 
		}
		if(TipoPlazo.length()>0){ FormActions.selectByText(LoansCreateFormForm.OperationEntity.plazoDescripcion, TipoPlazo); }
		this.PlazoValue = Plazo;
		if(Plazo.length()>0){ FormActions.enterText(LoansCreateFormForm.OperationEntity.plazo, Plazo); }
		if(FechaPrimerVencimiento.length()>0){ FormActions.setDate(LoansCreateFormForm.OperationEntity.firstDueDate, FechaPrimerVencimiento); }
		if(boton.equals("Crear")){ FormActions.clickOn(LoansCreateFormForm.Buttons.btnVAVABUTTONXCGGMOI839221IdVAVABUTTONXCGGMOI839221); }
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 30);
		ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, message);
	}

	@Cuando("presionar el boton {string}")
	public void presionamos_el_boton_luego_presionar_el_boton(String boton) {
		// Transmitir
		FormActions.scrollTotheEndOfThePage();
		switch(boton){
			case "Transmitir": 
				BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.Buttons.cmdCommand1IdCMTLNSPRMBTRO, 10);
				FormActions.clickOn(LoansCreateFormForm.Buttons.cmdCommand1IdCMTLNSPRMBTRO);
				break;
			case "Guardar":
				BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.Buttons.cmdCommand1IdCMTLNSPRMBTRO, 5);
				FormActions.clickOn(LoansCreateFormForm.Buttons.cmdCommand1IdCMTLNSPRMBTRO);
				break;
		}	    
	}

	@Entonces("se despliega el mensaje de alerta {string} con bloqueo en el boton transmitir")
	public void se_despliega_el_mensaje_de_alerta_con_bloqueo_en_el_boton_transmitir(String message) {
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 20);
		ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, message);
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
	}
	
	@Entonces("se valida la creacion de la operacion en la pantalla datos del préstamo, pestaña estado actual tabla de {string} ultima pagina")
	public void se_valida_la_creacion_de_la_operacion_en_la_pantalla_datos_del_préstamo_pestaña_estado_actual_tabla_de_ultima_pagina(String tab) {
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193, 5);
		// tab 
		FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193);
		FormActions.scrollTotheEndOfThePage();
		if( Integer.parseInt(this.PlazoValue)>13 ){ GridActions.Pager.goLastPage(LoansCreateFormForm.gridAmortizationEntity); }
		// Obtener ultima fila
		WebElement dynamicElement = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(LoansCreateFormForm.gridAmortizationEntity.getId()));
		List<WebElement> elements = dynamicElement.findElements(By.xpath("//*[@id='QV_ECPR_JAA30']/div[3]/table/tbody/tr"));
		Integer num = elements.size() - 1;
		System.out.println("Value num:"+num);
		System.out.println("PlazoValue:"+this.PlazoValue);
		System.out.println("Validacion"+ this.PlazoValue.equals(String.valueOf(num)));
		if( this.PlazoValue.equals(String.valueOf(num)) ){ 
			ValidationActions.isEquals(GridActions.getTargetByRowAndColumn(LoansCreateFormForm.gridAmortizationEntity, num, 1),this.PlazoValue); 
		}
		FormActions.takeScreenshot();
	}
	
	
	@Cuando("pestaña {string} se selecciona el rubro {string}, se presiona botón {string}")
	public void pestaña_se_selecciona_el_rubro_se_presiona_botón(String tab, String rubroName, String boton) throws InterruptedException {
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
		// Tab Rubros
		if(tab.equals("Rubros")){ FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCZUGXQMZUBQ554193); }
		FormActions.scrollTotheEndOfThePage();
		if(boton.equals("Eliminar")){ 
			System.out.println("Enter DELETE");
			GridActions.clickDeleteRecordByColumnAndText(OperationItemsForm.gridOperationItemsList, 1, rubroName); 
			GridActions.clickConfirmDelete(true);
		}
	}
	@Cuando("pestaña {string}, en rubro {string} boton {string} campo {string} se ingresa tasa {string}, presionamos boton {string} y se valida la modificación de la tasa en la pestaña de {string}")
	public void pestaña_en_rubro_boton_campo_se_ingresa_tasa_presionamos_boton_y_se_valida_la_modificación_de_la_tasa_en_la_pestaña_de(String tab, String rubroName, String botonGrid, String campo, String tasa, String boton, String tabValidacion) {
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
		// Tab Rubros
		if(tab.equals("Rubros")){ FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCZUGXQMZUBQ554193); }
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
			System.out.println("Entro amortizacion");
			FormActions.scrollToBeginingOfThePage();
			FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193);
			String Value = BaseActions.getValue(LoansCreateFormForm.AmortizationFormEntity.interest);
			
			if(Value.equals(tasa)){
				System.out.println("Value readable: "+ Value);
			}else{
				System.out.println("Value readable: "+ Value);
				ValidationActions.isEquals(LoansCreateFormForm.AmortizationFormEntity.interest.getTarget(), tasa);
			}
		}
	}

	@Entonces("se valida la creación de la operación en la pestaña {string}")
	public void se_valida_la_creación_de_la_operación_en_la_pestaña(String string) {
		FormActions.scrollToBeginingOfThePage();
		FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCZHQUMTXXGR635193);
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.operationEntity.operation, 10);
		BaseActions.takeScreenshot();
	}

	@Cuando("pestaña {string}, boton {string} ingresar {string} y {string}, presionamos boton {string}")
	public void pestaña_boton_ingresar_y_presionamos_boton(String tab, String botonGrid, String campoRublo, String campoTasa, String boton) {
		FormActions.scrollToBeginingOfThePage();
		FormActions.takeScreenshot();
		// Tab Rubros
		if(tab.equals("Rubros")){ FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCZUGXQMZUBQ554193); }
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
	}

	@Cuando("en la pestaña {string} se valida el nuevo rubro en la tabla")
	public void en_la_pestaña_se_valida_el_nuevo_rubro_en_la_tabla(String tab) {
		FormActions.scrollToBeginingOfThePage();
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193, 5);
		FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193);
//		FormActions.scrollTotheEndOfThePage();
		FormActions.scrollToPercentage(50);
		Target rowByIndex = Target.the("Grid-").located(By.xpath("//div[@id='"+LoansCreateFormForm.gridAmortizationEntity.getId()+"']//table//th[text() = '"+this.Rublo.split("-")[0].trim()+"']"));
		theActorInTheSpotlight().attemptsTo(Click.on(rowByIndex));
		BaseActions.takeScreenshot();
	}
	
	@Cuando("pestaña {string}, el campo {string} se marca {string}")
	public void pestaña_el_campo_Reajustable_se_marca(String tab, String campo, String valor) {
		FormActions.scrollToBeginingOfThePage();
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCUQBPHFCKCW777193, 5);
		if(tab.equals("Parámetros Generales")){ FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCUQBPHFCKCW777193); }
		if(campo.toLowerCase().equals("reajustable")){
			FormActions.selectRadioButtonValue(LoansCreateFormForm.GeneralParametersQuery.readjustable, valor.toUpperCase());
		}
		else if(campo.toLowerCase().equals("pago extraodinario")){
			FormActions.scrollTotheEndOfThePage();
			valor.toLowerCase();
			switch(valor){
				case "reducción de cuota":
					
					valor = "Pago Extraordinario con Reducción de Cuota"; break;
				case "reducción de tiempo": 
					FormActions.scrollTotheEndOfThePage();
					valor = "Pago Extraordinario con Reducción de Tiempo"; break;
			}
			FormActions.selectRadioButtonValue(LoansCreateFormForm.GeneralParametersQuery.typePayment, valor);
		}
		FormActions.scrollTotheEndOfThePage();
		FormActions.clickOn(LoansCreateFormForm.Buttons.btnVAVABUTTONFIRPTAQ308309IdVAVABUTTONFIRPTAQ308309);
	}
	
	@Cuando("en pestaña {string}")
	public void en_pestaña(String tab) {
		FormActions.scrollToBeginingOfThePage();
		if(tab.length()>0){
			FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193);			
		}
		FormActions.scrollTotheEndOfThePage();
		BaseActions.takeScreenshot();
	}

	
	@Cuando("pestaña {string} ingresar valores de gracia {string}, {string} y presionar {string}")
	public void pestaña_ingresar_valores_de_gracia_y_presionamos(String tab, String mesGracia, String graciaCapital, String boton) {
		FormActions.scrollToBeginingOfThePage();
		if(tab.length()>0){
			FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193);			
		}
		FormActions.scrollToPercentage(10);
		if(mesGracia.length()>0){
			FormActions.selectByText(LoansCreateFormForm.AmortizationFormEntity.monthGrace, mesGracia);
		}
		if(graciaCapital.length()>0){
			FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.termGraceCapital, graciaCapital);
		}
		BaseActions.takeScreenshot();
		if(boton.equals("Calcular")){
			FormActions.scrollTotheEndOfThePage();
			FormActions.clickOn(LoansCreateFormForm.Buttons.btnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198);
		}
		FormActions.scrollToPercentage(36);
		BaseActions.takeScreenshot();
	}
	
	@Cuando("pestaña {string} ingresar valores de pagos {string}, {string}, {string} y presionar {string}")
	public void pestaña_ingresar_valores_de_pagos_DiaDePago_y_presionar(String tab, String FechaDePagoFija, String DiaDePago, String FechaDePagoExtendido, String boton) {
		FormActions.scrollToBeginingOfThePage();
		if(tab.length()>0){
			FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193);			
		}
		FormActions.scrollToPercentage(10);
		if(FechaDePagoFija.toLowerCase().equals("x") ){
			FormActions.clickOn(LoansCreateFormForm.AmortizationFormEntity.fixedPayementDay);
		}
		if(DiaDePago.length()>0){
			FormActions.selectByText(LoansCreateFormForm.AmortizationFormEntity.paymentDay, DiaDePago);
		}
		if(FechaDePagoExtendido.length()>0){
			FormActions.scrollToPercentage(10);
			FormActions.setDate(LoansCreateFormForm.AmortizationFormEntity.extendedPaymentDate, FechaDePagoExtendido);
		}
		BaseActions.takeScreenshot();
		if(boton.equals("Calcular")){
			FormActions.scrollTotheEndOfThePage();
			FormActions.clickOn(LoansCreateFormForm.Buttons.btnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198);
		} 
		BaseActions.takeScreenshot();
	}
	
	@Cuando("pestaña {string} ingresar valores de Tipo de Amortizacion {string}, valores de gracia {string}, {string} y presionar {string}")
	public void pestaña_ingresar_valores_de_Tipo_de_Amortizacion_valores_de_gracia_y_presionar(String tab, String tipoAmortizacion, String mesGracia, String graciaCapital, String boton) {
		FormActions.scrollToBeginingOfThePage();
		if(tab.length()>0){
			FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193);			
		}
		FormActions.scrollToPercentage(15);
		if(mesGracia.length()>0){
			FormActions.selectByText(LoansCreateFormForm.AmortizationFormEntity.monthGrace, mesGracia);
		}
		if(graciaCapital.length()>0){
			FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.termGraceCapital, graciaCapital);
		}
		if(tipoAmortizacion.length()>0){
			tipoAmortizacion = tipoAmortizacion.substring(0,1).toUpperCase() + tipoAmortizacion.substring(1);
			switch(tipoAmortizacion){
				case "Alemana": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.typeAmortization, "Alemana"); break;
				case "Francesa": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.typeAmortization, "Francesa"); break;
				case "Manual": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.typeAmortization, "Manual"); break;
			}
		}
		BaseActions.takeScreenshot();
		if(boton.equals("Calcular")){
			FormActions.scrollTotheEndOfThePage();
			FormActions.clickOn(LoansCreateFormForm.Buttons.btnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198);
		} 
		FormActions.scrollToPercentage(36);
		BaseActions.takeScreenshot();
	}

	@Cuando("pestaña {string} ingresar {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} y presionar {string}")
	public void pestaña_ingresar_y_presionar(String tab, String FechaValor, String TasaTotal, String Cuota, String TipoPlazo, String Plazo, String TipoCuota, String FechaVencimiento, String FechaDePagoFija, String DiaDePago, String Pint, String Pcap, String FechaDePagoExtendido, String GraciaMora, String MesGracia, String PerGraciaCapital, String PerGraciaInteres, String BaseCalculo, String TipoAmortizacion, String boton) {
		if(tab.equals("Amortización")){ FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193); }
		if(FechaValor.length()>0){ FormActions.setDate(LoansCreateFormForm.AmortizationFormEntity.valueDate, FechaValor); }
		if(TasaTotal.length()>0){ FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.interest, TasaTotal); }
		if(Cuota.length()>0){ FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.fee, Cuota); }
		if(TipoPlazo.length()>0){ FormActions.selectByText(LoansCreateFormForm.AmortizationFormEntity.termType, TipoPlazo); }
		if(Plazo.length()>0){ FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.term, Plazo); }
		if(TipoCuota.length()>0){ FormActions.selectByText(LoansCreateFormForm.AmortizationFormEntity.typeFee, TipoCuota); }
		if(FechaVencimiento.length()>0){ FormActions.setDate(LoansCreateFormForm.AmortizationFormEntity.firstDueDate, FechaVencimiento); }
		if(FechaDePagoFija.toLowerCase().equals("x") ){ //&& FormActions.getCheckBoxValue(LoansCreateFormForm.AmortizationFormEntity.fixedPayementDay) 
			String clases = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(LoansCreateFormForm.AmortizationFormEntity.fixedPayementDay.getId())).getAttribute("class");
			if (clases.contains("ng-touched") || clases.contains("ng-empty")){
				FormActions.clickOn(LoansCreateFormForm.AmortizationFormEntity.fixedPayementDay); 				
			}
		}
		if(DiaDePago.length()>0){ FormActions.selectByText(LoansCreateFormForm.AmortizationFormEntity.paymentDay, DiaDePago); }		
		if(Pint.length()>0){ FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.termInterest, Pint); }
		if(Pcap.length()>0){ FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.termCapital, Pcap); }
		if(FechaDePagoExtendido.length()>0){
			FormActions.scrollToPercentage(10);
			FormActions.setDate(LoansCreateFormForm.AmortizationFormEntity.extendedPaymentDate, FechaDePagoExtendido);
		}
		if(GraciaMora.length()>0){ FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.daysGraceDefault, GraciaMora); }		
		if(MesGracia.length()>0){ FormActions.selectByText(LoansCreateFormForm.AmortizationFormEntity.monthGrace, MesGracia); }
		if(PerGraciaCapital.length()>0){ FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.termGraceCapital, PerGraciaCapital); }
		if(PerGraciaInteres.length()>0){ FormActions.enterText(LoansCreateFormForm.AmortizationFormEntity.termGraceInterest, PerGraciaInteres); }
		if(BaseCalculo.length()>0){
			BaseCalculo = BaseCalculo.toUpperCase();
			switch(BaseCalculo){
				case "COMERCIAL": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.baseInterestCalculation, "COMERCIAL"); break;
				case "REAL": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.baseInterestCalculation, "REAL"); break;
			}
		}
		if(TipoAmortizacion.length()>0){
			TipoAmortizacion = TipoAmortizacion.substring(0,1).toUpperCase() + TipoAmortizacion.substring(1);
			switch(TipoAmortizacion){
				case "Alemana": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.typeAmortization, "Alemana"); break;
				case "Francesa": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.typeAmortization, "Francesa"); break;
				case "Manual": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.typeAmortization, "Manual"); break;
			}
		}
		FormActions.takeScreenshot();
		if(boton.length()>0){
			FormActions.scrollTotheEndOfThePage();
			FormActions.clickOn(LoansCreateFormForm.Buttons.btnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198);
		}
		FormActions.scrollToPercentage(36);
		BaseActions.takeScreenshot();
	}
	
	@Cuando("pestaña {string} ingresar valores de Tipo de Amortizacion {string} y presionar {string}")
	public void pestaña_ingresar_valores_de_Tipo_de_Amortizacion_y_presionar(String tab, String TipoAmortizacion, String boton) {
		FormActions.scrollToBeginingOfThePage();
		if(tab.equals("Amortización")){ FormActions.clickLayout(LoansCreateFormForm.Layouts.lytViewContainerBaseIdVCBKTCDNSADU521193); }
		FormActions.scrollToPercentage(15);
		if(TipoAmortizacion.length()>0){
			TipoAmortizacion = TipoAmortizacion.substring(0,1).toUpperCase() + TipoAmortizacion.substring(1);
			switch(TipoAmortizacion){
				case "Alemana": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.typeAmortization, "Alemana"); break;
				case "Francesa": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.typeAmortization, "Francesa"); break;
				case "Manual": 
					FormActions.selectRadioButtonValue(LoansCreateFormForm.AmortizationFormEntity.typeAmortization, "Manual"); break;
			}
		}
		BaseActions.takeScreenshot();
		if(boton.equals("Calcular")){
			FormActions.scrollTotheEndOfThePage();
			FormActions.clickOn(LoansCreateFormForm.Buttons.btnVAVAVABUTTONRDGI5636198IdVAVAVABUTTONRDGI5636198);
		} 
		FormActions.scrollToPercentage(36);
		BaseActions.takeScreenshot();
		if(TipoAmortizacion.equals("Francesa")){
			GridActions.scrollToRight(LoansCreateFormForm.gridAmortizationEntity);
			BaseActions.takeScreenshot();
		}
	}
}
