package model;

public class GoLightBillet extends Billet{

    public GoLightBillet(String billetNavn, String beskrivelse, double pris, boolean ekstraHåndbaggage, boolean ekstraIndchecketBaggage, boolean tungBaggageLight, boolean tungBaggageHeavy) {
        super(billetNavn, beskrivelse, pris, ekstraHåndbaggage, ekstraIndchecketBaggage, tungBaggageLight, tungBaggageHeavy);
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
}
