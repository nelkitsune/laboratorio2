package Vuelos;

public class Vuelo {
    private String aerolinea;
    private int aeronave;
    private String destino;
    private String origen;
    private int fecha_salida;
    private int fecha_llegada;
    private int numero_vuelo;
    public Vuelo() {
    }
    public Vuelo(String aerolinea, int aeronave, String destino, String origen, int fecha_salida, int fecha_llegada, int numero_vuelo) {
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
        this.destino = destino;
        this.origen = origen;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.numero_vuelo = numero_vuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getAeronave() {
        return aeronave;
    }

    public void setAeronave(int aeronave) {
        this.aeronave = aeronave;
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
}
