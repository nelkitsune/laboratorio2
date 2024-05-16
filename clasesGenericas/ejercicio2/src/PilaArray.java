import java.util.ArrayList;
import java.util.EmptyStackException;

public class PilaArray<E> {
    private ArrayList<E> pila;
    private int objetos_insertados = 0;

    public PilaArray() {
        this.pila = new ArrayList<>();
    }

    public boolean estaVacia() {
        return this.pila.isEmpty();
    }

    public int tamanio() {
        return pila.size();
    }

    public void push (E dato) {
        pila.add(dato);
        objetos_insertados++;
    }

    public E pop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        objetos_insertados--;
        return pila.remove(pila.size() - 1);
    }

    public E peek() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return pila.get(pila.size() - 1);
    }

    public int getObjetos_insertados() {
        return objetos_insertados;
    }
}
