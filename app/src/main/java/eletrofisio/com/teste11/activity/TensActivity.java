package eletrofisio.com.teste11.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import eletrofisio.com.teste11.R;

public class TensActivity extends AppCompatActivity {
    private Button botaoVoltarMain;
    private TextView tensConv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tens);

        botaoVoltarMain = (Button) findViewById(R.id.id_botaoVoltar);
        tensConv = (TextView) findViewById(R.id.id_tensConv);

        botaoVoltarMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TensActivity.this, MainActivity.class);
                startActivity( intent );
                finish();

            }
        });

        tensConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TensActivity.this, TensConvActivity.class);
                startActivity( intent );
                finish();
            }
        });


    }
}