package Pais;

public class Provincia {
    private String nombre;
    private Capital capital;
    private Ciudad ciudad;
    private Limita_provincias limita_provincias;
    private  Limita_paises limitaPaises;

    public Provincia(String nombre, Capital capital, Ciudad ciudad) {
        this.nombre = nombre;
        this.capital = capital;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
