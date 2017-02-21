package eletrofisio.com.teste11.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import eletrofisio.com.teste11.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends Fragment {

    private EditText editNome, editEmail;
    private Button botaoOK;


    public CameraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_camera, container, false);

        editNome = (EditText) view.findViewById(R.id.editText_nome);
        editEmail = (EditText) view.findViewById(R.id.editText_email);
        botaoOK = (Button) view.findViewById(R.id.botao_ok);

        botaoOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CameraFragment.this.getActivity(), "Cliked",
                        Toast.LENGTH_LONG).show();



            }
        });



        return view;
    }

}
