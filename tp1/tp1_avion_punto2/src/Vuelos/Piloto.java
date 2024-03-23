package Vuelos;

import java.util.List;

public class Piloto extends Persona {
    private String experiencia;

    public Piloto(String aerolinea, String experiencia) {
        this.experiencia = experiencia;
    }

    public Piloto(String nombre, String apellido, int edad, String experiencia,int dni) {
        super(nombre, apellido, edad,dni);
        this.experiencia = experiencia;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

}
