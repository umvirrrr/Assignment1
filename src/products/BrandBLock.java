package products;

public class BrandBLock extends SmartLock {
    @Override
    public void displayInfo() {
        System.out.println("Brand B Smart Lock | Battery Consumption: " + batteryConsumption + "%");
    }
}
