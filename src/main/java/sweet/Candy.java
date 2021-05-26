package Sweet;

public class Candy extends Sweet {
    private String flavour;

    public Candy(String title, double weight, double price, String flavour) {
        super(title, weight, price);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Candy {" + super.toString() + ", flavour = " +  flavour + "}";
    }
}
