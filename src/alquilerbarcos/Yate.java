package alquilerbarcos;

public class Yate extends Barco{
	private int caballos;
	private int ncamarotes;
	public Yate(String matricula, double eslora, int ffabri, int caballos, int ncamarotes) {
		super(matricula, eslora, ffabri);
		this.caballos = caballos;
		this.ncamarotes = ncamarotes;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	public int getNcamarotes() {
		return ncamarotes;
	}
	public void setNcamarotes(int ncamarotes) {
		this.ncamarotes = ncamarotes;
	}
	public double precioBarco() {
		return 10*super.getEslora()+this.caballos+this.ncamarotes;

 }
}
