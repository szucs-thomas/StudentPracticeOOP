public class InformatikusDiak extends Diak {
    private String kedvencNyelv;
    private int tanultProgEv;
    private int InfLetszam;

    public InformatikusDiak() {
    }

    public InformatikusDiak(String nev, String cim, int elertPont, String osztaly, int maxPont, String kedvencNyelv, int tanultProgEv) {
        super(nev, cim, elertPont, osztaly, maxPont);
        this.kedvencNyelv = kedvencNyelv;
        this.tanultProgEv = tanultProgEv;
        osztalyoz(maxPont);
    }

    @Override
    public void kiir() {
        System.out.println(getNev() + ", " + getCim() + ", elért pont: " + getElertPont() + ", jegy: " + getJegy() + " - " + getErtekeles() +
                ", Kedvenc tanult programozasi nyelve: " + getKedvencNyelv() + ", Tanult Év: " + getTanultProgEv() +
                " | Osztály: " + getOsztaly());
    }

    public String getKedvencNyelv() {
        return kedvencNyelv;
    }

    public void setKedvencNyelv(String kedvencNyelv) {
        this.kedvencNyelv = kedvencNyelv;
    }

    public int getTanultProgEv() {
        return tanultProgEv;
    }

    public void setTanultProgEv(int tanultProgEv) {
        this.tanultProgEv = tanultProgEv;
    }

    public int getInfLetszam() {
        return InfLetszam;
    }

    public void setInfLetszam(int infLetszam) {
        InfLetszam = infLetszam;
    }
}
