package eletrofisio.com.teste11.activity.OndasCurtas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.MainActivity;

public class OndasCurtasActivity extends AppCompatActivity {

    private Button botaoIndicacoes;
    private Button botaoContraIndicacoes;
    private Button botaoPrecaucoes;
    private Button botaoAplicacao;
    private Button botaoEfeitos;
    private Button botaoTempo;
    private Button botaoVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ondas_curtas);


        botaoIndicacoes = (Button) findViewById(R.id.btIndicacoes_OndasCurtas);
        botaoContraIndicacoes = (Button) findViewById(R.id.bt_Contra_OndasCurtas);
        botaoPrecaucoes = (Button) findViewById(R.id.btPrecaucoes_OndasCurtas);
        botaoAplicacao = (Button) findViewById(R.id.bt_Aplicacao_OndasCurtas);
        botaoEfeitos = (Button) findViewById(R.id.bt_Efeitos_OndasCurtas);
        botaoTempo = (Button) findViewById(R.id.bt_Tempo_OndasCurtas);
        botaoVoltar = (Button) findViewById(R.id.btVoltar_OndasCurtas);


        botaoIndicacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OndasCurtasActivity.this, IndicacoesOndasCurtasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoPrecaucoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OndasCurtasActivity.this, PrecaucoesOndasCurtasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoAplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OndasCurtasActivity.this, AplicacaoOndasCurtasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoContraIndicacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OndasCurtasActivity.this, ContraOndasCurtasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoTempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OndasCurtasActivity.this, TempoOndasCurtasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoEfeitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OndasCurtasActivity.this, EfeitosOndasCurtasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OndasCurtasActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}


