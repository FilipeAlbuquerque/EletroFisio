package eletrofisio.com.teste11.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.TensActivity;

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


    private TextView tens;

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

        tens = (TextView) view.findViewById(R.id.text_tens);


        tens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Metodo para chamar a activity.
                chamadaTens(v);


                //Toast.makeText(AparelhosFragment.this.getActivity(),"TENS CHAMADO", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
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
