package Parking;

public class Parking {
	
	private String nombre;
	private Categoria categoria;
	private int totalPlazas;
	private int plazasOcupadas;
	private int codigo;
	private static int codsigui=1;
	private double recaudacion;
	
	public Parking(String nombre, Categoria categoria, int totalPlazas) throws Exception {
		super();
		if (totalPlazas<0) {
			throw new Exception("El parking debe crearse con plazas positivas");
		}
		this.nombre = nombre;
		this.categoria = categoria;
		this.totalPlazas = totalPlazas;
		this.plazasOcupadas=0;
		this.recaudacion=0;
		this.codigo=codsigui;
		this.codsigui++;
	}

	public int getTotalPlazas() {
		return totalPlazas;
	}

	private void setTotalPlazas(int totalPlazas) {
		this.totalPlazas = totalPlazas;
	}

	public int getPlazasOcupadas() {
		return plazasOcupadas;
	}

	private void setPlazasOcupadas(int plazasOcupadas) {
		this.plazasOcupadas = plazasOcupadas;
	}

	public double getRecaudacion() {
		return recaudacion;
	}

	private void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double cobrarSalir(int minutos) throws Exception {
		if (minutos<0) {
			throw new Exception("Los minutos no pueden ser negativos");
		}
		double cobrar=minutos*categoria.getPrecio();
		this.plazasOcupadas--;
		this.recaudacion=recaudacion+cobrar;
		return cobrar;
	}
	
	public void entraParking() throws Exception {
		if(this.getTotalPlazas()-this.plazasOcupadas==0) {
			throw new Exception("Parking lleno");
		}
		this.plazasOcupadas++;
	}

	@Override
	public String toString() {
		return "Parking [nombre=" + nombre + ", categoria=" + categoria + ", totalPlazas=" + totalPlazas
				+ ", plazasOcupadas=" + plazasOcupadas + ", codigo=" + codigo + ", recaudacion=" + recaudacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + plazasOcupadas;
		long temp;
		temp = Double.doubleToLongBits(recaudacion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + totalPlazas;
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
		Parking other = (Parking) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (codigo != other.codigo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (plazasOcupadas != other.plazasOcupadas)
			return false;
		if (Double.doubleToLongBits(recaudacion) != Double.doubleToLongBits(other.recaudacion))
			return false;
		if (totalPlazas != other.totalPlazas)
			return false;
		return true;
	}
	
//	public Parking clonar() {
//
//	}
	
}
