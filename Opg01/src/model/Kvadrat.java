package model;

public class Kvadrat extends GeometriskFigur {
    private double længde1;

    public Kvadrat(double xPlacering, double yPlacering, double længde1) {
        super(xPlacering, yPlacering);
        this.længde1 = længde1;
    }

    public double getLængde1() {
        return længde1;
    }


    public double beregnAreal() {
        return længde1 * længde1;
    }

    @Override
    public void doubleUp() {
        this.længde1 = længde1 * 2;
    }

    @Override
    public void halve() {
        this.længde1 = længde1 / 2;
    }
}
