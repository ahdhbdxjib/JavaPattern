package BridgePattern;

public class NoMilkCoffee extends JCoffeeImpl {
    @Override
    public void pourCoffee() {
        System.out.println("不加奶咖啡");
    }
}
