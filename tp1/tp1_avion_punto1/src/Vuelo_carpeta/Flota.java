package Vuelo_carpeta;

public class Flota {
    private String nombre_flota;
    private String aerolinea;

    public Flota(String nombre_flota, String aerolinea) {
        this.nombre_flota = nombre_flota;
        this.aerolinea = aerolinea;
    }

    public String getNombre_flota() {
        return nombre_flota;
    }

    public void setNombre_flota(String nombre_flota) {
        this.nombre_flota = nombre_flota;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

}
