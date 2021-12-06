package pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski;

import java.time.LocalDate;

public class Flet extends Instrument{
    public Flet(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "Fiu fiu";
    }
}
