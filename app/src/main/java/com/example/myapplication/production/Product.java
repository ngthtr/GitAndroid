package com.example.myapplication.production;

public class Product {
    private int mProductId;
    private String mProductName;
    private int mBrandId;
    private int mCategoryId;
    private int mModelYear;
    private double mListPrice;

    public Product(int productId, String productName, int brandId, int categoryId, int modelYear, double listPrice) {
        this.mProductId = productId;
        this.mProductName = productName;
        this.mBrandId = brandId;
        this.mCategoryId = categoryId;
        this.mModelYear = modelYear;
        this.mListPrice = listPrice;
    }

    public int getProductId() {
        return mProductId;
    }

    public void setProductId(int productId) {
        this.mProductId = productId;
    }

    public String getProductName() {
        return mProductName;
    }

    public void setProductName(String productName) {
        this.mProductName = productName;
    }

    public int getBrandId() {
        return mBrandId;
    }

    public void setBrandId(int brandId) {
        this.mBrandId = brandId;
    }

    public int getCategoryId() {
        return mCategoryId;
    }

    public void setCategoryId(int categoryId) {
        this.mCategoryId = categoryId;
    }

    public int getModelYear() {
        return mModelYear;
    }

    public void setModelYear(int modelYear) {
        this.mModelYear = modelYear;
    }

    public double getListPrice() {
        return mListPrice;
    }

    public void setListPrice(double listPrice) {
        this.mListPrice = listPrice;
    }
}
