package eletrofisio.com.teste11.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.Fes.FesActivity;
import eletrofisio.com.teste11.activity.Interferencial.InterferencialActivity;
import eletrofisio.com.teste11.activity.Laser.LaserActivity;
import eletrofisio.com.teste11.activity.MainActivity;
import eletrofisio.com.teste11.activity.OndasCurtas.OndasCurtasActivity;
import eletrofisio.com.teste11.activity.Russa.RussaActivity;
import eletrofisio.com.teste11.activity.TENS.TensActivity;
import eletrofisio.com.teste11.activity.UltraSom.UltraSomActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AparelhosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AparelhosFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button botaoTens;
    private Button botaoFes;
    private Button botaoUltraSom;
    private Button botaoLaser;
    private Button botaoRussa;
    private Button botaoOndasCurtas;
    private Button botaoInterferencial;
    private Button botaoAussie;
    private Button botaoVoltar;

    public AparelhosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AparelhosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AparelhosFragment newInstance(String param1, String param2) {
        AparelhosFragment fragment = new AparelhosFragment();
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
        View view = inflater.inflate(R.layout.fragment_aparelhos, container, false);

        botaoTens = (Button) view.findViewById(R.id.botao_tens);
        botaoFes = (Button) view.findViewById(R.id.botao_fes);
        botaoUltraSom = (Button) view.findViewById(R.id.botao_ultra_som);
        botaoLaser = (Button) view.findViewById(R.id.botaoLaser);
        botaoRussa = (Button) view.findViewById(R.id.botaoRussa);
        botaoOndasCurtas = (Button) view.findViewById(R.id.botaoOndasCurtas);
        botaoInterferencial = (Button) view.findViewById(R.id.botaoInterferencial);
        botaoVoltar = (Button) view.findViewById(R.id.botaoVoltar);
        botaoAussie = (Button) view.findViewById(R.id.botao_aussie);



        botaoTens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Metodo para chamar a activity.
                chamadaTens(v);


                //Toast.makeText(AparelhosFragment.this.getActivity(),"TENS CHAMADO", Toast.LENGTH_SHORT).show();

            }
        });

        botaoFes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Metodo para chamar a activity
                chamadaFes(v);
            }
        });

        botaoUltraSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamadaUltraSom(v);
            }
        });

        botaoLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamadaLaser(v);
            }
        });

        botaoRussa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamadaRussa(v);
            }
        });

        botaoOndasCurtas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chamadaOndasCurtas(v);

            }
        });

        botaoInterferencial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            chamadaInterferencial(v);
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarInicio(v);
            }
        });

        return view;
    }

    private void voltarInicio(View v) {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }

    private void chamadaInterferencial(View v) {

        Intent intent = new Intent(getActivity(), InterferencialActivity.class);
        startActivity(intent);

    }

    private void chamadaOndasCurtas(View v) {

        Intent intent = new Intent(getActivity(), OndasCurtasActivity.class);
        startActivity(intent);
    }

    private void chamadaRussa(View v) {
        Intent intent = new Intent(getActivity(), RussaActivity.class);
        startActivity(intent);

    }

    private void chamadaLaser(View v) {

        Intent intent = new Intent(getActivity(), LaserActivity.class);
        startActivity(intent);
    }

    private void chamadaUltraSom(View v) {

        Intent intent = new Intent(getActivity(), UltraSomActivity.class);
        startActivity(intent);

    }

    private void chamadaFes(View v) {
        Intent intent = new Intent(getActivity(), FesActivity.class);
        startActivity(intent);

    }

    public void chamadaTens(View v) {
        Intent intent = new Intent(getActivity(), TensActivity.class);
        startActivity(intent);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
