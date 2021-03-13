package Partido;

public class Equipo {
	private String nombrequipo;
	private int pganados;
	private String estadio;
	private String ciudad;
	
	public boolean compareTo(Equipo equipovisitante) {
		if (this.nombrequipo.equals(equipovisitante.getNombrequipo())) {
			return true;
		}
		return false;
	}

	public Equipo(String nombrequipo, String estadio, String ciudad) {
		super();
		this.nombrequipo = nombrequipo;
		this.estadio = estadio;
		this.ciudad = ciudad;
		this.pganados=0;
	}


	public String getNombrequipo() {
		return nombrequipo;
	}

	public void setNombrequipo(String nombrequipo) {
		this.nombrequipo = nombrequipo;
	}

	public int getPganados() {
		return pganados;
	}

	public void setPganados(int pganados) {
		this.pganados = pganados;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Equipo [nombrequipo=" + nombrequipo + ", pganados=" + pganados + ", estadio=" + estadio + ", ciudad="
				+ ciudad + "]";
	}
	

}
