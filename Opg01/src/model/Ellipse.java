package model;

public class Ellipse extends Cirkel{
    private double radius2;

    public Ellipse(double xPlacering, double yPlacering, double radius, double radius2) {
        super(xPlacering, yPlacering, radius);
        this.radius2 = radius2;
    }

    @Override
    public double beregnAreal() {
        return Math.PI*(getRadius()*radius2);
    }
}
