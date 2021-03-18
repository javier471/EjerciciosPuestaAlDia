package ComprimirClave;

public class ComprimirClave {
	private String clave;

	public ComprimirClave(String clave) {
		super();
		this.clave = clave;
	}

	public String getClave() {
		return clave;
	}

	private void setClave(String clave) {
		this.clave = clave;
	}
	
	

	@Override
	public String toString() {
		return "ComprimirClave [clave=" + clave + "]";
	}
	
}
