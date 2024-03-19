import Vuelos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Lista_pilotos lista_pilotos_main = new Lista_pilotos();
        List<Piloto> pilotos_lista = lista_pilotos_main.lista_pilotos();
        Lista_aviones lista_aviones = new Lista_aviones();
        List<Avion> aviones_list = lista_aviones.aviones_lista();

        List<Avion> airluns = new ArrayList<>();
        List<Piloto> pilotos_airluns = new ArrayList<>();
        List<Avion> aerolineasNel = new ArrayList<>();
        List<Piloto> pilotos_aerolineasNel = new ArrayList<>();
        List<Avion> curico = new ArrayList<>();
        List<Piloto> pilotos_curico = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            if (i < 6){
                pilotos_aerolineasNel.add(pilotos_lista.get(i));
            } else if (i < 12) {
                pilotos_airluns.add(pilotos_lista.get(i));
            } else {
                pilotos_curico.add(pilotos_lista.get(i));
            }
        }

        Flota flota_airluns = new Flota("airluns",airluns,pilotos_airluns);
        Flota flota_aerolineasNel = new Flota("aerolineasNel",aerolineasNel,pilotos_aerolineasNel);
        Flota flota_curico = new Flota("curico",curico,pilotos_curico);

        for (int i = 0; i < 3; i++) {
            flota_aerolineasNel.agregar_avion_lista(aviones_list.get(i));
            aviones_list.get(i).asignar_flota(flota_aerolineasNel);

        }
        for (int i = 3; i < 6; i++) {
            flota_airluns.agregar_avion_lista(aviones_list.get(i));
            aviones_list.get(i).asignar_flota(flota_airluns);
        }
        for (int i = 6; i < 9; i++) {
            flota_curico.agregar_avion_lista(aviones_list.get(i));
            aviones_list.get(i).asignar_flota(flota_curico);
        }


        Vuelo vuelo_Lujan_Mendoza = new Vuelo("Mendoza","Lujan",23,23,2598,flota_aerolineasNel.getLista_aviones().get(1));
        //vuelo_Lujan_Mendoza.getAvion().asignar_piloto_copiloto(vuelo_Lujan_Mendoza.getAvion().getFlota().getLista_piloto().get(random.nextInt(6)),vuelo_Lujan_Mendoza.getAvion().getFlota().getLista_piloto().get(random.nextInt(6)));
        flota_aerolineasNel.getLista_aviones().get(1).asignar_piloto_copiloto(flota_aerolineasNel.getLista_piloto().get(0),flota_aerolineasNel.getLista_piloto().get(1) );
        

    }
}