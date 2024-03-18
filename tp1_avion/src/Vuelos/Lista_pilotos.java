package Vuelos;
import java.util.ArrayList;
import java.util.List;

public class Lista_pilotos {
    public List lista_pilotos(){
        Piloto piloto_1 = new Piloto("Thadeo","Palacio",35,"Airluns","Intermedio");
        Piloto piloto_2 = new Piloto("Juan", "González", 40, "Airluns", "Avanzado");
        Piloto piloto_3 = new Piloto("María", "López", 38, "aerolineasNel", "Principiante");
        Piloto piloto_4 = new Piloto("Pedro", "Martínez", 42, "aerolineasNel", "Intermedio");
        Piloto piloto_5 = new Piloto("Laura", "Sánchez", 37, "curico", "Avanzado");
        Piloto piloto_6 = new Piloto("Carlos", "Ramírez", 45, "Airluns", "Avanzado");
        Piloto piloto_7 = new Piloto("Ana", "Gómez", 36, "Airluns", "Principiante");
        Piloto piloto_8 = new Piloto("Luis", "Pérez", 39, "aerolineasNel", "Intermedio");
        Piloto piloto_9 = new Piloto("Sofía", "Hernández", 41, "aerolineasNel", "Avanzado");
        Piloto piloto_10 = new Piloto("Javier", "Fernández", 37, "curico", "Intermedio");
        Piloto piloto_11 = new Piloto("Carmen", "Martínez", 43, "curico", "Avanzado");
        Piloto piloto_12 = new Piloto("Diego", "García", 40, "Airluns", "Principiante");
        Piloto piloto_13 = new Piloto("Marina", "Ruiz", 38, "Airluns", "Intermedio");
        Piloto piloto_14 = new Piloto("Hugo", "Díaz", 44, "aerolineasNel", "Avanzado");
        Piloto piloto_15 = new Piloto("Gabriela", "Flores", 35, "aerolineasNel", "Intermedio");
        List<Piloto> listaPilotos = new ArrayList<>();

        listaPilotos.add(piloto_1);
        listaPilotos.add(piloto_2);
        listaPilotos.add(piloto_3);
        listaPilotos.add(piloto_4);
        listaPilotos.add(piloto_5);
        listaPilotos.add(piloto_6);
        listaPilotos.add(piloto_7);
        listaPilotos.add(piloto_8);
        listaPilotos.add(piloto_9);
        listaPilotos.add(piloto_10);
        listaPilotos.add(piloto_11);
        listaPilotos.add(piloto_12);
        listaPilotos.add(piloto_13);
        listaPilotos.add(piloto_14);
        listaPilotos.add(piloto_15);
        return  listaPilotos;
    }
}
