package ejercicio5;

public enum Producto {
    LAPIZ("Norma", "gris") {
        @Override
        public void mostrarUso() {
            System.out.println(getNombre()+": Escribir");
        }
    },
    CUADERNO("Prisma","Grande") {
        @Override
        public void mostrarUso() {
            System.out.println(getNombre()+": Anotar");
        }
    },
    BORRADOR("Norma","Pequeño") {
        @Override
        public void mostrarUso() {
            System.out.println(getNombre()+": Eliminar escrito");
        }
    },
    SACAPUNTA("Prisma","Mediano") {
        @Override
        public void mostrarUso() {
            System.out.println(getNombre()+": Afilar lapiz");
        }
    },
    CARTUCHERA("Escribe","Mediana") {
        @Override
        public void mostrarUso() {
            System.out.println(getNombre()+": Guardar elementos");
        }
    };

    String nombre, descripcion;

    Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract void mostrarUso();

}
