package Pais;

import java.util.ArrayList;

public class Limita_provincias {
    private ArrayList<Provincia> lista_provincias = new ArrayList<>();

    public Limita_provincias() {
    }
    public void agregar_a_la_lista(Provincia provincias){
        lista_provincias.add(provincias);
    }
}
