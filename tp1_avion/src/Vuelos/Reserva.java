package Vuelos;

public class Reserva {
    private String destino;
    private int dni;
    private int fecha_salida;
    private int fecha_regreso;
    private String nombre_apellido_pasajero;
    private int numero_asiento;
    private int numero_vuelo;
    private String origen;

    public Reserva(String destino, int dni, int fecha_salida, int fecha_regreso, String nombre_apellido_pasajero, int numero_asiento, int numero_vuelo, String origen) {
        this.destino = destino;
        this.dni = dni;
        this.fecha_salida = fecha_salida;
        this.fecha_regreso = fecha_regreso;
        this.nombre_apellido_pasajero = nombre_apellido_pasajero;
        this.numero_asiento = numero_asiento;
        this.numero_vuelo = numero_vuelo;
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(int fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getFecha_regreso() {
        return fecha_regreso;
    }

    public void setFecha_regreso(int fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    public String getNombre_apellido_pasajero() {
        return nombre_apellido_pasajero;
    }

    public void setNombre_apellido_pasajero(String nombre_apellido_pasajero) {
        this.nombre_apellido_pasajero = nombre_apellido_pasajero;
    }

    public int getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(int numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(int numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
