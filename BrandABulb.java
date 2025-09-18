package products;

public class BrandABulb extends SmartBulb {
    @Override
    public void displayInfo() {
        System.out.println("Brand A Smart Bulb | Power Usage: " + powerUsage + "W");
    }
}
