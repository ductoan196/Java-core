package product_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private int price;
}
