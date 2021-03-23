package ejercuenta;

public class CuentaJoven extends Cuenta {
	private String titular;
	private int bonificacion;
	private int edad;

	public CuentaJoven(double saldo, String ncc, String titular , int bonificacion,int edad) throws Exception {
		super(saldo, ncc);
		this.titular=titular;
		this.bonificacion=bonificacion;
		this.edad=edad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}
	public boolean esTitularValido() {
		if (this.edad<18 || this.edad>25) {
			return false;
		}
		else {
			return true;
		}
	}
	public void reintegro (double cantidad) throws Exception {
		if (esTitularValido()!=false) {
			super.reintegro(cantidad);
		}
		else {
			throw new Exception("No es un titular válido");
		}
	}
	
	
	
	
	
}
