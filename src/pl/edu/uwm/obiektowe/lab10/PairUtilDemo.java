package pl.edu.uwm.obiektowe.lab10;

public class PairUtilDemo {
    public static void main(String[] args){

        Pair<String, Integer> pair1 = new Pair<>("Marian", 35);

        System.out.println(pair1);

        Pair pair2 = PairUtil.swap(pair1);

        System.out.println(pair2);
    }
}
