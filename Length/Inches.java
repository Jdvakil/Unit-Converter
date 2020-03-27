package Length;

public class Inches {
    private double Inch;

    private double inTkm = 2.54e-5;
    private double toKm;

    private double inTm = 0.0254;
    private double toM;

    private double inTcm = 2.54;
    private double toCm;

    private double inTmm = 25.4;// millimeter
    private double tomm;

    private double inTMM = 25400;
    private double toMM;

    private double inTnm = 2.54e+7;
    private double toNm;

    private double inTmi = 1.5783e-5;
    private double toMi;

    private double inTyd = 0.02777808;
    private double toYd;

    private double ydTft = 0.08333424;
    private double toFt;

    private double inTin = 1;
    private double toIn;

    private double inTnaum = 1.37150520259e-5;
    private double toNauM;

    public Inches(double in) throws LengthException {
        if (in >= 0) {
            this.Inch = in;
        } else {
            throw new LengthException("Inches cannot be less than 0");
        }
    }

    public Inches() throws LengthException {
        this(0);
    }

    private String getKm() {
        toKm = Inch * inTkm;
        return toKm + " KiloMeters (Km)";
    }

    public double toKm() {
        return toKm;
    }

    private String getM() {
        toM = inTm * Inch;
        return toM + " Meters (m)";
    }

    public double toM() {
        return toM;
    }

    private String getCm() {
        toCm = inTcm * Inch;
        return toCm + " CentiMeters (Cm)";
    }

    public double toCm() {
        return toCm;
    }

    private String getmm() {// Inch
        tomm = inTmm * Inch;
        return tomm + " Millimeters (mm)";
    }

    public double tomm() {
        return tomm;
    }

    private String getMm() {// micrometer
        toMM = inTMM * Inch;
        return toMM + " MicroMeters (uM)";
    }

    public double toMm() {
        return this.toMM;
    }

    private String getNm() {
        toNm = inTnm * Inch;
        return toNm + " NanoMeters (nm)";
    }

    public double tonm() {
        return this.toNm;
    }

    private String getMi() {
        toMi = inTmi * Inch;
        return toMi + " Miles (mi)";
    }

    public double toMi() {
        return this.toMi;
    }

    private String getYd() {
        toYd = inTyd * Inch;
        return toYd + " Inchs (yds)";
    }

    public double toYd() {
        return toYd;
    }

    private String getFt() {
        toFt = ydTft * Inch;
        return toFt + " feet (ft)";
    }

    public double toFt() {
        return this.toFt;
    }

    private String getIn() {
        toIn = inTin * Inch;
        return toIn + " Inches (in)";
    }

    public double toIn() {
        return this.toIn;
    }

    private String getNauM() {
        toNauM = inTnaum * Inch;
        return toNauM + " Nautical Miles (NauM)";
    }

    public double toNauM() {
        return toNauM;
    }

    public String toString() {
        String res = getIn() + " = " + getKm() + "\n";
        res += getIn() + " = " + getM() + "\n";
        res += getIn() + " = " + getCm() + "\n";
        res += getIn() + " = " + getmm() + "\n";
        res += getIn() + " = " + getMm() + "\n";
        res += getIn() + " = " + getNm() + "\n";
        res += getIn() + " = " + getMi() + "\n";
        res += getIn() + " = " + getYd() + "\n";
        res += getIn() + " = " + getFt() + "\n";
        res += getIn() + " = " + getIn() + "\n";
        res += getIn() + " = " + getNauM() + "\n";
        return res;
    }
}