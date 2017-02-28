package eletrofisio.com.teste11.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eletrofisio.com.teste11.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContraIndicacaoFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public ContraIndicacaoFragment() {
        // Required empty public constructor
    }


    public static ContraIndicacaoFragment newInstance(String param1, String param2) {
        ContraIndicacaoFragment contraIndicacaoFragment = new ContraIndicacaoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        contraIndicacaoFragment.setArguments(args);
        return contraIndicacaoFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contra_indicacao, container, false);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

}
