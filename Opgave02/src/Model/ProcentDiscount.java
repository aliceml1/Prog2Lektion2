package Model;

public class ProcentDiscount extends Discount {
    private int procent;

    public ProcentDiscount(String description, int procentDiscount) {
        super(description);
        this.procent = procentDiscount;
    }

    @Override
    public double applyDiscount(Basket basket) {
        return -basket.getTotal() * procent / 100;
    }

}
