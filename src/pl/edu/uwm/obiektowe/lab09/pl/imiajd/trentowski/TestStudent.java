package pl.edu.uwm.obiektowe.lab09.pl.imiajd.trentowski;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class TestStudent {
    public static void main(String[] args)
    {
        ArrayList<Student> grupa = new ArrayList<Student>();
        Student pierwsza = new Student("Trentowski", LocalDate.of(2001,2,3), 5.0d);
        Student druga = new Student("Pierwszy", LocalDate.of(2001,2,3), 4.0d);
        Student trzecia = new Student("Pierwszy", LocalDate.of(2001,2,3), 4.1d);
        Student czwarta = new Student("Czwarty", LocalDate.of(2001,2,3), 4.2d);
        Student piata = new Student("Piaty", LocalDate.of(2001,6,9), 4.3d);

        grupa.add(pierwsza);
        grupa.add(druga);
        grupa.add(trzecia);
        grupa.add(czwarta);
        grupa.add(piata);

        System.out.println("\nBefore sort:");
        for(Student o: grupa){
            System.out.println(o);
        }

        grupa.sort(Comparator.naturalOrder());
        System.out.println("\nAfter sort:");
        for(Student o: grupa){
            System.out.println(o);
        }
    }
}
