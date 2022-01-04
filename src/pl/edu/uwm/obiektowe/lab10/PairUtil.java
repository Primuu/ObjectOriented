package pl.edu.uwm.obiektowe.lab10;

public class PairUtil{

    public static Pair swap(Pair pair){
        Pair returnedPair = new Pair(pair.ob1, pair.ob2);
        returnedPair.swap();
        return returnedPair;
    }
}
