import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Lab03 {

    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int i = 0; i < n; ++i) {
            tab[i] = r.nextInt(maxWartosc + 1 - minWartosc) + minWartosc;
        }
    }

    public static void wypisz_tab(int[] tab) {
        System.out.print("[ ");
        for (int el_tab : tab) {
            System.out.print(el_tab + " ");
        }
        System.out.println("]");
    }

//2)a

    public static int ileNieparzystych(int[] tab) {
        int ilosc = 0;
        for (int el_tab : tab) {
            if (el_tab % 2 != 0) ilosc++;
        }
        return ilosc;
    }

    public static int ileParzystych(int[] tab) {
        int ilosc = 0;
        for (int el_tab : tab) {
            if (el_tab % 2 == 0) ilosc++;
        }
        return ilosc;
    }

//2)b

    public static int ileDodatnich(int[] tab) {
        int ilosc = 0;
        for (int el_tab : tab) {
            if (el_tab > 0) ilosc++;
        }
        return ilosc;
    }

    public static int ileUjemnych(int[] tab) {
        int ilosc = 0;
        for (int el_tab : tab) {
            if (el_tab < 0) ilosc++;
        }
        return ilosc;
    }

    public static int ileZerowych(int[] tab) {
        int ilosc = 0;
        for (int el_tab : tab) {
            if (el_tab == 0) ilosc++;
        }
        return ilosc;
    }

//2)c

    public static int ileMaksymalnych(int[] tab) {
        int ilosc = 0;
        int el_max = tab[0];
        for (int i = 1; i < tab.length; ++i) {
            if (tab[i] > el_max) el_max = tab[i];
        }

        for (int j : tab) {
            if (el_max == j) ilosc++;
        }
        return ilosc;
    }

//2)b

    public static int sumaDodatnich(int[] tab) {
        int ilosc = 0;
        for (int el_tab : tab) {
            if (el_tab > 0) ilosc += el_tab;
        }
        return ilosc;
    }

    public static int sumaUjemnych(int[] tab) {
        int ilosc = 0;
        for (int el_tab : tab) {
            if (el_tab < 0) ilosc += el_tab;
        }
        return ilosc;
    }

//2)e

    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab) {
        int dlugosc = 0;
        int maksymalna_dlugosc = 0;

        for (int j : tab) {
            if (j > 0) dlugosc++;
            if (j <= 0) dlugosc = 0;
            if (maksymalna_dlugosc < dlugosc) maksymalna_dlugosc = dlugosc;
        }
        return maksymalna_dlugosc;
    }

//2)f

    public static void signum(int[] tab) {
        for (int i = 0; i < tab.length; ++i) {
            if (tab[i] > 0) tab[i] = 1;
            if (tab[i] < 0) tab[i] = -1;
        }
        System.out.print("[ ");
        for (int el_tab : tab) {
            System.out.print(el_tab + " ");
        }
        System.out.println("]");
    }

//2)g

    public static void odwrocFragment(int[] tab, int lewy, int prawy) {
        if (lewy < 1 || lewy >= tab.length || prawy < 1 || prawy >= tab.length) {
            System.out.println("Wartość lewa lub prawa poza zakresem.");
            return;
        }

        int[] temp_tab = new int[prawy - lewy + 1];

        if (prawy + 1 - lewy >= 0) System.arraycopy(tab, lewy, temp_tab, 0, prawy + 1 - lewy);

        for (int i = lewy; i < prawy + 1; i++) {
            tab[i] = temp_tab[prawy - i];
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//2
//a

        System.out.println("2.a)");
        System.out.print("Podaj liczbe z zakresu od 1 do 100:");
        int a = 0;
        int n = 0;
        while (a == 0) {
            n = scan.nextInt();
            if (n >= 1 & n <= 100) a++;
            else System.out.print("Wprowadzona zla wartosc. Wprowadz wartosc z zakresu od 1 do 100:");
        }


        int[] tab = new int[n];
        generuj(tab, n, -999, 999);
        wypisz_tab(tab);
        odwrocFragment(tab, 4, 9);
        wypisz_tab(tab);

        System.out.println("Ilość nieparzystych: " + ileNieparzystych(tab));
        System.out.println("Ilość parzystych: " + ileParzystych(tab));
        System.out.println("Ilość dodatnich: " + ileDodatnich(tab));
        System.out.println("Ilość ujemnych: " + ileUjemnych(tab));
        System.out.println("Ilość zerowych: " + ileZerowych(tab));
        System.out.println("Ilość najwiekszych: " + ileMaksymalnych(tab));
        System.out.println("Suma dodatnich: " + sumaDodatnich(tab));
        System.out.println("Suma ujemnych: " + sumaUjemnych(tab));
        System.out.println("Najdłuższy fragment tab. o dod. elelementach: " + dlugoscMaksymalnegoCiaguDodatnich(tab));
        signum(tab);

//3
        System.out.println("3)");
        System.out.print("Podaj 3 liczby z zakresu od 1 do 10:\n");
        a = 0;
        int m = 0, k = 0;
        n = 0;
        while (a == 0) {
            System.out.print("m = ");
            m = scan.nextInt();
            if (m >= 1 & m <= 10) a++;
            else System.out.print("Wprowadzona zla wartosc. Wprowadz wartosc z zakresu od 1 do 10:");
        }
        a = 0;
        while (a == 0) {
            System.out.print("n = ");
            n = scan.nextInt();
            if (n >= 1 & n <= 10) a++;
            else System.out.print("Wprowadzona zla wartosc. Wprowadz wartosc z zakresu od 1 do 10:");
        }
        a = 0;
        while (a == 0) {
            System.out.print("k = ");
            k = scan.nextInt();
            if (k >= 1 & k <= 10) a++;
            else System.out.print("Wprowadzona zla wartosc. Wprowadz wartosc z zakresu od 1 do 10:");
        }

        int[][] macierz_a = new int[m][n];
        int[][] macierz_b = new int[n][k];

        Random r = new Random();
        int i;
        int j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                macierz_a[i][j] = r.nextInt(11);
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < k; j++) {
                macierz_b[i][j] = r.nextInt(11);
            }
        }

        System.out.print("\nMacierz A:\n");

        for (i = 0; i < m; i++) {
            System.out.print("[");
            for (j = 0; j < n; j++) {
                System.out.print(" " + macierz_a[i][j] + " ");
            }
            System.out.print("]\n");
        }

        System.out.print("\nMacierz B:\n");

        for (i = 0; i < n; i++) {
            System.out.print("[");
            for (j = 0; j < k; j++) {
                System.out.print(" " + macierz_b[i][j] + " ");
            }
            System.out.print("]\n");
        }

        int[][] macierz_c = new int[m][k];

        for (i = 0; i < m; i++) {
            for (j = 0; j < k; j++) {
                for (int x = 0; x < n; x++) {
                    macierz_c[i][j] += macierz_a[i][x] * macierz_b[x][j];
                }
            }

        }

        System.out.print("\nMacierz C:\n");

        for (i = 0; i < m; i++) {
            System.out.print("[");
            for (j = 0; j < k; j++) {
                System.out.print(" " + macierz_c[i][j] + " ");
            }
            System.out.print("]\n");
        }

    }
}




