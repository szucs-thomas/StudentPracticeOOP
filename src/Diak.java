public class Diak {
    private String nev;
    private String cim;
    private int jegy;
    private int elertPont;
    private String osztaly;
    private int letszam;

    public Diak() {
    }

    public Diak(String nev, String cim, int elertPont, String osztaly, int maxPont) {
        this.nev = nev;
        this.cim = cim;
        this.elertPont = elertPont;
        this.osztaly = osztaly;
        osztalyoz(maxPont);
    }

    public void kiir() {
        System.out.println(nev+", "+cim+", elért pont: "+elertPont+", jegy: "+jegy+" - "+getErtekeles()+" | Osztály: "+ osztaly);
    }
    public void osztalyoz(int maxPont) {
        double szazalek = elertPont/ (double) maxPont *100;
        jegy =5;

        if (szazalek < 20 ) {
            jegy = 1;
        } else if (szazalek < 40) {
            jegy = 2;
        }else if (szazalek < 60) {
            jegy = 3;
        }else if (szazalek < 80) {
            jegy = 4;
        }
    }
    public String getErtekeles(){
        return switch (jegy) {
            case 1 -> "Elégtelen";
            case 2 -> "Elégséges";
            case 3 -> "Közepes";
            case 4 -> "Jó";
            case 5 -> "Jeles";
            default -> "Hibas jegy";
        };
    }
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getJegy() {
        return jegy;
    }

    public int getElertPont() {
        return elertPont;
    }

    public void setElertPont(int elertPont) {
        this.elertPont = elertPont;
    }

    public String getOsztaly() {
        return osztaly;
    }

    public void setOsztaly(String osztaly) {
        this.osztaly = osztaly;
    }


    public int getLetszam() {
        return letszam;
    }

    public void setLetszam(int letszam) {
        this.letszam = letszam;
    }
}
