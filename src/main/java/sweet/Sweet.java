package sweet;

public abstract class Sweet {
    private String title;
    private double weight;
    private double price;

    public Sweet() {};

    public Sweet(String title, double weight, double price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "title = " + title + ", weight = " + weight + ", price = " + price;
    }
}
