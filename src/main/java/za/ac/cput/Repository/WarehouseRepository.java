package za.ac.cput.Repository;

import za.ac.cput.Domain.Warehouse;

import java.util.ArrayList;
import java.util.List;

/*
 * WarehouseRepository.java
 * Repository implementation for 'Warehouse'
 * Author: Mpotseng Heisi (222309792)
 * Date: 25 May 2025
 */
public class WarehouseRepository implements IWarehouseRepository {

    private static WarehouseRepository repository = null;
    private List<Warehouse> warehouseList;

    private WarehouseRepository() {
        warehouseList = new ArrayList<>();
    }

    public static WarehouseRepository getInstance() {
        if (repository == null) {
            repository = new WarehouseRepository();
        }
        return repository;
    }

    @Override
    public Warehouse create(Warehouse warehouse) {
        if (warehouse == null || warehouse.getWarehouseId() == null) {
            return null;
        }

        if (exists(warehouse.getWarehouseId())) {
            return null;
        }

        warehouseList.add(warehouse);
        return warehouse;
    }

    @Override
    public Warehouse read(String warehouseId) {
        for (Warehouse warehouse : warehouseList) {
            if (warehouse.getWarehouseId().equals(warehouseId)) {
                return warehouse;
            }
        }
        return null;
    }

    @Override
    public Warehouse update(Warehouse warehouse) {
        if (warehouse == null) {
            return null;
        }

        int index = findIndexByWarehouseId(warehouse.getWarehouseId());

        if (index == -1) {
            return null;
        }

        warehouseList.set(index, warehouse);
        return warehouse;
    }

    @Override
    public boolean delete(String warehouseId) {
        int index = findIndexByWarehouseId(warehouseId);

        if (index == -1) {
            return false;
        }

        warehouseList.remove(index);
        return true;
    }

    @Override
    public List<Warehouse> getAll() {
        return new ArrayList<>(warehouseList);
    }

    private int findIndexByWarehouseId(String warehouseId) {
        for (int i = 0; i < warehouseList.size(); i++) {
            if (warehouseList.get(i).getWarehouseId().equals(warehouseId)) {
                return i;
            }
        }
        return -1;
    }

    private boolean exists(String warehouseId) {
        return findIndexByWarehouseId(warehouseId) != -1;
    }
}
