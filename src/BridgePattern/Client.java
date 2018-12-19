package BridgePattern;

public class Client {
    public static void main(String[] args) {
        JCoffee coffee = new BigCoffee();
        (coffee).setjCoffee(new MilkCoffee());
        coffee.pourCoffee();

    }
}
