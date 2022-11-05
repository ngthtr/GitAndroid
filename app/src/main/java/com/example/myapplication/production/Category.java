package com.example.myapplication.production;


public class Category {
    private int mCategoryId;
    private String mCategoryName;

    public Category(int categoryId, String categoryName) {
        this.mCategoryId = categoryId;
        this.mCategoryName = categoryName;
    }

    public int getCategoryId() {
        return mCategoryId;
    }

    public void setCategoryId(int categoryId) {
        this.mCategoryId = categoryId;
    }

    public String getCategoryName() {
        return mCategoryName;
    }

    public void setCategoryName(String categoryName) {
        this.mCategoryName = categoryName;
    }
}
