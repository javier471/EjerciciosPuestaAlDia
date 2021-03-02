package ejercicios;

import java.util.Scanner;

public class MainCuenta {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		try {
			Cuenta c1= new Cuenta(50,"21221");
			System.out.println(c1);
			int opcion=0;
			char salir= 'N';
			while(salir=='N' && opcion<5) {
				System.out.println("Introuzca 1 para un reintegro"
						+" Introduzca un 2 para un ingreso"
						+" Introduzca un 3 para hacer una consulta"
						+" Introduza un 4 para finalizar");
			System.out.println("Introduzca opción");
			opcion=Integer.parseInt(teclado.nextLine());
			switch(opcion) {
				case 1:
					double cantidad;
					System.out.println("Introduzca cantidad");
					cantidad=Double.parseDouble(teclado.nextLine());
					c1.reintegro(cantidad);
					break;
				case 2:
					System.out.println("Introduzca cantidad");
					cantidad=Double.parseDouble(teclado.nextLine());
					c1.ingreso(cantidad);
					break;
				case 3:
					System.out.println(c1);
					break;
				case 4:
					System.out.println("¿Quiere salir?");
					salir=teclado.nextLine().charAt(0);
					if (salir!='N') {
						break;
					}			
			
		}
		}
		}
		catch(Exception saldo) {
			System.out.println(saldo.getMessage());
			
		}
	}
}
	


