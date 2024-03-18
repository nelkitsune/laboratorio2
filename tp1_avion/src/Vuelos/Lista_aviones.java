package Vuelos;

import java.util.List;
import java.util.ArrayList;

public class Lista_aviones {
    public List aviones_lista(){
        List<Avion>lista_de_aviones = new ArrayList<>();

        Avion avion_1 = new Avion("airluns",52390,104,"boing-737",2345234);
        Avion avion_2 = new Avion("airluns", 49320, 110, "boing-747", 2467123);
        Avion avion_3 = new Avion("aerolineasNel", 60840, 120, "airbus-A320", 3012450);
        Avion avion_4 = new Avion("curico", 37590, 90, "airbus-A330", 1987654);
        Avion avion_5 = new Avion("airluns", 56980, 100, "boing-737", 2203456);
        Avion avion_6 = new Avion("aerolineasNel", 50310, 108, "boing-747", 2398712);
        Avion avion_7 = new Avion("curico", 43920, 112, "airbus-A320", 2556341);
        Avion avion_8 = new Avion("curico", 50580, 98, "boing-747", 2198763);
        Avion avion_9 = new Avion("aerolineasNel", 58430, 115, "boing-737", 2412987);

        lista_de_aviones.add(avion_1);
        lista_de_aviones.add(avion_2);
        lista_de_aviones.add(avion_3);
        lista_de_aviones.add(avion_4);
        lista_de_aviones.add(avion_5);
        lista_de_aviones.add(avion_6);
        lista_de_aviones.add(avion_7);
        lista_de_aviones.add(avion_8);
        lista_de_aviones.add(avion_9);


        return lista_de_aviones;
    }

}
