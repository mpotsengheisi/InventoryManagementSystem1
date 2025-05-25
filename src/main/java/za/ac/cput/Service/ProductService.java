package za.ac.cput.Service;

/*
 * ProductService.java
 * Author: Mpotseng Heisi (222309792)
 * Date: 25 May 2025
 */

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Product;
import za.ac.cput.Repository.ProductRepository;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepo;

    public ProductService() {
        this.productRepo = ProductRepository.getInstance(); // Use your custom singleton
    }

    @Override
    public Product create(Product obj) {
        return productRepo.create(obj);
    }

    @Override
    public Product read(String productId) {
        return productRepo.read(productId);
    }

    @Override
    public Product update(Product obj) {
        return productRepo.update(obj);
    }

    @Override
    public boolean delete(String productId) {
        return productRepo.delete(productId);
    }

    @Override
    public List<Product> getAll() {
        return productRepo.getAll();
    }

    // Custom filtering methods (assuming you've added them in ProductRepository)
    public List<Product> findByCategoryId(String categoryId) {
        return productRepo.findByCategoryId(categoryId);
    }

    public List<Product> findBySupplierId(String supplierId) {
        return productRepo.findBySupplierId(supplierId);
    }

    public List<Product> findByPriceGreaterThan(double price) {
        return productRepo.findByPriceGreaterThan(price);
    }
}
