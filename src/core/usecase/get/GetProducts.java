package core.usecase.get;

import java.util.ArrayList;

import core.entity.Product;
import core.repository.ProductRepository;

public class GetProducts {

    private ProductRepository productRepository;

    public GetProducts(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ArrayList<Product> getAll() {
        return productRepository.getAll();
    }

    public Product getProductById(String id) {
        return productRepository.getProductById(id);
    }
}