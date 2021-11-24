package pl.edu.uwm.obiektowe.lab07.pl.imiajd.trentowski;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania ;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy, int numer_mieszkania) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_mieszkania = numer_mieszkania;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        String print = "";
        print = print + "Kod pocztowy: " + kod_pocztowy + ", miasto: " + miasto
                + "\nUlica: " + ulica + ", numer domu: " + numer_domu;
        if (numer_mieszkania != 0) print = print + ", numer mieszkania: " + numer_mieszkania;
        System.out.println(print + "\n");
    }

    public boolean przed(Adres compareTo){
        String thisKodpocztowy = this.kod_pocztowy.substring(0, 2) + this.kod_pocztowy.substring(3, 6);
        String compareKodpocztowy = compareTo.kod_pocztowy.substring(0, 2) + compareTo.kod_pocztowy.substring(3, 6);
        int thisKodPocztowyInt = Integer.parseInt(thisKodpocztowy);
        int compareKodPocztowyInt = Integer.parseInt(compareKodpocztowy);
        return thisKodPocztowyInt < compareKodPocztowyInt;
    }
}
