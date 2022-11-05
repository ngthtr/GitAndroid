package com.example.myapplication.sales;

public class Store {
    private String mStoreId;
    private String mStoreName;
    private String mPhone;
    private String mEmail;
    private Street mStreet;
    private String mCity;
    private String mState;
    private int mZipCode;

    public Store(String storeId, String storeName, String phone, String email, Street street,
                 String city, String state, int zipCode) {
        this.mStoreId = storeId;
        this.mStoreName = storeName;
        this.mPhone = phone;
        this.mEmail = email;
        this.mStreet = street;
        this.mCity = city;
        this.mState = state;
        this.mZipCode = zipCode;
    }

    public String getStoreId() {
        return mStoreId;
    }

    public void setStoreId(String storeId) {
        this.mStoreId = storeId;
    }

    public String getStoreName() {
        return mStoreName;
    }

    public void setStoreName(String storeName) {
        this.mStoreName = storeName;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        this.mPhone = phone;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public Street getStreet() {
        return mStreet;
    }

    public void setStreet(Street street) {
        this.mStreet = street;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        this.mCity = city;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        this.mState = state;
    }

    public int getZipCode() {
        return mZipCode;
    }

    public void setZipCode(int zipCode) {
        this.mZipCode = zipCode;
    }
}
