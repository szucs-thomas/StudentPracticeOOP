import java.util.Scanner;

public class Main {
    public static int beker(String szoveg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(szoveg);
        return sc.nextInt();
    }

    public static String szovegbBeker(String szoveg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(szoveg);
        return sc.nextLine();
    }
    public static double atlag (Diak[] tomb) {
        int osszeg = 0;
        for (Diak d : tomb) {
            osszeg+= d.getJegy();
        }
        return (double) osszeg/ tomb.length;
    }
    public static void atlagnalJobb(Diak[] tomb) {
        double atlag = atlag(tomb);
        for (Diak d : tomb) {
            if (d.getJegy()>atlag) {
                d.kiir();
            }
        }
    }

    public static void main(String[] args) {
        int osszLetszam = beker("Kérem adja meg az össz létszámot: ");
        int infoLetszam = beker("Kérem adja meg az Informatikai osztály létszámát: ");
        int jogLetszam = beker("Kérem adja meg a Jog osztály létszámát: ");
        int fizLetszam = beker("Kérem adja meg a Fizika osztály létszámát: ");
        int maxPont = beker("Kérem adja meg a max pontszámot: ");

        Diak[] diakok = new Diak[osszLetszam];

        int flag = 0;

        System.out.println("Informatika Osztály: ");
        for (int i = 0; i < infoLetszam; i++) {
            String nev = szovegbBeker("Kérem adja meg a(z) " + (flag + 1) + ". diák nevét: ");
            String cim = szovegbBeker("Kérem adja meg a " + nev + " diák címét: ");
            int elertPont = beker("Kérem a " + nev + " Elért pontját: ");
            String osztaly = szovegbBeker("Kérem adja meg a " + nev + " diák osztályát: ");
            String kedvencNyelv = szovegbBeker("Kérem adja meg kedvenc program nyelvét: ");
            int tanultProgEv = beker("Kérem adja meg hány évig programozott: ");

            diakok[flag] = new InformatikusDiak(nev, cim, elertPont, osztaly, maxPont, kedvencNyelv, tanultProgEv);
            flag++;
        }

        System.out.println("Jogi Osztály: ");
        for (int i = 0; i < jogLetszam; i++) {
            String nev = szovegbBeker("Kérem adja meg a(z) " + (flag + 1) + ". diák nevét: ");
            String cim = szovegbBeker("Kérem adja meg a " + nev + " diák címét: ");
            int elertPont = beker("Kérem a " + nev + " Elért pontját: ");
            String osztaly = szovegbBeker("Kérem adja meg a " + nev + " diák osztályát: ");
            String kedvencTargy = szovegbBeker("Kérem adja meg a kedvenc tantárgyát: ");
            String kollegiumNeve = szovegbBeker("Kérem adja meg a kollégiuma nevét: ");

            diakok[flag] = new JogaszDiak(nev, cim, elertPont, osztaly, maxPont, kedvencTargy, kollegiumNeve);
            flag++;
        }

        System.out.println("Fizika Osztály: ");
        for (int i = 0; i < fizLetszam; i++) {
            String nev = szovegbBeker("Kérem adja meg a(z) " + (flag + 1) + ". diák nevét: ");
            String cim = szovegbBeker("Kérem adja meg a " + nev + " diák címét: ");
            int elertPont = beker("Kérem a " + nev + " Elért pontját: ");
            String osztaly = szovegbBeker("Kérem adja meg a " + nev + " diák osztályát: ");
            String kedvencFizikus = szovegbBeker("Kérem adja meg kedvenc Fizikusát: ");
            int kiserletekSzama = beker("Kérem adja meg kísérleteinek számát: ");

            diakok[flag] = new FizikaDiak(nev, cim, elertPont, osztaly, maxPont, kedvencFizikus, kiserletekSzama);
            flag++;

        }
        System.out.println();
        System.out.println("A diákok eredményei: ");
        for (Diak diak : diakok) {
            diak.kiir();
        }
        System.out.print("Az osztály átlaga: "+atlag(diakok));
        System.out.println();
        System.out.println("Az átlagnál jobb diákok: ");
        atlagnalJobb(diakok);


    }
}
