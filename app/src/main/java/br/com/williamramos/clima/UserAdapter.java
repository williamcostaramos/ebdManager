package br.com.williamramos.clima;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by catolica2017 on 30/11/17.
 */

public class UserAdapter extends ArrayAdapter<User> {
    private Context context;
    private ArrayList<User> lista;


    public UserAdapter(Context context, ArrayList<User> lista) {
        super(context, 0, lista);
        this.context = context;
        this.lista = lista;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        User posicao= lista.get(position);

//        convertView= (LayoutInflater) LayoutInflater.from(context).inflate(R.layout.)

        return convertView;


    }
}
