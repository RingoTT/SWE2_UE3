package Items;

public abstract class Item implements Priced {

    final String name;
    public Item(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract float getPower();

    public abstract float getCooldown();

    @Override
    public float getDiscountPercent(DiscountRate rate) {

        switch (rate) {
            case LOW:
                return (float) 0.01;
            case MEDIUM:
                return (float) 0.05;
            case HIGH:
                return (float) 0.15;
            default:
                return 0;
        }
    }

    @Override
    public float getDiscountPercent() {
        return getDiscountPercent(DiscountRate.LOW);
    }

    @Override
    public float getDiscount(DiscountRate rate) {
        return this.getPrice() - this.getReducedPrice(rate);
    }

    @Override
    public float getDiscount() {
        return this.getPrice() - this.getReducedPrice();
    }

    @Override
    public float getReducedPrice(DiscountRate rate) {
        return this.getPrice() * this.getDiscountPercent(rate);
    }

    @Override
    public float getReducedPrice() {
        return this.getPrice() * this.getDiscountPercent();
    }

    public String toString() {
        return this.name;
    }
}
