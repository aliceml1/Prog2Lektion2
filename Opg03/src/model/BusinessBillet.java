package model;

public class BusinessBillet extends Billet {
    private int antalHåndbaggage = 1;
    private int antalIndchecketBaggage = 2;

    public BusinessBillet(String billetNavn, String beskrivelse, double pris, boolean ekstraHåndbaggage, boolean ekstraIndchecketBaggage, boolean tungBaggageLight, boolean tungBaggageHeavy, int antalHåndbaggage, int antalIndchecketBaggage) {
        super(billetNavn, beskrivelse, pris, ekstraHåndbaggage, ekstraIndchecketBaggage, tungBaggageLight, tungBaggageHeavy);
        this.antalHåndbaggage = antalHåndbaggage;
        this.antalIndchecketBaggage = antalIndchecketBaggage;
    }

    public int getAntalHåndbaggage() {
        return antalHåndbaggage;
    }

    public int getAntalIndchecketBaggage() {
        return antalIndchecketBaggage;
    }

    @Override
    public double beregnBilletPris() {
        double totalPris = getPris();
        if (isEkstraHåndbaggage()) {
            totalPris += 120;
        }
        if (isEkstraIndchecketBaggage()) {
            totalPris += 310;
        }
        if (isTungBaggageLight()) {
            totalPris += 330;
        }
        if (isTungBaggageHeavy()) {
            totalPris += 590;
        }
        return totalPris;
    }

    @Override
    public String toString() {
        return super.toString() + "Inkluderet: (Håndbaggage stk: " + getAntalHåndbaggage() + ", indchecket baggage stk: " + getAntalIndchecketBaggage() + ").\n";
    }
}
