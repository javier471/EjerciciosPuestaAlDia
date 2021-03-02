package ejercicios;

public class Cuenta {
	private double saldo;
	private String ncc;
	private int numingresos;
	private int numreintegros;
	public Cuenta(double saldo, String ncc)throws Exception {
		super();
		if(saldo<0) {
			throw new Exception("Debe crear una cuenta con saldo válido");
		}
		else {
			this.saldo = saldo;
			this.numingresos=1;
			this.numreintegros=0;
		}
		this.ncc = ncc;

	}
	public double getSaldo() {
		return saldo;
	}
	public String getNcc() {
		return ncc;
	}
	public int getNumingresos() {
		return numingresos;
	}
	public int getNumreintegros() {
		return numreintegros;
	}
	public void reintegro(double cantidad) throws Exception {
		if (cantidad<0) {
			throw new Exception("Introduce una cantidad válida");
		}
		else if(cantidad>this.saldo) {
			throw new Exception("La cantidad es mayor que su saldo");
		}
		this.saldo=saldo-cantidad;
		this.numreintegros++;
	}
	public void ingreso(double cantidad) throws Exception {
		if (cantidad<0) {
			throw new Exception("Ingresa una cantidad válida");
		}
		this.saldo=saldo+cantidad;
		this.numreintegros++;
	}
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", ncc=" + ncc + ", numingresos=" + numingresos + ", numreintegros="
				+ numreintegros + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ncc == null) ? 0 : ncc.hashCode());
		result = prime * result + numingresos;
		result = prime * result + numreintegros;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (ncc == null) {
			if (other.ncc != null)
				return false;
		} else if (!ncc.equals(other.ncc))
			return false;
		if (numingresos != other.numingresos)
			return false;
		if (numreintegros != other.numreintegros)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	
}
