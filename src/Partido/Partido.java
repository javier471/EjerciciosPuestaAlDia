package Partido;

public class Partido {
	private final int jornada;
	private final Equipo equipolocal;
	private final Equipo equipovisitante;
	private int goleslocal;
	private int golesvisitante;
	private String result;

	public Partido(int jornada, Equipo equipolocal, Equipo equipovisitante) throws Exception {
		super();
		if (equipolocal.compareTo(equipovisitante)) {
			throw new Exception("Equipos iguales");
		}
		if (jornada < 1 || jornada > 38) {
			throw new Exception("Jornada no válida");
		}
		this.jornada = jornada;
		this.equipolocal = equipolocal;
		this.equipovisitante = equipovisitante;
	}

	public int getGoleslocal() {
		return goleslocal;
	}

	public void setGoleslocal(int goleslocal) {
		this.goleslocal = goleslocal;
	}

	public int getGolesvisitante() {
		return golesvisitante;
	}

	public void setGolesvisitante(int golesvisitante) {
		this.golesvisitante = golesvisitante;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void ponerResult(String resultado) {
		try {
			String[] result = resultado.split("-");
			this.goleslocal = Integer.valueOf(result[0]);
			this.golesvisitante = Integer.valueOf(result[1]);
			if (this.goleslocal > this.golesvisitante) {
				this.result = "1";
				this.equipolocal.setPganados(this.equipolocal.getPganados()+1);
			} else if (this.goleslocal < this.golesvisitante) {
				this.result = "2";
				this.equipovisitante.setPganados(this.equipovisitante.getPganados()+1);
			} else {
				this.result = "X";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		if(this.result==null ||this.result=="") {
			return "Partido entre "+this.equipolocal.getNombrequipo()+ 
					" y " + this.equipovisitante.getNombrequipo() +  
					" todavía no se ha jugado";
		}
		else {
			return "Partido entre " +this.equipolocal.getNombrequipo() + "y" + 
					this.equipovisitante.getNombrequipo()+ "jugado en el estadio " + 
					this.equipolocal.getEstadio()+ " de la ciudad "+ 
					this.equipolocal.getCiudad() +" ha finalizado con "+this.goleslocal+" - " 
					+this.golesvisitante+". Resultado quiniela="
					+ this.result+" info equipo local= "+this.equipolocal.toString()+ " info equipo visitante "
					+this.equipovisitante.toString();
			
			}

	}
}
