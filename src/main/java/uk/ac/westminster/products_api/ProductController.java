package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController<ProductService> {
    private final ProductService productService;            // 1. the field

    public ProductController(ProductService productService) { // 2. the constructor
        this.productService = productService;
    }
    @GetMapping
    public Class<?> getAll() {
        return productService.getClass();              // 3. lowercase p
    }
}