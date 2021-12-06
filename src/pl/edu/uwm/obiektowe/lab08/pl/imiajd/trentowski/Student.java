package pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski;

import pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski.Osoba;

import java.time.LocalDate;

public class Student extends Osoba
{
    public Student(String nazwisko, String[] imiona, boolean plec, LocalDate dataUrodzenia, String kierunek, double sredniaOcen)
    {
        super(nazwisko, imiona, plec, dataUrodzenia);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    private String kierunek;
    private double sredniaOcen;
}
