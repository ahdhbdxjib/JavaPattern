package BridgePattern;

public class MediumCoffee extends JCoffee {

    @Override
    public void pourCoffee() {
        System.out.print("使用大杯");
        this.jCoffee.pourCoffee();
    }
}
