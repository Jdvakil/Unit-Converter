package Mass;

/**
 * Represents Ounces and converts accordingly
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class Ounces {
    private double ounce;

    private double oTmt = 2.835e-5;
    private double toMt;

    private double oTkg = 0.0283495;
    private double toKg;

    private double oTg = 28.3495;
    private double toG;

    private double oTmg = 28349.5;
    private double tomg;

    private double oTMg = 2.835e+7;
    private double toMg;

    private double oTit = 2.7902e-5;
    private double toIt;

    private double oTut = 3.125e-5;
    private double toUt;

    private double oTst = 0.00446429;
    private double toSt;

    private double oTp = 0.0625;
    private double toP;

    private double oTo = 1;
    private double toO;

    public Ounces(double o) throws MassException {
        if (o < 0)
            throw new MassException("Ounces cannot be less than 0");
        this.ounce = o;
    }

    public Ounces() throws MassException {
        this(0);
    }

    private String getMt() {
        toMt = ounce * oTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = ounce * oTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = ounce * oTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = ounce * oTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = ounce * oTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = ounce * oTit;
        return toIt + " Imperial ton(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = ounce * oTut;
        return toUt + " US Ton(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = ounce * oTst;
        return toSt + " Stone(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = ounce * oTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = ounce * oTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = getO() + " = " + getMt() + "\n";
        res += getO() + " = " + getKg() + "\n";
        res += getO() + " = " + getG() + "\n";
        res += getO() + " = " + getmg() + "\n";
        res += getO() + " = " + getMg() + "\n";
        res += getO() + " = " + getIt() + "\n";
        res += getO() + " = " + getUt() + "\n";
        res += getO() + " = " + getSt() + "\n";
        res += getO() + " = " + getP() + "\n";
        res += getO() + " = " + getO() + "\n";
        return res;
    }
}