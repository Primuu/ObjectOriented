package Z2;

import java.util.*;

public class WypiszCoDrugi {
    public static <E extends Iterable<?>> void wypiszCoDrugi(E e){
        Iterator<?> iterator = e.iterator();
        int counter = 0;
        while (iterator.hasNext()){
            if (counter % 2 == 0)
                System.out.print(iterator.next());
            else iterator.next();

            counter++;
            if (iterator.hasNext() & counter % 2 == 0)
                System.out.print(", ");
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        wypiszCoDrugi(arrayList);
        System.out.println();

        HashSet<Integer> hashSet = new HashSet<>(4);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        wypiszCoDrugi(hashSet);
        System.out.println();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Pierwszy");
        wypiszCoDrugi(linkedList);
        System.out.println();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("b");
        wypiszCoDrugi(treeSet);
        System.out.println();

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        wypiszCoDrugi(stack);
     }
}
