import java.util.LinkedList;

public class Pago {
	// ATRIBUTOS
	private LinkedList <TipoPago> tiposDePago;
	
	// GETTERS & SETTERS
	public LinkedList<TipoPago> getTipopago() {
		return tiposDePago;
	}
	public void setTipopago(TipoPago tiposDePago2) {
		this.tiposDePago.add(tiposDePago2);
	}

	// CONSTRUCTOR
	public Pago(LinkedList<TipoPago> tiposDePago) {
		super();
		this.tiposDePago = tiposDePago;
	}
	
}
