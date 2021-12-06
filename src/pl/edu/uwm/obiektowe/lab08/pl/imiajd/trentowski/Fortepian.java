package pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski;

import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "ding ding";
    }
}
