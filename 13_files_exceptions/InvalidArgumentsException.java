// we extend RuntimeException because we do not want to force developers 
// to have to handle it unless they want to
public class InvalidArgumentsException extends RuntimeException {
  public InvalidArgumentsException (String message) {
        // construct the parent class (RuntimeException)
        // with the error message passed into this constructor
        super(message);
    }
}