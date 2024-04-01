package Impue;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Ciudad> lista_ciudades_mascienmilHab=new ArrayList<>();
    private ArrayList<Ciudad> lista_ciudades_menoscienmilHab=new ArrayList<>();
    private String nombre;

    public Provincia(ArrayList<Ciudad> lista_ciudades_mascienmilHab, ArrayList<Ciudad> lista_ciudades_menoscienmilHab, String nombre) {
        this.lista_ciudades_mascienmilHab = lista_ciudades_mascienmilHab;
        this.lista_ciudades_menoscienmilHab = lista_ciudades_menoscienmilHab;
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getLista_ciudades_mascienmilHab() {
        return lista_ciudades_mascienmilHab;
    }

    public void setLista_ciudades_mascienmilHab(ArrayList<Ciudad> lista_ciudades_mascienmilHab) {
        this.lista_ciudades_mascienmilHab = lista_ciudades_mascienmilHab;
    }

    public ArrayList<Ciudad> getLista_ciudades_menoscienmilHab() {
        return lista_ciudades_menoscienmilHab;
    }

    public void setLista_ciudades_menoscienmilHab(ArrayList<Ciudad> lista_ciudades_menoscienmilHab) {
        this.lista_ciudades_menoscienmilHab = lista_ciudades_menoscienmilHab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
