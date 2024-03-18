package Vuelos;

import java.util.List;

public class Flota {
    private String aerolinea;
    private List<Avion> lista_aviones;


    public Flota() {
    }


    public Flota(String aerolinea, List<Avion> lista_aviones) {
        this.aerolinea = aerolinea;
        this.lista_aviones = lista_aviones;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public List<Avion> getLista_aviones() {
        return lista_aviones;
    }

    public void setLista_aviones(List<Avion> lista_aviones) {
        this.lista_aviones = lista_aviones;
    }
    public void mostrarInfoAviones() {
        System.out.println("Información de la flota de la aerolínea " + aerolinea + ":");
        for (Avion avion : lista_aviones) {
            avion.mostrar_info();
        }
    }


}
