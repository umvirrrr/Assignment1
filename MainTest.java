import factory.*;
import products.*;
import util.UsageFactory;

public class MainTest {
    public static void main(String[] args) {
        // Example 1: Brand A Bulb
        SmartDeviceFactory factoryA = new BrandAFactory();
        SmartBulb bulbA = factoryA.createBulb();
        bulbA.setPowerUsage(UsageFactory.getUsage("BrandABulb"));
        bulbA.displayInfo();

        // Example 2: Brand B Lock
        SmartDeviceFactory factoryB = new BrandBFactory();
        SmartLock lockB = factoryB.createLock();
        lockB.setBatteryConsumption(UsageFactory.getUsage("BrandBLock"));
        lockB.displayInfo();
    }
}
