package com.example.myapplication.production;

public class Stock {
    private int mStoreId;
    private int mProductId;
    private int mQuantity;

    public Stock(int storeId, int productId, int quantity) {
        this.mStoreId = storeId;
        this.mProductId = productId;
        this.mQuantity = quantity;
    }

    public int getStoreId() {
        return mStoreId;
    }

    public void setStoreId(int storeId) {
        this.mStoreId = storeId;
    }

    public int getProductId() {
        return mProductId;
    }

    public void setProductId(int productId) {
        this.mProductId = productId;
    }

    public int getQuantity() {
        return mQuantity;
    }

    public void setQuantity(int quantity) {
        this.mQuantity = quantity;
    }
}
