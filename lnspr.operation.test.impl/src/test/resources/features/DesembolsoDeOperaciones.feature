#language : es
#Author : roger.reyes@clearminds-it.com
Característica: Desembolso de un Prestamo
  
  COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de cartera 
  QUIERO crear un desembolso para un ente natural 
  PARA  evidenciar el desembolso exitoso del préstamo de un ente natural

  Antecedentes: 
    Dado que usuario realiza login en el sistema cobis
    Dado que navega desde "Operaciones>>Cartera" hacia "Datos del Préstamo"

  @DesembolsoDeOperaciones
  Esquema del escenario: 
    Cuando realiza la busqueda por <BuscarPor> con el <numeroDeOperacion>
    Y selecciona del menu de acciones la opcion "Desembolso de Préstamo"
    Y precionar "crear" y llenar la informacion <MonedaDeDesembolso>, <FormaDePago>, <Referencia> y presionar "Aceptar"
    Y se presenta el mensaje "La transacción se realizó exitosamente" y se presiona "Enviar"
    Entonces se despliega los mensajes de alerta "Transacción realizada exitosamente "
    
    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | MonedaDeDesembolso | FormaDePago | Referencia |
      | "Num. Préstamo" | '0001000199'      | ""                 | ""          | ""         |
