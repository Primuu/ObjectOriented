package pl.edu.uwm.obiektowe.lab07.pl.imiajd.trentowski;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Nazwisko: " + nazwisko + ", rok urodzenia: " + rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }
}

class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return super.toString() + ", kierunek: " + kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }
}

class Nauczyciel extends Osoba {
    private double pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return super.toString() + ", pensja: " + pensja;
    }

    public double getPensja() {
        return pensja;
    }
}