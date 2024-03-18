import Vuelos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista_pilotos lista_pilotos_main = new Lista_pilotos();
        List<Piloto> pilotos_lista = lista_pilotos_main.lista_pilotos();
        Lista_aviones lista_aviones = new Lista_aviones();
        List<Avion> aviones_list = lista_aviones.aviones_lista();

        List<Avion> airluns = new ArrayList<>();
        List<Avion> aerolineasNel = new ArrayList<>();
        List<Avion> curico = new ArrayList<>();
        for (Avion avion : aviones_list) {
            switch (avion.getAerolinea()) {
                case "airluns" -> airluns.add(avion);
                case "aerolineasNel" -> aerolineasNel.add(avion);
                case "curico" -> curico.add(avion);
            }
        }
        Flota flota_airluns = new Flota("airluns",airluns);
        Flota flota_aerolineasNel = new Flota("aerolineasNel",aerolineasNel);
        Flota flota_curico = new Flota("curico",curico);
        int dni;
        String nombre_apellido;
        int numero_asiento;
        int numero_vuelo;
        int fecha_salida;
        int fecha_llegada;
        String destino;
        String origen;
        List<Reserva> reservas = new ArrayList<>();
        String op;
        while (true) {
            System.out.println("Ingrese los datos del vuelo y del cliente para hacer la reserva");
            System.out.print("Ingrese el nombre completo: ");
            nombre_apellido = sc.nextLine(); // Leer el nombre completo
            System.out.print("Ingrese el DNI: ");
            dni = Integer.parseInt(sc.nextLine()); // Leer el DNI y convertirlo a entero
            System.out.print("Ingrese el numero de asiento: ");
            numero_asiento = Integer.parseInt(sc.nextLine()); // Leer el número de asiento y convertirlo a entero
            System.out.print("Ingrese el numero de vuelo: ");
            numero_vuelo = Integer.parseInt(sc.nextLine()); // Leer el número de vuelo y convertirlo a entero
            System.out.print("Ingrese la fecha de salida: ");
            fecha_salida = Integer.parseInt(sc.nextLine()); // Leer la fecha de salida y convertirla a entero
            System.out.print("Ingrese la fecha de llegada: ");
            fecha_llegada = Integer.parseInt(sc.nextLine()); // Leer la fecha de llegada y convertirla a entero
            System.out.print("Ingrese el origen: ");
            origen = sc.nextLine(); // Leer el origen
            System.out.print("Ingrese el destino: ");
            destino = sc.nextLine(); // Leer el destino

            Reserva reserva = new Reserva(destino, dni, fecha_salida, fecha_llegada, nombre_apellido, numero_asiento, numero_vuelo, origen);
            reservas.add(reserva);

            System.out.print("Ingrese 'a' para terminar o 'b' para continuar: ");
            op = sc.next();
            if (op.equals("a")) {
                break;
            } else if (op.equals("b")) {
                sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                continue;
            }

        }
        for (Reserva reservat : reservas) {
            reservat.mostrarInformacion();
            System.out.println("-----");
        }
    }
}