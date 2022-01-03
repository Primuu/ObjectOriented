package pl.edu.uwm.obiektowe.lab09.pl.imiajd.trentowski;

import java.time.LocalDate;

public class Student extends Osoba implements Comparable, Cloneable{

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    @Override
    public String toString(){
        return super.toString() + ", srednia ocen: " + getSredniaOcen();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Osoba other = (Osoba) otherObject;
        return this.getNazwisko().equals(other.getNazwisko())
                && this.getDataUrodzenia().equals(other.getDataUrodzenia())
                && this.getSredniaOcen() == ((Student) otherObject).getSredniaOcen();
    }


    @Override
    public int compareTo(Object otherObject) {
        Student student = (Student) otherObject;
        int result = String.CASE_INSENSITIVE_ORDER.compare(this.getNazwisko(), student.getNazwisko());
        if(result == 0){
            result = this.getDataUrodzenia().compareTo(student.getDataUrodzenia());
        }
            if(result == 0){
                result = Double.compare(this.getSredniaOcen(), student.getSredniaOcen());
            }
        return result;
    }

    @Override
    public Osoba clone() {
        return (Student) super.clone();
    }
}
