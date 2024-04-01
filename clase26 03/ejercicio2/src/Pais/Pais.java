package Pais;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private Capital capital;
    private Limita_paises lista_paises_limitrofes;
    private ArrayList<Provincia> lista_provincias = new ArrayList<>();

    public Pais(Capital capital, ArrayList<Provincia> lista_provincias, String nombre) {
        this.nombre=nombre;
        this.capital = capital;
        this.lista_provincias = lista_provincias;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public ArrayList<Provincia> getLista_provincias() {
        return lista_provincias;
    }

    public void setNueva_provincia(Provincia nueva_provincia) {
        lista_provincias.add(nueva_provincia);
    }
    public void agregar_lista_paises_limitrofes(Limita_paises lista_paises_limitrofes){
        this.lista_paises_limitrofes = lista_paises_limitrofes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
