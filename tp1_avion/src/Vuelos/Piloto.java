package Vuelos;

import java.util.List;

public class Piloto extends Persona {
    private String aerolinea;
    private String experiencia;

    public Piloto(String aerolinea, String experiencia) {
        this.aerolinea = aerolinea;
        this.experiencia = experiencia;
    }

    public Piloto(String nombre, String apellido, int edad, String aerolinea, String experiencia) {
        super(nombre, apellido, edad);
        this.aerolinea = aerolinea;
        this.experiencia = experiencia;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void mostrar_info(){
        System.out.println("Nombre: " + getNombre() + "\nApellido: "+getApellido()+"\nEdad: " + getEdad()+"\nAerolinea: " + getAerolinea()+ "\nExperiencia: "+ getExperiencia());
    }
}
