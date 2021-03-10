package Linea;

import java.util.Scanner;

public class MainLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
//		Punto p1=new Punto(0,0);
		Punto p2=new Punto(0,0);
		System.out.println("Vamos a crear la primera línea, introduce la x del primer punto");
		double x1=Double.parseDouble(teclado.nextLine());
//		p1.setCoorx(x1);
		System.out.println("Introduce la y del primer punto");
		double y1=Double.parseDouble(teclado.nextLine());
//		p1.setCoory(y1);
		Punto p1= new Punto(x1,y1);
		System.out.println("Introduce la x del segundo punto");
		double x2=Double.parseDouble(teclado.nextLine());
		p2.setCoorx(x2);
		System.out.println("Introduce la y del segundo punto");
		double y2=Double.parseDouble(teclado.nextLine());
		p2.setCoory(y2);
		Linea l1= new Linea(p1,p2);
		System.out.println(l1);
		System.out.println("¿Qué quieres hacer?");
		int opcion;
		opcion=Integer.parseInt(teclado.nextLine());
		switch(opcion) {
			case 1:
				System.out.println("¿Qué movimiento quieres hacer");
				char movimiento;
				movimiento=teclado.nextLine().charAt(0);
				if (movimiento== 'A') {
					System.out.println("¿Cuánto quieres mover?");
					double arriba=Double.parseDouble(teclado.nextLine());
					l1.moverArriba(arriba);
					System.out.println(l1);
				}
				else if(movimiento=='B') {
					System.out.println("¿Cuánto quieres mover?");
					double abajo=Double.parseDouble(teclado.nextLine());
					l1.moverAbajo(abajo);
					System.out.println(l1);
				}
				else if (movimiento=='I') {
					System.out.println("Cuánto quieres mover?");
					double izquierda=Double.parseDouble(teclado.nextLine());
					l1.moverIzquierda(izquierda);
					System.out.println(l1);
				}
				else if (movimiento=='D') {
					System.out.println("¿Cuánto quieres mover?");
					double derecha=Double.parseDouble(teclado.nextLine());
					l1.moverDerecha(derecha);
					System.out.println(l1);	
					break;
				}
			case 2:
				System.out.println(l1);
				break;
			case 3:
				break;
				
		}
		
		
	}
	
	
}
