package Pais;

import java.util.ArrayList;

public class Continente {
    private ArrayList<Pais> listaPais = new ArrayList<>();

    public Continente(Pais pais) {
        listaPais.add(pais);
    }

    public ArrayList<Pais> getListaPais() {
        return listaPais;
    }

}
