public class Main {
    public static void main(String[] args) {
        try {
            metodoUno();
        } catch (CustomException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }

    public static void metodoUno() throws CustomException {
        metodoDos();
    }

    public static void metodoDos() throws CustomException {
        metodoTres();
    }

    public static void metodoTres() throws CustomException {
        metodoCuatro();
    }

    public static void metodoCuatro() throws CustomException {
        // Lanzamos una excepción desde el último método
        throw new CustomException("Excepción lanzada desde el métodoCuatro");
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
