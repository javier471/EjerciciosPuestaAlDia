package ejercicios;

public class Cuenta {
	private double saldo;
	private String ncc;
	private int numingresos;
	private int numreintegros;
	public Cuenta(double saldo, String ncc) {
		super();
		this.saldo = saldo;
		this.ncc = ncc;
		this.numingresos=1;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNcc() {
		return ncc;
	}
	public void setNcc(String ncc) {
		this.ncc = ncc;
	}
	public int getNumingresos() {
		return numingresos;
	}
	public void setNumingresos(int numingresos) {
		this.numingresos = numingresos;
	}
	public int getNumreintegros() {
		return numreintegros;
	}
	public void setNumreintegros(int numreintegros) {
		this.numreintegros = numreintegros;
	}
	
	public void reintegro(double cantidad) {
		this.saldo=saldo-cantidad;
	}
	public void ingreso(double cantidad) {
		this.saldo=saldo+cantidad;
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
