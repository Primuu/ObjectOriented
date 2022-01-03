package pl.edu.uwm.obiektowe.lab09.pl.imiajd.trentowski;

import java.time.LocalDate;

public class Osoba implements Comparable, Cloneable {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + getNazwisko() + ", " + getDataUrodzenia() + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Osoba other = (Osoba) otherObject;
        return this.getNazwisko().equals(other.getNazwisko())
                && this.getDataUrodzenia().equals(other.getDataUrodzenia());
    }

    @Override
    public int compareTo(Object otherObject) {
        Osoba osoba = (Osoba) otherObject;
        int result = String.CASE_INSENSITIVE_ORDER.compare(this.getNazwisko(), osoba.getNazwisko());
        if(result == 0){
            result = this.getDataUrodzenia().compareTo(osoba.getDataUrodzenia());
        }
        return result;
    }

    @Override
    public Osoba clone() {
        try {
            return (Osoba) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
