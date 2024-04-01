package Figuras;

import java.util.ArrayList;
import java.util.List;

public class Lado {
    private List<Integer> lista_puntos_lado = new ArrayList<>(4);

    public Lado(int punto_x,int punto_y,int punto_x1, int punto_y2) {
        lista_puntos_lado.add(punto_x);
        lista_puntos_lado.add(punto_y);
        lista_puntos_lado.add(punto_x1);
        lista_puntos_lado.add(punto_y2);
    }

    public List<Integer> getLista_puntos_lado() {
        return lista_puntos_lado;
    }

    public void setLista_puntos_lado(List<Integer> lista_puntos_lado) {
        this.lista_puntos_lado = lista_puntos_lado;
    }
}
