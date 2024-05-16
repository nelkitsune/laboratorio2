public class Calculadora <T extends Number> implements Operable<T>{
    @Override
    public T suma(T a, T b) {
        return (T) Double.valueOf(a.doubleValue()+ b.doubleValue());
    }

    @Override
    public T resta(T a, T b) {
        return (T) Integer.valueOf(a.intValue() - b.intValue());
    }

    @Override
    public T multiplicacion(T a, T b) {
        return (T) Float.valueOf(a.floatValue()* b.floatValue());
    }

    @Override
    public T  division(T a, T b) {
        try {
            if (b.doubleValue() == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
