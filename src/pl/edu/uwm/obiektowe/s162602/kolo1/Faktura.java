package pl.edu.uwm.obiektowe.s162602.kolo1;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Faktura {
    private String numer;
    private LocalDate dataWystawienia;
    private int terminPlatonosciDni;
    ArrayList<Pozycja> pozycje = new ArrayList<Pozycja>();

    public Faktura(String numer, int terminPlatonosciDni, int year, int month, int day) {
        this.numer = numer;
        this.terminPlatonosciDni = terminPlatonosciDni;
        this.dataWystawienia = LocalDate.of(year, month, day);
    }

    public String getNumer() {
        String numerClone = this.numer;
        return numerClone;
    }

    public LocalDate getDataWystawienia() {
        LocalDate dataWystawieniaClone = this.dataWystawienia;
        return dataWystawieniaClone;
    }

    public int getTerminPlatonosciDni() {
        int terminPlatonosciDniClone = this.terminPlatonosciDni;
        return terminPlatonosciDniClone;
    }

    public void setDataWystawienia(int year, int month, int day) {
        this.dataWystawienia = LocalDate.of(year, month, day);
    }

    public void setTerminPlatonosciDni(int terminPlatonosciDni) {
        this.terminPlatonosciDni = terminPlatonosciDni;
    }

    public String wyswietlTerminPlatnosci(){
        String data = "";
        data = data + this.dataWystawienia.plusDays(this.terminPlatonosciDni);
        return data;
    }

    @Override
    public String toString(){
        return "Faktura o numerze " + numer + " wystawiona dnia: " + dataWystawienia +
                ", termin płatności: " + this.wyswietlTerminPlatnosci() + ".";
    }

    public void dodajPozycje(Pozycja p){
        this.pozycje.add(p);
    }

    public void usunPozycje(int numer){
        this.pozycje.remove(numer);
    }

    public void usunPozycje(Pozycja p){
        this.pozycje.remove(p);
    }

    public double getWartosc(){
        double sumarycznaWartosc = 0;
        for (Pozycja pozycja : this.pozycje) {
            sumarycznaWartosc = sumarycznaWartosc + pozycja.ilosc * (pozycja.cenaJednostkowa +
                    pozycja.cenaJednostkowa * pozycja.stawkaVat);
        }
        return sumarycznaWartosc;
    }

    public void wypiszFakture(){
        System.out.println(this.toString());
        for (Pozycja pozycja : this.pozycje) {
            System.out.println("Nazwa pozycji " + pozycja.nazwa + ". Cena pozycji " + pozycja.cenaJednostkowa +
                    ", (stawka vat: " + pozycja.stawkaVat + "). W ilości " + pozycja.ilosc + " o łącznej wartości " +
                    String.format("%.2f", pozycja.getWartosc()) + ".");
        }
        System.out.println("Sumaryczna wartosc faktury: " + String.format("%.2f", this.getWartosc()) + "\n");
    }


}
