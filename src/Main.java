public class Main {
    public static void main(String[] args) {
        Diak[] diakok = new Diak[9];
        int osszLetszam = 0;

        diakok[0]=new Diak("Szucs Tamas","Szolnok, Lovas Istvan utca 3",89,"8.A",100);
        diakok[1]=new Diak("Szucs Tibor","Szolnok, Bercsenyi ut 32",68,"7.B",100);
        diakok[2]=new Diak("Kovacs Peter","Budapest,Robert Karoly krt. 56",36,"11.T",100);
        diakok[3]= new InformatikusDiak("Nagy Imre","Budapest, Varkonyi ter 6.",56,"9.B",100,"C#",4);
        diakok[4] = new InformatikusDiak("Karoly Bela","Veszprem, Kolzsvari 89",83,"10.C",100,"Java",5);
        diakok[5]= new JogaszDiak("Herczeg Andras","Bekescsaba, Martirok utja 34",50,"7.A",100,"Romai Jog","Werboczi kollegium");
        diakok[6] = new JogaszDiak("Nagy Karoly","Sopron, Petofi setany 6.",19,"12.T",100,"Filozofia","Seprenczi kollegium");
        diakok[7]= new FizikaDiak("Kis Armand","Debrecen, Petofi setany 38.",69,"13.A",100,"Stephen Hawking",13);
        diakok[8]= new FizikaDiak("Cserepes Klara","Gyula, Kastely krt. 48.",78,"6.B",100,"Teller Ede",23);

        for (Diak diak : diakok) {
            diak.kiir();
        }

    }
}