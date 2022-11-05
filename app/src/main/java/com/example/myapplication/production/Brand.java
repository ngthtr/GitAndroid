package com.example.myapplication.production;

public class Brand {
    private int mBrandId;
    private String mBrandName;

    public Brand(int brandId, String brandName) {
        this.mBrandId = brandId;
        this.mBrandName = brandName;
    }

    public int getBrandId() {
        return mBrandId;
    }

    public void setBrandId(int brandId) {
        this.mBrandId = brandId;
    }

    public String getBrandName() {
        return mBrandName;
    }

    public void setBrandName(String brandName) {
        this.mBrandName = brandName;
    }
}
