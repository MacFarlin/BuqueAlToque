import java.util.LinkedList;

public class BuqueAlToque 
{
	public static void main(String[] args) 
	{   
		Menu menu = new Menu();
		Cliente cliente = new Cliente();
		LinkedList <Producto> productos = new LinkedList<Producto>();
		LinkedList <TipoPago> tiposDePago = new LinkedList<TipoPago>();
		// LinkedList <Reserva> reservas = new LinkedList<Reserva>();
		Reserva reserva = new Reserva(productos, EstadoReserva.PENDIENTE, false);
		
		
		// ESTO ES PARA EVITAR EL ALTA CLIENTE
		Pago pago = new Pago(tiposDePago);
		
		reserva.setCliente(cliente);
		cliente.setNombre("Ariel");
		cliente.setApellido("Mac Farlin");
		cliente.setDomicilio("Iglesias 2530");
		cliente.setFechaDeNacimiento("18-07-1996");
		cliente.setTarjetaDeCredito("1234987645321111");
		cliente.setEmail("nahuelarielmacfarlin@gmail.com");
		cliente.setActivo(true);
		cliente.setContrasena("123454321");
		
		cliente.setPago(pago);
		(cliente.getPago()).setTipopago(TipoPago.TarjetaDeCreditoODebito);
		(cliente.getPago()).setTipopago(TipoPago.CuentaBancaria);
		(cliente.getPago()).setTipopago(TipoPago.MercadoPago);
		//
		
		int opcion=0;
		
		do {
			menu.mostrarMenu();
			opcion = menu.leerOpcion();
		switch (opcion){
		
		// RESERVAR PASAJES 
		case 1:
		{	if (cliente.activo) {
			Pasaje pasaje = new Pasaje();
			menu.mostrarMenuPasajes(pasaje);
			
			reserva.setExiste(true);
			reserva.setProducto(pasaje);
		
			System.out.println("\nSe ha realizado con exito la reserva del pasaje!");
			reserva.setEstado(EstadoReserva.PENDIENTE);
			
			if(pasaje.getIdaOIdayVuelta() == "IDA") {
			pasaje.setPrecio((pasaje.cantidadPasajeros)*10000 + (pasaje.cantidadVehiculosBodega)*1000);
			} else {
				pasaje.setPrecio((pasaje.cantidadPasajeros)*15000 + (pasaje.cantidadVehiculosBodega)*2000);
			}
			pasaje.mostrarProducto();
			
			} else {
				menu.mostrarMensajeDarDeAlta();
			}
		}
		break;
		
		// RESERVAR PAQUETES
		case 2:
		{
			 if (cliente.activo) {
				            Paquete paquete = new Paquete();
							menu.mostrarMenuPaquetes(paquete);
							
							reserva.setExiste(true);
							reserva.setProducto(paquete);
							reserva.setEstado(EstadoReserva.PENDIENTE);
							} else {
			  menu.mostrarMensajeDarDeAlta();
			}
		}
		break;
		// RESERVAR DAYTOURS
		case 3: {
				if (cliente.activo) {
					   DayTours daytour = new DayTours();
						menu.mostrarMenuDayTours(daytour);
						reserva.setExiste(true);
						reserva.setProducto(daytour);
						reserva.setEstado(EstadoReserva.PENDIENTE);
							} else {
			menu.mostrarMensajeDarDeAlta();
			}

		}
		break;
		// VER RESERVAS
		case 4:{
			if(reserva.existe) {
			reserva.mostrarReserva();
			}
			else {
				menu.mostrarMensajeSinReserva();
			}
		}
		break;
		// PAGAR RESERVAS
		case 5:
		{   
		if(reserva.existe) {
			reserva.setEstado(EstadoReserva.PAGADA);
			reserva.mostrarEstado();
			}
			else {
				menu.mostrarMensajeSinReserva();
			}
		}
		break;
		// CANCELAR RESERVAS
		case 6:
		{
			if(reserva.existe){					
			reserva.setEstado(EstadoReserva.CANCELADA);
			reserva.mostrarEstado();}
			else{menu.mostrarMensajeSinReserva();;}
		}
		break;
		// ALTA CLIENTE
		case 7:
		{   
			menu.mostrarMenuIngreso(cliente);
			cliente.activo=true;
			
			cliente.setPago(pago);
			
			menu.mostrarMenuPago(cliente);
			reserva.setCliente(cliente);
			reserva.setPago(pago);
			
			cliente.mostrar();
			
			System.out.println("\nSe ha dado de alta exitosamente " + cliente.nombre + " " + cliente.apellido +"!");
		}
		break;
						}
			}while(opcion!=9);
		
		System.out.println("\n Gracias por usar nuestra App!");
	}
}
