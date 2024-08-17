package factory;

public class CoffeeFactory {
    private CoffeeFactory(){};
    public static Coffee getCoffeeByType(String type){
        Coffee coffee=null;
        switch (type){
            case "Black":
                coffee= new BlackCoffee("",2,2);
                break;
            case "American":
                coffee= new AmericanCoffee("",3,3);
                break;
            case "Capchino":
                coffee= new CapchinoCoffee("", 4,4);
                break;
        }
        return coffee;
    }
}
