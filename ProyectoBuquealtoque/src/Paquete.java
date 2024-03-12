public class Paquete extends Producto {
	
	
	private int precio;
	public String nombre;
	public int cantidadDePersonas;
	
	// GETTERS & SETTERS
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadDePersonas() {
		return cantidadDePersonas;
	}

	public void setCantidadDePersonas(int cantidadDePersonas) {
		this.cantidadDePersonas = cantidadDePersonas;
	}

	// METODOS DE LA CLASE ABSTRACTA
	public void mostrarProducto(){
		System.out.println("\n--- -- - PAQUETE - -- ---");
		System.out.println(this.getNombre());
		System.out.println("Cantidad de Personas: " + this.getCantidadDePersonas());
		System.out.println("$ " + this.getPrecio());
	}
	
}
