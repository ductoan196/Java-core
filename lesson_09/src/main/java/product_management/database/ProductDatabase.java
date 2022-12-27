package product_management.database;

import employee_management.model.Employee;
import product_management.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    public static ArrayList<Product> products = new ArrayList<>(List.of(
            new Product(1,"Candy","For children", 20,1000),
            new Product(2,"Snack","For adult", 30,1000),
            new Product(3,"Milk Tea","For women", 10,1000)
    ));
    }
