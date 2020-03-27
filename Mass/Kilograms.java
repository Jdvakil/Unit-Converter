package Mass;

/**
 * Represents Kilograms and converts accordingly
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class Kilograms {
    private double Kilograms;

    private double kgTmt = 0.001;
    private double toMt;

    private double kgTkg = 1;
    private double toKg;

    private double kgTg = 1000;
    private double toG;

    private double kgTmg = 1e6;
    private double tomg;

    private double kgTMg = 1e9;
    private double toMg;

    private double kgTit = 0.000984207;
    private double toIt;

    private double kgTut = 0.00110231;
    private double toUt;

    private double kgTst = 0.157473;
    private double toSt;

    private double kgTp = 2.20462;
    private double toP;

    private double kgTo = 35.274;
    private double toO;

    public Kilograms(double kg) throws MassException {
        if (kg < 0)
            throw new MassException("Kilograms cannot be negative");
        this.Kilograms = kg;
    }

    public Kilograms() throws MassException {
        this(0);
    }

    private String getMt() {
        toMt = Kilograms * kgTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = Kilograms * kgTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = Kilograms * kgTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = Kilograms * kgTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = Kilograms * kgTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = Kilograms * kgTit;
        return toIt + " Imperial ton(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = Kilograms * kgTut;
        return toUt + " US Ton(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = Kilograms * kgTst;
        return toSt + " Stone(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = Kilograms * kgTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = Kilograms * kgTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = getKg() + " = " + getMt() + "\n";
        res += getKg() + " = " + getKg() + "\n";
        res += getKg() + " = " + getG() + "\n";
        res += getKg() + " = " + getmg() + "\n";
        res += getKg() + " = " + getMg() + "\n";
        res += getKg() + " = " + getIt() + "\n";
        res += getKg() + " = " + getUt() + "\n";
        res += getKg() + " = " + getSt() + "\n";
        res += getKg() + " = " + getP() + "\n";
        res += getKg() + " = " + getO() + "\n";
        return res;
    }
}