package pl.edu.uwm.obiektowe.PROBNE.KOLO1;

import java.time.LocalDate;
import java.time.Period;
//import java.util.Date;
//import java.util.GregorianCalendar;


public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

    public Osoba(String imie, String nazwisko, int year, int month, int day) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        this.dataUrodzenia = LocalDate.of(year, month, day);
        obliczenieWieku();

//        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
//        this.dataUrodzenia = calendar.getTime();
    }

    private void obliczenieWieku(){
        if (this.dataUrodzenia.compareTo(LocalDate.now()) >= 0)this.wiek = 0;
        else this.wiek = Period.between(this.dataUrodzenia, LocalDate.now()).getYears();
    }

    @Override
    public String toString(){
        return "Osoba " + imie + " " + nazwisko + " urodzona " + dataUrodzenia +  ",wiek " + wiek + ".";
    }

// GETTERY ---------------------------------------------------------------------------------------------

    public LocalDate getDataUrodzenia() {
        LocalDate dataUrodzeniaClone = this.dataUrodzenia;
        return dataUrodzeniaClone;
    }

    public String getImie() {
        String imieClone = this.imie;
        return imieClone;
    }

    public String getNazwisko() {
        String nazwiskoClone = this.nazwisko;
        return nazwiskoClone;
    }

    public int getWiek() {
        int wiekClone = Period.between(this.dataUrodzenia, LocalDate.now()).getYears();
        return wiekClone;
    }

// SETTERY ---------------------------------------------------------------------------------------------

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

//    public void setDataUrodzenia(LocalDate dataUrodzenia) {
//        this.dataUrodzenia = dataUrodzenia;
//    }


    public void setDataUrodzenia(int year, int month, int day) {
        this.dataUrodzenia = LocalDate.of(year, month, day);
    }

    public void setWiek() {
        obliczenieWieku();
    }
}

class Pracownik extends Osoba {
    String stanowisko;
    double pensja;

    public Pracownik(String imie, String nazwisko, int year, int month, int day) {
        super(imie, nazwisko, year, month, day);
    }

//    public Pracownik(Osoba osoba, String stanowisko, double pensja) {
//
//        this.stanowisko = stanowisko;
//        this.pensja = pensja;
//    }


}

