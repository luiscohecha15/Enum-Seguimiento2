package ejercicio2;

public class Main {
    public static void main(String[] args) {
        ServicioPeluqueria servicioPeluqueriaCorte = ServicioPeluqueria.CORTE;
        ServicioPeluqueria servicioPeluqueriaUñas = ServicioPeluqueria.UÑAS;
        ServicioPeluqueria servicioPeluqueriaTinte = ServicioPeluqueria.TINTE;

        servicioPeluqueriaCorte.mostrarDescripcionServicio();
        servicioPeluqueriaUñas.mostrarDescripcionServicio();
        servicioPeluqueriaTinte.mostrarDescripcionServicio();
    }
}
