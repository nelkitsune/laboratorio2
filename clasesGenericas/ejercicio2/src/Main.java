public class Main {
    public static void main(String[] args) {
        PilaArray<Integer> pila = new PilaArray<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println("Tamaño de la pila: " + pila.tamanio());

        System.out.println("¿La pila está vacía?: " + pila.estaVacia());

        System.out.println("Elemento eliminado: " + pila.pop());

        System.out.println("Elemento en la parte superior: " + pila.peek());

        System.out.println("Número actual de objetos dentro de la pila : " + pila.getObjetos_insertados());
    }
}
