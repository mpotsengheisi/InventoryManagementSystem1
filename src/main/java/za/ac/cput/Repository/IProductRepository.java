package za.ac.cput.Repository;

import za.ac.cput.Domain.Product;

import java.util.Set;

public interface IProductRepository extends IRepository<Product, String> {
    Product create(Product product);

    Product read(String productId);

    Product update(Product product);

    boolean delete(String productId);

    Set<Product> getAll();

    Set<Product> getProductsByCategory(String categoryId);
    Set<Product> getProductsBySupplier(String supplierId);
}


