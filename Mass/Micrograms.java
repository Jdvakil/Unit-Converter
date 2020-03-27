package Mass;

/**
 * Represents Micrograms and converts accordingly
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class Micrograms {
    private double Micrograms;

    private double mgTmt = 1e-12;
    private double toMt;

    private double mgTkg = 1e-9;
    private double toKg;

    private double mgTg = 1e-6;
    private double toG;

    private double mgTmg = 0.001;
    private double tomg;

    private double mgTMg = 1;
    private double toMg;

    private double mgTit = 9.8421e-13;
    private double toIt;

    private double mgTut = 1.1023e-12;
    private double toUt;

    private double mgTst = 1.5747e-10;
    private double toSt;

    private double mgTp = 2.2046e-9;
    private double toP;

    private double mgTo = 3.5274e-8;
    private double toO;

    public Micrograms(double Mg) throws MassException {
        if (Mg < 0)
            throw new MassException("Micrograms cannot be less than 0");
        this.Micrograms = Mg;
    }

    public Micrograms() throws MassException {
        this(0);
    }

    private String getMt() {
        toMt = Micrograms * mgTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = Micrograms * mgTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = Micrograms * mgTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = Micrograms * mgTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = Micrograms * mgTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = Micrograms * mgTit;
        return toIt + " Imperial ton(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = Micrograms * mgTut;
        return toUt + " US Ton(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = Micrograms * mgTst;
        return toSt + " Stone(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = Micrograms * mgTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = Micrograms * mgTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = getMg() + " = " + getMt() + "\n";
        res += getMg() + " = " + getKg() + "\n";
        res += getMg() + " = " + getG() + "\n";
        res += getMg() + " = " + getmg() + "\n";
        res += getMg() + " = " + getMg() + "\n";
        res += getMg() + " = " + getIt() + "\n";
        res += getMg() + " = " + getUt() + "\n";
        res += getMg() + " = " + getSt() + "\n";
        res += getMg() + " = " + getP() + "\n";
        res += getMg() + " = " + getO() + "\n";
        return res;
    }
}