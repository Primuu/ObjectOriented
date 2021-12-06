package pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski;

import java.time.LocalDate;

public abstract class Osoba
{
    public Osoba(String nazwisko, String[] imiona, boolean plec, LocalDate dataUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.plec = plec;
        //this.dataUrodzenia = LocalDate.of(year, month, day);
        this.dataUrodzenia = dataUrodzenia;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean isPlec() {
        return plec;
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}
