package Z1;

import java.time.LocalTime;

public class ArrayUtilTest {
    public static void main(String[] args) {
        Integer[] integersSorted = new Integer[5];
        integersSorted[0] = 1;
        integersSorted[1] = 2;
        integersSorted[2] = 3;
        integersSorted[3] = 2;
        integersSorted[4] = 1;
        System.out.println(ArrayUtil.jestPalindromem(integersSorted));

        Integer[] integersNotSorted = new Integer[5];
        integersNotSorted[0] = 1;
        integersNotSorted[1] = 2;
        integersNotSorted[2] = 3;
        integersNotSorted[3] = 4;
        integersNotSorted[4] = 5;
        System.out.println(ArrayUtil.jestPalindromem(integersNotSorted));

        System.out.println();

        LocalTime[] localTimesSorted = new LocalTime[4];
        localTimesSorted[0] = LocalTime.of(6,16);
        localTimesSorted[1] = LocalTime.of(16,20);
        localTimesSorted[2] = LocalTime.of(16,20);
        localTimesSorted[3] = LocalTime.of(6,16);
        System.out.println(ArrayUtil.jestPalindromem(localTimesSorted));

        LocalTime[] localTimesNotSorted = new LocalTime[4];
        localTimesNotSorted[0] = LocalTime.of(6,16);
        localTimesNotSorted[1] = LocalTime.of(16,20);
        localTimesNotSorted[2] = LocalTime.of(12,20);
        localTimesNotSorted[3] = LocalTime.of(6,16);
        System.out.println(ArrayUtil.jestPalindromem(localTimesNotSorted));

    }
}
