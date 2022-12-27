package test2.backend.exception;

public class EmailNotValid extends RuntimeException{
    public EmailNotValid(String message) {
        super(message);
    }
}
