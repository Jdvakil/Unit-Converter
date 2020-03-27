package Mass;

/**
 * Represents Imperial tons and converts accordingly
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class ImperialTons {
    private double Ton;

    private double itTmt = 1.01605;
    private double toMt;

    private double itTkg = 1016.05;
    private double toKg;

    private double itTg = 1.016e+6;
    private double toG;

    private double itTmg = 1.016e+9;
    private double tomg;

    private double itTMg = 1.016e+12;
    private double toMg;

    private double itTit = 1;
    private double toIt;

    private double itTut = 1.12;
    private double toUt;

    private double itTst = 160;
    private double toSt;

    private double itTp = 2240;
    private double toP;

    private double itTo = 35840;
    private double toO;

    public ImperialTons(double its) throws MassException {
        if (its < 0)
            throw new MassException("Imperial tons cannot be less than 0");
        this.Ton = its;
    }

    public ImperialTons() throws MassException {
        this(0);
    }

    private String getMt() {
        toMt = Ton * itTmt;
        return toMt + " Metric Ton(s) (Mt)";
    }

    public double toMt() {
        return toMt;
    }

    private String getKg() {
        toKg = Ton * itTkg;
        return toKg + " Kilogram(s) (Kg)";
    }

    public double toKg() {
        return toKg;
    }

    private String getG() {
        toG = Ton * itTg;
        return toG + " Gram(s) (g)";
    }

    public double toG() {
        return toG;
    }

    private String getmg() {
        tomg = Ton * itTmg;
        return tomg + " Milligram(s) (mg)";
    }

    public double tomg() {
        return tomg;
    }

    private String getMg() {
        toMg = Ton * itTMg;
        return toMg + " Microgram(s) (Ug)";
    }

    public double toMg() {
        return toMg;
    }

    private String getIt() {
        toIt = Ton * itTit;
        return toIt + " Imperial ton(s) (It)";
    }

    public double toIt() {
        return toIt;
    }

    private String getUt() {
        toUt = Ton * itTut;
        return toUt + " US Ton(s) (Ut)";
    }

    public double toUt() {
        return toUt;
    }

    private String getSt() {
        toSt = Ton * itTst;
        return toSt + " Stone(s) (St)";
    }

    public double toSt() {
        return toSt;
    }

    private String getP() {
        toP = Ton * itTp;
        return toP + " Pound(s) (Lbs)";
    }

    public double toP() {
        return toP;
    }

    private String getO() {
        toO = Ton * itTo;
        return toO + " Ounce(s) (O)";
    }

    public double toO() {
        return toO;
    }

    public String toString() {
        String res = getIt() + " = " + getMt() + "\n";
        res += getIt() + " = " + getKg() + "\n";
        res += getIt() + " = " + getG() + "\n";
        res += getIt() + " = " + getmg() + "\n";
        res += getIt() + " = " + getMg() + "\n";
        res += getIt() + " = " + getIt() + "\n";
        res += getIt() + " = " + getUt() + "\n";
        res += getIt() + " = " + getSt() + "\n";
        res += getIt() + " = " + getP() + "\n";
        res += getIt() + " = " + getO() + "\n";
        return res;
    }
}