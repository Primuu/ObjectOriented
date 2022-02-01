package Z1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean jestPalindromem(T[] tab){
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(tab));
        Collections.reverse(arrayList);
        return Arrays.equals(arrayList.toArray(), tab);
    }
}
