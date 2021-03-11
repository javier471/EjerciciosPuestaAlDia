package Producto;

public class Producto {
	private final static double IVA=0.2;
	private double precio;
	private static int codsigui=1;
	private int codigo;
	private String descrip;
	
	public Producto(double precio, String descrip) {
		super();
		this.precio=precio;
		this.descrip=descrip;
		this.codigo = codsigui;
		codsigui++;
	}	
	
	public double precioIva() {
		this.precio=precio+precio*IVA;
		return precio;
	}
	
	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static double getIva() {
		return IVA;
	}



	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", codigo=" + codigo + ", descrip=" + descrip+"]";
	}
	

	
	
}
