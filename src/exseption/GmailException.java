package exseption;

public class GmailException extends RuntimeException{
    public GmailException() {
    }

    public GmailException(String message) {
        super(message);
    }
}
