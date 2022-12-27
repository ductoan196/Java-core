package product_management.repository;

import employee_management.database.EmployeeDB;
import product_management.database.ProductDatabase;
import product_management.model.Product;

import java.util.ArrayList;

public class ProductRepository {
    public ArrayList<Product> fillAllProducts(){
        return ProductDatabase.products;
    }
}
