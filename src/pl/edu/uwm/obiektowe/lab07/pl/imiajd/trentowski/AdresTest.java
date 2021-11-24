package pl.edu.uwm.obiektowe.lab07.pl.imiajd.trentowski;

public class AdresTest {
    public static void main(String[] args) {

        Osoba adam = new Osoba("Taki", 2000);
        System.out.println(adam.toString());

        Student student = new Student("Ooo", 1998, "ISI");
        Nauczyciel nauczyciel = new Nauczyciel("Bbb", 1976, 7000.99);
        System.out.println(student.toString());
        System.out.println(nauczyciel.toString());
        System.out.println(adam.getNazwisko());
        System.out.println(adam.getRokUrodzenia());
        System.out.println(student.getNazwisko());
        System.out.println(student.getKierunek());
        System.out.println(nauczyciel.getPensja());
    }
}
