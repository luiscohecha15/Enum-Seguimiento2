package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Producto productoLapiz = Producto.LAPIZ;
        Producto productoCuaderno = Producto.CUADERNO;
        Producto productoBorrador = Producto.BORRADOR;
        Producto productoSacaPunta= Producto.SACAPUNTA;
        Producto productoCartuchera = Producto.CARTUCHERA;

        productoLapiz.mostrarUso();
        productoCuaderno.mostrarUso();
        productoBorrador.mostrarUso();
        productoSacaPunta.mostrarUso();
        productoCartuchera.mostrarUso();
    }
}
