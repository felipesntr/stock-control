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

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getProductId() {
        return productId;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getDate() {
        return date;
    }

}
