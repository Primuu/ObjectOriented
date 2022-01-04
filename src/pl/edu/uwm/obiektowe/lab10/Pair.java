package pl.edu.uwm.obiektowe.lab10;

public class Pair<T, V> {

    T ob1;
    V ob2;

    public Pair(T t, V v){
        this.ob1 = t;
        this.ob2 = v;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "ob1=" + ob1.getClass().getName() +
                ", ob2=" + ob2.getClass().getName() +
                '}';
    }

    public void swap() {
        T temp = this.ob1;
        this.ob1 = (T) this.ob2;
        this.ob2 = (V) temp;
    }
}
