import java.io.IOException;
// we are extending IOException because we want it to be checked,
// and our exception is related to File I/O, but more specific than the general
// IOException
public class IncompatibleExtensionException extends IOException {
    public IncompatibleExtensionException(String message) {
        super(message);
    }
}