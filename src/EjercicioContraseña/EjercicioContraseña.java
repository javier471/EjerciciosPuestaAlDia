package EjercicioContraseña;

public class EjercicioContraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contraseña("hola]212a"));			
		}
	public static boolean contraseña(String cadena) {
		boolean flag=true;
		if(cadena.length()<8) {
			flag=false;
		}
		int cont=0;
		for(int i=0;i<cadena.length();i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				cont++;
			}
		}
		if(cont<2) {
			flag=false;
		}
		int contador=0;
		for(int i=0;i<cadena.length();i++) {
			if(Character.isLetter(cadena.charAt(i))) {
				contador++;
			}
		}
		if (contador<2) {
			flag=false;
		}
		int conta=0;
		String c1="*";
		String c2="-";
		String c3="+";
		String c4="[";
		String c5="]";
		for(int i=0;i<cadena.length();i++) {
			if(cadena.contains(c1) || cadena.contains(c2) || cadena.contains(c3) || cadena.contains(c4) || cadena.contains(c5)) {
				conta++;
			}
		}
		if(conta<1) {
			flag=false;
		}
		return flag;
	}

}
