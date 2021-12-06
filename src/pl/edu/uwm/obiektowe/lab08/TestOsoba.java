package pl.edu.uwm.obiektowe.lab08;

import pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski.*;


import java.time.LocalDate;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];


        ludzie[0] = new Pracownik("Pracowniczy", new String[]{"Jan", "Pawel"}, false, LocalDate.of(1990,4,3), 6000.0, LocalDate.of(2015, 5, 25));
        ludzie[1] = new Student("Studenciak", new String[]{"Stas", "Grzes"}, true, LocalDate.of(2001,2,3), "Informatyka", 4.79);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}






