package ejercicios;

import java.util.Scanner;

public class MainCuenta {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Cuenta c1= new Cuenta(50,"21221");
		System.out.println(c1);
		int opcion;
		System.out.println("Introduzca opción");
		opcion=teclado.nextInt();
		while (opcion!=4) {
			if (opcion==1){
				double cantidad;
				System.out.println("Introduzca cantidad a retirar");
				cantidad=Double.parseDouble(teclado.nextLine());
				c1.reintegro(cantidad);
				System.out.println(c1);
			}
			else if(opcion==2) {
				double ingresar;
				System.out.println("Introduzca cantidad a ingresar");
				ingresar=Double.parseDouble(teclado.nextLine());
				c1.ingreso(ingresar);
				System.out.println(c1);
			}
			else if (opcion==3) {
				System.out.println(c1);
			}
			else if (opcion==4){
				System.out.println(c1);
				System.out.println("Quieres terminar");
				char resp=teclado.nextLine().charAt(0);
				if (resp=='N'){
					opcion=teclado.nextInt();
				}
			}
		
			System.out.println("Introuzca 1 para un reintegro"
					+" Introduzca un 2 para un ingreso"
					+" Introduzca un 3 para hacer una consulta"
					+" Introduza un 4 para finalizar");
			opcion=teclado.nextInt();
		}
		
		}
	}


