import java.util.Scanner;

public class Menu 
{ 
	// MENU PRINCIPAL
	public void mostrarMenu(){
		System.out.println("\n---- --- -- -  - -- --- ----\n");
		System.out.println("\n Bienvenido a Buquealtoque! \n");
		System.out.println("1-Reservar Pasaje");
		System.out.println("2-Reservar Paquete");
		System.out.println("3-Reservar DayTour");
		System.out.println("4-Ver Reserva");
		System.out.println("5-Pagar Reserva ");
		System.out.println("6-Cancelar Reserva ");
		System.out.println("7-Alta Cliente ");
		System.out.println("9- Salir \n");
		System.out.println("Ingrese la opcion deseada: ");
	}
	
	// MENU SELECCION IDA O IDA Y VUELTA
	public void mostrarMenuIdaOIdaYVuelta(){
		System.out.println("\nIda o Ida/Vuelta:\n");
		System.out.println("1-Solo Ida");
		System.out.println("2-Ida y Vuelta");
	}
	
	// MENU ORIGEN Y DESTINO
	public void mostrarMenuOrigenDestino(Pasaje pasaje){
			System.out.println("Origen-Destino: \n");
			System.out.println("1-De Argentina a Uruguay");
			System.out.println("2-De Uruguay a Argentina");
			
			int opcion = this.leerOpcion();
		
		if(opcion==1){
			// GUARDAR ORIGEN Y DESTINO EN PASAJE
			pasaje.setOrigenDestino("DE ARGENTINA A URUGUAY");
			
		} if(opcion==2){
			//GUARDAR ORIGEN Y DESTINO EN PASAJE
			pasaje.setOrigenDestino("DE URUGUAY A ARGENTINA");
				}
	}
	
	// MENU SELECCION DE FECHA
	public void mostrarMenuSeleccionFechaIda(){
		System.out.println("\nIngrese la Fecha de Salida:");
		System.out.println("Dia-Mes -> 00-00");
	}
	
	public void mostrarMenuSeleccionFechaVuelta(){
		System.out.println("\nIngrese la Fecha de Vuelta");
		System.out.println("Dia-Mes -> 00-00");
	}
	
	// MENU CANTIDAD DE PASAJEROS Y BODEGA
	public void mostrarMenuPasajerosYVehiculo(Pasaje pasaje){
		System.out.println("\nCantidad de Pasajeros:");
		pasaje.setCantidadPasajeros(this.leerOpcion());
		
		System.out.println("\nCantidad de Vehiculos en la Bodega:");
		pasaje.setCantidadVehiculosBodega(this.leerOpcion());	
	}
	
	// MENU PASAJES IDA
	public void mostrarMenuIda(Pasaje pasaje){
		//ELEGIR FECHA IDA Y GUARDAR EN PASAJE
		this.mostrarMenuSeleccionFechaIda();
		pasaje.setFechaDeSalida(this.leerIngreso());
	}

	// MENU PASAJES IDA Y VUELTA
	public void mostrarMenuIdaYVuelta(Pasaje pasaje){
		this.mostrarMenuIda(pasaje);
		
		// ELEGIR FECHA DE VUELTA Y GUARDAR EN PASAJE
		this.mostrarMenuSeleccionFechaVuelta();
		pasaje.setFechaDeVuelta(this.leerIngreso());
	}
	
	// MENU PASAJES
	public void mostrarMenuPasajes(Pasaje pasaje){
	
	int opcion = 0;
	
	this.mostrarMenuIdaOIdaYVuelta();
	opcion = this.leerOpcion();
	
		if(opcion==1){
		// GUARDAR SOLO IDA
		pasaje.setIdaOIdayVuelta("IDA");
		pasaje.setFechaDeVuelta("XX-XX");
		this.mostrarMenuOrigenDestino(pasaje);
		this.mostrarMenuIda(pasaje);
		} 
	
		if(opcion==2) {
		// GUARDAR IDA Y VUELTA EN PASAJE
		pasaje.setIdaOIdayVuelta("IDA Y VUELTA");
		this.mostrarMenuOrigenDestino(pasaje);
		this.mostrarMenuIdaYVuelta(pasaje);
			}

	this.mostrarMenuPasajerosYVehiculo(pasaje);
					}
			
	// MENU CLIENTE
	public void mostrarMenuIngreso(Cliente cliente){
		System.out.println("\nIngrese su Nombre:");
		cliente.setNombre(this.leerIngreso());
		System.out.println("\nIngrese su Apellido:");
		cliente.setApellido(this.leerIngreso());
		System.out.println("\nIngrese su Domicilio:");
		cliente.setDomicilio(this.leerIngreso());
		System.out.println("\nIngrese su Fecha de Nacimiento");
		System.out.println("Dia-Mes-Ano -> XX-XX-XXXX");
		cliente.setFechaDeNacimiento(this.leerIngreso());
		System.out.println("\nIngrese su E-mail:");
		cliente.setEmail(this.leerIngreso());
		System.out.println("\nIngrese su Contrasena:");
		cliente.setContrasena(this.leerIngreso());
	}
	
	// MENU PAGO
	public void mostrarMenuPago(Cliente cliente) {
		System.out.println("\n " + cliente.nombre + " " + cliente.apellido + " elija el tipo de pago: \n");
		
		System.out.println("1-Tarjeta de Credito/Debito");
		System.out.println("2-Cuenta Bancaria");
		System.out.println("3-Mercado Pago");
		
		int opcion = this.leerOpcion();
		
		switch(opcion) {
		case 1:{
			System.out.println("\nIngrese los numeros de su tarjeta: ");
			cliente.setTarjetaDeCredito(this.leerIngreso());
			(cliente.getPago()).setTipopago(TipoPago.TarjetaDeCreditoODebito);
		}
		break;
		case 2:{
			System.out.println("\nIngrese su CBU: ");
			cliente.setCuentaBancaria(this.leerIngreso());
			(cliente.getPago()).setTipopago(TipoPago.CuentaBancaria);
		}
		break;
		case 3:{
			System.out.println("\nIngrese su CVU de Mercado Pago: ");
			cliente.setMercadoPago(this.leerIngreso());
			(cliente.getPago()).setTipopago(TipoPago.MercadoPago);
		}
		break;
								}
	}
	
	// MENU PAQUETES
	public void mostrarMenuPaquetes(Paquete paquete){
	System.out.println("\n1- URUGUAY - Hotel del Sol ***");
	System.out.println("2- URUGUAY - Hotel del Mar ****");
	System.out.println("3- ARGENTINA - Hotel Madero *****");
	
	int opcion = this.leerOpcion();
		switch(opcion){
			case 1:{
				this.mostrarMenuPaqueteUno();
				System.out.println("\n-PRECIO POR PERSONA $40000");
				
				 this.mostrarMenuReservarSalir();
				
				switch(this.leerOpcion()){
				case 1:{
					
				System.out.println("-Ingrese cantidad de pasajeros: ");
				int pasajeros= this.leerOpcion();
				
				paquete.setCantidadDePersonas(pasajeros);
				paquete.setNombre("URUGUAY - Hotel del Sol ***");
				paquete.setPrecio(40000*(paquete.getCantidadDePersonas()));
				
				System.out.println("\n- Se realizo la reserva del paquete con exito!");
				
				break;
				}
				}
			}
			break;
			case 2:{
				this.mostrarMenuPaqueteDos();
				
				System.out.println("\n-PRECIO POR PERSONA $25000");
				this.mostrarMenuReservarSalir();
				 
				switch(this.leerOpcion()){
				case 1:{
					
				System.out.println("-Ingrese cantidad de pasajeros: ");
				int pasajeros= this.leerOpcion();
				
				paquete.setCantidadDePersonas(pasajeros);
				paquete.setNombre("URUGUAY - Hotel del Mar ****");
				paquete.setPrecio(25000*(paquete.getCantidadDePersonas()));
				
				System.out.println("\n- Se realizo la reserva del paquete con exito!");
				
				break;
						}
				
											}
				}
			break;
			case 3:{
				this.mostrarMenuPaqueteTres();
		
				System.out.println("\n-PRECIO POR PERSONA $75000");
				
				this.mostrarMenuReservarSalir();
				
				switch(this.leerOpcion()){
				case 1:{
					
				System.out.println("-Ingrese cantidad de pasajeros: ");
				int pasajeros= this.leerOpcion();
				
				paquete.setCantidadDePersonas(pasajeros);
				paquete.setNombre("ARGENTINA - Hotel Madero *****");
				paquete.setPrecio(75000*(paquete.getCantidadDePersonas()));
				
				System.out.println("\n- Se realizo la reserva del paquete con exito!");
				
				break;
						}
				
											}
			}
		              }
	}
	
	// MENU OPCIONES PAQUETES
	public void mostrarMenuPaqueteUno() {
		System.out.println("\nIncluye: ");
		System.out.println("-Pasajes Ida y Vuelta a Uruguay");
		System.out.println("-6 Noches en Montevideo en 'Hotel del Sol' ");
		System.out.println("-Charter desde el puerto al hotel");
		System.out.println("-Media pension");
		System.out.println("\n-SALIDA 24-07");
	}
	
	public void mostrarMenuPaqueteDos() {
		System.out.println("\nIncluye:");
		System.out.println("-Pasajes Ida y Vuelta a Uruguay");
		System.out.println("-3 Noches en Montevideo en 'Hotel del Mar' ");
		System.out.println("-Charter desde el puerto al hotel");
		System.out.println("-Pension Completa");
		System.out.println("\n-Salida 17-09");
		
	}
	
public void mostrarMenuPaqueteTres() {
	System.out.println("\nIncluye:");
	System.out.println("-Pasajes Ida y Vuelta a Argentina");
	System.out.println("-10 Noches en Buenos Aires en 'Hotel Madero' ");
	System.out.println("-Charter desde el puerto al hotel");
	System.out.println("-Pension Completa");
	System.out.println("\n-Salida 23-12");
		
	}
	// MENU DAYTOURS
 	public void mostrarMenuDayTours(DayTours daytour){
	System.out.println("\n1- BIKE TOUR - Circuito en Bici en Colonia");
	System.out.println("2- CONOCIENDO LA CAPITAL - Recorrida de Capital en Montevideo");
	System.out.println("3- DEGUSTACION EN BODEGAS - Degustacion de Vinos en Carmelo");
	
		int opcion = this.leerOpcion();
		switch(opcion){
			case 1:{
				this.mostrarMenuDaytoursUno();
			    System.out.println("\n - PRECIO POR PERSONA: $25000");
			    daytour.setNombre("BIKE TOUR - Circuito en Bici en Colonia");
			    
			    this.mostrarMenuReservarSalir();
			    
			    switch(this.leerOpcion()){
				case 1:{
					
				System.out.println("\n-Ingrese cantidad de personas: ");
				int personas = this.leerOpcion();
				daytour.setCantidadDePersonas(personas);
				
				System.out.println("\n-Ingrese fecha de salida: ");
				System.out.println("  Dia-Mes --> XX-XX ");
				String fechaDeSalida = this.leerIngreso();
				daytour.setFechaDeSalida(fechaDeSalida);
	
				daytour.setPrecio(25000*(daytour.getCantidadDePersonas()));
				
				System.out.println("\n- Se realizo la reserva del daytour con exito!");
				}
				break;
			    }
			    
			}break;
			case 2:{
				this.mostrarMenuDaytoursDos();
				System.out.println("\n - PRECIO POR PERSONA: $30000");
				daytour.setNombre("CONOCIENDO LA CAPITAL - Recorrida de Capital en Montevideo");
		
				this.mostrarMenuReservarSalir();
				
				switch(this.leerOpcion()){
				case 1:{
					
				System.out.println("\n-Ingrese cantidad de personas: ");
				int personas = this.leerOpcion();
				daytour.setCantidadDePersonas(personas);
				
				System.out.println("\n-Ingrese fecha de salida: ");
				System.out.println("  Dia-Mes --> XX-XX ");
				String fechaDeSalida = this.leerIngreso();
				daytour.setFechaDeSalida(fechaDeSalida);
				
				daytour.setPrecio(30000*(daytour.getCantidadDePersonas()));
				
				System.out.println("\n- Se realizo la reserva del daytour con exito!");
				}
				break;
			    }
				
			}break;
			case 3:{
				this.mostrarMenuDaytoursTres();
				System.out.println("\n - PRECIO POR PERSONA: $28500");
				daytour.setNombre("DEGUSTACION EN BODEGAS - Degustacion de Vinos en Carmelo");
				
				this.mostrarMenuReservarSalir();
				
				switch(this.leerOpcion()){
				case 1:{
					
				System.out.println("\n-Ingrese cantidad de personas: ");
				int personas = this.leerOpcion();
				daytour.setCantidadDePersonas(personas);
				
				System.out.println("\n-Ingrese fecha de salida: ");
				System.out.println("  Dia-Mes --> XX-XX ");
				String fechaDeSalida = this.leerIngreso();
				daytour.setFechaDeSalida(fechaDeSalida);
				
				daytour.setPrecio(28500*(daytour.getCantidadDePersonas()));
				
				System.out.println("\n- Se realizo la reserva del daytour con exito!");
				}
				break;
			    }
				}
		              }
 	}
 // MENU OPCIONES DAYTOURS
 	public void mostrarMenuDaytoursUno() {
 		System.out.println("\nIncluye: ");
		System.out.println("-Pasajes Ida y Vuelta a Uruguay");
		System.out.println("-Charter Ida y Vuelta a Colonia");
		System.out.println("-Alquiler de Bici y paseo");
 	}
 	public void mostrarMenuDaytoursDos() {
 		System.out.println("\nIncluye:");
		System.out.println("-Pasajes Ida y Vuelta a Uruguay");
		System.out.println("-Charter Ida y Vuelta a Montevideo");
		System.out.println("-Excursion guiada por la capital");
		System.out.println("-Almuerzo en 'Oasis: La Cocina de Amira");
		System.out.println("-Merienda en 'Tres Cruces'");
 	}
 	public void mostrarMenuDaytoursTres() {
 		System.out.println("\nIncluye:");
		System.out.println("-Pasajes Ida y Vuelta a Uruguay");
		System.out.println("-Charter Ida y Vuelta a Carmelo");
		System.out.println("-Visita guiada a la Bodega 'CAMPOTINTO'");
		System.out.println("-Degustacion de Vinos");
		System.out.println("-Botella de vino de la casa");
 	}
 // NO HIZO RESERVA
 	public void mostrarMensajeSinReserva() {
 		System.out.println("\nNo ha realizado ninguna reserva!");
 	}	
 // NO DIO DE ALTA
 	public void mostrarMensajeDarDeAlta() {
 		System.out.println("\nPara realizar una compra debe darse de Alta en la App!");
 	}
 // RESERVAR/SALIR
	public void mostrarMenuReservarSalir() {
		System.out.println("\n1- RESERVAR");
		System.out.println("2- SALIR");
	}
 // LEER LA OPCION
	public String leerIngreso() {
		Scanner ingreso = new Scanner(System.in);
		String ingresoLeido = ingreso.next();
		return ingresoLeido;
	} 
	
	public int leerOpcion(){
		Scanner opcion = new Scanner(System.in);
		int opcionLeida=opcion.nextInt();
		return opcionLeida;
	}

}