package core.repository;

import java.util.ArrayList;

import core.entity.Product;

public interface ProductRepository {
    public boolean saveProduct(Product product);

    public Product getProductById(String id);

    public ArrayList<Product> getAll();
}
