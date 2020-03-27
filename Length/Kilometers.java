package Length;

public class Kilometers {
    private double Kilometer;
    // Kilometers
    private double kmTkm = 1.0;
    private double toKm;
    // meters
    private double kmTm = 1000;
    private double toM;
    // Centimeters
    private double kmTcm = 100000;
    private double toCm;
    // Millimeters
    private double kmTmm = 1e+6;
    private double tomm;
    // Micrometers
    private double kmTMm = 1e+9;
    private double toMm;
    // nanometers
    private double kmTnm = 1e+12;
    private double toNm;
    // miles
    private double kmTmi = 0.621371;
    private double toMi;
    // yards
    private double kmTyd = 1093.61;
    private double toYd;
    // feet
    private double kmTft = 3280.84;
    private double toFt;
    // inches
    private double kmTin = 39370.08;
    private double toIn;
    // nautical miles
    private double kmTnaum = 0.539957;
    private double toNauM;

    /**
     * The full constructor for this class.
     * 
     * @param km The value for Kilometer that needs to be converted.
     * @throws LengthException
     * @throws IllegalArgumentException If km is less than 0.
     */
    public Kilometers(double km) throws LengthException {
        if (km >= 0) {
            this.Kilometer = km;
        } else {
            throw new LengthException("Kilometers cannot be less than 0");
        }
    }

    /**
     * The half constructor which accepts no parameter, and sets the value of
     * Kilometer to 0.
     * 
     * @throws LengthException
     */
    public Kilometers() throws LengthException {
        this(0);
    }

    /**
     * This method calculates the value of Kilometer in Kilometer. (The value
     * itself)
     * 
     * @returns The string form of the converted number concatenated with its unit.
     *          K
     */
    private String getKm() {
        toKm = Kilometer * kmTkm;
        return toKm + " KiloMeters (Km)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Kilometers.
     */
    public double toKm() {
        return toKm;
    }

    /**
     * This method calculates the value of Kilometer in Meters.
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getM() {
        toM = kmTm * Kilometer;
        return toM + " Meters (m)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Meters.
     */
    public double toM() {
        return toM;
    }

    /**
     * This method calculates the value of Kilometer in Centimeters.
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getCm() {
        toCm = kmTcm * Kilometer;
        return toCm + " CentiMeters (Cm)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Centimeters.
     */
    public double toCm() {
        return toCm;
    }

    /**
     * This method calculates the value of Kilometer in Millimeters.
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getmm() {// millimeter
        tomm = kmTmm * Kilometer;
        return tomm + " Millimeters(mm)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Millimeters.
     */
    public double tomm() {
        return tomm;
    }

    /**
     * This method calculates the value of Kilometer in Micrometers.
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getMm() {// micrometer
        toMm = kmTMm * Kilometer;
        return toMm + " MicroMeters (uM)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Micrometers.
     */
    public double toMm() {
        return this.toMm;
    }

    /**
     * This method calculates the value of Kilometer in Nanometers
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getNm() {
        toNm = kmTnm * Kilometer;
        return toNm + " NanoMeters (nm)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Nanometers.
     */
    public double toNm() {
        return this.toNm;
    }

    /**
     * This method calculates the value of Kilometer in Miles
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getMi() {
        toMi = kmTmi * Kilometer;
        return toMi + " Miles (mi)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Miles.
     */
    public double toMi() {
        return this.toMi;
    }

    /**
     * This method calculates the value of Kilometer in Yards
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getYd() {
        toYd = kmTyd * Kilometer;
        return toYd + " Yards (yds)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Yards.
     */
    public double toYd() {
        return toYd;
    }

    /**
     * This method calculates the value of Kilometer in Feets
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getFt() {
        toFt = kmTft * Kilometer;
        return toFt + " feet (ft)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Feet.
     */
    public double toFt() {
        return this.toFt;
    }

    /**
     * This method calculates the value of Kilometer in Inches.
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getIn() {
        toIn = kmTin * Kilometer;
        return toIn + " Inches (in)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Inches.
     */
    public double toIn() {
        return this.toIn;
    }

    /**
     * This method calculates the value of Kilometer in Nautical Miles.
     * 
     * @returns The string form of the converted number concatenated with its unit.
     */
    private String getNauM() {
        toNauM = kmTnaum * Kilometer;
        return toNauM + " Nautical Miles (NauM)";
    }

    /**
     * This method returns the converted value of Kilometers, and it is public so it
     * could be used for other calculations.
     * 
     * @returns The converted form of the Nautical Miles.
     */
    public double toNauM() {
        return toNauM;
    }

    /**
     * This tostring() method outputs the converted values for Kilometers to
     * Kilometers, Meters, Centimeters, Millimeters, Micrometers, Nanometers, Miles,
     * yards, Inches, Feet, Nautical Miles.
     * 
     * @returns res The string that has all the final converted values.
     */
    public String toString() {
        String res = getKm() + " = " + getKm() + "\n";
        res += getKm() + " = " + getM() + "\n";
        res += getKm() + " = " + getCm() + "\n";
        res += getKm() + " = " + getmm() + "\n";
        res += getKm() + " = " + getMm() + "\n";
        res += getKm() + " = " + getNm() + "\n";
        res += getKm() + " = " + getMi() + "\n";
        res += getKm() + " = " + getYd() + "\n";
        res += getKm() + " = " + getFt() + "\n";
        res += getKm() + " = " + getIn() + "\n";
        res += getKm() + " = " + getNauM() + "\n";
        return res;
    }
}