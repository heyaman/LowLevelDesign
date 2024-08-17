package factory;

public class CoffeeServer {
    private final CoffeeFactory coffeeFactory;

    public CoffeeServer(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee getCoffee(String coffeeType){
        return CoffeeFactory.getCoffeeByType(coffeeType);
    }
}
