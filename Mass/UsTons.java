package Mass;

/**
 * Represents US tons and converts accordingly
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class UsTons {
    private double ton;

    private double tTmt;
    private double toMt;

    private double tTkg;
    private double toKg;

    private double tTg;
    private double toG;

    private double tTmg;
    private double tomg;

    private double tTMg;
    private double toMg;

    private double tTit;
    private double toIt;

    private double tTut;
    private double toUt;

    private double tTst;
    private double toSt;

    private double tTp;
    private double toP;

    private double tTo;
    private double toO;

    public UsTons(double t) {
        if (t < 0)
            throw new IllegalArgumentException("US Tons  cannot be less than 0");
        this.ton = t;
    }

    public UsTons() {
        this(0);
    }

    private String getMt() {
        toMt = ton * tTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = ton * tTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = ton * tTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = ton * tTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = ton * tTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = ton * tTit;
        return toIt + " Imperial ton(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = ton * tTut;
        return toUt + " US Ton(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = ton * tTst;
        return toSt + " Stone(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = ton * tTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = ton * tTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = getUt() + " = " + getMt() + "\n";
        res += getUt() + " = " + getKg() + "\n";
        res += getUt() + " = " + getG() + "\n";
        res += getUt() + " = " + getmg() + "\n";
        res += getUt() + " = " + getMg() + "\n";
        res += getUt() + " = " + getIt() + "\n";
        res += getUt() + " = " + getUt() + "\n";
        res += getUt() + " = " + getSt() + "\n";
        res += getUt() + " = " + getP() + "\n";
        res += getUt() + " = " + getO() + "\n";
        return res;
    }
}