// Definimos la excepción personalizada miException
public class Main {
    public static void main(String[] args) {
        try {
            Auto auto = new Auto("Auto1");
            auto.acelera(130);
        } catch (miException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
            System.out.println("Nombre del vehículo: " + e.getVehicleName());
            System.out.println("Tipo de vehículo: " + e.getVehicleType());
        }

        try {
            Camion camion = new Camion("Camion1");
            camion.acelera(150);
        } catch (miException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
            System.out.println("Nombre del vehículo: " + e.getVehicleName());
            System.out.println("Tipo de vehículo: " + e.getVehicleType());
        }

        try {
            Chofer chofer = new Chofer("Juan", true);
        } catch (matriculaVencidaException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }
}

class miException extends Exception {
    private String vehicleName;
    private String vehicleType;

    public miException(String vehicleName, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }
}

class matriculaVencidaException extends Exception {
    public matriculaVencidaException(String message) {
        super(message);
    }
}

abstract class Vehiculo {
    protected String nombre;
    protected String tipo;

    public Vehiculo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void acelera(int velocidad) throws miException {
        if (velocidad > 120) {
            throw new miException(this.nombre, this.tipo);
        }
    }

    public abstract void frena();
}

class Auto extends Vehiculo {
    public Auto(String nombre) {
        super(nombre, "Auto");
    }

    @Override
    public void frena() {
        // Implementación del método frena para Auto
    }
}

class Camion extends Vehiculo {
    public Camion(String nombre) {
        super(nombre, "Camion");
    }

    @Override
    public void frena() {
        // Implementación del método frena para Camion
    }
}

class Chofer {
    private String nombre;
    private boolean matriculaVencida;

    public Chofer(String nombre, boolean matriculaVencida) throws matriculaVencidaException {
        if (matriculaVencida) {
            throw new matriculaVencidaException("La matrícula está vencida");
        }
        this.nombre = nombre;
        this.matriculaVencida = matriculaVencida;
    }
}
