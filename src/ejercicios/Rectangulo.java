package ejercicios;

public class Rectangulo {
private double longitud;
private double ancho;



public Rectangulo(double longitud, double ancho) {
	super();
	this.longitud = setLongitud(longitud);
	this.ancho = setAncho(ancho);
}
private double getLongitud() {
	return longitud;
}
private double setLongitud(double largo) {
	if (largo>20 || largo<1) {
		this.longitud=1;
	}
	else {
		this.longitud = largo;
	}
	return this.longitud;
}
private double getAncho() {
	return ancho;
}
private double setAncho(double ancho) {
	if (ancho>20 || ancho<1) {
		this.ancho=1;
	}
	else {
		this.ancho = ancho;
	}
	return this.ancho;
}
public static double area(double ancho, double longitud) {
	return ancho*longitud;
}
public static double perimetro(double ancho,double longitud) {
	return (ancho*2)+(longitud*2); 
}
@Override
public String toString() {
	return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + " area=" + area(ancho, longitud) 
			+ " perimetro=" + perimetro(longitud, ancho) + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(ancho);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(longitud);
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
	Rectangulo other = (Rectangulo) obj;
	if (Double.doubleToLongBits(ancho) != Double.doubleToLongBits(other.ancho))
		return false;
	if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
		return false;
	return true;
}

}

