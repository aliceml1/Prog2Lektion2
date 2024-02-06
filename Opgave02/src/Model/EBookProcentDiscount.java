package Model;

public class EBookProcentDiscount extends Discount{
    private double procent;

    public EBookProcentDiscount(String description, double procent) {
        super(description);
        this.procent = procent;
    }

    @Override
    public double applyDiscount(Basket basket) {
        double discount = 0.0;
        for (Book item : basket.getItems()) {
            if (item instanceof Ebook) {
                discount -= item.getPrice()*procent/100;
            }
        }
        return discount;
    }
}
