//The Electricity packgage.
package Electricity;

/**
 * This class represents Voltage, it finds the voltage after getting the current
 * and the resistance from the user. It uses the base formula V=IR, Ohm's law to
 * calculate the voltage.
 * 
 * @author Jay Darshan Vakil
 * @version 03/23/2020
 */
public class Volts {
    // Data members, resistance and current
    private double ohms;
    private double amps;

    /**
     * This is the constructor, it takes in a resistance and a current and sets the
     * data to the data members using the mutators with validations.
     * 
     * @param ohms the resistance
     * @param amps the current
     * @throws ElectricityException
     */
    public Volts(double ohms, double amps) throws ElectricityException {
        this.setOhms(ohms);
        this.setAmps(amps);
    }

    /**
     * The getter for the number of Volts, calculates the voltage.
     * 
     * @return The number of volts.
     */
    public double getVolts() {
        double volts = this.getAmps() * this.getOhms();
        return volts;
    }

    /**
     * This is the getter for the current.
     * 
     * @return The current value.
     */
    public double getAmps() {
        return this.amps;
    }

    /**
     * This is the getter for the resistance, it returns the resistance value.
     * 
     * @return the ohms
     */
    public double getOhms() {
        return this.ohms;
    }

    /**
     * This sets the new Current to the data current.
     * 
     * @param amps the amps to set
     */
    public void setAmps(double amps) {
        this.amps = amps;
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
            this.ohms = ohms;
        } else {
            throw new ElectricityException("Error setting the resistance");
        }
    }

    /**
     * Returns the class in a string form.
     */
    @Override
    public String toString() {
        String res = "When you have: " + getOhms() + " Ohms and " + getAmps() + " A.\n";
        res += "Using Ohm's law, V = IR, we get: " + getVolts() + " V of volts.";
        return res;
    }
}