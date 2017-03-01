package eletrofisio.com.teste11.activity.Fes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.MainActivity;

public class FesActivity extends AppCompatActivity {

    private Button parametrosFES;
    private Button indicacoesFES;
    private Button contraFES;
    private Button botaoVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fes);

        parametrosFES = (Button) findViewById(R.id.botao_parametros_fes);
        indicacoesFES = (Button) findViewById(R.id.botao_indicacoes_fes);
        contraFES = (Button) findViewById(R.id.botao_contra_fes);
        botaoVoltar = (Button) findViewById(R.id.id_botaoVoltar);


        parametrosFES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FesActivity.this, ParametrosFESActivity.class);
                startActivity( intent );
                finish();
            }
        });

        indicacoesFES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FesActivity.this, IndicacoesFESActivity.class);
                startActivity( intent );
                finish();

            }
        });

        contraFES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FesActivity.this, ContraFESActivity.class);
                startActivity( intent );
                finish();

            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FesActivity.this, MainActivity.class);
                startActivity( intent );
                finish();

            }
        });

    }
}
