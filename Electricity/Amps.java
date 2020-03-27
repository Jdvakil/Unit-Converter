//Stored under the folder for electricity and its measurements. 
package Electricity;

/**
 * This class is to get the current with the given voltage and resistance using
 * Ohm's law V=IR. It asks the user for the voltage and resistance and returns
 * the current, the calculation is very simple but rather neccassary for
 * electrical engineers as most of the work they do is based on this formula.
 * 
 * @author Jay Darshan Vakil
 * @version 03/23/2020
 */
public class Amps {
    // data members: contains voltage and resistance
    private double Volts;
    private double Ohms;

    /**
     * The constructor that sets the voltage and the resistance for the Ohm's law
     * equation. It uses the mutators to set the value of the parameters with
     * appropriate validations.
     * 
     * @param V The voltage to set
     * @param O The Resistance to set
     * @throws ElectricityException
     */
    public Amps(double V, double O) throws ElectricityException {
        this.setVolts(V);
        this.setOhms(O);
    }

    /**
     * This is the getter for the resistance, it returns the resistance value.
     * 
     * @return the ohms
     */
    public double getOhms() {
        double tempOhms = this.Ohms;
        return tempOhms;
    }

    /**
     * This is the getter for the Voltage, it returns the Voltage value.
     * 
     * @return the volts
     */
    public double getVolts() {
        return Volts;
    }

    /**
     * This performs the calculations for the Current and returns the calculated
     * value.
     * 
     * @return calculated version of current
     */
    private double AmpCalculation() {
        return this.getVolts() / this.getOhms();
    }

    /**
     * This is the getter for the current
     * 
     * @return The current value
     */
    public double getAmps() {
        return this.AmpCalculation();
    }

    /**
     * This sets the resistance for the calculations after validating if the passed
     * parameter is valid or not.
     * 
     * @param ohms the ohms to set
     * @throws ElectricityException
     */
    public void setOhms(double ohms) throws ElectricityException {
        if (ohms >= 0) {
            this.Ohms = ohms;
        } else {
            throw new ElectricityException("Ohms cannot be less than 0, please try again...");
        }
    }

    /**
     * This sets the voltage. No validation as voltage can be negative or positive.
     * 
     * @param volts the volts to set
     */
    public void setVolts(double volts) {
        this.Volts = volts;
    }

    /**
     * This outputs the class as a string form
     */
    @Override
    public String toString() {
        String res = "When you have: " + getVolts() + " V and " + getOhms() + " Ohms.\n";
        res += "Using Ohm's law, I = V/R, we get: " + getAmps() + " A of cuurent.";
        return res;
    }
}