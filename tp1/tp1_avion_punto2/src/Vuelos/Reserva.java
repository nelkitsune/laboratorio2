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
    public void mostrarInfo(){
        System.out.println("Informacion del pasajero");
        System.out.println("Nombre y Apellido del pasajero: "+getPasajero().getNombre()+" "+ getPasajero().getApellido());
        System.out.println("Dni del pasajero: "+getPasajero().getDni());
        System.out.println("Edad del pasajero: "+getPasajero().getEdad());
        System.out.println("Peso del equipaje: "+getPasajero().getPeso_equipaje());
        System.out.println("-----");
        System.out.println("Informacion del vuelo");
        System.out.println("Origen: "+getVuelo().getOrigen());
        System.out.println("Destino: "+getVuelo().getDestino());
        System.out.println("Dia de salida: "+getVuelo().getFecha_salida());
        System.out.println("Dia de llegada: "+ getVuelo().getFecha_llegada());
        System.out.println("Aerolinea encargada: "+ getVuelo().getAvion().getFlota().getAerolinea());
        System.out.println("-----");
        System.out.println("Informacion del avion");
        System.out.println("Avion: "+getVuelo().getAvion().getModelo());
        System.out.println("Piloto: "+getVuelo().getAvion().getPiloto().getNombre() + " "+ getVuelo().getAvion().getPiloto().getApellido());
        System.out.println("Co_piloto: "+getVuelo().getAvion().getCo_piloto().getNombre()+ " "+getVuelo().getAvion().getCo_piloto().getApellido());
    }
}
