// extend from RubtimeException to make an unchecked exception 
// (extending from Exception directly would create a checked exception)
public class InvalidArgumentsException extends RuntimeException {
    public InvalidArgumentsException(String message) {
        super(message);
    }
}