//The files are under the package Length
package Length;

/**
 * This class represents the unit Centimeter under the category of Length, it
 * coverts the input centimeter to the other units found on google.com.
 * 
 * @author Jay Darshan Vakil
 * @version 03/25/2020
 */
public class Centimeters {
    private double Centimeter;// centimeter to be converted.

    // Centimeter to kilometer
    private double cmTkm = 1e-5;
    private double toKm;

    // Centimeter to meter
    private double cmTm = 0.01;
    private double toM;

    // Centimeter to centimeter
    private double cmTcm = 1;
    private double toCm;

    // Centimeter to millimeter
    private double cmTmm = 10;
    private double tomm;

    //// Centimeter to micrometer
    private double cmTUm = 10000;
    private double toUm;

    // Centimeter to nanometer
    private double cmTnm = 1e+7;
    private double toNm;

    // Centimeter to miles
    private double cmTmi = 6.21371527778e-6;
    private double toMi;

    // Centimeter to yards
    private double cmTyd = 0.01093611199693;
    private double toYd;

    // Centimeter to feet
    private double cmTft = 0.032808416666678406892;
    private double toFt;

    // Centimeter to inches
    private double cmTin = 0.39370003188976804287;
    private double toIn;

    // Centimeter to nautical miles
    private double cmTNaum = 5.399557672786235169e-6;
    private double toNaum;

    /**
     * This is the constructor that can instantiate the centimeters object and create a centimeter entity to
     * be converted.
     * @param cm the cm to be converted 
     * @throws LengthException
     */
    public Centimeters(double cm) throws LengthException {
        this.setCentimeter(cm);
    }

    /**
     * This is the empty constructor, it takes no argument and sets the centimeter to 0.
     * @throws LengthException
     */
    public Centimeters() throws LengthException {
        this(0);
    }

    private String getKm() {
        toKm = Centimeter * cmTkm;
        return toKm + " KiloMeters (Km)";
    }

    public double toKm() {
        return toKm;
    }

    private String getM() {
        toM = cmTm * Centimeter;
        return toM + " Meters (m)";
    }

    public double toM() {
        return toM;
    }

    private String getCm() {
        toCm = cmTcm * Centimeter;
        return toCm + " CentiMeters (Cm)";
    }

    public double toCm() {
        return toCm;
    }

    private String getmm() {// millimeter
        tomm = cmTmm * Centimeter;
        return tomm + " MilliMeters (mm)";
    }

    public double tomm() {
        return tomm;
    }

    private String getUm() {// micrometer
        toUm = cmTUm * Centimeter;
        return toUm + " MicroMeters (uM)";
    }

    public double toMM() {
        return toUm;
    }

    private String getNm() {
        toNm = cmTnm * Centimeter;
        return toNm + " NanoMeters (nm)";
    }

    public double tonm() {
        return this.toNm;
    }

    private String getMi() {
        toMi = cmTmi * Centimeter;
        return toMi + " Miles (mi)";
    }

    public double toMi() {
        return this.toMi;
    }

    private String getYd() {
        toYd = cmTyd * Centimeter;
        return toYd + " Yards (yds)";
    }

    public double toYd() {
        return toYd;
    }

    private String getFt() {
        toFt = cmTft * Centimeter;
        return toFt + " feet (ft)";
    }

    public double toFt() {
        return this.toFt;
    }

    private String getIn() {
        toIn = cmTin * Centimeter;
        return toIn + " Inches (in)";
    }

    public double toIn() {
        return this.toIn;
    }

    private String getNauM() {
        toNaum = cmTNaum * Centimeter;
        return toNaum + " Nautical Miles (NauM)";
    }

    public double toNauM() {
        return toNaum;
    }

    /**
     * @param centimeter the centimeter to set
     * @throws LengthException
     */
    public void setCentimeter(double centimeter) throws LengthException {
        if (centimeter >=0) {
            this.Centimeter = centimeter;
        }else{
            throw new LengthException("Centimeters cannot be less than 0");
        }
    }

    public String toString() {
        String res = getCm() + " = " + getKm() + "\n";
        res += getCm() + " = " + getM() + "\n";
        res += getCm() + " = " + getCm() + "\n";
        res += getCm() + " = " + getmm() + "\n";
        res += getCm() + " = " + getUm() + "\n";
        res += getCm() + " = " + getNm() + "\n";
        res += getCm() + " = " + getMi() + "\n";
        res += getCm() + " = " + getYd() + "\n";
        res += getCm() + " = " + getFt() + "\n";
        res += getCm() + " = " + getIn() + "\n";
        res += getCm() + " = " + getNauM() + "\n";
        return res;
    }
}