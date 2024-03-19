package Vuelos;

public class Avion {
    private Flota flota;
    private int capacidad_carga;
    private int capacidad_pasajeros;
    private String modelo;
    private int numero_serie;
    private Piloto piloto;
    private Piloto co_piloto;

    public Avion() {
    }

    public Avion(int capacidad_carga, int capacidad_pasajeros, String modelo, int numero_serie) {
        this.capacidad_carga = capacidad_carga;
        this.capacidad_pasajeros = capacidad_pasajeros;
        this.modelo = modelo;
        this.numero_serie = numero_serie;
    }
    public void asignar_piloto_copiloto(Piloto piloto, Piloto co_piloto){
        this.piloto=piloto;
        this.co_piloto=co_piloto;
    }
    public void asignar_flota(Flota flota){
        this.flota=flota;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Piloto getCo_piloto() {
        return co_piloto;
    }

    public void setCo_piloto(Piloto co_piloto) {
        this.co_piloto = co_piloto;
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


    public void mostrar_info() {
        System.out.println();
        System.out.println("Aerolinea: "+ getFlota().getAerolinea());
        System.out.println();
        System.out.println("Modelo: " + modelo);
        System.out.println();
        System.out.println("Número de serie: " + numero_serie);
        System.out.println();
        System.out.println("Capacidad de pasajeros: " + capacidad_pasajeros);
        System.out.println();
        System.out.println("Capacidad de carga: " + capacidad_carga);
        System.out.println();
        System.out.println("Piloto: " + piloto.getNombre() + " " + piloto.getApellido());
        System.out.println();
        System.out.println("Co-piloto: " + co_piloto.getNombre() + " " + co_piloto.getApellido());
        System.out.println();
    }
}
