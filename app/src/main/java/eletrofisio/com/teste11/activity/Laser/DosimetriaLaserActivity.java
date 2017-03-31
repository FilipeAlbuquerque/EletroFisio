package eletrofisio.com.teste11.activity.Laser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class DosimetriaLaserActivity extends AppCompatActivity {

    private Button botaoVoltarLaser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosimetria_laser);

        botaoVoltarLaser = (Button) findViewById(R.id.botao_voltar_laser);

        botaoVoltarLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DosimetriaLaserActivity.this, LaserActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
