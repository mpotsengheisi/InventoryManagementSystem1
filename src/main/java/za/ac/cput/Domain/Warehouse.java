package za.ac.cput.Domain;

public class Warehouse {
    private String warehouseId;
    private String name;
    private String location;

    private Warehouse() {}

    private Warehouse(Builder builder) {
        this.warehouseId = builder.warehouseId;
        this.name = builder.name;
        this.location = builder.location;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseId='" + warehouseId + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public static class Builder {
        private String warehouseId;
        private String name;
        private String location;

        public Builder setWarehouseId(String warehouseId) {
            this.warehouseId = warehouseId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder copy(Warehouse warehouse) {
            this.warehouseId = warehouse.warehouseId;
            this.name = warehouse.name;
            this.location = warehouse.location;
            return this;
        }

        public Warehouse build() {
            return new Warehouse(this);
        }
    }
}
