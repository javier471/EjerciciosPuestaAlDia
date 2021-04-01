package alquilerbarcos;

import java.time.LocalDate;

public class MainAlquilerBarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Velero v1=new Velero("rfr34",18,1998,4);
		Deportivos d1=new Deportivos("keof",12,1993,30);
		Yate y1=new Yate("efiei",28,2001,40,4);
		Barco b1=new Barco("deinfe",18,1993);
		LocalDate fecha1= LocalDate.of(2020, 12, 30);
		LocalDate fecha2=LocalDate.now();
		Alquiler a1=new Alquiler("Juan","31231",fecha1,fecha2,3,v1);
		Alquiler a2=new Alquiler("Juan","31231",fecha1,fecha2,3,d1);
		Alquiler a3=new Alquiler("Juan","31231",fecha1,fecha2,3,y1);
		Alquiler a4=new Alquiler("Juan","31231",fecha1,fecha2,3,b1);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);




	}

}
