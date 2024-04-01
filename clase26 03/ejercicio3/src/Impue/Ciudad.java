package Impue;

import java.util.ArrayList;

public class Ciudad {
    private int cantidad_recaudada;
    private int gasto_mantenimineto;
    private int numero_habitantes;
    private String nombre;
    private ArrayList<Impuesto> lista_impuestos = new ArrayList<>(5);

    public Ciudad(int cantidad_recaudada, int gasto_mantenimineto, int numero_habitantes, String nombre, ArrayList<Impuesto> lista_impuestos) {
        this.cantidad_recaudada = cantidad_recaudada;
        this.gasto_mantenimineto = gasto_mantenimineto;
        this.numero_habitantes = numero_habitantes;
        this.nombre = nombre;
        this.lista_impuestos = lista_impuestos;
    }

    public int getCantidad_recaudada() {
        return cantidad_recaudada;
    }

    public void setCantidad_recaudada(int cantidad_recaudada) {
        this.cantidad_recaudada = cantidad_recaudada;
    }

    public int getGasto_mantenimineto() {
        return gasto_mantenimineto;
    }

    public void setGasto_mantenimineto(int gasto_mantenimineto) {
        this.gasto_mantenimineto = gasto_mantenimineto;
    }

    public int getNumero_habitantes() {
        return numero_habitantes;
    }

    public void setNumero_habitantes(int numero_habitantes) {
        this.numero_habitantes = numero_habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Impuesto> getLista_impuestos() {
        return lista_impuestos;
    }

    public void setLista_impuestos(ArrayList<Impuesto> lista_impuestos) {
        this.lista_impuestos = lista_impuestos;
    }
}
