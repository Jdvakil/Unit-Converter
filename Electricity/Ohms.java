//Stored under the folder for electricity and its measurements. 
package Electricity;

/**
 * This class is to get the resistance with the given voltage and current using
 * Ohm's law V=IR. It asks the user for the voltage and current and returns
 * the current, the calculation is very simple but rather neccassary for
 * electrical engineers as most of the work they do is based on this formula.
 * 
 * @author Jay Darshan Vakil
 * @version 03/23/2020
 */
public class Ohms{

    //data members, voltage and current
    private double volts;
    private double amps;

    /**
     * The constructor that sets the voltage and the current for the Ohm's law
     * equation. It uses the mutators to set the value of the parameters with
     * appropriate validations.
     * @param V The voltage 
     * @param A The current 
     */
    public Ohms(double V, double A) {
        super();
        this.setAmps(A);
        this.setVolts(V);
    }

    /**
     * This is the getter for the resistance
     * 
     * @return The resistance value
     */
    public double getOhms() {
        double ohms = this.getVolts()/this.getAmps();
        return ohms;
    }

    /**
     * This is the getter for the Voltage
     * @return The voltage value.
     */
    public double getVolts() {
        return this.volts;
    }

    /**
     * The getter for the current.
     * @return The current value
     */
    public double getAmps() {
        return this.amps;
    }

    /**
     * This is the setter for the voltage, it sets the data voltage.
     * @param V new Voltage 
     */
    public void setVolts(double V) {
        this.volts = V;
    }

    /**
     * This is the setter for the amps.
     * @param amps new current
     */
    public void setAmps(double amps) {
        this.amps = amps;
    }

    /**
     * Outputs the class as a string.
     */
    @Override
    public String toString(){
        String res = "When you have: " + getVolts() + " V and "+ getAmps() + " A.\n";
        res += "Using Ohm's law, R = V/I, we get: " + getOhms()+ " Ohms of resistance.";
        return res;

    }

}
