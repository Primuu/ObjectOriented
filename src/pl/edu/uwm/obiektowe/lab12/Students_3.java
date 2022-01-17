package pl.edu.uwm.obiektowe.lab12;

import java.util.HashMap;
import java.util.TreeMap;

public class Students_3 {
    public HashMap<Integer ,Student> indeks_student;
    public HashMap<Student ,String> student_ocena;

    public Students_3() {
        this.indeks_student = new HashMap<>();
        this.student_ocena = new HashMap<>();
    }

    public void dodajStudenta (Student student, String ocena){
        this.indeks_student.put(student.getId(), student);
        this.student_ocena.put(student, ocena);
    }

    private Student studentByIndeks(Integer id)
    {
        return this.indeks_student.get(id);
    }

    public void usunStudenta (Integer id){
        this.student_ocena.remove(studentByIndeks(id));
        this.indeks_student.remove(id);
    }

    public void zmienOcene (Integer id, String ocena){
        this.student_ocena.replace(studentByIndeks(id), ocena);
    }

    public void wypiszListeStudentow(){
        TreeMap<Student ,String> sorted = new TreeMap<>(this.student_ocena);
        for (Student s : sorted.keySet()) {
            System.out.println(s + ": " + this.student_ocena.get(s));
        }
        System.out.println();
    }
}
