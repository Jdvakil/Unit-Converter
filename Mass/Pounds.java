package Mass;

/**
 * Represents Pounds and converts accordingly
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class Pounds {
    private double Pound;

    private double pTmt = 0.000453592;
    private double toMt;

    private double pTkg = 0.453592;
    private double toKg;

    private double pTg = 453.6;
    private double toG;

    private double pTmg = 453592;
    private double tomg;

    private double pTMg = 4.536e+8;
    private double toMg;

    private double pTit = 0.000446429;
    private double toIt;

    private double pTut = 0.0005;
    private double toUt;

    private double pTst = 0.0714286;
    private double toSt;

    private double pTp = 1;
    private double toP;

    private double pTo = 16;
    private double toO;

    public Pounds(double p) {
        if (p < 0)
            throw new IllegalArgumentException("Pounds cannot be less than 0");
        this.Pound = p;
    }

    public Pounds() {
        this(0);
    }

    private String getMt() {
        toMt = Pound * pTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = Pound * pTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = Pound * pTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = Pound * pTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = Pound * pTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = Pound * pTit;
        return toIt + " Imperial ton(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = Pound * pTut;
        return toUt + " US Ton(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = Pound * pTst;
        return toSt + " Stone(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = Pound * pTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = Pound * pTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = getP() + " = " + getMt() + "\n";
        res += getP() + " = " + getKg() + "\n";
        res += getP() + " = " + getG() + "\n";
        res += getP() + " = " + getmg() + "\n";
        res += getP() + " = " + getMg() + "\n";
        res += getP() + " = " + getIt() + "\n";
        res += getP() + " = " + getUt() + "\n";
        res += getP() + " = " + getSt() + "\n";
        res += getP() + " = " + getP() + "\n";
        res += getP() + " = " + getO() + "\n";
        return res;
    }
}