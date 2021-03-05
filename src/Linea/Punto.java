package Linea;

public class Punto {
private double coorx;
private double coory;
public Punto(double coorx, double coory) {
	super();
	this.coorx = coorx;
	this.coory = coory;
}

public Punto() {
	super();
	this.coorx = (0.0);
	this.coory = (0.0);
}

public double getCoorx() {
	return coorx;
}
public void setCoorx(double coorx) {
	this.coorx = coorx;
}
public double getCoory() {
	return coory;
}
public void setCoory(double coory) {
	this.coory = coory;
}

@Override
public String toString() {
	return "Punto [coorx=" + coorx + ", coory=" + coory + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(coorx);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(coory);
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
	Punto other = (Punto) obj;
	if (Double.doubleToLongBits(coorx) != Double.doubleToLongBits(other.coorx))
		return false;
	if (Double.doubleToLongBits(coory) != Double.doubleToLongBits(other.coory))
		return false;
	return true;
}


}

