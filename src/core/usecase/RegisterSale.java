package core.usecase;

import core.entity.Sale;
import core.repository.RegisterSaleRepository;

public class RegisterSale {
    private RegisterSaleRepository registerSaleRepository;

    public RegisterSale(RegisterSaleRepository registerSaleRepository) {
        this.registerSaleRepository = registerSaleRepository;
    }

    public boolean execute(Sale sale) {
        boolean result = registerSaleRepository.saveSale(sale);
        return result;
    }
}
