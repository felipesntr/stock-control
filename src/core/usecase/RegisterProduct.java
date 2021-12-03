package core.usecase;

import core.entity.Product;
import core.repository.RegisterProductRepository;

public class RegisterProduct {
    private RegisterProductRepository registerProductRepository;

    public RegisterProduct(RegisterProductRepository registerProductRepository) {
        this.registerProductRepository = registerProductRepository;
    }

    public boolean execute(Product product) {
        boolean result = registerProductRepository.saveProduct(product);
        return result;
    }
}
