package Vuelo_carpeta;

public class Avion {
    private String patente;
    private Flota flota;
    private Vuelo vuelo;

    public Avion(String patente,String nombre_flota, String aerolinea) {
        this.patente = patente;
        this.flota = new Flota(nombre_flota,aerolinea);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }
    public void agregar_vuelo(Vuelo vuelo){
        this.vuelo = vuelo;
    }
}
