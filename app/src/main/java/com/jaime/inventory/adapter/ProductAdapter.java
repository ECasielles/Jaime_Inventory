package com.jaime.inventory.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.CursorLoader;


public class ProductAdapter extends CursorLoader{

    public ProductAdapter(Context context) {
        super(context);
    }

    //Este método engaña a la clase CursorLoader porque no estamos usando
    //ContentProvider
    public Cursor loadInBackground() {
        return super.loadInBackground();
    }


}
