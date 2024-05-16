
public class Main {
    public static void main(String[] args) {

        Producto productoGenerico = new Producto("Manzana", 2.5);
        ProductoFresco productoFresco = new ProductoFresco("Lechuga", 1.2, "2024-05-10");
        ProductoCongelado productoCongelado = new ProductoCongelado("Pescado", 5.0, -18);


        System.out.println("Detalles del producto genérico:");
        mostrarDetallesProducto(productoGenerico);

        System.out.println("\nDetalles del producto fresco:");
        mostrarDetallesProducto(productoFresco);

        System.out.println("\nDetalles del producto congelado:");
        mostrarDetallesProducto(productoCongelado);
    }

    public static void mostrarDetallesProducto(Producto producto) {
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());


        if (producto instanceof ProductoFresco) {
            ProductoFresco productoFresco = (ProductoFresco) producto;
            System.out.println("Fecha de caducidad: " + productoFresco.getFechaCaducidad());
        } else if (producto instanceof ProductoCongelado) {
            ProductoCongelado productoCongelado = (ProductoCongelado) producto;
            System.out.println("Temperatura de almacenamiento: " + productoCongelado.getTemperatura() + "°C");
        }
    }
}
