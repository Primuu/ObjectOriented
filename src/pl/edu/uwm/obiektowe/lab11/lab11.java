package pl.edu.uwm.obiektowe.lab11;

import java.util.*;

public class lab11 {

    public static void redukuj(LinkedList<String> pracownicy, int n)
    {
        LinkedList<String> pracownicy_to_remove = new LinkedList<String>();
        for (int i = 0; i < pracownicy.size(); i++)
            if ((i + 1) % n == 0) pracownicy_to_remove.add(pracownicy.get(i));
        for (String p: pracownicy_to_remove)
        {
            pracownicy.remove(p);
        }

    }

    public static <T> void redukuj_generic(LinkedList<T> lista, int n)
    {
        LinkedList<T> lista_do_redukcji = new LinkedList<T>();
        for (int i = 0; i < lista.size(); i++)
            if ((i + 1) % n == 0) lista_do_redukcji.add(lista.get(i));
        for (T l: lista_do_redukcji)
        {
            lista.remove(l);
        }

    }

    public static void odwroc (LinkedList<String> lista)
    {
        LinkedList<String> list_temp = new LinkedList<>(lista);
        for (int i = lista.size() - 1, j = 0; i >= 0; i--, j++)
        {
            lista.set(j, list_temp.get(i));
        }
    }

    public static <T> void odwroc_generic (LinkedList<T> lista)
    {
        LinkedList<T> list_temp = new LinkedList<>(lista);
        for (int i = lista.size() - 1, j = 0; i >= 0; i--, j++)
        {
            lista.set(j, list_temp.get(i));
        }
    }

    public static void sito_eratostenesa ()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPodaj l. calk. nieujemna:");
        int i, j, n = scan.nextInt();
        boolean[] primes = new boolean[n + 1];
        for(i = 0; i <= n; i++)
            primes[i] = true;

        for(i = 2; i * i <= n; i++)
        {
            if(primes[i])
            {
                for(j = i * i; j <= n; j += i)
                {
                    primes[j] = false;
                }
            }
        }

        for(i = 2; i <= n; i++)
        {
            if(primes[i])
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static <T extends Iterable<?>> void print(T object)
    {
        Iterator<?> i = object.iterator();
        while (i.hasNext())
        {
            System.out.print(i.next());
            if (i.hasNext()) System.out.print(", ");
        }
        System.out.println();
    };


    public static void main(String[] args){
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("Pierwszy");
        pracownicy.add("Drugi");
        pracownicy.add("Trzeci");
        pracownicy.add("Czwarty");
        pracownicy.add("Piąty");
        pracownicy.add("Szósty");
        System.out.println(pracownicy);
        //redukuj(pracownicy, 2);
        redukuj_generic(pracownicy, 2);

        System.out.println(pracownicy);

        //odwroc(pracownicy);
        odwroc_generic(pracownicy);
        System.out.println(pracownicy);

        // TASK 5
        System.out.println("Zadanie 5:\nPodaj slowa (ostatnie zakoncz kropka):");
        Scanner scan = new Scanner(System.in);
        Stack<String> slowa = new Stack<>();
        do
        {
            slowa.push(scan.next());
        } while (!slowa.peek().endsWith("."));

        while (!slowa.empty())
        {
            String biezace_slowo = slowa.pop();
            biezace_slowo = biezace_slowo.toLowerCase();
            if (biezace_slowo.endsWith("."))
            {
                String first_letter = "" + biezace_slowo.charAt(0);
                biezace_slowo = biezace_slowo.substring(0, biezace_slowo.length() - 1);
                biezace_slowo = biezace_slowo.replaceFirst(first_letter, first_letter.toUpperCase());
            }
            if (slowa.empty())
            {
                biezace_slowo = biezace_slowo + ".";
            }
            System.out.println(biezace_slowo);
        }


        // TASK 6
        System.out.println("Zadanie 6:\nPodaj nieujemna l. calkowita:");
        int n = scan.nextInt();
        Stack<Integer> digits = new Stack<>();
        while (n > 0)
        {
            digits.push(n % 10);
            n /= 10;
        }
        while (!digits.empty())
        {
            System.out.print(digits.pop() + " ");
        }


        // TASK 7
        sito_eratostenesa();

        // TASK 8
        print(pracownicy);

        ArrayList<Boolean> tab = new ArrayList<>(10);
        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0) tab.add(true);
            else tab.add(false);
        }

        print(tab);
    }
}
