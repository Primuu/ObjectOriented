package Z1;

import java.util.Arrays;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(T[] tab){
        for(int i = 0; i < tab.length - 2; i++){
            if (tab[i].compareTo(tab[i + 1]) > 0) return false;
        }
        return true;
    }

    public static <T extends Comparable<? super T>> boolean isSortedUsingStream(T[] tab){
        return Arrays.equals(Arrays.stream(tab).sorted().toArray(), tab);
    }
}
