package Length;

public class Miles {
    private double Mile;

    private double miTkm = 1.60934;
    private double toKm;

    private double miTm = 1609.33999997549;
    private double toM;

    private double miTcm = 160933.99999754899181;
    private double toCm;

    private double miTmm = 1.609e+6;
    private double toMm;

    private double miTMM = 1.609e+9;
    private double toMM;

    private double miTnm = 1.609e+12;
    private double toNm;

    private double miTmi = 1;
    private double toMi;

    private double miTyd = 1760;
    private double toYd;

    private double miTft = 5280;
    private double toFt;

    private double miTin = 63360;
    private double toIn;

    private double miTnaum = 0.868976;
    private double toNauM;

    public Miles(double mi) throws LengthException {
        if (mi < 0) {
            throw new LengthException("Miles cannot be less than 0");
        } else {
            this.Mile = mi;
        }
    }

    public Miles() throws LengthException {
        this(0);
    }

    private String getKm() {
        toKm = Mile * miTkm;
        return toKm + " KiloMeters (Km)";
    }

    public double toKm() {
        return toKm;
    }

    private String getM() {
        toM = miTm * Mile;
        return toM + " Meters (m)";
    }

    public double toM() {
        return toM;
    }

    private String getCm() {
        toCm = miTcm * Mile;
        return toCm + " CentiMeters (Cm)";
    }

    public double toCm() {
        return toCm;
    }

    private String getmm() {// Micrometer
        toMm = miTmm * Mile;
        return toMm + " Millimeters (mm)";
    }

    public double tomm() {
        return toMm;
    }

    private String getMm() {// micrometer
        toMm = miTMM * Mile;
        return toMM + " MicroMeters (uM)";
    }

    public double toMm() {
        return this.toMm;
    }

    private String getNm() {
        toNm = miTnm * Mile;
        return toNm + " NanoMeters (nm)";
    }

    public double tonm() {
        return this.toNm;
    }

    private String getMi() {
        toMi = miTmi * Mile;
        return toMi + " Miles (mi)";
    }

    public double toMi() {
        return this.toMi;
    }

    private String getYd() {
        toYd = miTyd * Mile;
        return toYd + " Yards (yds)";
    }

    public double toYd() {
        return toYd;
    }

    private String getFt() {
        toFt = miTft * Mile;
        return toFt + " feet (ft)";
    }

    public double toFt() {
        return this.toFt;
    }

    private String getIn() {
        toIn = miTin * Mile;
        return toIn + " Inches (in)";
    }

    public double toIn() {
        return this.toIn;
    }

    private String getNauM() {
        toNauM = miTnaum * Mile;
        return toNauM + " Nautical Miles (NauM)";
    }

    public double toNauM() {
        return toNauM;
    }

    public String toString() {
        String res = getMi() + " = " + getKm() + "\n";
        res += getMi() + " = " + getM() + "\n";
        res += getMi() + " = " + getCm() + "\n";
        res += getMi() + " = " + getmm() + "\n";
        res += getMi() + " = " + getMm() + "\n";
        res += getMi() + " = " + getNm() + "\n";
        res += getMi() + " = " + getMi() + "\n";
        res += getMi() + " = " + getYd() + "\n";
        res += getMi() + " = " + getFt() + "\n";
        res += getMi() + " = " + getIn() + "\n";
        res += getMi() + " = " + getNauM() + "\n";
        return res;
    }
}
