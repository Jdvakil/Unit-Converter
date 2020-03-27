//This is in the folder Length.
package Length;

/**
 * This class throws a custom exception for the Length package when an invalid
 * length is passed through.
 * 
 * @author Jay Darshan Vakil
 * @version 03/26/2020
 */
public class LengthException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * This is the empty constructor, it throws a custom exception specific to the
     * Length class.
     */
    public LengthException() {
        super("Error in the Length package");
    }

    /**
     * This is the exception that throws the text that is passed by the user.
     * 
     * @param arg0 text passed by the user.
     */
    public LengthException(String arg0) {
        super(arg0);
    }
}
