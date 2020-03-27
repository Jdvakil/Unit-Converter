package Length;

public class Millimeters {
    private double Millimeter;

    private double mmTkm = 1e-6;
    private double toKm;

    private double mmTm = 0.001;
    private double toM;

    private double mmTcm = 0.1;
    private double toCm;

    private double mmTmm = 1.0;
    private double tomm;

    private double mmTMm = 1000;
    private double toMm;

    private double mmTnm = 1e+6;
    private double toNm;

    private double mmTmi = 6.2137e-7;
    private double toMi;

    private double mmTyd = 0.0010936111996938;
    private double toYd;

    private double mmTft = 0.0032808335990813998657;
    private double toFt;

    private double mmTin = 0.039370003188976800124;
    private double toIn;

    private double mmTnaum = 5.399557672786235169e-7;
    private double toNauM;

    public Millimeters(double mm) throws LengthException {
        if (mm >= 0) {
            this.Millimeter = mm;
        } else {
            throw new LengthException("Millimeter cannot be less than 0");
        }
    }

    public Millimeters() throws LengthException {
        this(0);
    }

    private String getKm() {
        toKm = Millimeter * mmTkm;
        return toKm + " KiloMeters (Km)";
    }

    public double toKm() {
        return toKm;
    }

    private String getM() {
        toM = mmTm * Millimeter;
        return toM + " Meters (m)";
    }

    public double toM() {
        return toM;
    }

    private String getCm() {
        toCm = mmTcm * Millimeter;
        return toCm + " CentiMeters (Cm)";
    }

    public double toCm() {
        return toCm;
    }

    private String getmm() {// millimeter
        tomm = mmTmm * Millimeter;
        return tomm + " MilliMeters (mm)";
    }

    public double tomm() {
        return tomm;
    }

    private String getMm() {// micrometer
        toMm = mmTMm * Millimeter;
        return toMm + " MicroMeters (uM)";
    }

    public double toMm() {
        return this.toMm;
    }

    private String getNm() {
        toNm = mmTnm * Millimeter;
        return toNm + " NanoMeters (nm)";
    }

    public double tonm() {
        return this.toNm;
    }

    private String getMi() {
        toMi = mmTmi * Millimeter;
        return toMi + " Miles (mi)";
    }

    public double toMi() {
        return this.toMi;
    }

    private String getYd() {
        toYd = mmTyd * Millimeter;
        return toYd + " Yards (yds)";
    }

    public double toYd() {
        return toYd;
    }

    private String getFt() {
        toFt = mmTft * Millimeter;
        return toFt + " feet (ft)";
    }

    public double toFt() {
        return this.toFt;
    }

    private String getIn() {
        toIn = mmTin * Millimeter;
        return toIn + " Inches (in)";
    }

    public double toIn() {
        return this.toIn;
    }

    private String getNauM() {
        toNauM = mmTnaum * Millimeter;
        return toNauM + " Nautical Miles (NauM)";
    }

    public double toNauM() {
        return toNauM;
    }

    public String toString() {
        String res = getmm() + " = " + getKm() + "\n";
        res += getmm() + " = " + getM() + "\n";
        res += getmm() + " = " + getCm() + "\n";
        res += getmm() + " = " + getmm() + "\n";
        res += getmm() + " = " + getMm() + "\n";
        res += getmm() + " = " + getNm() + "\n";
        res += getmm() + " = " + getMi() + "\n";
        res += getmm() + " = " + getYd() + "\n";
        res += getmm() + " = " + getFt() + "\n";
        res += getmm() + " = " + getIn() + "\n";
        res += getmm() + " = " + getNauM() + "\n";
        return res;
    }
}