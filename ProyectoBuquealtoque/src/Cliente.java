
public class Cliente {
	
/// ATRIBUTOS
	public String nombre;
	public String apellido;
	private String domicilio;
	private String fechaDeNacimiento;
	private String tarjetaDeCredito;
	private String mercadopago;
	public String email;
	private String contrasena;
	private String cuentaBancaria;
	private int cantidadDeIncumplimientos;
	public boolean esPremium;
	public boolean activo;
	private Pago pago;
	

Cliente(){
	esPremium= false;
	activo= false;
	cantidadDeIncumplimientos= 0;
	}

	
/// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getTarjetaDeCredito() {
		return tarjetaDeCredito;
	}

	public void setTarjetaDeCredito(String tarjetaDeCredito) {
		this.tarjetaDeCredito = tarjetaDeCredito;
	}
	public String getMercadoPago() {
		return mercadopago;
	}
	public void setMercadoPago(String mercadopago){
		this.mercadopago = mercadopago;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public String getMercadopago() {
		return mercadopago;
	}

	public void setMercadopago(String mercadopago) {
		this.mercadopago = mercadopago;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public int getCantidadDeIncumplimientos() {
		return cantidadDeIncumplimientos;
	}
	
	public void setCantidadDeIncumplimientos(int cantidadDeIncumplimientos) {
		this.cantidadDeIncumplimientos = cantidadDeIncumplimientos;
	}
	
	public boolean isEsPremium() {
		return esPremium;
	}
	
	public void setEsPremium(boolean esPremium) {
		this.esPremium = esPremium;
	}

// METODOS
	
	public void mostrar() {
		System.out.println("\n--- -- - DATOS DEL CLIENTE - -- ---");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("Fecha De Nacimiento: " + this.fechaDeNacimiento);
		System.out.println("E-Mail: " + this.email);
		System.out.println("Contrasena: ********");
		System.out.println("Tipo/s de pago: " + (this.pago).getTipopago());
	}
	
	
}