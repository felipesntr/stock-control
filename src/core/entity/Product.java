package core.entity;

public class Product {
    private String name;
    private String category;
    private double price;
    private String description;

    public Product(String name, String description, double price, String category,
            String subCategory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }
}
