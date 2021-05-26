import sweet.Sweet;
import sweet.Candy;
import sweet.Jellybean;
import sweet.ChocolateBar;

public class MakePresent {
    public static void main(String[] args) {
        Candy candy11 = new Candy("Bon pari", 20.54, 5.99, "Lemon");
        Candy candy12 = new Candy("ChupaChups", 10.5, 0.98, "Cherry");
        Jellybean jelly11 = new Jellybean("NoTitle", 50.495, 10.99, "green");
        Jellybean jelly12 = new Jellybean("Fini", 11.84, 8.49, "orange");
        ChocolateBar choco11 = new ChocolateBar();
        choco11.setTitle("Ritter Sport");
        choco11.setWeight(95.0);
        choco11.setPrice(199.99);
        choco11.setCocoaPercent(80);
        Sweet[] presentBox1 = {candy11, candy12, jelly11, jelly12, choco11};
        double totalWeight = 0;
        double totalPrice = 0;
        for (Sweet some : presentBox1) {
            System.out.println(some.toString());
            totalWeight += some.getWeight();
            totalPrice += some.getPrice();
        }
        System.out.printf("Total weight of present = %.3f%n", totalWeight);
        System.out.printf("Total price of present = %.3f%n", totalPrice);
    }
}
