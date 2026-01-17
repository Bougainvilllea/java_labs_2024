package exceptions;

public class WrongRadius extends RuntimeException {
    public WrongRadius(String message) {
        super(message);
    }
}
