package Length;
public class Yards{
    private final double Yard;

    private final double ydTkm = 0.00091440029260800000446;
    private double toKm;

    private final double ydTm = 0.914400292608;
    private double toM;

    private final double ydTcm =91.4400292608;
    private double toCm;

    private final double ydTmm = 914.400292608;//Yard
    private double tomm;

    private final double ydTMM = 914400.292608;
    private double toMM;

    private final double ydTnm = 9.144e+8;
    private double toNm;

    private final double ydTmi = 0.000568182;
    private double toMi;

    private final double ydTyd = 1;
    private double toYd;

    private final double ydTft = 3;
    private double toFt;

    private final double ydTin = 36;
    private double toIn;

    private final double ydTnaum = 0.000493737;
    private double toNauM;
    public Yards(final double yd){
        if(yd < 0 )throw new IllegalArgumentException("Yards cannot be less than 0.");
        this.Yard = yd;
    }

    public Yards(){this(0);}
    
        private String getKm(){
        toKm = Yard * ydTkm;
        return toKm + " KiloMeters (Km)";
    }

    public double toKm(){return toKm;}

    private String getM(){
        toM =ydTm * Yard;
        return toM + " Meters (m)";
    }

    public double toM(){return toM;}

    private String getCm(){
        toCm = ydTcm * Yard;
        return toCm + " CentiMeters (Cm)";
    }

    public double toCm(){return toCm;}

    private String getmm(){//Yard
        tomm = ydTmm * Yard;
        return tomm + " Millimeters (mm)";
    }

    public double tomm(){return tomm;}

    private String getMm(){//micrometer
        toMM = ydTMM * Yard;
        return toMM + " MicroMeters (uM)";
    }

    public double toMm(){return this.toMM;}

    private String getNm(){
        toNm = ydTnm * Yard;
        return toNm + " NanoMeters (nm)";
    }

    public double tonm(){return this.toNm;}

    private String getMi(){
        toMi =ydTmi * Yard;
        return toMi + " Miles (mi)";
    }

    public double toMi(){return this.toMi;}

    private String getYd(){
        toYd = ydTyd * Yard;
        return toYd + " Yards (yds)";
    }

    public double toYd(){return toYd;}

    private String getFt(){
        toFt = ydTft * Yard;
        return toFt + " feet (ft)";
    }

    public double toFt(){return this.toFt;}

    private String getIn(){
        toIn = ydTin * Yard;
        return toIn + " Inches (in)";
    }

    public double toIn(){return this.toIn;}

    private String getNauM(){
        toNauM = ydTnaum * Yard;
        return toNauM + " Nautical Miles (NauM)";
    }

    public double toNauM(){return toNauM;}

    public String toString(){
        String res = getYd() + " = " + getKm() + "\n";
        res += getYd() + " = " + getM() + "\n"; 
        res += getYd() + " = "+getCm() + "\n";
        res+= getYd()+ " = "+ getmm() + "\n";
        res+=getYd() + " = " + getMm() + "\n";
        res+=getYd() + " = " + getNm() + "\n";
        res+=getYd() + " = " + getMi() + "\n";
        res+=getYd() + " = " + getYd() + "\n";
        res+=getYd() + " = " + getFt() + "\n";
        res+=getYd() + " = " + getIn() + "\n";
        res+=getYd() + " = " + getNauM() + "\n";
        return res;
    }
}

