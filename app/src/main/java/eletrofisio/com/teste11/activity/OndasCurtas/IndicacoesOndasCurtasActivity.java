package eletrofisio.com.teste11.activity.OndasCurtas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class IndicacoesOndasCurtasActivity extends AppCompatActivity {

    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicacoes_ondas_curtas);



        botaoVoltar = (Button) findViewById(R.id.botaoVoltar_OndasCurtas);


        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndicacoesOndasCurtasActivity.this, OndasCurtasActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
