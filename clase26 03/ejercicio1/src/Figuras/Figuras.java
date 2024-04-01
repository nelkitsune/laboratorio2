package Figuras;

import java.util.ArrayList;
import java.util.List;

public class Figuras {
    private ArrayList<Elipse> figuras_elipticas = new ArrayList<>();
    private ArrayList<Poligonos> figuras_poligonales = new ArrayList<>();

    public Figuras() {
    }

    public void agregar_elipse(Elipse figura){
        figuras_elipticas.add(figura);
    }
    public void agregar_poligono(Poligonos figura){
        figuras_poligonales.add(figura);
    }
}
