package exceptions;

public class WrongHeight extends RuntimeException {
    public WrongHeight(String message) {
        super(message);
    }
}
