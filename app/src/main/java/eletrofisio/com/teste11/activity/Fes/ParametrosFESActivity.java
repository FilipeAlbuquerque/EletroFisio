package eletrofisio.com.teste11.activity.Fes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.TENS.AcupunturalActivity;
import eletrofisio.com.teste11.activity.TENS.TensActivity;

public class ParametrosFESActivity extends AppCompatActivity {

    private Button botaoVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametros_fes);


        botaoVoltar = (Button) findViewById(R.id.botao_voltar_fes);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ParametrosFESActivity.this, FesActivity.class);
                startActivity( intent );
                finish();

            }
        });
    }
}
