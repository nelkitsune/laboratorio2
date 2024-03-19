import Vuelo_carpeta.*;

public class Main {
    public static void main(String[] args) {
        Avion avion1 = new Avion("lv124","pepito alfa","nel&asociados");
        Pasajero pasajero = new Pasajero("Ramiro","Ferrari",21,44140,23);
        Piloto piloto = new Piloto("thadeo","palacio",21,242526,"intermedio");
        Vuelo vuelo_Mendoza_BuenosAires = new Vuelo("Mendoza","Buenos aires", 23,23,2526);
        avion1.agregar_vuelo(vuelo_Mendoza_BuenosAires);
        vuelo_Mendoza_BuenosAires.agregar_avion(avion1);
        Reserva reserva = new Reserva(25);
        reserva.setPasajero(pasajero);
        reserva.setVuelo(vuelo_Mendoza_BuenosAires);

        System.out.println(reserva.getPasajero().getNombre());
        System.out.println(reserva.getVuelo().getOrigen());
    }
}