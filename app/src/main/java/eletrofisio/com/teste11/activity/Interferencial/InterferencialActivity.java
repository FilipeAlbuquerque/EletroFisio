package eletrofisio.com.teste11.activity.Interferencial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.MainActivity;

public class InterferencialActivity extends AppCompatActivity {

    private Button botaoIndic;
    private Button botaoContra;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interferencial);

        botaoIndic = (Button) findViewById(R.id.botaoIndic_Interfe);
        botaoContra = (Button) findViewById(R.id.botaoContra_Interfe);
        botaoVoltar = (Button) findViewById(R.id.botaoVoltarInterfe_1);



        botaoIndic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(InterferencialActivity.this, IndicInterferencialActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoContra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(InterferencialActivity.this, ContraInterferencialActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(InterferencialActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
