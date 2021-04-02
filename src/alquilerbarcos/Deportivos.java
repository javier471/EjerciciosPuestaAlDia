package alquilerbarcos;

public class Deportivos extends Barco{
private int caballos;

public Deportivos(String matricula, double eslora, int ffabri, int caballos) {
	super(matricula, eslora, ffabri);
	this.caballos=caballos;
}
public double getAlquiler() {
	return super.getAlquiler()+this.caballos;

}
}
