package pl.edu.uwm.obiektowe.lab09.pl.imiajd.trentowski;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class TestOsoba {
    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        Osoba pierwsza = new Osoba("Trentowski", LocalDate.of(2001,2,3));
        Osoba druga = new Osoba("Pierwszy", LocalDate.of(2001,2,3));
        Osoba trzecia = new Osoba("Pierwszy", LocalDate.of(2001,2,4));
        Osoba czwarta = new Osoba("Czwarty", LocalDate.of(2001,2,3));
        Osoba piata = new Osoba("Piaty", LocalDate.of(2001,6,9));

        grupa.add(pierwsza);
        grupa.add(druga);
        grupa.add(trzecia);
        grupa.add(czwarta);
        grupa.add(piata);


        System.out.println("\nBefore sort:");
        for(Osoba o: grupa){
            System.out.println(o);
        }

        grupa.sort(Comparator.naturalOrder());
        System.out.println("\nAfter sort:");
        for(Osoba o: grupa){
            System.out.println(o);
        }
    }


}
