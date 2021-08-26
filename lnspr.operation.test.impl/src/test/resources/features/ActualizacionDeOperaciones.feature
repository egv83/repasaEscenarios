#language : es
#Author : roger.reyes@clearminds-it.com
Característica: Verificar la correcta creacion de un prestamo para una persona natural y persona juridica, moneda base, con tipo de pago mensual
  
  COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de Cartera
  QUIERO crear un Prestamo a una persona natural y juridica
  PARA evidenciar la correcta generacion de la tabla de amortizacion y calculo de interes

  Antecedentes: 
    Dado que usuario realiza login en el sistema cobis
    Dado que navega desde "Operaciones>>Cartera" hacia "Actualización Préstamo"

  # QA-CAR-S450910 - Esc1 - Actualización de un préstamo de Crédito Individual añadiendo un nuevo rubro para persona jurídica con moneda en dólares
  @ActualizacionOperacionCrearRubroJuridico
  Esquema del escenario: Actualizacion de un prestamo de Credito Individual añadiendo un nuevo rubro para persona juridica con moneda en dolares
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y selecciona la pestaña "Rubros", boton "Nuevo" ingresar <rubro> y <tasa>, presionamos boton "Guardar"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | rubro                 | tasa |
      | 'Num. Préstamo' | '0001000124'      | 'CMO - COMISION MORA' | '10' |
      | 'Num. Préstamo' | '0001000125'      | 'CMO - COMISION MORA' | '15' |
      | 'Num. Préstamo' | '0001000126'      | 'CMO - COMISION MORA' | '18' |

  # QA-CAR-S450910 - Esc2 - Actualización de un préstamo de Crédito Individual eliminando un rubro para persona jurídica con moneda en dólares
  @ActualizacionOperacionEliminarRubroJuridico
  Esquema del escenario: Actualizacion de un prestamo de Credito Individual eliminando un rubro para persona juridica con moneda en dolares
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y selecciona la pestaña "Rubros" se selecciona el rubro <rubro>, se presiona boton "Eliminar"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | rubro |
      | 'Num. Préstamo' | '0001000124'      | "CMO" |

  # QA-CAR-S450910 - Esc3 - Actualizacion de un prestamo de Credito Individual modificando el rubro Interes para persona juridica con moneda en dolares
  @ActualizacionOperacionEditarRubroJuridico
  Esquema del escenario: Actualizacion de un prestamo de Credito Individual modificando el rubro Interes para persona juridica con moneda en dolares
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y selecciona la pestaña "Rubros", en rubro <rubro> boton "Editar" campo "Tasa" se ingresa <tasa>, presionar boton "Guardar" y se valida la modificación de la tasa en la pestaña de "Amortización"
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | rubro | tasa |
      | 'Num. Préstamo' | '0001000261'      | "INT" | "14" |
      | 'Num. Préstamo' | '0001000262'      | "INT" | "15" |
      | 'Num. Préstamo' | '0001000259'      | "INT" | "14" |

  # QA-CAR-S450257 - Esc1 - Actualizacion de un prestamo de Credito Individual añadiendo un nuevo rubro para persona natural con moneda en dolares
  @ActualizacionOperacionCrearRubroNatural
  Esquema del escenario: Actualizacion de un prestamo de Credito Individual añadiendo un nuevo rubro para persona natural con moneda en dolares
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y selecciona la pestaña "Rubros", boton "Nuevo" ingresar <rubro> y <tasa>, presionamos boton "Guardar"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | rubro                 | tasa |
      | 'Num. Préstamo' | '0001000278'      | 'SEGDES - SEGURO DESGRAVAMEN'      | ''   |
      | 'Num. Préstamo' | '0001000279'      | 'SEGDES - SEGURO DESGRAVAMEN'      | ''   |
      | 'Num. Préstamo' | '0001000280'      | 'SEGMULTR - SEGURO MULTIPROPOSITO' | ''   |

  # QA-CAR-S450257 - Esc2 - Actualizacion de un prestamo de Credito Individual eliminando un rubro para persona natural con moneda en dolares
  @ActualizacionOperacionEliminarRubroNatural
  Esquema del escenario: Actualizacion de un prestamo de Credito Individual eliminando un rubro para persona natural con moneda en dolares
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y selecciona la pestaña "Rubros" se selecciona el rubro <rubro>, se presiona boton "Eliminar"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | rubro    |
      | 'Num. Préstamo' | '0001000278'      | 'SEGDES'   |
      | 'Num. Préstamo' | '0001000279'      | 'SEGDES'   |
      | 'Num. Préstamo' | '0001000280'      | 'SEGMULTR' |

  # QA-CAR-S450257 - Esc3 - Actualizacion de un prestamo de Credito Individual modificando el rubro Interes para persona natural con moneda en dolares
  @ActualizacionOperacionEditarRubroNatural
  Esquema del escenario: Actualizacion de un prestamo de Credito Individual modificando el rubro Interes para persona natural con moneda en dolares
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y selecciona la pestaña "Rubros", en rubro <rubro> boton "Editar" campo "Tasa" se ingresa <tasa>, presionar boton "Guardar" y se valida la modificación de la tasa en la pestaña de "Amortización"
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | rublo                 | rubro | tasa |
      | 'Num. Préstamo' | '0001000280'      | 'CMO - COMISION MORA' | "INT" | '15' |
      | 'Num. Préstamo' | '0001000278'      | 'CMO - COMISION MORA' | "INT" | '16' |
      | 'Num. Préstamo' | '0001000279'      | 'CMO - COMISION MORA' | "INT" | '12' |
 

  # QA-CAR-S518473 - Actualización de un préstamo de Crédito Individual opción Pago Intereses acumulados, para persona jurídica con moneda en dólares
  @ActualizacionOperacionParametroGeneralJuridico
  Esquema del escenario: Actualizacion de un prestamo de Credito Individual opcion Pago Intereses acumulados, para persona juridica con moneda en dolares
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y seleccionar la pestaña "Parámetros Generales" el campo <reajustable>, <PeriodoReajustable>, <PagoIntereses>, <PagoPor>, <PagoNormal/Extraordinario> y presionar "Guardar"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | reajustable | PeriodoReajustable | PagoIntereses                | PagoPor | PagoNormal/Extraordinario                     |
      # QA-CAR-S518473 - Esc1 - Actualización de un préstamo de Crédito Individual opción Pago Intereses acumulados, para persona jurídica con moneda en dólares
      | 'Num. Préstamo' | '0001000281'      | ""          | ""                 | "Paga Intereses acumulados?" | ""      | ""                                            |
      # QA-CAR-S518473 - Esc2 - Actualización de un préstamo de Crédito Individual opción Pago Extraordinario con Reducción de Tiempo, para persona jurídica con moneda en dólares
      | 'Num. Préstamo' | '0001000281'      | ""          | ""                 | ""                           | ""      | "Pago Extraordinario con Reducción de Tiempo" |
      # QA-CAR-S518473 - Esc3 - Actualización de un préstamo de Crédito Individual opción Reajustable, para persona jurídica con moneda en dólares
      | 'Num. Préstamo' | '0001000281'      | "SI"        | ""                 | ""                           | ""      | ""                                            |

  # QA-CAR-S518500 - Actualización de un Préstamo para una Persona Natural, Pestaña Parámetros Generales
  @ActualizacionOperacionParametroGeneralNatural
  Esquema del escenario: Actualizacion de un Prestamo para una Persona Natural, Pestaña Parametros Generales
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y seleccionar la pestaña "Parámetros Generales" el campo <reajustable>, <PeriodoReajustable>, <PagoIntereses>, <PagoPor>, <PagoNormal/Extraordinario> y presionar "Guardar"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | reajustable | PeriodoReajustable | PagoIntereses                | PagoPor | PagoNormal/Extraordinario                     |
      # QA-CAR-S518473 - Esc1 - Actualización de un préstamo de Crédito Individual opción Pago Intereses acumulados, para persona natural con moneda en dólares
      | 'Num. Préstamo' | '0001000049'      | ""          | ""                 | "Paga Intereses acumulados?" | ""      | ""                                            |
      # QA-CAR-S518473 - Esc2 - Actualización de un préstamo de Crédito Individual opción Pago Extraordinario con Reducción de Tiempo, para persona natural con moneda en dólares
      | 'Num. Préstamo' | '0001000049'      | ""          | ""                 | ""                           | ""      | "Pago Extraordinario con Reducción de Tiempo" |
      # QA-CAR-S518473 - Esc3 - Actualización de un préstamo de Crédito Individual opción Reajustable, para persona natural con moneda en dólares
      | 'Num. Préstamo' | '0001000049'      | "SI"        | ""                 | ""                           | ""      | ""                                            |

  # QA-CAR-S518509-Actualización de un Préstamo para una Persona Natural, Pestaña Amortización
  @ActualizacionOperacionAmortizacionNatural
  Esquema del escenario: Actualizacion de un Prestamo para una Persona Natural, Pestaña Amortizacion
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y en pestaña "Amortización" ingresar <FechaValor>, <TasaTotal>, <Cuota>, <TipoPlazo>, <Plazo>, <TipoCuota>, <FechaVencimiento>, <FechaDePagoFija>, <DiaDePago>, <Pint>, <Pcap>, <FechaDePagoExtendido>, <GraciaMora>, <MesGracia>, <PerGraciaCapital>, <PerGraciaInteres>, <BaseCalculo>, <TipoAmortizacion> y presionar "Calcular"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | FechaValor | TasaTotal | Cuota | TipoPlazo    | Plazo | TipoCuota | FechaVencimiento | FechaDePagoFija | DiaDePago | Pint | Pcap | FechaDePagoExtendido | GraciaMora | MesGracia | PerGraciaCapital | PerGraciaInteres | BaseCalculo | TipoAmortizacion |
      # QA-CAR-S518509 -Esc1 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Fecha Valor, para persona natural con moneda en dólares
      | 'Num. Préstamo' | '0001000135'      | '20042021' | ''        | ''    | ''           | ''    | ''        | ''               | ''              | ''        | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      # QA-CAR-S518509 -Esc2 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Fecha Valor, para persona natural con moneda en dólares
      | 'Num. Préstamo' | '0001000135'      | ''         | ''        | ''    | 'M - MES(ES)' | '18'  | ''        | ''               | ''              | ''        | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      # QA-CAR-S518509 -Esc3 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Fecha Valor, para persona natural con moneda en dólares
      | 'Num. Préstamo' | '0001000135'      | ''         | ''        | ''    | ''           | ''    | ''        | ''               | 'X'             | '6'       | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      # QA-CAR-S518509 -Esc4 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Fecha Valor, para persona natural con moneda en dólares
      | 'Num. Préstamo' | '0001000135'      | ''         | ''        | ''    | ''           | ''    | ''        | ''               | ''              | ''        | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | 'COMERCIAL' | ''               |

  # QA-CAR-S518509 - Esc5 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Tipo Amortización, para persona natural con moneda en dólares
  @ActualizacionOperacionAmortizacionTipoAmortizacionNatural
  Esquema del escenario: Actualizacion de un Prestamo para una Persona Natural, Pestaña Amortizacion
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y en pestaña "Amortización" ingresar valores de Tipo de Amortizacion "Alemana" y presionar "Calcular"
    Y en pestaña "Amortización" ingresar valores de Tipo de Amortizacion "Francesa" y presionar "Calcular"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion |
      | 'Num. Préstamo' | '0001000135'      |

  # QA-CAR-S518517 - Actualización de un Préstamo para una Persona Jurídica, Pestaña Amortización
  @ActualizacionOperacionAmortizacionJuridica
  Esquema del escenario: Actualizacion de un Prestamo para una Persona Natural, Pestaña Amortizacion
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y en pestaña "Amortización" ingresar <FechaValor>, <TasaTotal>, <Cuota>, <TipoPlazo>, <Plazo>, <TipoCuota>, <FechaVencimiento>, <FechaDePagoFija>, <DiaDePago>, <Pint>, <Pcap>, <FechaDePagoExtendido>, <GraciaMora>, <MesGracia>, <PerGraciaCapital>, <PerGraciaInteres>, <BaseCalculo>, <TipoAmortizacion> y presionar "Calcular"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | FechaValor | TasaTotal | Cuota | TipoPlazo | Plazo | TipoCuota | FechaVencimiento | FechaDePagoFija | DiaDePago | Pint | Pcap | FechaDePagoExtendido | GraciaMora | MesGracia | PerGraciaCapital | PerGraciaInteres | BaseCalculo | TipoAmortizacion |
      # QA-CAR-S518509 -Esc1 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Fecha Valor, para persona jurídica con moneda en dólares
      | 'Num. Préstamo' | '0001000268'      | '20042021' | ''        | ''    | ''        | ''    | ''        | ''               | ''              | ''        | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      # QA-CAR-S518509 -Esc2 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Plazo, para persona jurídica con moneda en dólares
      | 'Num. Préstamo' | '0001000268'      | ''         | ''        | ''    | ''        | '6'   | ''        | ''               | ''              | ''        | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      # QA-CAR-S518509 -Esc3 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Fecha de Pago Fija, para persona jurídica con moneda en dólares
      | 'Num. Préstamo' | '0001000268'      | ''         | ''        | ''    | ''        | ''    | ''        | ''               | 'X'             | '6'       | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      # QA-CAR-S518509 -Esc4 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Base de Cálculo, para persona jurídica con moneda en dólares
      | 'Num. Préstamo' | '0001000268'      | ''         | ''        | ''    | ''        | ''    | ''        | ''               | ''              | ''        | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | 'COMERCIAL' | ''               |

  # QA-CAR-S518517 - Esc5 - Actualización de un préstamo de Crédito Individual, Pestaña Amortización, opción Tipo Amortización, para persona jurídica con moneda en dólares
  @ActualizacionOperacionAmortizacionTipoAmortizacionJuridica
  Esquema del escenario: Actualizacion de un Prestamo para una Persona Natural, Pestaña Amortizacion
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y en pestaña "Amortización" ingresar valores de Tipo de Amortizacion "Alemana" y presionar "Calcular"
    Y en pestaña "Amortización" ingresar valores de Tipo de Amortizacion "Francesa" y presionar "Calcular"
    Y se despliega los mensajes de alerta "Operación Correcta"
    Y selecciona la pestaña "Amortización" se visualiza la tabla
    Y presionar el boton de "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion |
      | 'Num. Préstamo' | '0001000268'      |
