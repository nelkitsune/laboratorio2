package Vuelos;

import java.util.List;

public class Flota {
    private String aerolinea;
    private List<Avion> lista_aviones;

    private List<Piloto> lista_piloto;


    public Flota() {
    }


    public Flota(String aerolinea, List<Avion> lista_aviones,List<Piloto> lista_piloto) {
        this.aerolinea = aerolinea;
        this.lista_aviones = lista_aviones;
        this.lista_piloto = lista_piloto;
    }

    public List<Piloto> getLista_piloto() {
        return lista_piloto;
    }

    public void setLista_piloto(List<Piloto> lista_piloto) {
        this.lista_piloto = lista_piloto;
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
    public void agregar_avion_lista(Avion avion){
        lista_aviones.add(avion);
    }

    public void mostrar_info() {
        System.out.println("Información de la flota de la aerolínea " + getAerolinea() + ":");
        for (Avion avion : lista_aviones) {
            System.out.println("-----------------------------");
            System.out.println("Avión:");
            avion.mostrar_info();
            System.out.println("-----------------------------");
        }
    }



}
