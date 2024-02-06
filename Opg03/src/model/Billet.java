package model;

public abstract class Billet {
    private String billetNavn;
    private String beskrivelse;
    private double pris = 0.0;
    private boolean ekstraHåndbaggage = false; //pris 120
    private boolean ekstraIndchecketBaggage = false; //pris 310
    private boolean tungBaggageLight = false; //pris 330, 23,1-28kg
    private boolean tungBaggageHeavy = false; //pris 590, over 28kg

    public Billet(String billetNavn, String beskrivelse, double pris, boolean ekstraHåndbaggage, boolean ekstraIndchecketBaggage, boolean tungBaggageLight, boolean tungBaggageHeavy) {
        this.billetNavn = billetNavn;
        this.beskrivelse = beskrivelse;
        this.pris = pris;
        this.ekstraHåndbaggage = ekstraHåndbaggage;
        this.ekstraIndchecketBaggage = ekstraIndchecketBaggage;
        this.tungBaggageLight = tungBaggageLight;
        this.tungBaggageHeavy = tungBaggageHeavy;
    }

    public String getBilletNavn() {
        return billetNavn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public double getPris() {
        return pris;
    }

    public boolean isEkstraHåndbaggage() {
        return ekstraHåndbaggage;
    }

    public boolean isEkstraIndchecketBaggage() {
        return ekstraIndchecketBaggage;
    }

    public boolean isTungBaggageLight() {
        return tungBaggageLight;
    }

    public boolean isTungBaggageHeavy() {
        return tungBaggageHeavy;
    }

    @Override
    public String toString() {
        return "SAS Billet " + billetNavn + ", " + beskrivelse + ". \nEkstra håndbaggage: " + ekstraHåndbaggage + "\nEkstra indchecket baggage: " + ekstraIndchecketBaggage + "\nTung baggage (under 28kg): " + tungBaggageLight + "\nTung baggage(over 28kg): " + tungBaggageHeavy + "\n-----------------" + "\nTotal pris: " + beregnBilletPris() + "\n";
    }

        public abstract double beregnBilletPris();
    }
