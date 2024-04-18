package ejercicio1;

public enum Vestuario {
    BLUSA("Zara", "Negra", 13) {
        @Override
        public void showInfo() {
            System.out.println("Marca: " + this.getNombre() + " Su color es: " + this.getDescripcion() + " Su Stock es: " + this.getNumero());
        }
    },
    JEAN("Pilatos", "Diesel", 20) {
        @Override
        public void showInfo() {
            System.out.println("Marca: " + this.getNombre() + " Su color es: " + this.getDescripcion() + " Su Stock es: " + this.getNumero());
        }
    },
    CAMISETA("Monastery", "Roja", 35) {
        @Override
        public void showInfo() {
            System.out.println("Marca: " + this.getNombre() + " Su color es: " + this.getDescripcion() + " Su Stock es: " + this.getNumero());
        }
    },
    CAMISA("Polo", "Manga corta", 18) {
        @Override
        public void showInfo() {
            System.out.println("Marca: " + this.getNombre() + " Su color es: " + this.getDescripcion() + " Su Stock es: " + this.getNumero());
        }
    };
    private String nombre, descripcion;
    private int numero;

    Vestuario(String nombre, String descripcion, int numero) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public abstract void showInfo();
}
