package core.entity;

public class Sale {
    private String id;
    private String customerId;
    private String productId;
    private String storeId;
    private String date;

    public Sale(String id, String customerId, String productId, String storeId, String date) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.storeId = storeId;
        this.date = date;
    }
}
