package alquilerbarcos;

public class Barco {
	private String matricula;
	private double eslora;
	private int ffabri;
	public Barco(String matricula, double eslora, int ffabri) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.ffabri = ffabri;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getEslora() {
		return eslora;
	}
	public void setEslora(double eslora) {
		this.eslora = eslora;
	}
	public int getFfabri() {
		return ffabri;
	}
	public void setFfabri(int ffabri) {
		this.ffabri = ffabri;
	}
	public double precioBarco() {
		return 10*this.eslora;
	}
	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", ffabri=" + ffabri + "]";
	}
	
}
