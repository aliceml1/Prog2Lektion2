package model;

public abstract class GeometriskFigur implements Resizable{
    private double xPlacering;
    private double yPlacering;

    public GeometriskFigur(double xPlacering, double yPlacering) {
        this.xPlacering = xPlacering;
        this.yPlacering = yPlacering;
    }



    public abstract double beregnAreal();
}
