package Parking;

import java.util.Scanner;

public class MainParking {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		try {
		Categoria c1=new Categoria("Categoria 1");
		Parking p1=new Parking("Nervion",c1,1);
		int opcion=0;
		while (opcion<4) {
			System.out.println("1.- Entrar al parking.\n" + 
					"2.- Salir de parking.\n" + 
					"3.- Mostrar información del parking.\n" + 
					"4.- Salir del programa.");
			System.out.println("¿Qué opción quieres hacer?");
			opcion=Integer.parseInt(teclado.nextLine());
			switch(opcion) {
				case 1:
					p1.entraParking();
					System.out.println(p1);
					break;
			
				case 2:
					System.out.println("Cuantos minutos has estado en el parking?");	
					int minutos=Integer.parseInt(teclado.nextLine());
					p1.cobrarSalir(minutos);
					break;
				case 3:
					System.out.println(p1);
					break;
				case 4:
					System.out.println("Saliendo del programa");
					break;
					
		}

	}

}
		catch(Exception parking) {
			System.out.println(parking.getMessage());
		}
}
}
