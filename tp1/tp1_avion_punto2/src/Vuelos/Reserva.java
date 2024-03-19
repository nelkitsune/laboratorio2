package Vuelos;

public class Reserva {
    private int numero_asiento;
    private Vuelo vuelo;
    private Pasajero pasajero;

    public Reserva(int numero_asiento, Vuelo vuelo, Pasajero pasajero) {
        this.numero_asiento = numero_asiento;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }

    public int getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(int numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}
