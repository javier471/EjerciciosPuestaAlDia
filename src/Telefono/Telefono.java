package Telefono;

public class Telefono {
	private String mensaje1="";
	private String mensaje2="";
	private String mensaje3="";
	private int numeromensajes=0;
	public Telefono() {
		super();
	}
	
	public String getMensaje1() throws Exception {
		if(mensaje1=="") {
			throw new Exception("El mensaje no existe");
		}
		return mensaje1;
	}
	public void setMensaje1(String mensaje1) {
		this.mensaje1 = mensaje1;
	}
	public String getMensaje2() throws Exception {
		if (mensaje2=="") {
			throw new Exception("El mensaje no existe");
		}
		return mensaje2;
	}
	public void setMensaje2(String mensaje2) {
		this.mensaje2 = mensaje2;
	}
	public String getMensaje3() throws Exception {
		if (mensaje3=="") {
			throw new Exception("El mensaje no existe");
		}
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
	public void anadirMensaje(String mensaje) throws Exception {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mensaje1 == null) ? 0 : mensaje1.hashCode());
		result = prime * result + ((mensaje2 == null) ? 0 : mensaje2.hashCode());
		result = prime * result + ((mensaje3 == null) ? 0 : mensaje3.hashCode());
		result = prime * result + numeromensajes;
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
		Telefono other = (Telefono) obj;
		if (mensaje1 == null) {
			if (other.mensaje1 != null)
				return false;
		} else if (!mensaje1.equals(other.mensaje1))
			return false;
		if (mensaje2 == null) {
			if (other.mensaje2 != null)
				return false;
		} else if (!mensaje2.equals(other.mensaje2))
			return false;
		if (mensaje3 == null) {
			if (other.mensaje3 != null)
				return false;
		} else if (!mensaje3.equals(other.mensaje3))
			return false;
		if (numeromensajes != other.numeromensajes)
			return false;
		return true;
	}
	
	
}
