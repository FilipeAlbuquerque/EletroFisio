package eletrofisio.com.teste11.activity.UltraSom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.MainActivity;

public class UltraSomActivity extends AppCompatActivity {

    private Button efeitosUltrasom;
    private Button DosimetriaUltrasom;
    private Button terapeuticaUltrasom;
    private Button aplicacoesUltrasom;
    private Button exemploERAUltrasom;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultra_som);

        efeitosUltrasom = (Button) findViewById(R.id.bt_efeitos_ultrasom);
        DosimetriaUltrasom = (Button) findViewById(R.id.bt_dosimetria_ultrasom);
        terapeuticaUltrasom = (Button) findViewById(R.id.bt_terapeutica_ultrasom);
        aplicacoesUltrasom = (Button) findViewById(R.id.bt_tecnica_ultrassom);
        exemploERAUltrasom = (Button) findViewById(R.id.bt_exemplo_ultrassom);
        botaoVoltar = (Button) findViewById(R.id.botaoVoltarUltrassom);

        //Eventos de clique

        efeitosUltrasom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UltraSomActivity.this, EfeitosUltrassomActivity.class);
                startActivity(intent);
                finish();
            }
        });

        DosimetriaUltrasom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UltraSomActivity.this, DosimetriaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        terapeuticaUltrasom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UltraSomActivity.this, EfeitosTerapeuticosUSActivity.class);
                startActivity(intent);
                finish();
            }
        });

        aplicacoesUltrasom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UltraSomActivity.this, TecnicaAplicaUSActivity.class);
                startActivity(intent);
                finish();
            }
        });

        exemploERAUltrasom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UltraSomActivity.this, ExemploEraActivity.class);
                startActivity(intent);
                finish();
            }
        });


        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UltraSomActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
