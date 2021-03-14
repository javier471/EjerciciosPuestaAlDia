package Partido;

public class MainPartidos {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Equipo e1=new Equipo("Madrid","Bernabeu","Madrid");
		Equipo e2=new Equipo("Madrid","Wanda","Madrid");
		Equipo e3=new Equipo("Valencia","Mestalla","Valencia");
		Equipo e4=new Equipo("Sevilla","Nervion","Sevilla");

		Partido p1=new Partido(2,e1,e2);
		System.out.println(p1);
		p1.ponerResult("2-1");
		System.out.println(p1);
		Partido p2=new Partido(3,e1,e4);
		System.out.println(p2);
		p2.ponerResult("0-0");
		System.out.println(p2);
		Partido p3= new Partido(4,e2,e3);
		System.out.println(p3);
		p3.ponerResult("1-2");
		System.out.println(p3);

	}

}
