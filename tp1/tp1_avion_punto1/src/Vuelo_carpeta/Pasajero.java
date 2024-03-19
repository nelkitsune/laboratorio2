package Vuelo_carpeta;

public class Pasajero extends Persona {
    private int equipaje_kg;

    public Pasajero(String nombre, String apellido, int edad, int dni, int equipaje_kg) {
        super(nombre, apellido, edad, dni);
        this.equipaje_kg = equipaje_kg;
    }

    public int getEquipaje_kg() {
        return equipaje_kg;
    }

    public void setEquipaje_kg(int equipaje_kg) {
        this.equipaje_kg = equipaje_kg;
    }
}
