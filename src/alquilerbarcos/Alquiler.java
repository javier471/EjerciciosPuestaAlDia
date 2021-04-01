package alquilerbarcos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Alquiler {
	private String nombre;
	private String DNI;
	private LocalDate finicial;
	private LocalDate ffinal;
	private int posicion;
	private Barco barco;
	
	public Alquiler(String nombre, String dNI, LocalDate finicial, LocalDate ffinal, int posicion, Barco barco) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.finicial = finicial;
		this.ffinal = ffinal;
		this.posicion = posicion;
		this.barco = barco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public LocalDate getFinicial() {
		return finicial;
	}

	public void setFinicial(LocalDate finicial) {
		this.finicial = finicial;
	}

	public LocalDate getFfinal() {
		return ffinal;
	}

	public void setFfinal(LocalDate ffinal) {
		this.ffinal = ffinal;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	public double CalculaAlquiler() {
		long aux = ChronoUnit.DAYS.between(this.finicial, this.ffinal);
		return 20*aux*this.barco.precioBarco();
		}

	@Override
	public String toString() {
		return "Alquiler [nombre=" + nombre + ", DNI=" + DNI + ", finicial=" + finicial + ", ffinal=" + ffinal
				+ ", posicion=" + posicion + ", barco=" + barco + ", CalculaAlquiler()=" + CalculaAlquiler() + "]";
	}
	

}
