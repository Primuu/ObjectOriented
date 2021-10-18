import java.util.Scanner;

import static java.lang.Math.*;

public class Lab02 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        //1
        //a
// KOMENTOWAĆ ODTĄD ( /**/ )
/*
        System.out.println("1)a)");

        System.out.print("Podaj ilosc liczb:");
        int n = scan.nextInt();
        int a = 0;
        double wynik = 0;
        while(a != n){
            System.out.print("Podaj elementy:");
            double na = scan.nextDouble();
            a++;
            wynik = wynik + na;
        }
        System.out.println("a = " + wynik + "\n");

        //b
        System.out.println("1)b)");

        System.out.print("Podaj ilosc liczb:");
        n = scan.nextInt();
        a = 0;
        wynik = 1;
        while(a != n){
            System.out.print("Podaj elementy:");
            double nb = scan.nextDouble();
            a++;
            wynik = wynik * nb;
        }
        System.out.println("b = " + wynik + "\n");

        //c
        System.out.println("1)c)");

        System.out.print("Podaj ilosc:");
        n = scan.nextInt();
        a = 0;
        wynik = 0;
        while(a != n){
            System.out.print("Podaj elementy:");
            double nc = scan.nextDouble();
            a++;
            wynik = wynik + abs(nc);
        }
        System.out.println("c = " + wynik + "\n");

        //d
        System.out.println("1)d)");

        System.out.print("Podaj ilosc:");
        n = scan.nextInt();
        a = 0;
        wynik = 0;
        while(a != n){
            System.out.print("Podaj elementy:");
            double nd = scan.nextDouble();
            a++;
            wynik = wynik + sqrt(abs(nd));

        }
        System.out.println("d = " + wynik + "\n");

        //e
        System.out.println("1)e)");

        System.out.print("Podaj ilosc:");
        n = scan.nextInt();
        a = 0;
        wynik = 1;
        while(a != n){
            System.out.print("Podaj elementy:");
            double ne = scan.nextDouble();
            a++;
            wynik = wynik * abs(ne);
        }
        System.out.println("e = " + wynik + "\n");

        //f
        System.out.println("1)f)");

        System.out.print("Podaj ilosc:");
        n = scan.nextInt();
        a = 0;
        wynik = 0;
        while(a != n){
            System.out.print("Podaj elementy:");
            double nf = scan.nextDouble();
            a++;
            wynik = wynik + pow(nf, 2);
        }
        System.out.println("f = " + wynik + "\n");

        //g
        System.out.println("1)g)");

        System.out.print("Podaj ilosc liczb:");
        n = scan.nextInt();
        a = 0;
        wynik = 0;
        double wyniko = 1;
        while(a != n){
            System.out.print("Podaj elementy:");
            double ng = scan.nextDouble();
            a++;
            wynik = wynik + ng;
            wyniko = wyniko * ng;
        }
        System.out.println("g1 = " + wynik + "  g2 = " + wyniko +"\n");

        //h
        System.out.println("1)h)");

        System.out.print("Podaj ilosc:");
        n = scan.nextInt();
        a = 0;
        wynik = 0;
        while(a != n){
            System.out.print("Podaj elementy:");
            double nh = scan.nextDouble();
            a++;
            wynik = wynik + pow(-1, (a+1)) * nh;
        }
        System.out.println("h = " + wynik + "\n");

        //i
        System.out.println("1)i)");

        System.out.print("Podaj ilosc:");
        n = scan.nextInt();
        a = 0;
        wynik = 0;
        while(a != n){
            System.out.print("Podaj elementy:");
            double ni = scan.nextDouble();
            a++;
            int f = 1;
            for (int i = 1; i <= a; i++)
            {f = f * i;}
            wynik = wynik + (pow(-1, a) * ni) / f;
        }
        System.out.println("i = " + wynik + "\n");

        //2
        System.out.println("2)");

        System.out.print("Podaj ilosc liczb:");
        int n = scan.nextInt();
        double [] tab = new double[n];
        int a = 0;
        while(a != n){
            System.out.print("Podaj elementy tablicy:");
            double n2 = scan.nextDouble();
            tab[a] = n2;
            a++;
        }
        a = 1;
        while(a < n){
            System.out.print(tab[a] + ", ");
            a++;
        }
        System.out.print(tab[0]);
*/
//KOMENTOWAĆ DOTĄD ( /**/ )

        //2.2
        System.out.println("2.2)");

        System.out.print("Podaj ilosc:");
        int n = scan.nextInt();
        int a = 0;
        double wynik = 0;
        while(a != n){
            System.out.print("Podaj elementy:");
            double n22 = scan.nextDouble();
            a++;
            if (n22 > 0)
            {
                wynik = wynik + 2 * n22;
            }
        }
        System.out.println("2.2 = " + wynik + "\n");

        //2.3
        System.out.println("2.3)");

        System.out.print("Podaj ilosc:");
        n = scan.nextInt();
        a = 0;
        int d = 0, u = 0, z = 0;
        while(a != n){
            System.out.print("Podaj elementy:");
            double n23 = scan.nextDouble();
            a++;
            if (n23 < 0)u++;
            else if (n23 == 0)z++;
            else d++;

        }
        System.out.println("2.3 Ujemne:" + u + "  Zera:" + z + "  Dodatnie:" + d + "\n");

        //2.4
        System.out.println("2.4)");

        System.out.print("Podaj ilosc:");
        n = scan.nextInt();
        a = 0;
        double minimalna, maksymalna;
        double [] tab1 = new double[n];
        while(a != n){
            System.out.print("Podaj elementy:");
            double n24 = scan.nextDouble();
            tab1[a] = n24;
            a++;
        }
        
        minimalna = tab1[0];
        maksymalna = tab1[0];
        for (double num : tab1) {
            if (num < minimalna) minimalna = num;
            if (num > maksymalna) maksymalna = num;
        }

        System.out.println("2.4 Minimalna:" + minimalna + "  Maksymalna:" + maksymalna + "\n");

        //2.5
        System.out.println("2.5)");

        System.out.print("Podaj ilosc:");
        n = scan.nextInt();
        a = 0;
        int suma = 0;
        double [] tab2 = new double[n];
        while(a != n){
            System.out.print("Podaj elementy:");
            double n25 = scan.nextDouble();
            tab2[a] = n25;
            a++;
        }

        for (int i = 0; i < n - 1; i++) {
            if (tab2[i] > 0 && tab2[i + 1] > 0) suma++;
        }

        System.out.println("2.5 Ilość sąsiadujących par:" + suma + "\n");

    }

}