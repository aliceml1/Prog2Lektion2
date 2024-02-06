package Model;

public class TwoForOneDiscount extends Discount{

    public TwoForOneDiscount(String description, int procentDiscount, int fixedDiscount, int minimumAmount) {
        super(description);
    }

    @Override
    public double applyDiscount(Basket basket) {
        double discount = 0.0;
        if (basket.getItems().get(0).getPrice() < basket.getItems().get(1).getPrice()) {
            discount = - basket.getItems().get(0).getPrice();
            }
        else {
            discount = - basket.getItems().get(1).getPrice();
        }
        return discount;
    }
}
