package za.ac.cput.Repository;

import za.ac.cput.Domain.Product;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Mpotseng Heisi (222309792)
 */
public class ProductRepository implements IProductRepository {


    private static ProductRepository repository = null;
    private List<Product> productList;


    private ProductRepository() {
        productList = new ArrayList<>();
    }


    public static ProductRepository getInstance() {
        if (repository == null) {
            repository = new ProductRepository();
        }
        return repository;
    }

    @Override
    public Product create(Product product) {
        if (product == null || product.getProductId() == null) {
            return null;
        }

        if (exists(product.getProductId())) {
            return null;
        }

        productList.add(product);
        return product;
    }

    @Override
    public Product read(String productId) {
        for (Product product : productList) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product update(Product product) {
        if (product == null) {
            return null;
        }

        int index = findIndexByProductId(product.getProductId());

        if (index == -1) {
            return null;
        }

        productList.set(index, product);
        return product;
    }

    @Override
    public boolean delete(String productId) {
        int index = findIndexByProductId(productId);

        if (index == -1) {
            return false;
        }

        productList.remove(index);
        return true;
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(productList);
    }


    private int findIndexByProductId(String productId) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId().equals(productId)) {
                return i;
            }
        }
        return -1;
    }


    private boolean exists(String productId) {
        return findIndexByProductId(productId) != -1;
    }


}
