package pl.edu.uwm.obiektowe.lab12;

import java.util.HashMap;
import java.util.TreeMap;

public class Students_2 {
    public HashMap<String ,String> students;

    public Students_2() {
        this.students = new HashMap<>();
    }

    public void dodajStudenta (String nazwisko, String ocena){
        this.students.put(nazwisko, ocena);
    }

    public void usunStudenta (String nazwisko){
        this.students.remove(nazwisko);
    }

    public void zmienOcene (String nazwisko, String ocena){
        this.students.replace(nazwisko, ocena);
    }

    public void wypiszListeStudentow(){
        TreeMap<String ,String> sorted = new TreeMap<>(this.students);
        for (String key : sorted.keySet()) {
            System.out.println(key + ": " + this.students.get(key));
        }
        System.out.println();
    }

}
