package eletrofisio.com.teste11.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import eletrofisio.com.teste11.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link IndicacoesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IndicacoesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private Button botaoVoltar;


    public IndicacoesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment IndicacoesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static IndicacoesFragment newInstance(String param1, String param2) {
        IndicacoesFragment fragment = new IndicacoesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_indicacoes, container, false);

        //botaoVoltar = (Button) view.findViewById(R.id.btVoltar_Indic_fragment_1);

        /*botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //voltarInicio(v);
            }
        });*/

        return view;
    }
    /*private void voltarInicio(View v) {

        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }*/

}
