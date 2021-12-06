package pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski;

import pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski.Osoba;

import java.time.LocalDate;

public class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, String[] imiona, boolean plec, LocalDate dataUrodzenia, double pobory, LocalDate dataZatrudnienia)
    {
        super(nazwisko, imiona, plec, dataUrodzenia);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}
