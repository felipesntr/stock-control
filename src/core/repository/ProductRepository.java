package core.repository;

import core.entity.Product;

public interface ProductRepository {
    public boolean saveProduct(Product product);

    public boolean getProductById(String id);
}
