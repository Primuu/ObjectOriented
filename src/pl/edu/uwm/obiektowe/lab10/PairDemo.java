package pl.edu.uwm.obiektowe.lab10;

public class PairDemo {
    public static void main(String[] args){

        Pair<String, Integer> pair1 = new Pair<>("Marian", 35);

        System.out.println(pair1);

        pair1.swap();

        System.out.println(pair1);
    }
}
