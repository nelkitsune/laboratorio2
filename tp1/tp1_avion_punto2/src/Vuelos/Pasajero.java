package Vuelos;

public class Pasajero extends Persona{
    private int peso_equipaje;

    public Pasajero(int peso_equipaje) {
        this.peso_equipaje = peso_equipaje;
    }

    public Pasajero(String nombre, String apellido, int edad, int dni, int peso_equipaje) {
        super(nombre, apellido, edad, dni);
        this.peso_equipaje = peso_equipaje;
    }

    public int getPeso_equipaje() {
        return peso_equipaje;
    }

    public void setPeso_equipaje(int peso_equipaje) {
        this.peso_equipaje = peso_equipaje;
    }
}
