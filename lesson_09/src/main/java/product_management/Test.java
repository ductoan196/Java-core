package product_management;

import product_management.database.ProductDatabase;
import product_management.service.ProductService;

public class Test {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        ProductDatabase productDatabase = new ProductDatabase();
//        productService.showAllProducts();
//        productService.findWithQuantityLessThan(30);
        productService.findById(2);
    }
}
