package model;

import storage.Storage;

public class Test {
    public static void main(String[] args) {
        GeometriskFigur fig1 = new Cirkel(10.0, 10.0, 3.0);
        GeometriskFigur fig2 = new Ellipse(10.0, 10.0, 3.0, 4.5);
        GeometriskFigur fig3 = new Kvadrat(10.0, 10.0, 4.0);
        GeometriskFigur fig4 = new Rektangel(10.0, 10.0, 2.0, 4.0);

        System.out.println(fig1.beregnAreal());
        System.out.println(fig2.beregnAreal());
        System.out.println(fig3.beregnAreal());
        System.out.println(fig4.beregnAreal());

    }
}
