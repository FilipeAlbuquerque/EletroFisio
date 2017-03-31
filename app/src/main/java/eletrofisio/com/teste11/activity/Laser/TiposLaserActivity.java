package eletrofisio.com.teste11.activity.Laser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class TiposLaserActivity extends AppCompatActivity {

    private Button botaoVoltarLaser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_laser);


        botaoVoltarLaser = (Button) findViewById(R.id.botaoVoltarLaser);


        botaoVoltarLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TiposLaserActivity.this, LaserActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
