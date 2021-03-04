package NumerosComplejos;

public class Complejos {
	private double preal;
	private double pimaginaria;
	
	
	public Complejos(double preal, double pimaginaria) {
		super();
		this.preal = preal;
		this.pimaginaria = pimaginaria;
	}
	
	public Complejos suma(Complejos num) {
		 double partereal=this.preal+num.preal;
		 double parteimaginaria=this.pimaginaria+num.pimaginaria;
		 Complejos numero= new Complejos (partereal,parteimaginaria);
		 return numero;
	}
	public Complejos resta(Complejos num) {
		double partereal=this.preal-num.preal;
		double parteimaginaria=this.pimaginaria-num.pimaginaria;
		Complejos numero = new Complejos(partereal,parteimaginaria);
		return numero;
	}

	@Override
	public String toString() {
		return "(" + preal + "," + pimaginaria + "i)";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(pimaginaria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(preal);
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
		Complejos other = (Complejos) obj;
		if (Double.doubleToLongBits(pimaginaria) != Double.doubleToLongBits(other.pimaginaria))
			return false;
		if (Double.doubleToLongBits(preal) != Double.doubleToLongBits(other.preal))
			return false;
		return true;
	}
	
	
	
}
