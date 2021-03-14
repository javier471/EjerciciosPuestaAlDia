package ejercicio1;

public class ejer1 {
	public static void main(String[]args ){
		System.out.println(vecesqueaparece("mañanA",'a'));
		System.out.println(sonminusculas("MañanAA"));
		System.out.println(sonmayusculas("MañanAA"));
		System.out.println(sonnumeros("Maña323nAA"));
		System.out.println(palindromo("anna"));



	}
	public static int vecesqueaparece(String cadena, char letra) {
		String str=cadena.toUpperCase();
		char caracter=Character.toUpperCase(letra);
		int cont=0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)==caracter) {
				cont++;
			}
			
		}
		return cont;
	}
	public static int sonminusculas(String cadena) {
		int cont=0;
		for(int i=0;i<cadena.length();i++) {
			if (Character.isLowerCase(cadena.charAt(i))) {
				cont++;
			}
		}
		return cont;
	}
	public static int sonmayusculas(String cadena) {
		int cont=0;
		for(int i=0;i<cadena.length();i++) {
			if (Character.isUpperCase(cadena.charAt(i))) {
				cont++;
			}
		}
		return cont;
	}
	public static int sonnumeros(String cadena) {
		int cont=0;
		for(int i=0;i<cadena.length();i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				cont++;
			}
		}
		return cont;
	} 
	public static boolean palindromo(String cad1) {
		StringBuilder cad= new StringBuilder(cad1.toLowerCase());
		StringBuilder cadreves= new StringBuilder(cad1.toLowerCase());
		cadreves= cadreves.reverse();
		if(cad.compareTo(cadreves)==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean encontrarpalabra(String cad, String buscar) {
		int posAnt = -1;
		boolean resultado = true;
		for (int i=0; i< buscar.length() && resultado;i++) {	
			int pos = cad.indexOf(String.valueOf(buscar.charAt(i)),posAnt);
			if (pos <= posAnt) {
				return false;
			}
			posAnt = pos;
		}
		return resultado;
	}
	public static String reemplazarPalabra(String frase, String cadena, String reemplazar) {
		return frase.replaceAll(cadena, reemplazar);
	} 
}
