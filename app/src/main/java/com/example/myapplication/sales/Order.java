package com.example.myapplication.sales;

import java.util.Date;

public class Order {
    private int mOrderId;
    private int mCustomerId;
    private int mOrderStatus;
    private Date mOrderDate;
    private Date mRequiredDate;
    private Date mShippedDate;
    private int mStoreId;
    private int mStaffId;

    public Order(int mOrderId, int mCustomerId, int mOrderStatus, Date mOrderDate,
                 Date mRequiredDate, Date mShippedDate, int mStoreId, int mStaffId) {
        this.mOrderId = mOrderId;
        this.mCustomerId = mCustomerId;
        this.mOrderStatus = mOrderStatus;
        this.mOrderDate = mOrderDate;
        this.mRequiredDate = mRequiredDate;
        this.mShippedDate = mShippedDate;
        this.mStoreId = mStoreId;
        this.mStaffId = mStaffId;
    }
}
