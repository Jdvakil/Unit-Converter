package Mass;

/**
 * Represents Milligrams and converts accordingly
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class Milligrams {
    private double Milligrams;

    // metric tons
    private double mgTmt = 1e-9;
    private double toMt;

    // kilograms
    private double mgTkg = 1e-6;
    private double toKg;

    // grams
    private double mgTg = 0.001;
    private double toG;

    // milligrams
    private double mgTmg = 1;
    private double tomg;

    // micrograms
    private double mgTMg = 1000;
    private double toMg;

    // imperial tons
    private double mgTit = 9.8421e-10;
    private double toIt;

    private double mgTut = 1.1023e-9;
    private double toUt;

    private double mgTst = 1.5747e-7;
    private double toSt;

    private double mgTp = 2.2046e-6;
    private double toP;

    private double mgTo = 3.5274e-5;
    private double toO;

    public Milligrams(double mg) throws MassException {
        if (mg < 0)
            throw new MassException("Milligrams cannot be less than 0");
        this.Milligrams = mg;
    }

    public Milligrams() throws MassException {
        this(0);
    }

    private String getMt() {
        toMt = Milligrams * mgTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = Milligrams * mgTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = Milligrams * mgTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = Milligrams * mgTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = Milligrams * mgTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = Milligrams * mgTit;
        return toIt + " Imperial ton(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = Milligrams * mgTut;
        return toUt + " US Ton(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = Milligrams * mgTst;
        return toSt + " Stone(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = Milligrams * mgTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = Milligrams * mgTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = getmg() + " = " + getMt() + "\n";
        res += getmg() + " = " + getKg() + "\n";
        res += getmg() + " = " + getG() + "\n";
        res += getmg() + " = " + getmg() + "\n";
        res += getmg() + " = " + getMg() + "\n";
        res += getmg() + " = " + getIt() + "\n";
        res += getmg() + " = " + getUt() + "\n";
        res += getmg() + " = " + getSt() + "\n";
        res += getmg() + " = " + getP() + "\n";
        res += getmg() + " = " + getO() + "\n";
        return res;
    }
}
