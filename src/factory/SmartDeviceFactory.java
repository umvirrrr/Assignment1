package factory;

import products.SmartBulb;
import products.SmartLock;

public interface SmartDeviceFactory {
    SmartBulb createBulb();
    SmartLock createLock();
}
