package Vuelos;
import java.util.ArrayList;
import java.util.List;

public class Lista_pilotos {
    public List lista_pilotos(){
        Piloto piloto_1 = new Piloto("Thadeo", "Palacio", 35, "Intermedio", 12345678);
        Piloto piloto_2 = new Piloto("Juan", "González", 40, "Avanzado", 23456789);
        Piloto piloto_3 = new Piloto("María", "López", 38, "Principiante", 34567890);
        Piloto piloto_4 = new Piloto("Pedro", "Martínez", 42, "Intermedio", 45678901);
        Piloto piloto_5 = new Piloto("Laura", "Sánchez", 37, "Avanzado", 56789012);
        Piloto piloto_6 = new Piloto("Carlos", "Ramírez", 45, "Avanzado", 67890123);
        Piloto piloto_7 = new Piloto("Ana", "Gómez", 36, "Principiante", 78901234);
        Piloto piloto_8 = new Piloto("Luis", "Pérez", 39, "Intermedio", 89012345);
        Piloto piloto_9 = new Piloto("Sofía", "Hernández", 41, "Avanzado", 90123456);
        Piloto piloto_10 = new Piloto("Javier", "Fernández", 37, "Intermedio", 12340987);
        Piloto piloto_11 = new Piloto("Carmen", "Martínez", 43, "Avanzado", 23410987);
        Piloto piloto_12 = new Piloto("Diego", "García", 40, "Principiante", 34109876);
        Piloto piloto_13 = new Piloto("Marina", "Ruiz", 38, "Intermedio", 41098765);
        Piloto piloto_14 = new Piloto("Hugo", "Díaz", 44, "Avanzado", 10987654);
        Piloto piloto_15 = new Piloto("Gabriela", "Flores", 35, "Intermedio", 98765432);
        Piloto piloto_16 = new Piloto("Andrea", "Gómez", 39, "Principiante", 87654321);
        Piloto piloto_17 = new Piloto("Martín", "Hernández", 41, "Avanzado", 76543210);
        Piloto piloto_18 = new Piloto("Lucía", "Díaz", 36, "Intermedio", 65432109);


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
        listaPilotos.add(piloto_16);
        listaPilotos.add(piloto_17);
        listaPilotos.add(piloto_18);
        return  listaPilotos;
    }
}
