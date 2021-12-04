package core.repository;

import java.util.ArrayList;

import core.entity.Product;

public interface ProductRepository {
    public boolean saveProduct(Product product);

    public boolean getProductById(String id);

    public ArrayList<Product> getAll();
}
