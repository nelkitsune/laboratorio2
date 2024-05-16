import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private List<T> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (T producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
    }
}
