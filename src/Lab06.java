import java.lang.reflect.Array;

public class Lab06 {

    public static class RachunekBankowy {
        public static double rocznaStopaProcentowa;
        private double saldo;

        public RachunekBankowy(double saldo) {
            this.saldo = saldo;
        }

        public void obliczMiesieczneOdsetki() {
            double odsetki = (this.saldo * RachunekBankowy.rocznaStopaProcentowa) / 12;
            this.saldo = this.saldo + odsetki;
        }

        public static void setRocznaStopaProcentowa(double nowa_stopa_procentowa) {
            RachunekBankowy.rocznaStopaProcentowa = nowa_stopa_procentowa;
        }

    }

    public static class IntegerSet {
        boolean[] tab = new boolean[100];

        public IntegerSet() {
            for (int i = 0; i < 100; i++) {
                this.tab[i] = false;
            }
        }

        public void printIntegerSet() {
            for (int i = 0; i < 100; i++) {
                System.out.println(i + 1 + " " + this.tab[i]);
            }
        }

        public String toString(){
            StringBuilder a = new StringBuilder();
            int x = 0;

            for (int i = 0; i < 100; i++)
            {
                if(this.tab[i])
                {
                    a.append(i).append(" ");
                    x++;
                }
            }
            if(x == 0) a.append("tab is empty");
            return a.toString();
        }

        public boolean iterator(int a) {
            return this.tab[a];

        }

        public void insertElement(int a) {
            this.tab[a] = true;
        }

        public void deleteElement(int a) {
            this.tab[a] = false;
        }

        public static IntegerSet union(IntegerSet a, IntegerSet b) {
            IntegerSet tab1 = new IntegerSet();
            for (int i = 0; i < 100; i++) {
                if (a.iterator(i)) tab1.insertElement(i);
                if (b.iterator(i)) tab1.insertElement(i);
            }

            return tab1;
        }

        public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
            IntegerSet tab1 = new IntegerSet();
            for (int i = 0; i < 100; i++) {
                if (a.iterator(i) && b.iterator(i)) tab1.insertElement(i);
            }
            return tab1;
        }

        public boolean equals(IntegerSet a) {
            boolean returned = true;
            for (int i = 0; i < 100; i++) {
                if (this.tab[i] != a.iterator(i)) {
                    returned = false;
                    break;
                }
            }
        return returned;
        }

    }


    public static void main(String[] args){

        RachunekBankowy saver1 = new RachunekBankowy(2000.00);
        RachunekBankowy saver2 = new RachunekBankowy(3000.00);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.printf("%.2f%n", saver1.saldo);
        System.out.printf("%.2f%n", saver2.saldo);
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.printf("%.2f%n", saver1.saldo);
        System.out.printf("%.2f%n\n", saver2.saldo);
//-------------------------------------------------------------------------------
        IntegerSet tab1 = new IntegerSet();
        IntegerSet tab2 = new IntegerSet();
        //tab1.printIntegerSet();
        tab1.insertElement(10);
        tab2.insertElement(10);
        tab2.insertElement(80);

        IntegerSet tab3 = IntegerSet.union(tab1, tab2);
        System.out.println(tab3.toString());

        IntegerSet tab4 = IntegerSet.intersection(tab1, tab2);
        System.out.println(tab4.toString());

        tab4.deleteElement(10);
        System.out.println(tab4.toString());

        tab4.insertElement(10);
        System.out.println(tab4.toString());
        System.out.println(tab1.toString());
        boolean x = tab1.equals(tab4);
        System.out.println(x);






    }
}