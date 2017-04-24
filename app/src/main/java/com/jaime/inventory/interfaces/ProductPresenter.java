package com.jaime.inventory.interfaces;


import android.content.Context;
import android.database.Cursor;

public interface ProductPresenter {

    interface View {

    }

    Cursor requestAllProducts(Context context);
}
