package eletrofisio.com.teste11.activity.Laser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class ContraIndLaserActivity extends AppCompatActivity {

    private Button botaoVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contra_ind_laser);



        botaoVoltar = (Button) findViewById(R.id.bt_voltar_laser);


        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ContraIndLaserActivity.this, LaserActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
