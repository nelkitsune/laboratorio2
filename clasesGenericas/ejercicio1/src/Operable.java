public interface Operable<T> {
    T suma(T a, T b);
    T resta(T a, T b);
    T multiplicacion(T a, T b);
    T division(T a, T b) throws ArithmeticException;
}
