package ejercicios;

public class MaquinaCafe {
	private int MAXIMOCAFE=50;
	private int MAXIMOLECHE=50;
	private int MAXIMOVASOS=80;
	private double preciocafe=1;
	private double precioleche=0.8;
	private double preciocafeconleche=1.5;
	private int depositocafe;
	private int depositoleche;
	private int depositovasos;
	private double monedero;
	public MaquinaCafe(double monedero) {
		super();
		this.depositocafe = MAXIMOCAFE;
		this.depositoleche = MAXIMOLECHE;
		this.depositovasos = MAXIMOVASOS;
		this.monedero = monedero;
	}
	public void llenardepositos() {
		this.depositocafe=MAXIMOCAFE;
		this.depositoleche=MAXIMOLECHE;
		this.depositovasos=MAXIMOVASOS;	
	}
	public double servicafe(double dinero) {
		this.depositocafe--;
		this.depositovasos--;
		this.monedero=this.monedero+1;
		return dinero-1;
	}
	public double servirleche(double dinero) {
		depositovasos--;
		depositoleche--;
		monedero=monedero+0.8;
		return dinero-0.8;
	}
	public double servircafeconleche(double dinero) {
		depositovasos--;
		depositoleche--;
		depositocafe--;
		monedero=monedero+1.5;
		return dinero -1.5;
	}
	
	
	
	
	
}
