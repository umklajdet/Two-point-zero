package sweet;

public class Jellybean extends Sweet {
    private String color;

    public Jellybean(String title, double weight, double price, String color) {
        super(title, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jellybean {" + super.toString() + ", color = " + color + "}";
    }
}
