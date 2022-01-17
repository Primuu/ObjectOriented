package pl.edu.uwm.obiektowe.lab12;

public class Test_2 {
    public static void main(String[] args) throws Exception {
        Students_2 students = new Students_2();
        students.dodajStudenta("Joe", "db");
        students.dodajStudenta("Carl", "db+");
        students.dodajStudenta("Susan", "bdb");
        students.dodajStudenta("Takidousuniecia", "dst");
        students.wypiszListeStudentow();

        students.usunStudenta("Takidousuniecia");
        students.wypiszListeStudentow();
    }
}
