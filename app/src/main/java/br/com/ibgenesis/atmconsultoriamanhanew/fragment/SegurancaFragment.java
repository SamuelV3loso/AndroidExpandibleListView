package br.com.ibgenesis.atmconsultoriamanhanew.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.ibgenesis.atmconsultoriamanhanew.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SegurancaFragment extends Fragment {


    public SegurancaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seguranca, container, false);
    }

}
