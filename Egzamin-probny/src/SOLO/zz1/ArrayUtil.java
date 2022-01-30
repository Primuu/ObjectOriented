package SOLO.zz1;

import java.util.Arrays;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(T[] tab){
        return Arrays.equals(Arrays.stream(tab).sorted().toArray(), tab);
    }

    public static <T extends Comparable<? super T>> boolean isSortedUsingFor(T[] tab){
        for (int i = 0; i < tab.length - 1; i++){
            if (tab[i].compareTo(tab[i + 1]) > 0) return false;
        }
        return true;
    }

}
