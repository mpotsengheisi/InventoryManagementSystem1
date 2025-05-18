package za.ac.cput.Factory;

import org.junit.Test;
import za.ac.cput.Domain.Product;
import za.ac.cput.Domain.Warehouse;

import static org.junit.jupiter.api.Assertions.*;

public class ProductFactoryTest {
    @Test
    public void createProduct() {
        Product product = ProductFactory.createProduct("A123", "Television", 800.00, 5, "C001", "S001");
        System.out.println("Television" + product);
        assertNotNull(product.getProductId());
    }
}