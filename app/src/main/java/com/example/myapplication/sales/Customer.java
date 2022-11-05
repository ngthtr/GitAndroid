package com.example.myapplication.sales;

public class Customer extends Person {
    private String mState;
    private Street mStreet;
    private String mCity;

    public Customer(String staffId, String firstName, String lastName, String email, String phone,
                    Street street, String city, String state) {
        super(staffId, firstName, lastName, email, phone);
        this.mStreet = street;
        this.mCity = city;
        this.mState = state;
    }

    public String getState() {
        return mState;
    }

    public void setState(String mState) {
        this.mState = mState;
    }

    public Street getStreet() {
        return mStreet;
    }

    public void setStreet(Street mStreet) {
        this.mStreet = mStreet;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String mCity) {
        this.mCity = mCity;
    }
}
