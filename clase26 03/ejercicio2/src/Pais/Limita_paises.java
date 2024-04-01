package Pais;

import java.util.ArrayList;

public class Limita_paises {
    private ArrayList<Pais> lista_paises = new ArrayList<>();

    public Limita_paises() {
    }
    public void agregar_a_la_lista(Pais pais){
        lista_paises.add(pais);
    }
}
