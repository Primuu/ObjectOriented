public class Start {
    public static void main(String[] args){
        //1

        System.out.println(31+29+31);

        //2
        int w2 = 0;
        for(int i = 1; i < 11; i++)
        {
            w2 = w2 + i;
        }
        System.out.println(w2);

        //3
        int w3 = 1;
        for(int i = 1; i < 11; i++)
        {
            w3 = w3 * i;
        }
        System.out.println(w3);

        //4
        double w4 = 1000;
        double op = 0.06;
        for(int i = 1; i < 4; i++)
        {
            w4 = w4 + w4 * op;
            //System.out.println(w4);
            System.out.printf("%1.2f%n", w4);
            System.out.printf("%1.2f%n", w4);
            System.out.printf("%1.2f%n", w4);
        }

        //5
        System.out.println("\n+____+");
        System.out.println("|java|");
        System.out.println("+____+");

        //6
        System.out.println("\n / / / / / / / / ");
        System.out.println(" +'''''''''''''+");
        System.out.println(" (|  ☯    ☯  |)");
        System.out.println("     |  ☮  |");
        System.out.println("    |   \u7bd0   |");
        System.out.println("   |   '~'   |");
        System.out.println(" +______________+");

        //10
        System.out.println("\nTakijednowski\nKaczyński\nKomediant");

        //11
        System.out.println("\nJejku jejku\nElżbieto\nBardzo tęskno mi do ciebie\nAle nie spotkamy się \nĆma wpadła do\n\nPokoju mego\nI\nStresuje się");

        //12
        System.out.println("\nJejku jejku\nElżbieto\nBardzo tęskno mi do ciebie\nAle nie spotkamy się \nĆma wpadła do\n\nPokoju mego\nI\nStresuje się");
    }
}