package com.cobiscorp.cobis.lnspr.test.impl.steps;

import com.cobiscorp.cobis.assts.trnsc.test.LoanDisbursementMainForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansUpdateFormManual;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.HeaderActions;

import io.cucumber.java.es.Cuando;

public class DesembolsoDeOperacionesStepDefinitions {
	@Cuando("realiza la busqueda por {string} con el {string}")
	public void realiza_la_busqueda_por_BuscarPor_con_el_numeroDeOperacion(String buscarPor, String numeroOperacion) {
		 FormActions.selectByText(LoansUpdateFormManual.Buttons.searchByButton, buscarPor);
		    if(buscarPor.equals("Num. Préstamo")){
		    	FormActions.enterText(LoansUpdateFormManual.LoansUpdate.inputSearchByNumPres, numeroOperacion);
		    }	    
		    else if(buscarPor.equals("Cliente")){
//		    	FormActions.clickTextButton(LoansUpdateFormManual.LoansUpdate.inputSearchByCostumer);
		    	FormActions.enterText(LoansUpdateFormManual.LoansUpdate.inputSearchByCostumer, numeroOperacion);
		    	
		    }
		    FormActions.clickOn(LoansUpdateFormManual.Buttons.cmdCommandVA_VAIMAGEBUTTONNN_614498);
		    GridActions.selectRecord(LoansUpdateFormManual.gridLoansUpdate, 1);
	}
	
	@Cuando("selecciona del menu de acciones la opcion {string}")
	public void selecciona_del_menu_de_acciones_la_opcion(String accion) {
		HeaderActions.clickActionByText(accion);
	}
	@Cuando("precionar {string} y llenar la informacion {string}, {string}, {string} y presionar {string}")
	public void precionar_y_llenar_la_informacion_y_presionar(String botonDetalleDesembolso, String MonedaDeDesembolso, String FormaDePago, String Referencia, String botonModal) {
	    if(botonDetalleDesembolso.length()>0){
	    	FormActions.clickOn(LoanDisbursementMainForm.GridDetailPaymentForm.Buttons.btnGridCommandIdCEQV201QV597348889606);
	    }
	}

	@Cuando("se presenta el mensaje {string} y se presiona {string}")
	public void se_presenta_el_mensaje_y_se_presiona(String mensaje, String boton) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
