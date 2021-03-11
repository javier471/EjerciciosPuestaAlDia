package Producto;

public class MainProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1= new Producto(32,"Lechuga");
		Producto p2= new Producto(11,"Filetes");
		System.out.println(p1);
		System.out.println(p2);
		p1.precioIva();
		System.out.println(p1);
	}

}
