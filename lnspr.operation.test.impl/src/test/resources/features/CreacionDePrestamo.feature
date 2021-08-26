#language : es
#Author : roger.reyes@clearminds-it.com
Característica: Verificar la correcta creacion de un prestamo para una persona natural y persona juridica, moneda base, con tipo de pago mensual
  
  COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de Cartera
  QUIERO crear un Prestamo a una persona natural y juridica
  PARA evidenciar la correcta generacion de la tabla de amortizacion y calculo de interes

  Antecedentes: 
    Dado que usuario realiza login en el sistema cobis
    Dado que navega desde "Operaciones>>Cartera" hacia "Creación Préstamo"

  # QA-CAR-S453056-Verificar la creación de un préstamo para una persona natural, moneda base, pago mensual.
  @PrestamoBase
  Esquema del escenario: Verificar la correcta creacion de un prestamo para una persona natural, moneda base, pago mensual
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y presionar el boton "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero | DestinoEconomico                          | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      | '9'     | 'Cliente' | 'Persona Natural' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '1 - ACTIVO FIJO' | '1520 - Elaboración de productos lácteos' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | '25052021'             |

  # QA-CAR-S450208 - escenario1
  @PrestamoPlazoMensualEnSoles
  Esquema del escenario: Apertura de un prestamo de Credito individual persona natural con moneda en soles y tipo de plazo mensual
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y presionar el boton "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda    | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial | Oficina | Ubicacion                 | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      | 'A'     | 'Cliente' | 'Persona Natural' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - SOL' | '5000' | '5000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | ''      | ''      | '1001 - CAJAMARCA - PERU' | ''            | 'M - MES(ES)' | '5'   | '29102021'             |

  # QA-CAR-S450208 - escenario2
  @PrestamoPlazoMensualEnDolar
  Esquema del escenario: Apertura de un prestamo de Credito individual persona natural con moneda en dolares y tipo de plazo mensual
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y presionar el boton "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      | 'A'     | 'Cliente' | 'Persona Natural' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '1 - DOLAR' | '5000' | '5000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | ''      | ''      | '1001 - CAJAMARCA - PERU' | ''            | 'M - MES(ES)' | '5'   | '29102021'             |

  # QA-CAR-S502904 ----------------
  @PrestamoAmortizacion
  Esquema del escenario: Verificar la correcta creación de un Préstamo para una persona natural, tipo de pago mensual, plazo veinte años
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y se valida la creacion de la operacion en la pantalla datos del préstamo, pestaña estado actual tabla de "amortización" ultima pagina
    Y presionar el boton "Transmitir"
    Entonces se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial           | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      | 'T'     | 'Cliente' | 'Persona Natural' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '5000' | '5000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '2 - NIDIA SILVA' | ''      | '205 - OLA - PANAMA' | ''            | 'A - A�O(S)' | '20'  | ''                     |

  # QA-CAR-S503489
  @PrestamoFechaAnterior
  Esquema del escenario: Verificar la correcta creacion de un Prestamo con la fecha de creacion anterior a la fecha de proceso (fecha valor)
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y presionar el boton "Transmitir"
    Y se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir
    Entonces se valida la creacion de la operacion en la pantalla datos del préstamo, pestaña estado actual tabla de "amortización" ultima pagina

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      | 'C'     | 'Cliente' | 'Persona Natural' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | '20042021'    | 'M - MES(ES)' | '5'   | '15052021'             |

  # QA-CAR-S503582
  @PrestamoRubrosTasa
  Esquema del escenario: Creacion de un Prestamo modificando la tasa de interes en la pestaña rubro
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y pestaña "Rubros", en rubro "INT" boton "Editar" campo "Tasa" se ingresa tasa "70", presionamos boton "Guardar" y se valida la modificación de la tasa en la pestaña de "Amortización"
    Y presionar el boton "Transmitir"
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      | 'A'     | 'Cliente' | 'Persona Natural' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '5000' | '80000'       | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     |

  # QA-CAR-S503649 - escenario1
  @PrestamoNuevoRubro
  Esquema del escenario: Verificar la creacion de prestamo ingresando un rubro
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y pestaña "Rubros", boton "Nuevo" ingresar <rublo> y <tasa>, presionamos boton "Guardar"
    Y en la pestaña "Amortización" se valida el nuevo rubro en la tabla
    Y presionar el boton "Transmitir"
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento | rublo                 | tasa |
      | 'S'     | 'Cliente' | 'Persona Natural' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '10000' | '20000'       | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '20'   | ''                     | 'CMO - COMISION MORA' | '5'  |

  # QA-CAR-S503649 - escenario2
  @PrestamoEliminarRubros
  Esquema del escenario: Verificar la creacion de un prestamo eliminando un rubro
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y pestaña "Rubros" se selecciona el rubro "SEGDES", se presiona botón "Eliminar"
    Y presionar el boton "Transmitir"
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      | 'A'     | 'Cliente' | 'Persona Natural' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     |

  # QA-CAR-S504210 - escenario1
  @PrestamoParametroGeneralReajustable
  Esquema del escenario: Modificación opción Reajustable NO
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y pestaña "Parámetros Generales", el campo "Reajustable" se marca "NO"
    Y presionar el boton "Transmitir"
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      | 'A'     | 'Cliente' | 'Persona Natural' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     |

  # QA-CAR-S504210 - escenario2
  @PrestamoParametroGeneralPagoExtraordinario
  Esquema del escenario: Modificación Pago extraordinario con Reducción de Tiempo
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y pestaña "Parámetros Generales", el campo "Pago Extraodinario" se marca "Reducción de Tiempo"
    Y presionar el boton "Transmitir"
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo              | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      | 'A'     | 'Cliente' | 'Persona Natural' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     |

  # QA-CAR-S450901
  @PrestamoPersonaJuridica
  Esquema del escenario: Creacion de un Prestamo para una Persona Jurídica
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y en pestaña "Amortización"
    Y presionar el boton "Transmitir"
    Y se despliega el mensaje de alerta "Operación ha sido transmitida exitosamente" con bloqueo en el boton transmitir
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo               | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      #Escenario 2 - Apertura de un préstamo de Crédito Individual persona jurídica con moneda en dólares y tipo de plazo mensual
      | '171'   | 'Cliente' | 'Persona Jurídica' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     |

  # QA-CAR-S504319
  @PrestamoConGracia
  Esquema del escenario: Creación de préstamo con dos meses de gracia
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y pestaña "Amortización" ingresar valores de gracia <MesDeGracia>, <PerGraciaCapital> y presionar "Calcular"
    Y presionar el boton "Transmitir"
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo               | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento | MesDeGracia | PerGraciaCapital |
      #Escenario 1 - Creación de préstamo persona natural, moneda base
      | 'A'     | 'Cliente' | 'Persona Natural'  | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     | "2"         | "2"              |
      | 'SEGOVIA DOMINGUEZ DARIO' | 'Cliente' | 'Persona Natural'  | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '5000'  | '8000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería'       | '1 - admuser' | ''      | '205 - OLA - PANAMA'            | ''            | 'M - MES(ES)' | '12'  | '28052021'             | "2"         | "2"              |
      | '7'                       | 'Cliente' | 'Persona Natural'  | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '10000' | '20000'       | '2 - CAPITAL DE TRABAJO' | '0111 - Cultivo de cereales y otros cultivos n.c.p.' | '1 - admuser' | ''      | '101 - BOCAS DEL TORO - PANAMA' | '28042021'    | 'M - MES(ES)' | '12'  | ''                     | "1"         | "1"              |
      | 'A'                       | 'Cliente' | 'Persona Natural'  | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '50000' | '100000'      | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería'       | '1 - admuser' | ''      | '205 - OLA - PANAMA'            | ''            | 'D - DIA(S)'  | '180' | ''                     | "1"         | "1"              |
      #Escenario 3 - Creación de préstamo persona jurídica, moneda base
      | '171'   | 'Cliente' | 'Persona Jurídica' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     | "2"         | "2"              |

  # QA-CAR-S504267
  @PrestamoFechasPagos
  Esquema del escenario: Creacion prestamos modificando opciones en la pestaña Amortizacion
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y pestaña "Amortización" ingresar <FechaValor>, <TasaTotal>, <Cuota>, <TipoPlazo>, <Plazo>, <TipoCuota>, <FechaVencimiento>, <FechaDePagoFija>, <DiaDePago>, <Pint>, <Pcap>, <FechaDePagoExtendido>, <GraciaMora>, <MesGracia>, <PerGraciaCapital>, <PerGraciaInteres>, <BaseCalculo>, <TipoAmortizacion> y presionar "Calcular"
    Y presionar el boton "Transmitir"
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo               | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento | FechaValor | TasaTotal | Cuota | TipoPlazo | Plazo | TipoCuota | FechaVencimiento | FechaDePagoFija | DiaDePago | Pint | Pcap | FechaDePagoExtendido | GraciaMora | MesGracia | PerGraciaCapital | PerGraciaInteres | BaseCalculo | TipoAmortizacion |
      #Escenario 1 - Modificación de Día de Pago, Persona Natural
      | '12'                | 'Cliente' | 'Persona Natural'  | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '7500'  | '10000'       | '2 - CAPITAL DE TRABAJO' | '0122 - Cría de otros animales; elaboración de productos animales n.c.p.' | '2 - NIDIA SILVA'                  | ''      | '101 - BOCAS DEL TORO - PANAMA'  | ''            | 'A - A�O(S)'  | '2'   | ""                     | ''         | ''        | ''    | ''        | ''    | ''        | ''               | 'X'             | '28'      | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      | 'LÓPEZ HUAMAN JUAN' | 'Cliente' | 'Persona Natural'  | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '5000'  | '8000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería'                            | '6 - ESTEBAN ANDRES PEREZ HERRERA' | ''      | '103 - CHIRIQUI GRANDE - PANAMA' | '28042021'    | 'M - MES(ES)' | '12'  | ""                     | ''         | ''        | ''    | ''        | ''    | ''        | ''               | 'X'             | '5'       | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      | 'A'                 | 'Cliente' | 'Persona Natural'  | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '10000' | '10000'       | '2 - CAPITAL DE TRABAJO' | '0122 - Cría de otros animales; elaboración de productos animales n.c.p.' | '1 - admuser'                      | ''      | '205 - OLA - PANAMA'             | ''            | 'D - DIA(S)'  | '180' | ""                     | ''         | ''        | ''    | ''        | ''    | ''        | ''               | 'X'             | '16'      | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      #Escenario 3 - Modificación de Día de Pago, Persona Jurídica
      | '113'               | 'Cliente' | 'Persona Jurídica' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '50000' | '100000'      | '1 - ACTIVO FIJO'        | '1722 - Fabricación de tapices y alfombras'                               | '9 - MANUEL JIMENEZ'               | ''      | '204 - NATA - PANAMA'            | '28042021'    | 'M - MES(ES)' | '12'  | ""                     | ''         | ''        | ''    | ''        | ''    | ''        | ''               | 'x'             | '12'      | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      | '171'               | 'Cliente' | 'Persona Jurídica' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '20000' | '40000'       | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería'                            | '1 - admuser'                      | ''      | '303 - DONOSO - PANAMA'          | ''            | 'D - DIA(S)'  | '360' | ""                     | ''         | ''        | ''    | ''        | ''    | ''        | ''               | 'x'             | '15'      | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      | 'A'                 | 'Cliente' | 'Persona Jurídica' | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000'  | '4000'        | '2 - CAPITAL DE TRABAJO' | '1911 - Curtido y adobo de cueros'                                        | '1 - admuser'                      | ''      | '205 - OLA - PANAMA'             | ''            | 'A - A�O(S)'  | '1'   | ""                     | ''         | ''        | ''    | ''        | ''    | ''        | ''               | 'x'             | '20'      | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      | '113'               | 'Cliente' | 'Persona Jurídica' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '55000' | '100000'      | '2 - CAPITAL DE TRABAJO' | '1729 - Fabricación de otros productos textiles n.c.p.'                   | '1 - admuser'                      | ''      | '401 - ALANJE - PANAMA'          | '26042021'    | 'M - MES(ES)' | '12'  | "26052021"             | ''         | ''        | ''    | ''        | ''    | ''        | ''               | 'x'             | '30'      | ''   | ''   | ''                   | ''         | ''        | ''               | ''               | ''          | ''               |
      | '30'                | 'Cliente' | 'Persona Natural'  | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '6500'  | '10000'       | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería'                            | '1 - admuser'                      | ''      | '301 - CHAGRES - PANAMA'         | ''            | 'M - MES(ES)' | '12'  | ""                     | '27042021' | ''        | ''    | ''        | ''    | ''        | ''               | 'x'             | '28'      | ''   | ''   | ''                   | ''         | ''        | '2'              | ''               | ''          | ''               |
      | '171'               | 'Cliente' | 'Persona Jurídica' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000'  | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería'                            | '1 - admuser'                      | ''      | '205 - OLA - PANAMA'             | ''            | 'M - MES(ES)' | '5'   | ""                     | ''         | ''        | ''    | ''        | ''    | ''        | ''               | 'x'             | '16'      | ''   | ''   | ''                   | ''         | ''        | '1'              | '1'              | ''          | ''               |
      
  #QA-CAR-S504279
  @PrestamoTipoAmortizacion
  Esquema del escenario: Creacion de un Prestamo con tabla de amortización tipo Alemana
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y pestaña "Amortización" ingresar valores de Tipo de Amortizacion "Alemana", valores de gracia <MesDeGracia>, <PerGraciaCapital> y presionar "Calcular"
    Y presionar el boton "Transmitir"
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo               | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento | FechaDePagoFija | MesDeGracia | PerGraciaCapital |
      #Escenario 1 - Creación de Préstamo Persona Natural
      | 'A'     | 'Cliente' | 'Persona Natural'  | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     | "x"             | ''          | ''               |
      #Escenario 2 - Creación de Préstamo Persona Juridica
      | '171'   | 'Cliente' | 'Persona Jurídica' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     | "X"             | ''          | ''               |
      #Escenario 3 - Creación de Préstamo Persona Natural con Período de Gracia
      | 'A'     | 'Cliente' | 'Persona Natural'  | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     | "x"             | '2'         | '2'              |
      #Escenario 4 - Creación de Préstamo Persona Jurídica con Período de Gracia
      | '171'   | 'Cliente' | 'Persona Jurídica' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     | "X"             | '2'         | '2'              |

  # QA-CAR-S504289
  @PrestamoTipoAmortizacionFrancesa
  Esquema del escenario: Creacion de prestamo con tabla de amortizacion tipo francesa
    Cuando se desea agregar el Cliente en el campo "Cód. Cliente"
    Y se busca el <cliente> por <entidad>, <tipo>, <buscarPor>, luego se "marca" Deudor Principal y se presiona boton "Añadir"
    Y en el formulario de Creacion de Prestamo ingresar los campos <TipoOperacion>,<Moneda>,<Monto>,<MontoAprobado>,<DestinoFinanciero>,<DestinoEconomico>,<Oficial>,<Oficina>,<Ubicacion>,<FechaCreacion>,<TipoPlazo>,<Plazo>,<FechaPrimerVencimiento> y presionar el boton "Crear" se despliega el mensaje "Creación Correcta" y se genera numero de operacion
    Y pestaña "Amortización" ingresar valores de Tipo de Amortizacion "Alemana" y presionar "Calcular"
    Y pestaña "Amortización" ingresar valores de Tipo de Amortizacion "Francesa" y presionar "Calcular"
    Y presionar el boton "Transmitir"
    Entonces se valida la creación de la operación en la pestaña "Información General"

    Ejemplos: 
      | cliente | entidad   | tipo               | buscarPor | TipoOperacion                  | Moneda      | Monto  | MontoAprobado | DestinoFinanciero        | DestinoEconomico                               | Oficial       | Oficina | Ubicacion            | FechaCreacion | TipoPlazo     | Plazo | FechaPrimerVencimiento |
      #Escenario 1 - Creacion de operacion Persona Natural, modificacion de tabla de amortizacion, moneda base
      | 'A'     | 'Cliente' | 'Persona Natural'  | 'Nombre'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     |
      #Escenario 2 - Creacion de operacion Persona Juridica, modificacion de tabla de amortizacion, moneda base
      | '171'   | 'Cliente' | 'Persona Jurídica' | 'Código'  | 'CREDIND - CREDITO INDIVIDUAL' | '0 - DOLAR' | '4000' | '4000'        | '2 - CAPITAL DE TRABAJO' | '1541 - Elaboración de productos de panadería' | '1 - admuser' | ''      | '205 - OLA - PANAMA' | ''            | 'M - MES(ES)' | '5'   | ''                     |
