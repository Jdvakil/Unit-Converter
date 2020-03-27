package Mass;

/**
 * Represents Metric tons and converts accordingly
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class MetricTons {
    private double MetricTons;

    private double mtTmt = 1;
    private double toMt;

    private double mtTkg = 1000;
    private double toKg;

    private double mtTg = 1e+6;
    private double toG;

    private double mtTmg = 1e9;
    private double tomg;

    private double mtTMg = 1e12;
    private double toMg;

    private double mtTit = 0.984207;
    private double toIt;

    private double mtTut = 1.1023118400336000544;
    private double toUt;

    private double mtTst = 157.4731200048;
    private double toSt;

    private double mtTp = 2204.6236800671999845;
    private double toP;

    private double mtTo = 35273.978881075199752;
    private double toO;

    /**
     * The constructor
     * 
     * @throws MassException
     */
    public MetricTons(double mt) throws MassException {
        if (mt < 0)
            throw new MassException("The value cannot be less than 0");
        this.MetricTons = mt;
    }

    /**
     * Empty constructor
     * 
     * @throws MassException
     */
    public MetricTons() throws MassException {
        this(0);
    }

    /**
     * calculates metric tons from metric tons.
     */
    private String getMt() {
        toMt = MetricTons * mtTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = MetricTons * mtTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = MetricTons * mtTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = MetricTons * mtTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = MetricTons * mtTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = MetricTons * mtTit;
        return toIt + " Imperial ton(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = MetricTons * mtTut;
        return toUt + " US Ton(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = MetricTons * mtTst;
        return toSt + " Stone(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = MetricTons * mtTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = MetricTons * mtTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = "\n" + getMt() + " = " + getMt() + "\n";
        res += getMt() + " = " + getKg() + "\n";
        res += getMt() + " = " + getG() + "\n";
        res += getMt() + " = " + getmg() + "\n";
        res += getMt() + " = " + getMg() + "\n";
        res += getMt() + " = " + getIt() + "\n";
        res += getMt() + " = " + getUt() + "\n";
        res += getMt() + " = " + getSt() + "\n";
        res += getMt() + " = " + getP() + "\n";
        res += getMt() + " = " + getO() + "\n";
        return res;
    }
}