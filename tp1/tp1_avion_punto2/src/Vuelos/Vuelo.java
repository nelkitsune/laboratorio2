package Vuelos;

public class Vuelo {
    private String destino;
    private String origen;
    private int fecha_salida;
    private int fecha_llegada;
    private int numero_vuelo;
    private Avion avion;
    public Vuelo() {
    }
    public Vuelo( String destino, String origen, int fecha_salida, int fecha_llegada, int numero_vuelo,Avion avion) {
        this.destino = destino;
        this.origen = origen;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.numero_vuelo = numero_vuelo;
        this.avion = avion;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(int fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(int fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(int numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }
    public void mostrar_info() {
        System.out.println("Número de vuelo: " + numero_vuelo);
        System.out.println();
        System.out.println("Origen: " + origen);
        System.out.println();
        System.out.println("Destino: " + destino);
        System.out.println();
        System.out.println("Fecha de salida: " + fecha_salida);
        System.out.println();
        System.out.println("Fecha de llegada: " + fecha_llegada);
        System.out.println();
        System.out.println("Información del avión:");
        avion.mostrar_info();
        System.out.println("--------");
    }
}
