package Telefono;

import java.util.Scanner;

public class MainTelefono {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		try {
		Telefono t1=new Telefono();
		System.out.println(t1);
		int opcion=0;
		while(opcion<6) {
		System.out.println("Qué desea hacer?");
		System.out.println(	"1.Consultar número de mensajes"+"\n"+
				"2. Consultar mensaje"+"\n"+
					"1. Mensaje número 1"+"\n"+
						"1. Oír"+"\n"+
						"2. Borrar"+"\n"+
					"2. Mensaje número 2"+"\n"+
						"1. Oír"+"\n"+
						"2. Borrar"+"\n"+
					"3. Mensaje número 3"+"\n"+
						"1. Oír"+"\n"+
						"2. Borrar"+"\n"+
				"3. Añadir mensaje"+"\n"+
				"4. Borrar todos los mensajes"+"\n"+
				"5. Salir");
		opcion=Integer.parseInt(teclado.nextLine());
	
		switch(opcion) {
			case 1:
				System.out.println(t1.getNumeromensajes());
				break;
			case 2:
				System.out.println("Qué mensaje quieres consultar");
				int nmensaje=Integer.parseInt(teclado.nextLine());
				if (nmensaje<1 || nmensaje>3) {
					throw new Exception();
				}
				else if (nmensaje==1) {
					System.out.println("Pulse 1 para oír y 2 para borrar");
					int opcionhacer=Integer.parseInt(teclado.nextLine());
					if (opcionhacer==1) {
						t1.getMensaje1();
					}
					else if (opcionhacer==2) {
						t1.borrarMensaje(1);
					}
				else if (nmensaje==2) {
					System.out.println("Pulse 1 para oír y 2 para borrar");
					opcionhacer=Integer.parseInt(teclado.nextLine());
					if (opcionhacer==1) {
						t1.getMensaje2();
					}
					else if (opcionhacer==2) {
						t1.borrarMensaje(2);
						}
				}
				else if (nmensaje==3) {
					System.out.println("Pulse 1 para oír y 2 para borrar");
					opcionhacer=Integer.parseInt(teclado.nextLine());
					if (opcionhacer==1) {
						t1.getMensaje3();
					}
					else if (opcionhacer==2) {
						t1.borrarMensaje(3);
						}
					}	
				}
				break;
			case 3:
				System.out.println("Qué mensaje quieres añadir?");
				String mensajeAnadir=teclado.nextLine();
				t1.anadirMensaje(mensajeAnadir);
				System.out.println(t1);
				break;
			case 4:
				t1.borrarTodosLosMensajes();
				System.out.println(t1);
			case 5:
				System.out.println("Comunicación cortada");
				break;
	}	
	}
		}
		catch(Exception t) {
			System.out.println(t.getMessage());
		}

	}
}
