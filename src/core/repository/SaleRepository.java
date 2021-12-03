package core.repository;

import core.entity.Sale;

public interface SaleRepository {

    public boolean saveSale(Sale sale);

    public boolean getSaleById(String id);

}
