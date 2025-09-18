package products;

public class BrandBBulb extends SmartBulb {
    @Override
    public void displayInfo() {
        System.out.println("Brand B Smart Bulb | Power Usage: " + powerUsage + "W");
    }
}
