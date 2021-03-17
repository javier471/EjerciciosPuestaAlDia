package EjerBinario;

public class EjerBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux="11100100";
		System.out.println(sumaBinario(aux));
	}
	
	public static double sumaBinario(String cadena) {
		StringBuilder cad= new StringBuilder(cadena);//Creamos un StringBuilder para manipularla y le pasamos el String que teníamos
		cad.reverse();//Le damos la vuelta
		double cont=0; //Creamos un contador para que a lo que vamos a elevar vaya aumentando
		double result=0;
		for (int i=0;i<cad.length();i++) {
			if(cad.charAt(i)=='1') { //Si lo que nos encontramos es un 1, lo multiplicamos por  2 elevado al contador
				result=result+Math.pow(2.0, cont);
			}
			cont++;	//Aumentamos el contador para que a lo que elevamos aumente
		}
	return result;
	}
}
