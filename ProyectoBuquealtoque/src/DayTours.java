
public class DayTours extends Producto {
		private int precio;
		public String nombre;
		public int cantidadDePersonas;
		public String fechaDeSalida;
		
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
		public String getFechaDeSalida() {
			return fechaDeSalida;
		}
		public void setFechaDeSalida(String fechaDeSalida) {
			this.fechaDeSalida = fechaDeSalida;
		}

		// METODOS DE LA CLASE ABSTRACTA
		public void mostrarProducto(){
			System.out.println("\n--- -- - DAY TOUR - -- ---");
			System.out.println(this.getNombre());
			System.out.println("Fecha de Salida: " + this.getFechaDeSalida());
			System.out.println("Cantidad de Personas: " + this.getCantidadDePersonas());
			System.out.println("$ " + this.getPrecio());
		}
		
	}