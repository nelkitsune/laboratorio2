package Impue;

public class Impuesto {
    private int monto_impositivo;
    private String nombre;

    public Impuesto(int monto_impositivo, String nombre) {
        this.monto_impositivo = monto_impositivo;
        this.nombre = nombre;
    }

    public int getMonto_impositivo() {
        return monto_impositivo;
    }

    public void setMonto_impositivo(int monto_impositivo) {
        this.monto_impositivo = monto_impositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
