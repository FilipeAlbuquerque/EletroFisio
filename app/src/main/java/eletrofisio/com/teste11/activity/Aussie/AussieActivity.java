package eletrofisio.com.teste11.activity.Aussie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.MainActivity;

public class AussieActivity extends AppCompatActivity {

    private Button botaoIndic;
    private Button botaoContra;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aussie);


        botaoIndic = (Button) findViewById(R.id.botaoIndic_Aussie);
        botaoContra = (Button) findViewById(R.id.btContra_Aussie);
        botaoVoltar = (Button) findViewById(R.id.bt_Voltar_Aussie);



        botaoIndic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AussieActivity.this, IndicAussieActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoContra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AussieActivity.this, ContraAussieActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AussieActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
