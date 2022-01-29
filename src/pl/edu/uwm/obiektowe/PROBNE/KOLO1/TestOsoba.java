package pl.edu.uwm.obiektowe.PROBNE.KOLO1;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> ludzie = new ArrayList<Osoba>();

        Osoba adam = new Osoba("Adam", "Trentowski", 2001, 2, 3);
        Osoba bartek = new Osoba("Bartek", "Xski", 2002, 3, 5);
        Osoba kamil = new Osoba("Kamil", "Owski", 2011, 11, 14);
        Osoba robert = new Osoba("Robert", "Downey Jr.", 1980, 1, 1);
        Osoba bjron = new Osoba("Bjorn", "Dow.", 2200, 1, 1);
        Osoba lui = new Osoba("Lui", "Vitonn", 1988, 6, 13);

        //zamiana na "pracowników"

        ludzie.add(adam);
        ludzie.add(bartek);
        ludzie.add(kamil);
        ludzie.add(robert);
        ludzie.add(bjron);
        ludzie.add(lui);

        for (Osoba e : ludzie) {
            System.out.println(e.toString());
        }
        System.out.println();

    }
}
