package service;

import java.util.ArrayList;

import org.junit.Test;

import core.entity.Product;
import core.repository.ProductRepository;

public class GetProductsTest {

    class ProductRepositoryMemory implements ProductRepository {

        private ArrayList<Product> products = new ArrayList<Product>();

        public ProductRepositoryMemory() {
            products.add(new Product("Product 1", "Description 1", 10.0, "category"));
            products.add(new Product("Product 2", "Description 2", 20.0, "category"));
            products.add(new Product("Product 3", "Description 3", 30.0, "category"));
        }

        @Override
        public boolean saveProduct(Product product) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean getProductById(String id) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public ArrayList<Product> getAll() {
            return this.products;
        }
    }

    @Test
    public void assert_that_get_all_return_all_products() {
        ProductRepositoryMemory productRepository = new ProductRepositoryMemory();
        GetProducts getProducts = new GetProducts(productRepository);
        ArrayList<Product> products = getProducts.execute();
        assert products.size() == 3;
    }
}
