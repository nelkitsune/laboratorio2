package Vuelo_carpeta;

public class Vuelo {
    private int numero_de_vuelo;
    private String origen;
    private String destino;
    private int fecha_salida;
    private int fecha_llegada;
    private Avion avion;

    public Vuelo(String origen, String destino, int fecha_salida, int fecha_llegada,int numero_de_vuelo) {
        this.origen = origen;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.numero_de_vuelo= numero_de_vuelo;
    }
    public void agregar_avion(Avion avion){
        this.avion= avion;
    }
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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
}
