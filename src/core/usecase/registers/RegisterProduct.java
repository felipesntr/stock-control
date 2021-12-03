package core.usecase.registers;

import core.entity.Product;
import core.repository.ProductRepository;

public class RegisterProduct {
    private ProductRepository registerProductRepository;

    public RegisterProduct(ProductRepository registerProductRepository) {
        this.registerProductRepository = registerProductRepository;
    }

    public boolean execute(Product product) {
        boolean result = registerProductRepository.saveProduct(product);
        return result;
    }
}
