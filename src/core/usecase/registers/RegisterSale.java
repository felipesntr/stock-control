package core.usecase.registers;

import core.entity.Sale;
import core.repository.SaleRepository;

public class RegisterSale {
    private SaleRepository registerSaleRepository;

    public RegisterSale(SaleRepository registerSaleRepository) {
        this.registerSaleRepository = registerSaleRepository;
    }

    public boolean execute(Sale sale) {
        boolean result = registerSaleRepository.saveSale(sale);
        return result;
    }
}
