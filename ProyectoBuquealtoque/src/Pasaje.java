public class Pasaje extends Producto

{	// ATRIBUTOS
	public String idaOIdayVuelta;
	public String origenDestino;
	public String fechaDeSalida;
	public String fechaDeVuelta;
	public int cantidadPasajeros;
	public int cantidadVehiculosBodega;
    private int precio;
	
	// GETTERS Y SETTERS
	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public int getCantidadVehiculosBodega() {
		return cantidadVehiculosBodega;
	}

	public void setCantidadVehiculosBodega(int cantidadVehiculosBodega) {
		this.cantidadVehiculosBodega = cantidadVehiculosBodega;
	}

	public String getFechaDeSalida() {
		return fechaDeSalida;
	}

	public void setFechaDeSalida(String fechaDeSalida) {
		this.fechaDeSalida = fechaDeSalida;
	}

	public String getFechaDeVuelta() {
		return fechaDeVuelta;
	}

	public void setFechaDeVuelta(String fechaDeVuelta) {
		this.fechaDeVuelta = fechaDeVuelta;
	}

	public String getOrigenDestino() {
		return origenDestino;
	}

	public void setOrigenDestino(String origenDestino) {
		this.origenDestino = origenDestino;
	}

	public String getIdaOIdayVuelta() {
		return idaOIdayVuelta;
	}

	public void setIdaOIdayVuelta(String idaOIdayVuelta) {
		this.idaOIdayVuelta = idaOIdayVuelta;
	}
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	// MOSTRAR PASAJE
	public void mostrarProducto() {
		System.out.println("\n--- -- - TICKET DEL PASAJE - -- ---");
		System.out.println(this.idaOIdayVuelta + " " + this.origenDestino + "\n");
		System.out.println("Pasajeros: " + this.cantidadPasajeros);
		System.out.println("Vehiculos en la Bodega: " + this.cantidadVehiculosBodega);
		System.out.println("Fecha de Salida: " + this.fechaDeSalida);
		System.out.println("Fecha de Vuelta: " + this.fechaDeVuelta + "\n");
		System.out.println("Precio: $" + this.precio);
	}

}
