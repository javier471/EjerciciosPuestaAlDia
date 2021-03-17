package Telefono;

public class Telefono {
	private String mensaje1="";
	private String mensaje2="";
	private String mensaje3="";
	private int numeromensajes;
	private final int MAXIMOMENSAJES=3;
	public Telefono() {
		super();
	}
	
	public String getMensaje1() {
		return mensaje1;
	}
	public void setMensaje1(String mensaje1) {
		this.mensaje1 = mensaje1;
	}
	public String getMensaje2() {
		return mensaje2;
	}
	public void setMensaje2(String mensaje2) {
		this.mensaje2 = mensaje2;
	}
	public String getMensaje3() {
		return mensaje3;
	}
	public void setMensaje3(String mensaje3) {
		this.mensaje3 = mensaje3;
	}
	public int getNumeromensajes() {
		return numeromensajes;
	}
	public void setNumeromensajes(int numeromensajes) {
		this.numeromensajes = numeromensajes;
	}
	public void anadirMensaje(String mensaje) {
		if (mensaje1=="") {
			this.mensaje1=mensaje;	
			numeromensajes++;
		}
		else if(mensaje2=="") {
			this.mensaje2=mensaje;
			numeromensajes++;
		}
		else if (mensaje3=="") {
			this.mensaje3=mensaje;
			numeromensajes++;
		}
		else {
			System.out.println("El buzón está lleno");
		}
		
	}
	public void borrarTodosLosMensajes() {
		this.mensaje1="";
		this.mensaje2="";
		this.mensaje3="";
		this.numeromensajes=0;
	}
	
	public void borrarMensaje(int mensaje) throws Exception {
		if (mensaje<1 || mensaje>3) {
			throw new Exception();
		}
		switch(mensaje) {
			case 1:
				this.mensaje1="";
				break;
			case 2:
				this.mensaje2="";
				break;
			case 3:
				this.mensaje3="";
				break;
		}
		this.numeromensajes--;
		
	}
	@Override
	public String toString() {
		return "Telefono [mensaje1=" + mensaje1 + ", mensaje2=" + mensaje2 + ", mensaje3=" + mensaje3
				+ ", numeromensajes=" + numeromensajes + "]";
	}
	
	
}
