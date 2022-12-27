package employee_management.exception;

public class InvalidSalaryException  extends RuntimeException{

    public InvalidSalaryException(String message) {
        super(message);
    }
}
