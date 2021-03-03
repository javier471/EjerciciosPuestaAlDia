package ejercicios;

public class MaquinaCafe {
	private final int MAXIMOCAFE=50;
	private final int MAXIMOLECHE=50;
	private final int MAXIMOVASOS=80;
	private final double preciocafe=1;
	private final double precioleche=0.8;
	private final double preciocafeconleche=1.5;
	private int depositocafe;
	private int depositoleche;
	private int depositovasos;
	private double monedero;
	public MaquinaCafe(double monedero) throws Exception {
		super();
		if (monedero<0) {
			throw new Exception("Para crear máquina introduzca cantidad positiva");
		}
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
	public double servicafe(double dinero) throws Exception {
		if (monedero<dinero) {
			throw new Exception("No tengo cambio para esa cantidad");
		}
		this.depositocafe--;
		this.depositovasos--;
		this.monedero=this.monedero+preciocafe;
		return dinero-preciocafe;
	}
	public double servirleche(double dinero) throws Exception {
		if (monedero<dinero) {
			throw new Exception("No tengo cambio para esa cantidad");
		}
		depositovasos--;
		depositoleche--;
		monedero=monedero+precioleche;
		return dinero-precioleche;
	}
	public double servircafeconleche(double dinero) throws Exception {
		if (monedero<dinero) {
			throw new Exception("No tengo cambio para esa cantidad");
		}
		depositovasos--;
		depositoleche--;
		depositocafe--;
		monedero=monedero+preciocafeconleche;
		return dinero -preciocafeconleche;
	}
	public int getDepositocafe() {
		return depositocafe;
	}
	public int getDepositoleche() {
		return depositoleche;
	}
	public int getDepositovasos() {
		return depositovasos;
	}
	
	public double getMonedero() {
		return monedero;
	}
	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}
	@Override
	public String toString() {
		return "MaquinaCafe [preciocafe=" + preciocafe + ", precioleche=" + precioleche + ", preciocafeconleche="
				+ preciocafeconleche + ", depositocafe=" + depositocafe + ", depositoleche=" + depositoleche
				+ ", depositovasos=" + depositovasos + ", monedero=" + monedero + "]";
	}
	
	
	
	
}
