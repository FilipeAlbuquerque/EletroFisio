package eletrofisio.com.teste11.activity.Laser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.MainActivity;

public class LaserActivity extends AppCompatActivity {

    private Button tiposLaser;
    private Button dosimetriaLaser;
    private Button indicacoesLaser;
    private Button contraIndLaser;
    private Button cuidadosLaser;
    private Button botaoVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laser);


        tiposLaser = (Button) findViewById(R.id.tiposLaser);
        dosimetriaLaser = (Button) findViewById(R.id.dosimetriaLaser);
        indicacoesLaser = (Button) findViewById(R.id.indicacoesLaser);
        contraIndLaser = (Button) findViewById(R.id.contraIndLaser);
        cuidadosLaser = (Button) findViewById(R.id.cuidadosLaser);
        botaoVoltar = (Button) findViewById(R.id.botaoVoltarLaser);


        //Eventos de clique

        tiposLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LaserActivity.this, TiposLaserActivity.class);
                startActivity(intent);
                finish();
            }
        });

        dosimetriaLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LaserActivity.this, DosimetriaLaserActivity.class);
                startActivity(intent);
                finish();
            }
        });

        indicacoesLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LaserActivity.this, IndicacoesLaserActivity.class);
                startActivity(intent);
                finish();
            }
        });

        contraIndLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LaserActivity.this, ContraIndLaserActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LaserActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
