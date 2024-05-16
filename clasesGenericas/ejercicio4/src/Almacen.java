import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private List<T> elementos;

    public Almacen() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos(List<? super T> lista) {
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }
    public void imprimirElementos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

}