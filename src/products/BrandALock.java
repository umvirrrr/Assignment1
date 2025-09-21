package products;

public class BrandALock extends SmartLock {
    @Override
    public void displayInfo() {
        System.out.println("Brand A Smart Lock | Battery Consumption: " + batteryConsumption + "%");
    }
}
