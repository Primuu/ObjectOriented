package pl.edu.uwm.obiektowe.lab08;

import pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski.Flet;
import pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski.Fortepian;
import pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski.Instrument;
import pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski.Skrzypce;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrument {
    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        Flet flet_jeden = new Flet("Fleciskowo", LocalDate.of(2014, 5, 29));
        Flet flet_dwa = new Flet("Flute Masters", LocalDate.of(1998, 2, 3));
        Skrzypce skrzypce_raz = new Skrzypce("Skrip", LocalDate.of(2001, 4, 4));
        Skrzypce skrzypce_i_dwa = new Skrzypce("Skrip Masters", LocalDate.of(2011, 6, 4));
        Fortepian fortepianino = new Fortepian("Fort Mustang", LocalDate.of(2021, 12, 6) );

        orkiestra.add(flet_jeden);
        orkiestra.add(flet_dwa);
        orkiestra.add(skrzypce_raz);
        orkiestra.add(skrzypce_i_dwa);
        orkiestra.add(fortepianino);

        flet_jeden.dzwiek();
        flet_dwa.dzwiek();
        skrzypce_raz.dzwiek();
        skrzypce_i_dwa.dzwiek();
        fortepianino.dzwiek();

        for (Object instrument: orkiestra
             ) {
            System.out.println(instrument.toString());


        }



    }
}
