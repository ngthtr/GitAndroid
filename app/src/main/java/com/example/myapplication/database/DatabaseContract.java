package com.example.myapplication.database;

public class DatabaseContract {
    public static final String DATABASE_NAME = "MilkTeaDatabase.db";
    public static final int DATABASE_VERSION = 1;

    public static final class MilkTeaTable {
        public static final String NAME = "milk_tea_table";
        public static final class Column {
            public static final String ID = "milk_tea_id_column";
            public static final String NAME = "milk_tea_name_column";
            public static final String PRICE = "milk_tea_price_column";

        }
    }

    public static final class FastFoodTable {
        public static final String NAME = "fast_food_table";
        public static final class Column {
            public static final String ID = "fast_food_id_column";
            public static final String NAME = "fast_food_name_column";
            public static final String PRICE = "fast_food_price_column";

        }
    }

    public static final class EmployeeTable {
        public static final String NAME = "employee_table";
        public static final class Column {
            public static final String ID = "employee_id_column";
            public static final String NAME = "employee_name_column";
            public static final String PHONE = "employee_phone_column";
            public static final String BRANCH_ID = "employee_branch_id_column";
            public static final String DEPARTMENT_ID = "employee_department_id_column";
            public static final String LEVEL_ID = "employee_level_column";
            public static final String EMAIL = "employee_email_column";
        }
    }
}
