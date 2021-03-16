package EjerBinario;

public class EjerBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux="11100100";
		System.out.println(sumaBinario(aux));
	}
	
	public static double sumaBinario(String cadena) {
		StringBuilder cad= new StringBuilder(cadena);
		cad=cad.reverse();
		double cont=0;
		double result=0;
		for (int i=0;i<cad.length();i++) {
			if(cad.charAt(i)=='1') {
				result=result+Math.pow(2.0, cont);
				cont++;
			}
			else if(cad.charAt(i)=='0') {
				cont++;
			}
		}
	return result;
	}
}
