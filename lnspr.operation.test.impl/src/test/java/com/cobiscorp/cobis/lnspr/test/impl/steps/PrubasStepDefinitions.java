package com.cobiscorp.cobis.lnspr.test.impl.steps;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

import com.cobiscorp.cobis.assts.trnsc.test.DisbursementFormForm;
import com.cobiscorp.cobis.assts.trnsc.test.LoanDisbursementMainForm;
import com.cobiscorp.cobis.assts.trnsc.test.PaymentModeFormForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansCreateFormForm;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.HeaderActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class PrubasStepDefinitions {

	@Cuando("selecciona el menu de acciones la opcion {string}")
	public void selecciona_el_menu_de_acciones_la_opcion(String accion) {
		HeaderActions.clickActionByText(accion);
	}

	@Cuando("diligencia el formulario de Desembolso de Préstamo, botón crear, llena información de: Moneda de desembolso {string}, Valor, Forma de Pago {string}, {string}")
	public void diligencia_el_formulario_de_Desembolso_de_Préstamo_botón_crear_llena_información_de_Moneda_de_desembolso_Valor_Forma_de_Pago(String moneda, String pago, String referencia) {
		GridActions.clickCommand(LoanDisbursementMainForm.gridDetailPaymentForm,LoanDisbursementMainForm.GridDetailPaymentForm.Buttons.btnGridCommandIdCEQV201QV597348889606); // Setea el valor correspondiente al ID del grid mapeado en la clase
		FormActions.enterText(PaymentModeFormForm.PaymentForm.accountNumber, referencia);
		FormActions.selectByText(PaymentModeFormForm.PaymentForm.currencyId, moneda);
		FormActions.selectByText(PaymentModeFormForm.PaymentForm.payFormId, pago);
		FormActions.takeScreenshot();
	}

	@Cuando("presiona botón {string}, presenta mensaje {string} y luego se presiona {string}")
	public void presiona_botón_presenta_mensaje_y_luego_se_presiona(String botonAceptar, String mensaje,String botonEnviar) {
		FormActions.clickOn(PaymentModeFormForm.Buttons.cmdCommand1IdCMTPAYMENTNS7);
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 20);
		ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, mensaje);
		FormActions.clickOn(LoanDisbursementMainForm.Buttons.cmdCommand1IdCMTLOANDISS5N);
		FormActions.takeScreenshot();
	}

	@Entonces("se despliega los mensajes de alerta {string} con bloqueo en el botón de enviar.")
	public void se_despliega_los_mensajes_de_alerta_con_bloqueo_en_el_botón_de_enviar(String mensaje) {
		 BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding,20);
		 ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding,mensaje);
		 FormActions.takeScreenshot();
	}

	@Cuando("diligencia el formulario de Desembolso de Préstamo, Detalle del Desembolso seleccionar el registro ingresado presionar botón Eliminar, presenta mensaje {string}, se presiona Aceptar")
	public void diligencia_el_formulario_de_Desembolso_de_Préstamo_Detalle_del_Desembolso_seleccionar_el_registro_ingresado_presionar_botón_presenta_mensaje_se_presiona_Aceptar(String mensaje) {
		GridActions.clickDeleteRecord(LoanDisbursementMainForm.gridDetailPaymentForm, 1);
		GridActions.clickConfirmDelete(true);
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 20);
		//ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, mensaje);
		FormActions.takeScreenshot();
	}

	@Cuando("presiona botón crear, llena información de: Moneda de desembolso {string}, Valor \\(DOLAR) {string}, Forma de Pago {string}, {string} botón Aceptar, Enviar")
	public void presiona_botón_crear_llena_información_de_Moneda_de_desembolso_Valor_DOLAR_Forma_de_Pago_botón_Aceptar_Enviar(String moneda, String valor, String pago, String referencia) {
		Double valorPaga;
		GridActions.clickCommand(LoanDisbursementMainForm.gridDetailPaymentForm,LoanDisbursementMainForm.GridDetailPaymentForm.Buttons.btnGridCommandIdCEQV201QV597348889606); // Setea el valor correspondiente al ID del grid mapeado en la clase
		String val = BaseActions.getValue(PaymentModeFormForm.DisbursementResult.difference);
		FormActions.enterText(PaymentModeFormForm.PaymentForm.accountNumber, referencia);
		FormActions.selectByText(PaymentModeFormForm.PaymentForm.currencyId, moneda);
		FormActions.selectByText(PaymentModeFormForm.PaymentForm.payFormId, pago);
		
		/*if (!valor.isEmpty()) {
			System.out.println("EL VALOR: "+valor);
			if (valor.equals("100")) {
				FormActions.enterText(PaymentModeFormForm.DisbursementResult.difference, val);
			} else {
				valorPaga = Double.parseDouble(val) * (Double.parseDouble(valor) / 100);
				FormActions.enterText(PaymentModeFormForm.DisbursementResult.difference, valorPaga.toString());
			}
		}*/
		
		 FormActions.clickOn(PaymentModeFormForm.Buttons.cmdCommand1IdCMTPAYMENTNS7);
		 //BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding,20);
		 FormActions.clickOn(LoanDisbursementMainForm.Buttons.cmdCommand1IdCMTLOANDISS5N);
		 FormActions.takeScreenshot();
	}

}
