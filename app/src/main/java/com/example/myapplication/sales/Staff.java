package com.example.myapplication.sales;

public class Staff extends Person {
    private boolean mActive;
    private int mStoreId;
    private int mManagerId;

    public Staff(String staffId, String firstName, String lastName, String email, String phone,
                 boolean mActive, int mStoreId, int mManagerId) {
        super(staffId, firstName, lastName, email, phone);
        this.mActive = mActive;
        this.mStoreId = mStoreId;
        this.mManagerId = mManagerId;
    }

    public boolean isActive() {
        return mActive;
    }

    public void setActive(boolean mActive) {
        this.mActive = mActive;
    }

    public int getStoreId() {
        return mStoreId;
    }

    public void setStoreId(int mStoreId) {
        this.mStoreId = mStoreId;
    }

    public int getManagerId() {
        return mManagerId;
    }

    public void setManagerId(int mManagerId) {
        this.mManagerId = mManagerId;
    }
}
