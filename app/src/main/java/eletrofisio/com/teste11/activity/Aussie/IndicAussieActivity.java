package eletrofisio.com.teste11.activity.Aussie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class IndicAussieActivity extends AppCompatActivity {

    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indic_aussie);

        botaoVoltar = (Button) findViewById(R.id.btVoltarAussie_1);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IndicAussieActivity.this, AussieActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
