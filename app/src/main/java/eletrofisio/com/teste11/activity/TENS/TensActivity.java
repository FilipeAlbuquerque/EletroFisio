package eletrofisio.com.teste11.activity.TENS;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.MainActivity;

public class TensActivity extends AppCompatActivity {
    private Button botaoVoltarMain;
    private Button tensConvencional;
    private Button tensBreveIntensa;
    private Button tensAcunputural;
    private Button tensBurst;
    private Button indicacoes;
    private Button contraIndicacoes;


    //Método para chamada de tens convencional deve ser transformada em botão.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tens);

        botaoVoltarMain = (Button) findViewById(R.id.id_botaoVoltar);
        tensConvencional = (Button) findViewById(R.id.botaoConvencional);
        tensBreveIntensa = (Button) findViewById(R.id.botaoBreveIntensa);
        tensAcunputural = (Button) findViewById(R.id.botaoAcupuntural);
        tensBurst = (Button) findViewById(R.id.botaoBurst);
        indicacoes = (Button) findViewById(R.id.botaoIndicacoes);
        contraIndicacoes = (Button) findViewById(R.id.botaoContraIndicacoes);



        tensConvencional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TensActivity.this, TensConvActivity.class);
                startActivity( intent );
                finish();
            }
        });

        tensBreveIntensa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TensActivity.this, BreveIntensaActivity.class);
                startActivity( intent );
                finish();

            }
        });

        tensBurst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TensActivity.this, BurstActivity.class);
                startActivity( intent );
                finish();
            }
        });

        tensAcunputural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TensActivity.this, AcupunturalActivity.class);
                startActivity( intent );
                finish();
            }
        });

        indicacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TensActivity.this, IndicacoesTensActivity.class);
                startActivity( intent );
                finish();
            }
        });

        contraIndicacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TensActivity.this, ContraTensActivity.class);
                startActivity( intent );
                finish();
            }
        });

        botaoVoltarMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* InicioFragment inicioFragment = new InicioFragment();
                FragmentManager manager = getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.relativelayout_for_fragment, inicioFragment,
                        inicioFragment.getTag())
                        .commit();*/

               Intent intent = new Intent(TensActivity.this, MainActivity.class);
                startActivity( intent );
                finish();

            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(getApplicationContext(), "onDestroy metodo chamado", Toast.LENGTH_SHORT).show();
    }
}

