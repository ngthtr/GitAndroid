package com.example.myapplication.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.Set;

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String TAG = "DatabaseHelper";

    private static DatabaseHelper mDatabaseHelper;
    private final DataHelper mDataHelper;
    private final Context mContext;

    private DatabaseHelper(@Nullable Context context) {
        super(context, DatabaseContract.DATABASE_NAME, null, DatabaseContract.DATABASE_VERSION);
        mDataHelper = new DataHelper();
        mContext = context;
    }

    public static DatabaseHelper getInstance(Context context) {
        if (mDatabaseHelper == null) {
            mDatabaseHelper = new DatabaseHelper(context);
        }
        return mDatabaseHelper;
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        Log.i(TAG, "onCreate() is called");
        createMilkTeaTable(database);
        createFastFoodTable(database);
        createEmployeeTable(database);

        createDataMilkTeaTable(database);
        createDataFastFoodTable(database);
        createDataEmployeeTable(database);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Log.i(TAG, "onUpgrade() is called");

    }

    private void createMilkTeaTable(SQLiteDatabase database) {
        Log.i(TAG, "createMilkTeaTable() is called");

        String queryClause = "CREATE TABLE IF NOT EXISTS " + DatabaseContract.MilkTeaTable.NAME
                + "(" + DatabaseContract.MilkTeaTable.Column.ID + " INTEGER, "
                + DatabaseContract.MilkTeaTable.Column.NAME + " TEXT, "
                + DatabaseContract.MilkTeaTable.Column.PRICE + " INTEGER)";
        database.execSQL(queryClause);
    }

    private void createFastFoodTable(SQLiteDatabase database) {
        Log.i(TAG, "createFastFoodTable() is called");

        String queryClause = "CREATE TABLE IF NOT EXISTS " + DatabaseContract.FastFoodTable.NAME
                + "(" + DatabaseContract.FastFoodTable.Column.ID + " INTEGER, "
                + DatabaseContract.FastFoodTable.Column.NAME + " TEXT, "
                + DatabaseContract.FastFoodTable.Column.PRICE + " INTEGER)";
        database.execSQL(queryClause);
    }

    private void createEmployeeTable(SQLiteDatabase database) {
        Log.i(TAG, "createEmployeeTable() is called");

        String queryClause = "CREATE TABLE IF NOT EXISTS " + DatabaseContract.EmployeeTable.NAME
                + "(" + DatabaseContract.EmployeeTable.Column.ID + " INTEGER, "
                + DatabaseContract.EmployeeTable.Column.NAME + " TEXT, "
                + DatabaseContract.EmployeeTable.Column.PHONE + " TEXT, "
                + DatabaseContract.EmployeeTable.Column.BRANCH_ID + " INTEGER, "
                + DatabaseContract.EmployeeTable.Column.DEPARTMENT_ID + " INTEGER, "
                + DatabaseContract.EmployeeTable.Column.LEVEL_ID + " INTEGER, "
                + DatabaseContract.EmployeeTable.Column.EMAIL + "TEXT)"
                ;

        database.execSQL(queryClause);
    }

    private void createDataMilkTeaTable(SQLiteDatabase database) {
        Log.i(TAG, "createDataMilkTeaTable() is called");

        Set<MilkTea> milkTeaSet = mDataHelper.getDataMilkTea(mContext);
        for (MilkTea milkTea : milkTeaSet) {
            ContentValues values = new ContentValues();
            values.put(DatabaseContract.MilkTeaTable.Column.ID, milkTea.getId());
            values.put(DatabaseContract.MilkTeaTable.Column.NAME, milkTea.getName());
            values.put(DatabaseContract.MilkTeaTable.Column.PRICE, milkTea.getPrice());
            Log.i(TAG, "createDataMilkTeaTable(): " + milkTea.toString());
            database.insert(DatabaseContract.MilkTeaTable.NAME, null, values);
        }
    }

    private void createDataFastFoodTable(SQLiteDatabase database) {
        Log.i(TAG, "createDataFastFoodTable() is called");

        Set<FastFood> fastFoodSet = mDataHelper.getDataFastFood(mContext);
        for (FastFood fastFood : fastFoodSet) {
            ContentValues values = new ContentValues();
            values.put(DatabaseContract.FastFoodTable.Column.ID, fastFood.getId());
            values.put(DatabaseContract.FastFoodTable.Column.NAME, fastFood.getName());
            values.put(DatabaseContract.FastFoodTable.Column.PRICE, fastFood.getPrice());
            Log.i(TAG, "createDataFastFoodTable(): " + fastFood.toString());
            database.insert(DatabaseContract.FastFoodTable.NAME, null, values);
        }
    }

    private void createDataEmployeeTable(SQLiteDatabase database) {
        Log.i(TAG, "createDataEmployeeTable() is called");

        Set<Employee> employeeSet = mDataHelper.getDataEmployee(mContext);
        for (Employee employee : employeeSet) {
            ContentValues values = new ContentValues();
            values.put(DatabaseContract.EmployeeTable.Column.ID, employee.getId());
            values.put(DatabaseContract.EmployeeTable.Column.NAME, employee.getName());
            values.put(DatabaseContract.EmployeeTable.Column.PHONE, employee.getPhone());
            Log.i(TAG, "createDataEmployeeTable(): " + employee.toString());
            database.insert(DatabaseContract.EmployeeTable.NAME, null, values);
        }
    }

    private void deleteOneData(String tableName, String whereClause, String[] whereArgs) {
        Log.i(TAG, "deleteOneData() is called with table_name = [" + tableName + "]");

        SQLiteDatabase database = mDatabaseHelper.getWritableDatabase();
        int result = database.delete(tableName, whereClause, whereArgs);
        Log.i(TAG, "deleteOneData(): has " + result + " row are deleted");
    }

    private void insertOneData(String tableName, String nullColumnHack, ContentValues values) {
        Log.i(TAG, "insertOneData() is called with table_name = [" + tableName + "]");

        SQLiteDatabase database = mDatabaseHelper.getWritableDatabase();
        long result = database.insert(tableName, nullColumnHack, values);
        Log.i(TAG, "insertOneData(): has " + result + " are inserted");
    }

    private void updateOneData(String tableName, ContentValues values, String whereClause, String[] whereArgs) {
        Log.i(TAG, "updateOneData() is called with table_name = [" + tableName + "]");

        SQLiteDatabase database = mDatabaseHelper.getWritableDatabase();
        int result = database.update(tableName, values, whereClause, whereArgs);
        Log.i(TAG, "updateOneData(): has " + result + " are updated");
    }
}
