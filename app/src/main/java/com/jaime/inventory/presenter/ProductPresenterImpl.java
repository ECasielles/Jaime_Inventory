package com.jaime.inventory.presenter;

import android.content.Context;
import android.database.Cursor;

import com.jaime.inventory.database.DatabaseManager;
import com.jaime.inventory.interfaces.ProductPresenter;

public class ProductPresenterImpl implements ProductPresenter {

    @Override
    public Cursor requestAllProducts(Context context) {
        return DatabaseManager.getInstance(context).getAllProduct();
    }
}
