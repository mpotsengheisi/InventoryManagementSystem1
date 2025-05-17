package za.ac.cput.Factory;
import za.ac.cput.Domain.Warehouse;
import za.ac.cput.Util.Helper;

public class WarehouseFactory {

    public static Warehouse  createWarehouse(String warehouseId, String name, String location) {
        if (Helper.isNullOrEmpty(warehouseId) || Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(location)) {
            return null;
        }

        return new Warehouse.Builder()
                .setWarehouseId(warehouseId)
                .setName(name)
                .setLocation(location)
                .build();
    }
}

