package Z1;

import java.math.BigInteger;
import java.time.LocalDate;

public class ArrayUtilTest {
    public static void main(String[] args) {
        BigInteger[] tab1 = new BigInteger[4];
        tab1[0] = new BigInteger("5");
        tab1[1] = new BigInteger("2");
        tab1[2] = new BigInteger("1");
        tab1[3] = new BigInteger("7");
        System.out.println(ArrayUtil.isSorted(tab1));

        BigInteger[] tab2 = new BigInteger[4];
        tab2[0] = new BigInteger("1");
        tab2[1] = new BigInteger("2");
        tab2[2] = new BigInteger("3");
        tab2[3] = new BigInteger("4");
        System.out.println(ArrayUtil.isSorted(tab2));

        String[] tab3 = new String[4];
        tab3[0] = "x";
        tab3[1] = "b";
        tab3[2] = "y";
        tab3[3] = "z";
        System.out.println(ArrayUtil.isSortedUsingStream(tab3));

        String[] tab4 = new String[4];
        tab4[0] = "a";
        tab4[1] = "b";
        tab4[2] = "c";
        tab4[3] = "d";
        System.out.println(ArrayUtil.isSortedUsingStream(tab4));

        LocalDate[] tab5 = new LocalDate[4];
        tab5[0] = LocalDate.of(2001, 2, 4);
        tab5[1] = LocalDate.of(1998, 3, 14);
        tab5[2] = LocalDate.of(2013, 11, 24);
        tab5[3] = LocalDate.of(204, 12, 3);
        System.out.println(ArrayUtil.isSorted(tab5));

        LocalDate[] tab6 = new LocalDate[4];
        tab6[0] = LocalDate.of(2001, 2, 4);
        tab6[1] = LocalDate.of(2001, 2, 5);
        tab6[2] = LocalDate.of(2002, 11, 24);
        tab6[3] = LocalDate.of(2010, 12, 3);
        System.out.println(ArrayUtil.isSorted(tab6));

    }
}
