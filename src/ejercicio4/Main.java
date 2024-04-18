package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Transporte transporteBus = Transporte.BUS;
        Transporte transporteTren = Transporte.TREN;
        Transporte transporteBarco = Transporte.BARCO;
        Transporte transporteMoto = Transporte.MOTO;
        Transporte transporteAvion = Transporte.AVION;

        transporteBus.mostrarDescripcion();
        transporteTren.mostrarDescripcion();
        transporteBarco.mostrarDescripcion();
        transporteMoto.mostrarDescripcion();
        transporteAvion.mostrarDescripcion();

    }


}
