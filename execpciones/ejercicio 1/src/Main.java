public class Main {
    public static void main(String[] args) {
        try {
            // Dividir por cero para provocar una ArithmeticException
            int resultado = dividePorCero(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }

    public static int dividePorCero(int numerador, int denominador) {
        return numerador / denominador;
    }
}
