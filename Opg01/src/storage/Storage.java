package storage;

import model.Cirkel;
import model.GeometriskFigur;

import java.util.ArrayList;

public class Storage {
    private ArrayList<GeometriskFigur> geometriskeFigurer = new ArrayList<GeometriskFigur>();

    public void addGeometriskFigur(GeometriskFigur geometriskFigur) {
        geometriskeFigurer.add(geometriskFigur);
    }

    public ArrayList<GeometriskFigur> getGeometriskeFigurer() {
        return new ArrayList<>(geometriskeFigurer);
    }
}
