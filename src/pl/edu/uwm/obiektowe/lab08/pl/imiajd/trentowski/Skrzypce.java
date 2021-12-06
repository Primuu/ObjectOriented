package pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski;

import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "io io";
    }
}
