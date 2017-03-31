package eletrofisio.com.teste11.activity.Laser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class CuidadosLaserActivity extends AppCompatActivity {
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuidados_laser);


        botaoVoltar = (Button) findViewById(R.id.botaoVoltar_laser);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CuidadosLaserActivity.this, LaserActivity.class);
                startActivity(intent);
                finish();

            }
        });


    }
}
