import java.util.LinkedList;

public class Reserva {
	
	// ATRIBUTOS
	private int id;
	private Cliente cliente;
	public LinkedList <Producto> productos;
	private Pago pago;
	private EstadoReserva estado;
	public boolean existe;
	
	
	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LinkedList<Producto> getProductos() {
		return productos;
	}
	
	public void setProducto(Producto producto) {
		this.productos.add(producto);
	}
	public boolean isExiste() {
		return existe;
	}
	public void setExiste(boolean existe) {
		this.existe = existe;
	}
	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}
	
	/* CONSTRUCTOR
	public Reserva() {
		
	existe = false;
	estado = EstadoReserva.PENDIENTE;
	productos = ;

	} */


	
	// ESTADO RESERVA
	public EstadoReserva getEstado() {
		return estado;
	}
	
	public Reserva(LinkedList<Producto> productos, EstadoReserva estado, boolean existe) {
		super();
		this.productos = productos;
		this.estado = estado;
		this.existe = existe;
	}
	public void setEstado(EstadoReserva er) {
		estado=er;
	}
	
	public void mostrarEstado() {
		System.out.println("El estado de la reserva es: " + estado);
	}
	
	// METODOS
	public void imprimir(LinkedList<Producto> listaDeProductos) {
        for (Producto elemento : listaDeProductos)
            elemento.mostrarProducto();
        System.out.println();
    }
	
	
	public void mostrarReserva() {
		System.out.println("\n----- ---- --- -- - RESERVA - -- --- ---- -----\n");
		
		(this.getCliente()).mostrar();
		this.imprimir(this.productos);
		System.out.println("\n---- --- -- -  - -- --- ----\n");
		this.mostrarEstado();
		}
}
