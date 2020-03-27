package Length;

public class Micrometers {
    private double Micrometer;

    private double mmTkm = 1e-9;
    private double toKm;

    private double mmTm = 1e-6;
    private double toM;

    private double mmTcm = 1e-4;
    private double toCm;

    private double mmTmm = 0.001;
    private double toMm;

    private double mmTMm = 1.0;
    private double tomm;

    private double mmTnm = 1000;
    private double toNm;

    private double mmTmi = 6.2137e-10;
    private double toMi;

    private double mmTyd = 1.093611199694e-6;
    private double toYd;

    private double mmTft = 3.280833599081999999e-6;
    private double toFt;

    private double mmTin = 3.937000318898399999e-5;
    private double toIn;

    private double mmTnaum = 5.399557672787222376e-10;
    private double toNauM;

    public Micrometers(double Mme) throws LengthException {
        if (Mme >= 0) {
            this.Micrometer = Mme;
        } else {
            throw new LengthException("Micrometers cannot be less than 0");
        }
    }

    public Micrometers() throws LengthException {
        this(0);
    }

    private String getKm() {
        toKm = Micrometer * mmTkm;
        return toKm + " KiloMeters (Km)";
    }

    public double toKm() {
        return toKm;
    }

    private String getM() {
        toM = mmTm * Micrometer;
        return toM + " Meters (m)";
    }

    public double toM() {
        return toM;
    }

    private String getCm() {
        toCm = mmTcm * Micrometer;
        return toCm + " CentiMeters (Cm)";
    }

    public double toCm() {
        return toCm;
    }

    private String getmm() {// millimeter
        tomm = mmTmm * Micrometer;
        return tomm + " MilliMeters (mm)";
    }

    public double tomm() {
        return tomm;
    }

    private String getMm() {// micrometer
        toMm = mmTMm * Micrometer;
        return toMm + " MicroMeters (uM)";
    }

    public double toMm() {
        return this.toMm;
    }

    private String getNm() {
        toNm = mmTnm * Micrometer;
        return toNm + " NanoMeters (nm)";
    }

    public double tonm() {
        return this.toNm;
    }

    private String getMi() {
        toMi = mmTmi * Micrometer;
        return toMi + " Miles (mi)";
    }

    public double toMi() {
        return this.toMi;
    }

    private String getYd() {
        toYd = mmTyd * Micrometer;
        return toYd + " Yards (yds)";
    }

    public double toYd() {
        return toYd;
    }

    private String getFt() {
        toFt = mmTft * Micrometer;
        return toFt + " feet (ft)";
    }

    public double toFt() {
        return this.toFt;
    }

    private String getIn() {
        toIn = mmTin * Micrometer;
        return toIn + " Inches (in)";
    }

    public double toIn() {
        return this.toIn;
    }

    private String getNauM() {
        toNauM = mmTnaum * Micrometer;
        return toNauM + " Nautical Miles (NauM)";
    }

    public double toNauM() {
        return toNauM;
    }

    public String toString() {
        String res = getMm() + " = " + getKm() + "\n";
        res += getMm() + " = " + getM() + "\n";
        res += getMm() + " = " + getCm() + "\n";
        res += getMm() + " = " + getmm() + "\n";
        res += getMm() + " = " + getMm() + "\n";
        res += getMm() + " = " + getNm() + "\n";
        res += getMm() + " = " + getMi() + "\n";
        res += getMm() + " = " + getYd() + "\n";
        res += getMm() + " = " + getFt() + "\n";
        res += getMm() + " = " + getIn() + "\n";
        res += getMm() + " = " + getNauM() + "\n";
        return res;
    }
}