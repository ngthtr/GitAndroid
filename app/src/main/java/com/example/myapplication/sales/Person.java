package com.example.myapplication.sales;

public class Person {
    private String mStaffId;
    private String mFirstName;
    private String mLastName;
    private String mEmail;
    private String mPhone;


    public Person(String staffId, String firstName, String lastName, String email, String phone) {
        this.mStaffId = staffId;
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mEmail = email;
        this.mPhone = phone;
    }

    public String getStaffId() {
        return mStaffId;
    }

    public void setStaffId(String mStaffId) {
        this.mStaffId = mStaffId;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }


}
