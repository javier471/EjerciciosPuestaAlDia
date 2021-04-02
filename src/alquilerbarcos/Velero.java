package alquilerbarcos;

public class Velero extends Barco{
 private int nmastiles;

public Velero(String matricula, double eslora, int ffabri, int nmastiles) {
	super(matricula, eslora, ffabri);
	this.nmastiles = nmastiles;
}

public int getNmastiles() {
	return nmastiles;
}

public void setNmastiles(int nmastiles) {
	this.nmastiles = nmastiles;
}
 public double getAlquiler() {
		return super.getAlquiler()+this.nmastiles;

 }
}
