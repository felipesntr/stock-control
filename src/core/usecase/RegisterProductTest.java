package core.usecase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import core.entity.Product;
import core.repository.RegisterProductRepository;

public class RegisterProductTest {
    class RegisterProductRepositoryMemory implements RegisterProductRepository {

        @Override
        public boolean saveProduct(Product product) {
            if (product.getName() == null ||
                    product.getName() == null ||
                    product.getPrice() == 0 ||
                    product.getDescription() == null ||
                    product.getCategory() == null) {
                return false;
            }
            return true;
        }

        @Override
        public boolean getProductById(String id) {
            // TODO Auto-generated method stub
            return false;
        }

    }

    @Test
    public void register_with_some_atr_null() {
        RegisterProductRepositoryMemory registerProductRepository = new RegisterProductRepositoryMemory();
        RegisterProduct registerProduct = new RegisterProduct(registerProductRepository);
        boolean registration_result;
        Product product;
        // ensure that the client is not registered if least one field is null
        product = new Product(null, "valid", 21, "valid");
        registration_result = registerProduct.execute(product);
        assertEquals(false, registration_result);

        product = new Product("valid", null, 32, "valid");
        registration_result = registerProduct.execute(product);
        assertEquals(false, registration_result);

        product = new Product("valid", null, 44, "valid");
        registration_result = registerProduct.execute(product);
        assertEquals(false, registration_result);

        product = new Product("valid", "valid", 0, "valid");
        registration_result = registerProduct.execute(product);
        assertEquals(false, registration_result);

        product = new Product("valid", "valid", 22, null);
        registration_result = registerProduct.execute(product);
        assertEquals(false, registration_result);
    }
}
