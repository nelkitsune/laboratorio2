public class Main {
    public static void main(String[] args) {
        Calculadora<Integer> calcInt = new Calculadora<>();
        System.out.println(calcInt.suma(2, 3));
        System.out.println(calcInt.resta(2, 3));
        System.out.println(calcInt.multiplicacion(2, 3));
        System.out.println(calcInt.division(2, 0));
        Calculadora<Double> calcDouble = new Calculadora<>();
        System.out.println(calcDouble.suma(2.0, 3.0));
        System.out.println(calcDouble.resta(2.0, 3.0));
        System.out.println(calcDouble.multiplicacion(2.0, 3.0));
        System.out.println(calcDouble.division(2.0, 3.0));

    }
}