package Length;

public class Nanometers {
    private double Nanometer;

    private double nmTkm = 1e-12;
    private double toKm;

    private double nmTm = 1e-9;
    private double toM;

    private double nmTcm = 1e-7;
    private double toCm;

    private double nmTMm = 1e-6;
    private double toMm;

    private double nmTmm = 0.001;
    private double tomm;

    private double nmTnm = 1;
    private double toNm;

    private double nmTmi = 6.2137e-13;
    private double toMi;

    private double nmTyd = 1.093611199694e-9;
    private double toYd;

    private double nmTft = 3.280833599081999999e-9;
    private double toFt;

    private double nmTin = 3.937000318898399999e-8;
    private double toIn;

    private double nmTnaum = 5.399557672787222376e-13;
    private double toNauM;

    public Nanometers(double nm) throws LengthException {
        if (nm >= 0) {
            this.Nanometer = nm;
        } else {
            throw new LengthException("Nanometers cannot be less than 0");
        }
    }

    public Nanometers() throws LengthException {
        this(0);
    }

    private String getKm() {
        toKm = Nanometer * nmTkm;
        return toKm + " KiloMeters (Km)";
    }

    public double toKm() {
        return toKm;
    }

    private String getM() {
        toM = nmTm * Nanometer;
        return toM + " Meters (m)";
    }

    public double toM() {
        return toM;
    }

    private String getCm() {
        toCm = nmTcm * Nanometer;
        return toCm + " CentiMeters (Cm)";
    }

    public double toCm() {
        return toCm;
    }

    private String getmm() {// millimeter
        tomm = nmTmm * Nanometer;
        return tomm + " MilliMeters (mm)";
    }

    public double tomm() {
        return tomm;
    }

    private String getMm() {// Nanometer
        toMm = nmTMm * Nanometer;
        return toMm + " Micrometers (uM)";
    }

    public double toMm() {
        return this.toMm;
    }

    private String getNm() {
        toNm = nmTnm * Nanometer;
        return toNm + " NanoMeters (nm)";
    }

    public double tonm() {
        return this.toNm;
    }

    private String getMi() {
        toMi = nmTmi * Nanometer;
        return toMi + " Miles (mi)";
    }

    public double toMi() {
        return this.toMi;
    }

    private String getYd() {
        toYd = nmTyd * Nanometer;
        return toYd + " Yards (yds)";
    }

    public double toYd() {
        return toYd;
    }

    private String getFt() {
        toFt = nmTft * Nanometer;
        return toFt + " feet (ft)";
    }

    public double toFt() {
        return this.toFt;
    }

    private String getIn() {
        toIn = nmTin * Nanometer;
        return toIn + " Inches (in)";
    }

    public double toIn() {
        return this.toIn;
    }

    private String getNauM() {
        toNauM = nmTnaum * Nanometer;
        return toNauM + " Nautical Miles (NauM)";
    }

    public double toNauM() {
        return toNauM;
    }

    public String toString() {
        String res = getNm() + " = " + getKm() + "\n";
        res += getNm() + " = " + getM() + "\n";
        res += getNm() + " = " + getCm() + "\n";
        res += getNm() + " = " + getmm() + "\n";
        res += getNm() + " = " + getMm() + "\n";
        res += getNm() + " = " + getNm() + "\n";
        res += getNm() + " = " + getMi() + "\n";
        res += getNm() + " = " + getYd() + "\n";
        res += getNm() + " = " + getFt() + "\n";
        res += getNm() + " = " + getIn() + "\n";
        res += getNm() + " = " + getNauM() + "\n";
        return res;
    }
}