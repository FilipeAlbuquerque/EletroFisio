package eletrofisio.com.teste11.activity.Russa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.MainActivity;

public class RussaActivity extends AppCompatActivity {

    private Button indiRussa;
    private Button paramRussa;
    private Button contraRussa;
    private Button tiposRussa;
    private Button modosRussa;
    private Button btVoltarRussa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_russa);

        indiRussa = (Button) findViewById(R.id.IndiRussa);
        paramRussa = (Button) findViewById(R.id.ParamRussa);
        contraRussa = (Button) findViewById(R.id.ContraRussa);
        tiposRussa = (Button) findViewById(R.id.TiposRussa);
        modosRussa = (Button) findViewById(R.id.ModosRussa);
        btVoltarRussa = (Button) findViewById(R.id.BtVoltar_Russa1);


        indiRussa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RussaActivity.this, IndicRussaActivity.class);
                startActivity(intent);
                finish();

            }
        });

        paramRussa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RussaActivity.this, ParamRussaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        contraRussa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RussaActivity.this, ContraRussaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        tiposRussa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RussaActivity.this, TiposRussaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        modosRussa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RussaActivity.this, ModosRussaActivity.class);
                startActivity(intent);
                finish();
            }
        });


        btVoltarRussa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RussaActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
