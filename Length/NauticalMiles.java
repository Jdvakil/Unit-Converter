package Length;
public class NauticalMiles
{
    private double Naum;

    private double naumTkm = 1.852;
    private double toKm;

    private double naumTm = 1852;
    private double toM;

    private double naumTcm = 185200;
    private double toCm;

    private double naumTmm = 1.852e+6 ;//millimeter
    private double tomm;

    private double naumTMM = 1.852e+9;
    private double toMM;

    private double naumTnm = 1.852e+12;
    private double toNm;

    private double naumTmi = 1.15078;
    private double toMi;

    private double naumTyd = 2025.3728007;
    private double toYd;

    private double naumTft = 2025.3728007;
    private double toFt;

    private double naumTin = 72913.420825199762476;
    private double toIn;

    private double naumTnaum =1;
    private double toNauM;
    public NauticalMiles(double naum){
        if(naum < 0 )throw new IllegalArgumentException("Nautical Miles cannot be less than 0.");
        this.Naum = naum;
    }

    public NauticalMiles(){this(0);}

    private String getKm(){
        toKm = Naum * naumTkm;
        return toKm + " KiloMeters (Km)";
    }

    public double toKm(){return toKm;}

    private String getM(){
        toM = naumTm * Naum;
        return toM + " Meters (m)";
    }

    public double toM(){return toM;}

    private String getCm(){
        toCm = naumTcm * Naum;
        return toCm + " CentiMeters (Cm)";
    }

    public double toCm(){return toCm;}

    private String getmm(){//millimeter
        tomm = naumTmm * Naum;
        return tomm + " MilliMeters (mm)";
    }

    public double tomm(){return tomm;}

    private String getMm(){//Naum
        toMM = naumTMM * Naum;
        return toMM + " Micrometers (uM)";
    }

    public double toMm(){return this.toMM;}

    private String getNm(){
        toNm = naumTnm * Naum;
        return toNm + " NanoMeters (nm)";
    }

    public double tonm(){return this.toNm;}

    private String getMi(){
        toMi =naumTmi * Naum;
        return toMi + " Miles (mi)";
    }

    public double toMi(){return this.toMi;}

    private String getYd(){
        toYd = naumTyd * Naum;
        return toYd + " Yards (yds)";
    }

    public double toYd(){return toYd;}

    private String getFt(){
        toFt = naumTft * Naum;
        return toFt + " feet (ft)";
    }

    public double toFt(){return this.toFt;}

    private String getIn(){
        toIn = naumTin * Naum;
        return toIn + " Inches (in)";
    }

    public double toIn(){return this.toIn;}

    private String getNauM(){
        toNauM = naumTnaum * Naum;
        return toNauM + " Nautical Miles (NauM)";
    }

    public double toNauM(){return toNauM;}

    public String toString(){
        String res = getNauM() + " = " + getKm() + "\n";
        res += getNauM() + " = " + getM() + "\n"; 
        res += getNauM()  + " = "+getCm() + "\n";
        res+= getNauM() + " = "+ getmm() + "\n";
        res+=getNauM()+ " = " + getMm() + "\n";
        res+=getNauM() + " = " + getNm() + "\n";
        res+=getNauM() + " = " + getMi() + "\n";
        res+=getNauM() + " = " + getYd() + "\n";
        res+=getNauM() + " = " + getFt() + "\n";
        res+=getNauM() + " = " + getIn() + "\n";
        res+=getNauM() + " = " + getNauM() + "\n";
        return res;
    }
}