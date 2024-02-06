package model;

public class Cirkel extends GeometriskFigur{
    private double radius;

    public Cirkel(double xPlacering, double yPlacering, double radius) {
        super(xPlacering, yPlacering);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double beregnAreal() {
        return Math.PI*(radius*radius);
    }

    @Override
    public void doubleUp() {
        this.radius = radius*2;
    }

    @Override
    public void halve() {
        double halverRadius = getRadius()/2;
    }
}
