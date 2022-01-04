package pl.edu.uwm.obiektowe.lab10;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args){

        ArrayList<Integer> tab_int_sort = new ArrayList<>();
        tab_int_sort.add(0);
        tab_int_sort.add(1);
        tab_int_sort.add(1);
        tab_int_sort.add(2);
        tab_int_sort.add(5);
        tab_int_sort.add(6);

        ArrayList<Integer> tab_int_chaos = new ArrayList<>();
        tab_int_chaos.add(7);
        tab_int_chaos.add(1);
        tab_int_chaos.add(8);
        tab_int_chaos.add(2);
        tab_int_chaos.add(5);
        tab_int_chaos.add(1);

        ArrayList<Integer> tab_int_chaos1 = new ArrayList<>();
        tab_int_chaos1.add(7);
        tab_int_chaos1.add(9);
        tab_int_chaos1.add(5);
        tab_int_chaos1.add(2);
        tab_int_chaos1.add(4);
        tab_int_chaos1.add(1);

        ArrayList<LocalDate> tab_date_sort = new ArrayList<>();
        tab_date_sort.add(LocalDate.of(2000,1,1));
        tab_date_sort.add(LocalDate.of(2000,1,1));
        tab_date_sort.add(LocalDate.of(2001,2,15));
        tab_date_sort.add(LocalDate.of(2003,11,29));

        ArrayList<LocalDate> tab_date_chaos = new ArrayList<>();
        tab_date_chaos.add(LocalDate.of(1912,1,13));
        tab_date_chaos.add(LocalDate.of(2000,11,19));
        tab_date_chaos.add(LocalDate.of(1669,12,15));
        tab_date_chaos.add(LocalDate.of(2003,11,29));

        ArrayList<LocalDate> tab_date_chaos1 = new ArrayList<>();
        tab_date_chaos1.add(LocalDate.of(1952,10,13));
        tab_date_chaos1.add(LocalDate.of(2004,12,1));
        tab_date_chaos1.add(LocalDate.of(1869,2,15));
        tab_date_chaos1.add(LocalDate.of(1803,1,9));


        System.out.println("\nIs tab of Integers(sorted) sorted?: " + ArrayUtil.isSorted(tab_int_sort));
        System.out.println("Then binary search will work. 5 is at index: "
                + ArrayUtil.binSearch(tab_int_sort, 5));


        System.out.println("Is tab of Integers(chaos) sorted?: " + ArrayUtil.isSorted(tab_int_chaos));
        ArrayUtil.selectionSort(tab_int_chaos);
        System.out.println("Is tab of Integers(chaos) sorted? (after sort): " + ArrayUtil.isSorted(tab_int_chaos));


        System.out.println("Is tab of Integers(chaos1) sorted?: " + ArrayUtil.isSorted(tab_int_chaos1));
        ArrayUtil.mergeSort(tab_int_chaos1);
        System.out.println("Is tab of Integers(chaos1) sorted? (after sort): " + ArrayUtil.isSorted(tab_int_chaos1));




        System.out.println("\nIs tab of LocalDates(sorted) sorted?: " + ArrayUtil.isSorted(tab_date_sort));
        System.out.println("Then binary search will work. date(2001-02-15) is at index: "
                + ArrayUtil.binSearch(tab_date_sort, LocalDate.of(2001,2,15)));


        System.out.println("Is tab of LocalDates(chaos) sorted?: " + ArrayUtil.isSorted(tab_date_chaos));
        ArrayUtil.selectionSort(tab_date_chaos);
        System.out.println("Is tab of LocalDates(chaos) sorted? (after sort): " + ArrayUtil.isSorted(tab_date_chaos));


        System.out.println("Is tab of LocalDates(chaos1) sorted?: " + ArrayUtil.isSorted(tab_date_chaos1));
        ArrayUtil.mergeSort(tab_date_chaos1);
        System.out.println("Is tab of LocalDates(chaos1) sorted? (after sort): " + ArrayUtil.isSorted(tab_date_chaos1));

    }
}
