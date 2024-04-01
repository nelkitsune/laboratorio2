package Impue;

import java.util.ArrayList;

public class Pais {
    private ArrayList<Provincia> lista_provincias = new ArrayList<>();
    private String nombre;

    public Pais(ArrayList<Provincia> lista_provincias, String nombre) {
        this.lista_provincias = lista_provincias;
        this.nombre = nombre;
    }

    public ArrayList<Provincia> getLista_provincias() {
        return lista_provincias;
    }

    public void setLista_provincias(ArrayList<Provincia> lista_provincias) {
        this.lista_provincias = lista_provincias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Ciudad> getCiudadDeficit(){
        ArrayList<Ciudad> ciudadesDeficit = new ArrayList<>();
        ArrayList<Ciudad> ciudadesAuxiliar = new ArrayList<>();
        for(Provincia i: lista_provincias){
            ciudadesAuxiliar = i.getLista_ciudades_mascienmilHab();
            for (Ciudad j : ciudadesAuxiliar){
                if(j.getCantidad_recaudada()< j.getGasto_mantenimineto()){
                    ciudadesDeficit.add(j);
                }
            }
        }
        return ciudadesDeficit;
    }
    public ArrayList<Provincia> provincias_mucho_Deficit(){
        int contador = 0;
        ArrayList<Provincia> provinciasmucho_deficit = new ArrayList<>();
        ArrayList<Ciudad> ciudadesAuxiliar = new ArrayList<>();
        for(Provincia i: lista_provincias){
            ciudadesAuxiliar = i.getLista_ciudades_mascienmilHab();
            for (Ciudad j : ciudadesAuxiliar){
                if(j.getCantidad_recaudada()< j.getGasto_mantenimineto()){
                    contador +=1;
                }
            }
            if(contador > 2){
                provinciasmucho_deficit.add(i);
            }
        }
        return provinciasmucho_deficit;

    }
}
