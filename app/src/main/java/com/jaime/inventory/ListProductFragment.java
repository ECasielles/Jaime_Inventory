package com.jaime.inventory;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.jaime.inventory.interfaces.ProductPresenter;
import com.jaime.inventory.presenter.ProductPresenterImpl;


public class ListProductFragment extends ListFragment {

    private ListProductListener mcallback;
    private ProductPresenter presenter;
    private ListAdapter mAdapter;

    //Cuando listamos los elementos usamos addProductListener
    //Comunicamos la MainActivity con su fragment
    public interface ListProductListener {
        public void onAddProductListener();
    }

    //Usamos el obsoleto
    //La diferencia con los demás es que el que pide Context por parámetro
    //solo funciona en API24+ por lo que no nos funcionaría
    //Hasta que eso no se arregle, usamos este.
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mcallback = (ListProductListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(getActivity().toString() + " must implement ListProductListener");
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new ProductPresenterImpl();
        //Guarda la instancia del fragment en la pila de llamadas.
        //Hacemos esto porque tenemos sólo una actividad con muchos Fragment.
        setRetainInstance(true);
    }

    //Cuando se crea la vista.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_listproduct, container, false);
        return rootView;
    }

    //Cuando se ha creado ya la vista.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Le pasamos el adapter porque la vista ya está creada. Hacerlo en onCreateView nos da NullPointerEx
        setListAdapter(mAdapter);
    }


}
