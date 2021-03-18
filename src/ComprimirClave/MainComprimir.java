package ComprimirClave;

public class MainComprimir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(descomprimir("k3a2p2"));
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
}
