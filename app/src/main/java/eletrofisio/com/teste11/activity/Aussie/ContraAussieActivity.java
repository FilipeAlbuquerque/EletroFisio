package eletrofisio.com.teste11.activity.Aussie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class ContraAussieActivity extends AppCompatActivity {

    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contra_aussie);


        botaoVoltar = (Button) findViewById(R.id.botaoVoltarAussie_2);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ContraAussieActivity.this, AussieActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
