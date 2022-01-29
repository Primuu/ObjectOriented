package pl.edu.uwm.obiektowe.s162602.kolo1;

import java.sql.SQLOutput;

public class FakturaTest {
    public static void main(String[] args) {
        Faktura styczniowa = new Faktura("12345678",40,2021,1,3);
        Faktura grudniowa = new Faktura("33345679",10,2020,12,18);
//        System.out.println(styczniowa.wyswietlTerminPlatnosci());
//        System.out.println(styczniowa.toString());

        Pozycja pierwsza = new Pozycja("coś pierwszego", 1.50,0.23f, 10f);
        Pozycja druga = new Pozycja("coś drugiego", 10.00,0.23f, 10f);
        Pozycja trzecia = new Pozycja("coś trzeciego", 1,0.23f, 10f);
        Pozycja czwarta = new Pozycja("coś czwartego", 1,0.23f, 10f);
        Pozycja piata = new Pozycja("coś piątego", 1,0.23f, 10f);

        styczniowa.dodajPozycje(pierwsza);
        styczniowa.dodajPozycje(druga);
        styczniowa.dodajPozycje(trzecia);

        grudniowa.dodajPozycje(czwarta);
        grudniowa.dodajPozycje(piata);

        styczniowa.wypiszFakture();
        grudniowa.wypiszFakture();

        styczniowa.usunPozycje(1);

        styczniowa.wypiszFakture();

        styczniowa.usunPozycje(trzecia);

        styczniowa.wypiszFakture();

    }
}
