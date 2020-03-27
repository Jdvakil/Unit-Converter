package Mass;

/**
 * Represents Stones and converts accordingly
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class Stones {
    private double Stones;

    private double stTmt = 0.00635;
    private double toMt;

    private double stTkg = 6.35;
    private double toKg;

    private double stTg = 6350.29;
    private double toG;

    private double stTmg = 6.35e+6;
    private double tomg;

    private double stTMg = 6.35e+9;
    private double toMg;

    private double stTit = 0.00625;
    private double toIt;

    private double stTut = 0.007;
    private double toUt;

    private double stTst = 1;
    private double toSt;

    private double stTp = 14;
    private double toP;

    private double stTo = 224;
    private double toO;

    public Stones(double st) {
        if (st < 0)
            throw new IllegalArgumentException("Stones cannot be less than 0");
        this.Stones = st;
    }

    public Stones() {
        this(0);
    }

    private String getMt() {
        toMt = Stones * stTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = Stones * stTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = Stones * stTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = Stones * stTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = Stones * stTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = Stones * stTit;
        return toIt + " Imperial Stones(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = Stones * stTut;
        return toUt + " US Stones(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = Stones * stTst;
        return toSt + " Stonese(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = Stones * stTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = Stones * stTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = getSt() + " = " + getMt() + "\n";
        res += getSt() + " = " + getKg() + "\n";
        res += getSt() + " = " + getG() + "\n";
        res += getSt() + " = " + getmg() + "\n";
        res += getSt() + " = " + getMg() + "\n";
        res += getSt() + " = " + getIt() + "\n";
        res += getSt() + " = " + getUt() + "\n";
        res += getSt() + " = " + getSt() + "\n";
        res += getSt() + " = " + getP() + "\n";
        res += getSt() + " = " + getO() + "\n";
        return res;
    }
}
