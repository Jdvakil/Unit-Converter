package Electricity;

/**
 * This is an exception made specifically for the Electricity package. 
 * 
 * @author Jay Darshan Vakil
 * @version 03/23/2020
 */
public class ElectricityException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * This is the empty constructor, it throws the default exception for the specific exception
     */
    public ElectricityException() {
        super();
    }

    /**
     * This is the custom constructor, it throws the text passed as a parameter by the user.
     * @param text
     */
    public ElectricityException(String text) {
        super(text);
    }

}
//Joyousspider243