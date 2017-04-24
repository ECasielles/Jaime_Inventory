package com.jaime.inventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Listamos los elementos de la BD
public class MainActivity extends AppCompatActivity implements ListProductFragment.ListProductListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Se inicializa el Fragment que permite añadir un producto
     */
    @Override
    public void onAddProductListener() {

    }
}
