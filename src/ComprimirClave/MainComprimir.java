package ComprimirClave;

public class MainComprimir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(descomprimir("k3a2p2"));
		System.out.println(comprimir("kkkaapp"));
	}
	public static String descomprimir(String cadena) {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<cadena.length();i=i+2) {
			char caracter=cadena.charAt(i);
			int num=Integer.parseInt(String.valueOf(cadena.charAt(i+1)));
			for (int j=0;j<num;j++) {
				result.append(caracter);
			}
			
	}
		return result.toString();
	}
	public static String comprimir(String cadena) {
		int cont=1;
		StringBuilder result=new StringBuilder();
		for(int i=0;i<cadena.length();i++) {
			char caracter=cadena.charAt(i);
			if(caracter==cadena.charAt(i+1)) {
				cont++;
			}
			else {
				result.append(cont).append(caracter);
				cont=0;
			}
			
		}
		return result.toString();	
	}
	
	
	
	
	
	
}
