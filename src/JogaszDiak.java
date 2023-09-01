public class JogaszDiak extends Diak {
    private String kedvencTargy;
    private String kollegiumNeve;
    private int jogLetszam;

    public JogaszDiak() {
    }

    public JogaszDiak(String nev, String cim, int elertPont, String osztaly, int maxPont, String kedvencTargy, String kollegiumNeve) {
        super(nev, cim, elertPont, osztaly, maxPont);
        this.setKedvencTargy(kedvencTargy);
        this.setKollegiumNeve(kollegiumNeve);
        osztalyoz(maxPont);

    }

    @Override
    public void kiir() {
        System.out.println(getNev() + ", " + getCim() + ", elért pont: " + getElertPont() + ", jegy: " + getJegy() +
                " - " + getErtekeles() + ", Kedvenc Tantárgy: " + getKedvencTargy() +
                ", Kollégium neve: " + getKollegiumNeve() + " | Osztály: " + getOsztaly());

    }

    public String getKedvencTargy() {
        return kedvencTargy;
    }

    public void setKedvencTargy(String kedvencTargy) {
        this.kedvencTargy = kedvencTargy;
    }

    public String getKollegiumNeve() {
        return kollegiumNeve;
    }

    public void setKollegiumNeve(String kollegiumNeve) {
        this.kollegiumNeve = kollegiumNeve;
    }

    public int getJogLetszam() {
        return jogLetszam;
    }

    public void setJogLetszam(int jogLetszam) {
        this.jogLetszam = jogLetszam;
    }
}
