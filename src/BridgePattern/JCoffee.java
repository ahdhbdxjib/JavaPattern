package BridgePattern;

public abstract class JCoffee {
    public JCoffeeImpl jCoffee;

    public void pourCoffee()
    {
        jCoffee.pourCoffee();
    }

    public JCoffeeImpl getjCoffee() {
        return jCoffee;
    }

    public void setjCoffee(JCoffeeImpl jCoffee) {
        this.jCoffee = jCoffee;
    }
}
