package pl.edu.uwm.obiektowe.lab12;

public class Test_3 {
    public static void main(String[] args)
    {
        Students_3 lista_studentow = new Students_3();
        lista_studentow.dodajStudenta(new Student("Adam", "Malysz", 2001), "bdb");
        lista_studentow.dodajStudenta(new Student("Adam", "Malysz", 2002), "bdb");
        lista_studentow.dodajStudenta(new Student("Bartosz", "Wisniewski", 2003), "db+");
        lista_studentow.dodajStudenta(new Student("Nieuk", "Cymbal", 2004), "dst");
        lista_studentow.wypiszListeStudentow();
        lista_studentow.zmienOcene(2004, "ndst");
        lista_studentow.wypiszListeStudentow();
        lista_studentow.usunStudenta(2004);
        lista_studentow.wypiszListeStudentow();
    }

}
