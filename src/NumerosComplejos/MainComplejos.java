package NumerosComplejos;

public class MainComplejos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejos n1=new Complejos(3,4);
		Complejos n2=new Complejos(1,1);
		System.out.println(n1);
		System.out.println(n2);
		Complejos n3=n1.suma(n2);
		System.out.println(n3);
		Complejos n4=n1.resta(n2);
		System.out.println(n4);
		
	}

}
