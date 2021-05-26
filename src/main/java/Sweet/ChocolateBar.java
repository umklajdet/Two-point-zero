package Sweet;

public class ChocolateBar extends Sweet {
    private double cocoaPercent;

    public ChocolateBar() {};

    public ChocolateBar(String title, double weight, double price, double cocoaPercent) {
        super(title, weight, price);
        this.cocoaPercent = cocoaPercent;
    }

    public double getCocoaPercent() {
        return cocoaPercent;
    }

    public void setCocoaPercent(double cocoaPercent) {
        this.cocoaPercent = cocoaPercent;
    }

    @Override
    public String toString() {
        return "ChocolateBar {" + super.toString() + "cocoaPercent = " + cocoaPercent + "}";
    }
}
