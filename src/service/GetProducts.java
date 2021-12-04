package service;

import java.util.ArrayList;

import core.entity.Product;
import core.repository.ProductRepository;

public class GetProducts {

    private ProductRepository productRepository;

    public GetProducts(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ArrayList<Product> execute() {
        return productRepository.getAll();
    }

}
