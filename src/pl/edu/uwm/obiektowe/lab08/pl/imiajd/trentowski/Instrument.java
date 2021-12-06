package pl.edu.uwm.obiektowe.lab08.pl.imiajd.trentowski;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Instrument {
    public String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public abstract String dzwiek();

    @Override
    public String toString() {
        return "Instrument producenta: " + producent + ", rokProdukcji: " + rokProdukcji;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Instrument other = (Instrument) otherObject;
        return Objects.equals(producent, other.producent)
                && Objects.equals(rokProdukcji, other.rokProdukcji);
    }

}
