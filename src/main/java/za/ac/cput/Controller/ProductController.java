package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Product;
import za.ac.cput.Service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping("/read/{productId}")
    public Product read(@PathVariable String productId) {
        return productService.read(productId);
    }

    @PostMapping("/update")
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("/delete/{productId}")
    public void delete(@PathVariable String productId) {
        productService.delete(productId);
    }

    @GetMapping("/getAll")
    public List<Product> getAll() {
        return productService.getAll();
    }
}
