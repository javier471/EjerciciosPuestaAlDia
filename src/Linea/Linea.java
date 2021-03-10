package Linea;

public class Linea {
	private Punto lineaa;
	private Punto lineab;
	public Linea(Punto lineaa, Punto lineab) {
		super();
		this.lineaa = lineaa;
		this.lineab = lineab;
	}
	public Linea() {
		super();
		this.lineaa=new Punto(0,0);
		this.lineab=new Punto(0,0);
	}

	public Punto getLineaa() {
		return lineaa;
	}
	public void setLineaa(Punto lineaa) {
		this.lineaa = lineaa;
	}
	public Punto getLineab() {
		return lineab;
	}
	public void setLineab(Punto lineab) {
		this.lineab = lineab;
	}
	public void moverDerecha(double x) {
		this.lineaa.setCoorx(x+this.lineaa.getCoorx());
		this.lineab.setCoorx(x+this.lineab.getCoorx());
	}
	public void moverIzquierda(double x) {
		this.lineaa.setCoorx(x-this.lineaa.getCoorx());
		this.lineab.setCoorx(x-this.lineab.getCoorx());
	}
	public void moverArriba(double y) {
		this.lineaa.setCoory(y+this.lineaa.getCoory());
		this.lineab.setCoory(y+this.lineab.getCoory());
	}
	public void moverAbajo(double y) {
		this.lineaa.setCoory(y-this.lineaa.getCoory());
		this.lineab.setCoory(y-this.lineab.getCoory());
	}
	
	@Override
	public String toString() {
		return "Linea [lineaa=" + lineaa + ", lineab=" + lineab + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lineaa == null) ? 0 : lineaa.hashCode());
		result = prime * result + ((lineab == null) ? 0 : lineab.hashCode());
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
		Linea other = (Linea) obj;
		if (lineaa == null) {
			if (other.lineaa != null)
				return false;
		} else if (!lineaa.equals(other.lineaa))
			return false;
		if (lineab == null) {
			if (other.lineab != null)
				return false;
		} else if (!lineab.equals(other.lineab))
			return false;
		return true;
	}
	
}
