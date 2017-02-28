package eletrofisio.com.teste11.activity.TENS;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class IndicacoesTensActivity extends AppCompatActivity {

    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicacoes_tens);


        botaoVoltar = (Button) findViewById(R.id.bt_voltar_tens);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IndicacoesTensActivity.this, TensActivity.class);
                startActivity( intent );
                finish();

            }
        });
    }
}
