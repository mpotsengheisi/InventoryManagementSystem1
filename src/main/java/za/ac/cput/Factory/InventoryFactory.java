package za.ac.cput.Factory;

import za.ac.cput.Domain.Inventory;

public class InventoryFactory {
    public static Inventory createInventory(String inventoryId, String productId, String productName, double price, String category, String supplier, int quantity, int reorderLevel, String reason) {
        if (inventoryId == null || inventoryId.isEmpty() || productId == null || productId.isEmpty() || productName == null || productName.isEmpty() || price<0 || category == null || category.isEmpty() || supplier.isEmpty() || reason.isEmpty()){
            return null;
        }

        return new Inventory.Builder()
                .setInventoryId(inventoryId)
                .setProductId(productId)
                .setProductName(productName)
                .setPrice(price)
                .setCategory(category)
                .setSupplier(supplier)
                .setQuantity(quantity)
                .setReorderLevel(reorderLevel)
                .setReason(reason)
                .build();


    }


}
