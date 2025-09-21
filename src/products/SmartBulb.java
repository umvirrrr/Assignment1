package products;

public abstract class SmartBulb {
    protected int powerUsage; // in watts

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public abstract void displayInfo();
}
