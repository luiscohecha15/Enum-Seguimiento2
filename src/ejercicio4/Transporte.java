package ejercicio4;

public enum Transporte {
    BUS("15","gasolina") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("BUS: Capacidad: "+getCapacidad()+", Tipo de motor: "+getTipoMotor());
        }
    },
    TREN("50","carbon") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("TREN: Capacidad: "+getCapacidad()+", Tipo de motor: "+getTipoMotor());
        }
    },
    BARCO("70","gasolina") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("BARCO: Capacidad: "+getCapacidad()+", Tipo de motor: "+getTipoMotor());
        }
    },
    MOTO("2","gasolina") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("MOTO: Capacidad: "+getCapacidad()+", Tipo de motor: "+getTipoMotor());
        }
    },
    AVION("200","gasolina") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("AVION: Capacidad: "+getCapacidad()+", Tipo de motor: "+getTipoMotor());
        }
    };

    String capacidad,tipoMotor;

    Transporte(String capacidad, String tipoMotor) {
        this.capacidad = capacidad;
        this.tipoMotor = tipoMotor;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public abstract void mostrarDescripcion();

}
