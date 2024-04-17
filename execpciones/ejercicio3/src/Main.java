import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            int numeroAleatorio = generarNumeroAleatorio();
            verificarParidad(numeroAleatorio);
            System.out.println("El número generado es: " + numeroAleatorio);
        } catch (ParImparException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }

    public static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100); // Generar un número aleatorio entre 0 y 99
    }

    public static void verificarParidad(int numero) throws ParImparException {
        if (numero % 2 == 0) {
            throw new ParImparException("El número es par.");
        } else {
            throw new ParImparException("El número es impar.");
        }
    }
}
