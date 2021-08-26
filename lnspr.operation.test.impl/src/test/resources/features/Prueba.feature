#language : es
#Author : esteban.vallejo@clearminds-it.com
Característica: Verificar la correcta creacion de un prestamo para una persona natural y persona juridica, moneda base, con tipo de pago mensual
  
  COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de Cartera
  QUIERO crear un Prestamo a una persona natural y juridica
  PARA evidenciar la correcta generacion de la tabla de amortizacion y calculo de interes

  Antecedentes: 
    Dado que usuario realiza login en el sistema cobis
    Dado que navega desde "Operaciones>>Cartera" hacia "Datos del Préstamo"    

	# QA-CAR-S448070 - Esc2 - Desembolso préstamo Crédito Individual persona natural con moneda en dolares y forma de pago BANCO BANBIF
	@DesembolsoPrestamosBancoBANBIF
	Esquema del escenario: Desembolso préstamo Crédito Individual persona natural con moneda en dolares y forma de pago BANCO BANBIF
	Cuando realiza la busqueda por <BuscarPor> con el <numeroDeOperacion>
	Y selecciona el menu de acciones la opcion "Desembolso de Préstamo"
	Y diligencia el formulario de Desembolso de Préstamo, botón crear, llena información de: Moneda de desembolso <moneda>, Valor, Forma de Pago <pago>, <Referencia>
	Y presiona botón "Aceptar", presenta mensaje "La transacción se realizó exitosamente" y luego se presiona "Enviar"
	Entonces se despliega los mensajes de alerta "La transacción se realizó exitosamente" con bloqueo en el botón de enviar.
	#Entonces se despliega los mensajes de alerta "Transacción realizada exitosamente " con bloqueo en el botón de enviar.
	
		Ejemplos: 
      | BuscarPor       | numeroDeOperacion |moneda	|pago						|Referencia	|
      | "Num. Préstamo" | '0001000131'      |'DOLAR'|'BANCO BANBIF'	|'123'			|
      
      
   # QA-CAR-S448070 - Esc4 - Desembolso préstamo Crédito Individual persona natural con moneda en dolares, monto Valor igual a Total a Liquidar
   @DesembolsoPrestamoTotalLiquidar
   Esquema del escenario: Desembolso préstamo Crédito Individual persona natural con moneda en dolares, monto Valor igual a Total a Liquidar
   Cuando realiza la busqueda por <BuscarPor> con el <numeroDeOperacion>
   Y selecciona el menu de acciones la opcion "Desembolso de Préstamo"
   Y diligencia el formulario de Desembolso de Préstamo, Detalle del Desembolso seleccionar el registro ingresado presionar botón Eliminar, presenta mensaje "¿Está seguro que desea borrar la fila seleccionada?", se presiona Aceptar
   Y presiona botón crear, llena información de: Moneda de desembolso <moneda>, Valor (DOLAR) <valor%>, Forma de Pago <pago>, <Referencia> botón Aceptar, Enviar
	 Entonces se despliega los mensajes de alerta "La transacción se realizó exitosamente" con bloqueo en el botón de enviar.
   Ejemplos: 
      | BuscarPor   			| numeroDeOperacion |moneda	|pago						|Referencia	|valor%		|
      | "Num. Préstamo" 	| '0001000066'      |'DOLAR'|'BANCO BANBIF'	|'123'			|"100"		|


      
      