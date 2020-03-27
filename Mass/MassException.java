package Mass;

/**
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class MassException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MassException() {
        super("Error in the mass package");
    }

    public MassException(String arg0) {
        super(arg0);
    }

}