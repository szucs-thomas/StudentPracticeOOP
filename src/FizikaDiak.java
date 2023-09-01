public class FizikaDiak extends Diak {
    private String kedvencFizikus;
    private int kiserletekSzama;
    private int fizLetszam;

    public FizikaDiak() {
    }

    public FizikaDiak(String nev, String cim, int elertPont, String osztaly, int maxPont, String kedvencFizikus, int kiserletekSzama) {
        super(nev, cim, elertPont, osztaly, maxPont);
        this.setKedvencFizikus(kedvencFizikus);
        this.setKiserletekSzama(kiserletekSzama);
        osztalyoz(maxPont);
    }

    @Override
    public void kiir() {
        System.out.println(getNev() + ", " + getCim() + ", elért pont: " + getElertPont() + ", jegy: " + getJegy() +
                " - " + getErtekeles() + ", Kedvenc Fizikus: " + getKedvencFizikus() +
                ", Kísérletek Száma: " + getKiserletekSzama() + " | Osztály: " + getOsztaly());
    }

    public String getKedvencFizikus() {
        return kedvencFizikus;
    }

    public void setKedvencFizikus(String kedvencFizikus) {
        this.kedvencFizikus = kedvencFizikus;
    }

    public int getKiserletekSzama() {
        return kiserletekSzama;
    }

    public void setKiserletekSzama(int kiserletekSzama) {
        this.kiserletekSzama = kiserletekSzama;
    }

    public int getFizLetszam() {
        return fizLetszam;
    }

    public void setFizLetszam(int fizLetszam) {
        this.fizLetszam = fizLetszam;
    }
}
