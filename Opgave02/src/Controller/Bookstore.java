package Controller;

import Model.*;

public class Bookstore {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addItem(new Book(600, "Introduction to Java Programming and Data Structures"));
        basket.addItem(new Book(350, "Head First Design Patterns"));
        basket.addDiscount(new ProcentDiscount("10% rabat på alt", 10));
        basket.addDiscount(new FixedDiscount("25 kr rabat på beløb over 500 kr.",  -25, 500));
        basket.addDiscount(new FixedDiscount("50 kr rabat på beløb over 1000 kr.",-50, 1000));
        basket.addItem(new Ebook(300, "EPro"));
        basket.addDiscount(new EBookProcentDiscount("5% ekstra rabat på E-bøger", 5));

        basket.printTotal();

    }
}
