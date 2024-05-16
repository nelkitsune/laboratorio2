import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Almacen<Fruta> almacenFrutas = new Almacen<>();
        almacenFrutas.agregarElemento(new Fruta("Manzana", 2.5));
        almacenFrutas.agregarElemento(new Fruta("Plátano", 1.8));
        almacenFrutas.agregarElemento(new Fruta("Naranja", 3.0));
        almacenFrutas.imprimirElementos();
    }
}

