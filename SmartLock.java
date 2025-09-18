package products;

public abstract class SmartLock {
    protected int batteryConsumption; // in %

    public void setBatteryConsumption(int batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
    }

    public abstract void displayInfo();
}
