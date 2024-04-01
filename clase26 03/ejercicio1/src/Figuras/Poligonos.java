package Figuras;

import java.util.ArrayList;

public class Poligonos {
    private ArrayList<Lado> lista_lados = new ArrayList<>();

    public Poligonos(ArrayList<Lado> lista_lados) {
        this.lista_lados = lista_lados;
    }

    public ArrayList<Lado> getLista_lados() {
        return lista_lados;
    }

    public void setLista_lados(ArrayList<Lado> lista_lados) {
        this.lista_lados = lista_lados;
    }
}
