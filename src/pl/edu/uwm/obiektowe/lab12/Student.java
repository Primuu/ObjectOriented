package pl.edu.uwm.obiektowe.lab12;

public class Student implements Comparable {
    private String imie;
    private String nazwisko;
    private int id;

    public Student(String imie, String nazwisko, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getId() {
        return id;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + id;
    }


    @Override
    public int compareTo(Object o) {
        Student otherStudent = (Student) o;
        int result = this.nazwisko.compareTo(otherStudent.getNazwisko());
        if(result == 0)
        {
            result = this.imie.compareTo(otherStudent.getImie());
            if(result == 0)
            {
                result = Integer.compare(this.id, otherStudent.getId());
            }
        }
        return result;
    }
}
