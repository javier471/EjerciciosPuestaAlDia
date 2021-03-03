package ejercicios;

import java.util.Scanner;

public class MainMaquinaCafe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		try {
		MaquinaCafe maquina= new MaquinaCafe(14);
		int opcion=0;
		while (opcion<5) {
			System.out.println("1.Servir café solo (1 euro)\n"
					+ "2. Servir leche (0,8 euros)\n"
					+ "3. Servir café con leche (1,5 euros)\n"
					+ "4. Consultar estado máquina. Aparecen los datos de los depósitos y del\n"
					+ "monedero\n"
					+ "5. Apagar máquina y salir");
			System.out.println("Introduzca opción");
			opcion=Integer.parseInt(teclado.nextLine());
			switch(opcion) {
				case 1:
					double cantidad;
					System.out.println("Introduzca cantidad");
					cantidad=Double.parseDouble(teclado.nextLine());
					System.out.println("Su cambio es "+ maquina.servicafe(cantidad));
					break;
				case 2:
					System.out.println("Introduzca cantidad");
					cantidad=Double.parseDouble(teclado.nextLine());
					System.out.println("Su cambio es "+ maquina.servirleche(cantidad));
					break;
				case 3:
					System.out.println("Introduzca cantidad");
					cantidad=Double.parseDouble(teclado.nextLine());
					System.out.println("Su cambio es "+ maquina.servircafeconleche(cantidad));
					break;
				case 4:
					System.out.println(maquina.getDepositocafe());
					System.out.println(maquina.getDepositoleche());
					System.out.println(maquina.getDepositovasos());
					System.out.println(maquina.getMonedero());
					break;
				case 5:
					break;
				}
			}
		
		}
		catch(Exception maquinacafe){
			System.out.println(maquinacafe.getMessage());
		}
	}
}
