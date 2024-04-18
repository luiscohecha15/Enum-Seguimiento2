package ejercicio2;

public enum ServicioPeluqueria {
    CORTE("Mullet","Lindo",20000) {
        @Override
        public void mostrarDescripcionServicio() {
            System.out.println(" Nombre: " + CORTE.getNombre() + " Descripcion: " + CORTE.getDescripcion() +" Precio: "+ CORTE.getPrecio());
        }
    },
    UÑAS("Semi-perminentes","Lindas",40000) {
        @Override
        public void mostrarDescripcionServicio() {
            System.out.println(" Nombre: " + UÑAS.getNombre() + " Descripcion: " + UÑAS.getDescripcion() +" Precio: "+ UÑAS.getPrecio());
        }
    },
    TINTE("Rojo","Lindo",120000) {
        @Override
        public void mostrarDescripcionServicio() {
            System.out.println(" Nombre: " + TINTE.getNombre() + " Descripcion: " + TINTE.getDescripcion() +" Precio: "+ TINTE.getPrecio());
        }
    };

    String nombre, descripcion;
    double precio;

    ServicioPeluqueria(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void mostrarDescripcionServicio();
}
