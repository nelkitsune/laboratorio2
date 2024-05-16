class ProductoFresco extends Producto {
    private String fechaCaducidad;

    public ProductoFresco(String nombre, double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
}