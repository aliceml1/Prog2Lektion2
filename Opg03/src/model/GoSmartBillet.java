package model;

public class GoSmartBillet extends Billet {
    private int antalHåndBaggage = 1;
    private int antalIndchecketBaggage = 1;

    public GoSmartBillet(String billetNavn, String beskrivelse, double pris, boolean ekstraHåndbaggage, boolean ekstraIndchecketBaggage, boolean tungBaggageLight, boolean tungBaggageHeavy, int antalHåndBaggage, int antalIndchecketBaggage) {
        super(billetNavn, beskrivelse, pris, ekstraHåndbaggage, ekstraIndchecketBaggage, tungBaggageLight, tungBaggageHeavy);
        this.antalHåndBaggage = antalHåndBaggage;
        this.antalIndchecketBaggage = antalIndchecketBaggage;
    }

    public int getAntalHåndBaggage() {
        return antalHåndBaggage;
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
        return super.toString() + "Inkluderet: (Håndbaggage stk: " + getAntalHåndBaggage() + ", indchecket baggage stk: " + getAntalIndchecketBaggage() + ").\n";
    }
}
