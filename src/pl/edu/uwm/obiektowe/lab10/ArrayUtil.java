package pl.edu.uwm.obiektowe.lab10;

import java.util.ArrayList;

public class ArrayUtil {

    public static <T extends Comparable<? super T>> boolean isSorted (ArrayList<T> tab)
    {
        for(int i = 0; i < tab.size() - 1; i++)
        {
            if (tab.get(i).compareTo(tab.get(i + 1)) > 0) return false;
        }
        return true;
    }

    public static <T extends Comparable<? super T>> int binSearch (ArrayList<T> tab,T try_to_find)
    {
        //Array must be sorted
        int left = 0, right = tab.size() - 1, middle = 0;
        while (left <= right)
        {
            middle = (left + right) / 2;
            if (tab.get(middle).compareTo(try_to_find) == 0) return middle;
            else if (tab.get(middle).compareTo(try_to_find) < 0) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }

    public static <T extends Comparable<? super T>> void selectionSort (ArrayList<T> tab)
    {
        for (int i = 0; i < tab.size() - 1; i++)
        {
            int min_index = i;

            for (int j = i + 1; j < tab.size(); j++)
            {
                if (tab.get(j).compareTo(tab.get(min_index)) < 0)
                    min_index = j;
            }
            T temp = tab.get(min_index);
            tab.set(min_index, tab.get(i));
            tab.set(i, temp);
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort (ArrayList<T> tab)
    {
        if(tab == null) {
            return ;
        }

        if(tab.size() > 1)
        {
            int middle = tab.size() / 2;

            ArrayList<T> left = new ArrayList<>(tab.size() / 2);
            for(int i = 0; i < middle; i++)
            {
                left.add(i, tab.get(i));
            }

            ArrayList<T> right = new ArrayList<>(tab.size() - middle);
            for(int i = middle; i < tab.size(); i++)
            {
                right.add(i - middle, tab.get(i));
            }

            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < left.size() && j < right.size())
            {
                if(left.get(i).compareTo(right.get(j)) < 0)
                {
                    tab.set(k, left.get(i));
                    i++;
                }
                else
                {
                    tab.set(k, right.get(j));
                    j++;
                }
                k++;
            }

            while(i < left.size())
            {
                tab.set(k, left.get(i));
                i++;
                k++;
            }
            while(j < right.size())
            {
                tab.set(k, right.get(j));
                j++;
                k++;
            }
        }
    }

}
