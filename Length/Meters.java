package Length;

public class Meters {
    private double meter;

    private double mTkm = 0.001;
    private double toKm;

    private double mTm = 1;
    private double toM;

    private double mTcm = 100;
    private double toCm;

    private double mTmm = 1000;
    private double toMM;

    private double mTMm = 1e+6;
    private double tomM;

    private double mTnm = 1e+9;
    private double toNm;

    private double mTmi = 0.000621371;
    private double toMi;

    private double mTyd = 1.09361;
    private double toYd;

    private double mTft = 3.28;
    private double toFt;

    private double mTin = 39.3701;
    private double toIn;

    private double mTnaum = 0.000539957;
    private double toNauM;

    /**
     * The full constructor for this class.
     * 
     * @param km The value for Meter that needs to be converted.
     * @throws LengthException
     * @throws IllegalArgumentException If M is less than 0.
     */
    public Meters(double m) throws LengthException {
        if (m < 0) {
            throw new LengthException("Meters cannot be less than 0");
        }
        this.meter = m;
    }

    /**
     * The half constructor which accepts no parameter, and sets the value of Meter
     * to 0.
     * 
     * @throws LengthException
     */
    public Meters() throws LengthException {
        this(0);
    }

    private String getKm() {
        toKm = meter * mTkm;
        return toKm + " KiloMeters (Km)";
    }

    public double toKm() {
        return toKm;
    }

    private String getM() {
        toM = mTm * meter;
        return toM + " Meters (m)";
    }

    public double toM() {
        return toM;
    }

    private String getCm() {
        toCm = mTcm * meter;
        return toCm + " CentiMeters (Cm)";
    }

    public double toCm() {
        return toCm;
    }

    private String getmm() {// millimeter
        toMM = mTmm * meter;
        return toMM + " MilliMeters (mm)";
    }

    public double tomm() {
        return toMM;
    }

    private String getMm() {// micrometer
        tomM = mTMm * meter;
        return tomM + " MicroMeters (uM)";
    }

    public double toMM() {
        return this.tomM;
    }

    private String getNm() {
        toNm = mTnm * meter;
        return toNm + " NanoMeters (nm)";
    }

    public double tonm() {
        return this.toNm;
    }

    private String getMi() {
        toMi = mTmi * meter;
        return toMi + " Miles (mi)";
    }

    public double toMi() {
        return this.toMi;
    }

    private String getYd() {
        toYd = mTyd * meter;
        return toYd + " Yards (yds)";
    }

    public double toYd() {
        return toYd;
    }

    private String getFt() {
        toFt = mTft * meter;
        return toFt + " feet (ft)";
    }

    public double toFt() {
        return this.toFt;
    }

    private String getIn() {
        toIn = mTin * meter;
        return toIn + " Inches (in)";
    }

    public double toIn() {
        return this.toIn;
    }

    private String getNauM() {
        toNauM = mTnaum * meter;
        return toNauM + " Nautical Miles (NauM)";
    }

    public double toNauM() {
        return toNauM;
    }

    public String toString() {
        String res = getM() + " = " + getKm() + "\n";
        res += getM() + " = " + getM() + "\n";
        res += getM() + " = " + getCm() + "\n";
        res += getM() + " = " + getmm() + "\n";
        res += getM() + " = " + getMm() + "\n";
        res += getM() + " = " + getNm() + "\n";
        res += getM() + " = " + getMi() + "\n";
        res += getM() + " = " + getYd() + "\n";
        res += getM() + " = " + getFt() + "\n";
        res += getM() + " = " + getIn() + "\n";
        res += getM() + " = " + getNauM() + "\n";
        return res;
    }
}