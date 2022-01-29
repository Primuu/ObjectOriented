package SOLO.zz1;

import java.math.BigInteger;
import java.time.LocalDate;

public class ArrayUtilTest {
    public static void main(String[] args) {
        BigInteger[] tab1 = new BigInteger[4];
        tab1[0] = new BigInteger("0");
        tab1[1] = new BigInteger("1");
        tab1[2] = new BigInteger("2");
        tab1[3] = new BigInteger("3");
        System.out.println(ArrayUtil.isSorted(tab1));

        BigInteger[] tab2 = new BigInteger[4];
        tab2[0] = new BigInteger("3");
        tab2[1] = new BigInteger("1");
        tab2[2] = new BigInteger("25");
        tab2[3] = new BigInteger("3");
        System.out.println(ArrayUtil.isSorted(tab2));

        String[] tab3 = new String[4];
        tab3[0] = "a";
        tab3[1] = "a";
        tab3[2] = "a";
        tab3[3] = "a";
        System.out.println(ArrayUtil.isSorted(tab3));

        String[] tab4 = new String[4];
        tab4[0] = "x";
        tab4[1] = "a";
        tab4[2] = "y";
        tab4[3] = "a";
        System.out.println(ArrayUtil.isSorted(tab4));

        LocalDate[] tab5 = new LocalDate[4];
        tab5[0] = LocalDate.of(2000, 3, 3);
        tab5[1] = LocalDate.of(2001, 5, 13);
        tab5[2] = LocalDate.of(2002, 6, 28);
        tab5[3] = LocalDate.of(2002, 6, 29);
        System.out.println(ArrayUtil.isSorted(tab5));

        LocalDate[] tab6 = new LocalDate[4];
        tab6[0] = LocalDate.of(1998, 7, 31);
        tab6[1] = LocalDate.of(2001, 5, 13);
        tab6[2] = LocalDate.of(1615, 9, 28);
        tab6[3] = LocalDate.of(1615, 9, 29);
        System.out.println(ArrayUtil.isSorted(tab6));

    }
}
