import java.util.ArrayList;
import java.util.Comparator;

public class Lab05 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> returnedArray = new ArrayList<Integer>(a);
        returnedArray.addAll(b);
        return returnedArray;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> returnedArray = new ArrayList<Integer>();
        int len = Math.max(a.size(), b.size());
        for(int i = 0; i < len; i++)
        {
            if (i < a.size())returnedArray.add(a.get(i));
            if (i < b.size())returnedArray.add(b.get(i));
        }
        return returnedArray;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> returnedArray = new ArrayList<Integer>();
        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());
        int a_index = 0 ,b_index = 0;
        while (a_index < a.size() && b_index < b.size())
        {
            if(a.get(a_index) <= b.get(b_index))
            {
                returnedArray.add(a.get(a_index));
                a_index++;
            }
            else
            {
                returnedArray.add(b.get(b_index));
                b_index++;
            }
        }

        while (a_index < a.size())
        {
            returnedArray.add(a.get(a_index));
            a_index++;
        }

        while (b_index < b.size())
        {
            returnedArray.add(b.get(b_index));
            b_index++;
        }
        return returnedArray;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> returnedArray = new ArrayList<Integer>();
        for(int i = a.size() - 1; i >= 0; i--)
        {
            returnedArray.add(a.get(i));
        }
        return returnedArray;
    }

    public static void  reverse(ArrayList<Integer> a){
        for(int i = a.size() - 1; i >= 0; i--){
            a.add(a.get(i));
        }
        for(int j = 0; j < a.size(); j++){
            a.remove(a.get(j));
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println("\na: " + a);
        System.out.println("b: " + b);
//1
        ArrayList<Integer> c = append(a, b);
        System.out.println("\n1.  a + b:\n" + c);
//2
        ArrayList<Integer> d = merge(a, b);
        System.out.println("\n2.  a + b (na przemian):\n" + d);
//3
        ArrayList<Integer> e = mergeSorted(a, b);
        System.out.println("\n3.  a + b (posortowane):\n" + e);
//4
        ArrayList<Integer> f = reversed(a);
        System.out.println("\n3.  a (odwrócone):\n" + f);
//5
        reverse(a);
        System.out.println("\n3.  a (odwrócone):\n" + a);

    }
}
