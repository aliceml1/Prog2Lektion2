package model;

public class Rektangel extends Kvadrat{
    private double længde2;

    public Rektangel(double xPlacering, double yPlacering, double længde1, double længde2) {
        super(xPlacering, yPlacering, længde1);
        this.længde2 = længde2;
    }

    @Override
    public double beregnAreal() {
        return getLængde1()*længde2;
    }
}
