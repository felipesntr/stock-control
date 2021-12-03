package core.usecase.registers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import core.entity.Sale;
import core.repository.SaleRepository;

public class RegisterSaleTest {
    class RegisterSaleRepositoryMemory implements SaleRepository {

        @Override
        public boolean saveSale(Sale sale) {
            if (sale.getId() == null ||
                    sale.getCustomerId() == null ||
                    sale.getProductId() == null ||
                    sale.getStoreId() == null ||
                    sale.getDate() == null) {
                return false;
            }
            return true;
        }

        @Override
        public boolean getSaleById(String id) {
            // TODO Auto-generated method stub
            return true;
        }

    }

    @Test
    public void register_with_some_atr_null() {
        RegisterSaleRepositoryMemory registerSaleRepository = new RegisterSaleRepositoryMemory();
        RegisterSale registerSale = new RegisterSale(registerSaleRepository);
        boolean registration_result;
        Sale sale;

        sale = new Sale(null, "valid", "valid", "valid", "valid");
        registration_result = registerSale.execute(sale);
        assertEquals(false, registration_result);

        sale = new Sale("valid", null, "valid", "valid", "valid");
        registration_result = registerSale.execute(sale);
        assertEquals(false, registration_result);

        sale = new Sale("valid", "valid", null, "valid", "valid");
        registration_result = registerSale.execute(sale);
        assertEquals(false, registration_result);

        sale = new Sale("valid", "valid", "valid", null, "valid");
        registration_result = registerSale.execute(sale);
        assertEquals(false, registration_result);

        sale = new Sale("valid", "valid", "valid", "valid", null);
        registration_result = registerSale.execute(sale);
        assertEquals(false, registration_result);

    }
}
