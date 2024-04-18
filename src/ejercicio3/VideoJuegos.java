package ejercicio3;

public enum VideoJuegos implements Acciones {

    DEPORTIVOS("EAFC24","Futbol",2024)
    ,ESTRATEGIA("CSGO","5VS5",2012)
    ,MUSICALES("Just dance","bailar",2014)
    ,AVENTURA("Horizon","Mundo abierto",2013),
    SIMULACION("Detroit","Androides",2018);
    private String nombre,jugabilidad;
    private int año;

    VideoJuegos(String nombre, String jugabilidad, int año) {
        this.nombre = nombre;
        this.jugabilidad = jugabilidad;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJugabilidad() {
        return jugabilidad;
    }

    public void setJugabilidad(String jugabilidad) {
        this.jugabilidad = jugabilidad;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void mostrarPocisionRanking() {
        System.out.println("Muestra el ranking");
    }

    @Override
    public void comprarMonedas() {
        System.out.println("Compra de monedas");
    }
}
