package product_management.service;

import product_management.model.Product;
import product_management.repository.ProductRepository;

import java.util.ArrayList;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();
    //danh sách các sản phẩm
    public void showAllProducts(){
        for(Product product: productRepository.fillAllProducts()){
            System.out.println(product);
        }
    }
    //Tìm kiếm theo tên
    public void findByName(String name){
        int count = 0;
        for(Product product: productRepository.fillAllProducts()){
            if (product.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(product);
                count++;
            }
        }
        if (count ==0){
            System.out.println("Không có sản phẩm nào chứa tên "+ name);
        }
    }
    //Tìm kiếm theo id
    ArrayList<Product> products = productRepository.fillAllProducts();
    public void findById(int id){
        int count = 0;
        for(Product product: products){
            if (product.getId()==id){
                System.out.println(product);
                products.remove(0);
                count++;
            }
        }
        if (count ==0){
            System.out.println("Không có sản phẩm nào có Id "+ id);
        }
        for(Product product: products){
            System.out.println(product);
        }
    }

    //Tìm kiếm sản phẩm có số lượng ít hơn 5
    public void findWithQuantityLessThan5(){
        int count = 0;
        ArrayList<Product> productsWithQuantityLessThan5 = new ArrayList<>();
        for(Product product: productRepository.fillAllProducts()){
            if (product.getQuantity()<5){
                System.out.println(product);
                productsWithQuantityLessThan5.add(product);
                count++;
            }
        }
        if (count ==0){
            System.out.println("Không có sản phẩm nào số lượng dưới 5 ");
        }
    }
    public void findProductByPrice(int price){
        int count = 0;
        ArrayList<Product> productsPriceLessThan50K = new ArrayList<>();
        ArrayList<Product> productsPrice50_100K = new ArrayList<>();
        ArrayList<Product> productsMorethan100K = new ArrayList<>();

        for(Product product: productRepository.fillAllProducts()){
            if (product.getPrice()<50_000){
                System.out.println(product);
                productsPriceLessThan50K.add(product);
                count++;
            }
        }
    }
}
