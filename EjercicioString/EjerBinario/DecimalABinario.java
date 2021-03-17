package EjerBinario;

public class DecimalABinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux=240;
		System.out.println(decimalABinario(aux));
	
	}
	public static String decimalABinario(int decimal) {
		StringBuilder cad=new StringBuilder(); //Creamos un StringBuilder porque vamos a modificarlo
		while(decimal>=2) {	//Mientras que el decimal sea mayor que 2 tiene que seguir dividiendo
			cad.append(decimal%2); //Guardamos en la cadena el decimal módulo de 2
			decimal=decimal/2;//Dividimos el decimal para la siguiente vuelta
		}
		cad.append(decimal);//Le sumamos el último decimal, que ha sido menor que 2
		return cad.reverse().toString(); //Le damos la vuelta a la cadena y la pasamos a toString porque al método hay quye devolverle un String
	}
}