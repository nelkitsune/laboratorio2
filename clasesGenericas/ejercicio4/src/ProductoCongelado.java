class ProductoCongelado extends Producto {
    private int temperatura;

    public ProductoCongelado(String nombre, double precio, int temperatura) {
        super(nombre, precio);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }
}