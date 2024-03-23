import Vuelos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Random random = new Random();
        //llamado de la clase lista pilotos y lista aviones para aligerar la carga del main
        Lista_pilotos lista_pilotos_main = new Lista_pilotos();
        List<Piloto> pilotos_lista = lista_pilotos_main.lista_pilotos();
        Lista_aviones lista_aviones = new Lista_aviones();
        List<Avion> aviones_list = lista_aviones.aviones_lista();

        //creacion de las listas que contienen a los pilotos y aviones de cada aerolina
        List<Avion> airluns = new ArrayList<>();
        List<Piloto> pilotos_airluns = new ArrayList<>();
        List<Avion> aerolineasNel = new ArrayList<>();
        List<Piloto> pilotos_aerolineasNel = new ArrayList<>();
        List<Avion> curico = new ArrayList<>();
        List<Piloto> pilotos_curico = new ArrayList<>();
        //bucle for para dividir en listas de cada aerolinea a los distintos pilotos
        for (int i = 0; i < 18; i++) {
            if (i < 6){
                pilotos_aerolineasNel.add(pilotos_lista.get(i));
            } else if (i < 12) {
                pilotos_airluns.add(pilotos_lista.get(i));
            } else {
                pilotos_curico.add(pilotos_lista.get(i));
            }
        }
        //creacion de las distintas flotas
        Flota flota_airluns = new Flota("airluns",airluns,pilotos_airluns);
        Flota flota_aerolineasNel = new Flota("aerolineasNel",aerolineasNel,pilotos_aerolineasNel);
        Flota flota_curico = new Flota("curico",curico,pilotos_curico);

        //rellenado simultaneo de datos de aviones y flotas
        for (int i = 0; i < aviones_list.size(); i++) {
            Avion avion = aviones_list.get(i);
            if (i < 3) {
                flota_aerolineasNel.agregar_avion_lista(avion);
                avion.asignar_flota(flota_aerolineasNel);
            } else if (i < 6) {
                flota_airluns.agregar_avion_lista(avion);
                avion.asignar_flota(flota_airluns);
            } else {
                flota_curico.agregar_avion_lista(avion);
                avion.asignar_flota(flota_curico);
            }
        }
        //creacion de los vuelos y la asignasion respectiva de cada piloto/co_piloto a el avion que se usara
        Vuelo vuelo_Lujan_Mendoza = new Vuelo("Mendoza","Lujan",23,23,2598,flota_aerolineasNel.getLista_aviones().get(1));
        flota_aerolineasNel.getLista_aviones().get(1).asignar_piloto_copiloto(flota_aerolineasNel.getLista_piloto().get(0),flota_aerolineasNel.getLista_piloto().get(1) );
        Vuelo vuelo_Mendoza_chile = new Vuelo("Chile","Mendoza",25,25,43,flota_curico.getLista_aviones().get(2));
        flota_curico.getLista_aviones().get(2).asignar_piloto_copiloto(flota_curico.getLista_piloto().get(2),flota_curico.getLista_piloto().get(1));
        Vuelo vuelo_argentina_Francia = new Vuelo("Francia","Argentina",10,11,45510,flota_airluns.getLista_aviones().get(0));
        flota_airluns.getLista_aviones().get(0).asignar_piloto_copiloto(flota_airluns.getLista_piloto().get(5),flota_airluns.getLista_piloto().get(3));

        //linea de codigo descartada por salud mental del estudiante. Cumplia la funcion de asignar pilotos aleatorios
        //de la misma aerolinea a un avion en caso de que no se supiera que avion seria asignado,
        // pero por simplificacion del codigo se descarto
        //vuelo_Lujan_Mendoza.getAvion().asignar_piloto_copiloto(vuelo_Lujan_Mendoza.getAvion().getFlota().getLista_piloto().get(random.nextInt(6)),vuelo_Lujan_Mendoza.getAvion().getFlota().getLista_piloto().get(random.nextInt(6)));


        //creacion de pasajeros
        Pasajero pasajero_1 = new Pasajero("Ramiro", "Ferrari", 21, 44140, 20);
        Pasajero pasajero_2 = new Pasajero("María", "González", 30, 55230, 15);
        Pasajero pasajero_3 = new Pasajero("Juan", "Martínez", 25, 66320, 18);
        Pasajero pasajero_4 = new Pasajero("Laura", "López", 40, 77410, 22);
        Pasajero pasajero_5 = new Pasajero("Carlos", "Sánchez", 35, 88500, 19);
        Pasajero pasajero_6 = new Pasajero("Ana", "Rodríguez", 28, 99680, 21);
        //creacion de las reservas
        Reserva reserva_1 = new Reserva(12,vuelo_Lujan_Mendoza,pasajero_1);
        Reserva reserva_2 = new Reserva(16,vuelo_Lujan_Mendoza,pasajero_2);
        Reserva reserva_3 = new Reserva(30,vuelo_Mendoza_chile,pasajero_3);
        Reserva reserva_4 = new Reserva(5,vuelo_Mendoza_chile,pasajero_4);
        Reserva reserva_5 = new Reserva(15,vuelo_argentina_Francia,pasajero_5);
        Reserva reserva_6 = new Reserva(16,vuelo_argentina_Francia,pasajero_6);

        System.out.println("Bienvenido a la central de consultas de las reservas aereas");
        int option;
        int option2;
        boolean finalizar_programa = true;
        while (finalizar_programa) {
            System.out.println("Sobre qué vuelo desea consultar?");
            System.out.println("Presione '1' para el vuelo de Lujan a Mendoza");
            System.out.println("Presione '2' para el vuelo de Mendoza a Chile");
            System.out.println("Presione '3' para el vuelo de Argentina a Francia");
            System.out.println("Presione '4' para salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Se encontraron dos reservas para el vuelo de Lujan a Mendoza.");
                    System.out.println("Si desea consultar la primera reserva presione 1. Si desea consultar la segunda reserva presione 2");
                    option2 = sc.nextInt();
                    switch (option2) {
                        case 1:
                            reserva_1.mostrarInfo();
                            break;
                        case 2:
                            reserva_2.mostrarInfo();
                            break;
                        default:
                            System.out.println("Ingreso de dato no válido. Reiniciando programa Azul+");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Se encontraron dos reservas para el vuelo de Mendoza a Chile.");
                    System.out.println("Si desea consultar la primera reserva presione 1. Si desea consultar la segunda reserva presione 2");
                    option2 = sc.nextInt();
                    switch (option2) {
                        case 1:
                            reserva_3.mostrarInfo();
                            break;
                        case 2:
                            reserva_4.mostrarInfo();
                            break;
                        default:
                            System.out.println("Ingreso de dato no válido. Reiniciando programa Azul+");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Se encontraron dos reservas para el vuelo de Argentina a Francia.");
                    System.out.println("Si desea consultar la primera reserva presione 1. Si desea consultar la segunda reserva presione 2");
                    option2 = sc.nextInt();
                    switch (option2) {
                        case 1:
                            reserva_5.mostrarInfo();
                            break;
                        case 2:
                            reserva_6.mostrarInfo();
                            break;
                        default:
                            System.out.println("Ingreso de dato no válido. Reiniciando programa Azul+");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("¡Que tenga un buen día!");
                    finalizar_programa = false;
                    break;
                default:
                    System.out.println("Error al ingresar la opción. Reiniciando programa");
                    break;
            }
        }

    }
}