package za.ac.cput.Repository;

import za.ac.cput.Domain.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductRepository implements IProductRepository {

    private static ProductRepository repository = null;
    private Set<Product> productDB;

    private ProductRepository() {
        this.productDB = new HashSet<>();
    }

    public static ProductRepository getRepository() {
        if (repository == null) {
            repository = new ProductRepository();
        }
        return repository;
    }

    @Override
    public Product create(Product product) {
        if (productDB.add(product)) {
            return product;
        }
        return null;
    }

    @Override
    public Product read(String productId) {
        return productDB.stream()
                .filter(product -> product.getProductId().equals(productId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Product update(Product product) {
        Product existingProduct = read(product.getProductId());
        if (existingProduct != null) {
            productDB.remove(existingProduct);
            productDB.add(product);
            return product;
        }
        return null;
    }

    @Override
    public boolean delete(String productId) {
        Product product = read(productId);
        if (product != null) {
            productDB.remove(product);
            return true;
        }
        return false;
    }

    @Override
    public Set<Product> getAll() {
        return productDB;
    }

    @Override
    public Set<Product> getProductsByCategory(String categoryId) {
        Set<Product> result = new HashSet<>();
        for (Product product : productDB) {
            if (product.getCategoryId().equalsIgnoreCase(categoryId)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public Set<Product> getProductsBySupplier(String supplierId) {
        Set<Product> result = new HashSet<>();
        for (Product product : productDB) {
            if (product.getSupplierId().equalsIgnoreCase(supplierId)) {
                result.add(product);
            }
        }
        return result;
    }
}
