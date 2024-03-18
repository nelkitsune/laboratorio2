package Vuelos;

public class avion {
    private String aerolinea;
    private int capacidad_carga;
    private int capacidad_pasajeros;
    private String modelo;
    private int numero_serie;

    public avion() {
    }

    public avion(String aerolinea, int capacidad_carga, int capacidad_pasajeros, String modelo, int numero_serie) {
        this.aerolinea = aerolinea;
        this.capacidad_carga = capacidad_carga;
        this.capacidad_pasajeros = capacidad_pasajeros;
        this.modelo = modelo;
        this.numero_serie = numero_serie;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }
}
