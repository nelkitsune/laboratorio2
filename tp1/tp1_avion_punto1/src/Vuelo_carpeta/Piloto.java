package Vuelo_carpeta;

public class Piloto extends Persona implements Volador{
    private String experiencia;

    public Piloto(String nombre, String apellido, int edad, int dni, String experiencia) {
        super(nombre, apellido, edad, dni);
        this.experiencia = experiencia;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void volando() {
        System.out.println("esta volando");
    }
}
