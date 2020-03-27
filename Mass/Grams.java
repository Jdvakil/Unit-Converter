package Mass;//This instantiates that this class belongs to the package "Mass"

/**
 * This class gets called in the main class to instantiate the value in grams to
 * be converted to several different units.
 * 
 * @author Jay Darshan Vakil
 * @version January 1, 2019
 */
public class Grams {
    private double Grams;// the value in grams passes as a parameter by the user

    private final double gTmt = 1e-6;// grams to metric tons
    private double toMt;

    private final double gTkg = 0.001;// grams to kilograms
    private double toKg;

    private final double gTg = 1;// grams to grams (should be 1)
    private double toG;

    private final double gTmg = 1000;// grams to milligrams
    private double tomg;

    private final double gTMg = 1e+6;// grams to micrograms
    private double toMg;

    private final double gTit = 9.8421e-7;// gram to imperial tons
    private double toIt;

    private final double gTut = 1.1023e-6;// gram to US tons
    private double toUt;

    private final double gTst = 0.000157473;// grams to stones
    private double toSt;

    private final double gTp = 0.00220462;// gram to pounds
    private double toP;

    private final double gTo = 0.035274;// gram to ounces
    private double toO;

    /**
     * This is the main constructor, here the user inputs the value in grams and
     * then passes on to be converted. This method checks if the value inputed by
     * the user is above 0.
     * 
     * @param g the value in grams entered by the user
     * @throws MassException
     */
    public Grams(final double g) throws MassException {
        if (g < 0)
            throw new MassException("Grams cannot be less than 0");
        this.Grams = g;
    }

    /**
     * This is the default constructor which sets the default variable value to 0 if
     * no value if entered.
     * 
     * @throws MassException
     */
    public Grams() throws MassException {
        this(0);
    }

    private String getMt() {
        toMt = Grams * gTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = Grams * gTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = Grams * gTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = Grams * gTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = Grams * gTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = Grams * gTit;
        return toIt + " Imperial ton(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = Grams * gTut;
        return toUt + " US Ton(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = Grams * gTst;
        return toSt + " Stone(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = Grams * gTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = Grams * gTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = getG() + " = " + getMt() + "\n";
        res += getG() + " = " + getKg() + "\n";
        res += getG() + " = " + getG() + "\n";
        res += getG() + " = " + getmg() + "\n";
        res += getG() + " = " + getMg() + "\n";
        res += getG() + " = " + getIt() + "\n";
        res += getG() + " = " + getUt() + "\n";
        res += getG() + " = " + getSt() + "\n";
        res += getG() + " = " + getP() + "\n";
        res += getG() + " = " + getO() + "\n";
        return res;
    }

}