package Telefono;

public class MainTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1=new Telefono();
		t1.anadirMensaje("Hola");
		System.out.println(t1);
		t1.anadirMensaje("2mensaje");
		System.out.println(t1);
		t1.anadirMensaje("3mensaje");
		System.out.println(t1);		
		t1.borrarTodosLosMensajes();
		System.out.println(t1);
	}

}
