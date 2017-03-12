package eletrofisio.com.teste11.activity.UltraSom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class TecnicaAplicaUSActivity extends AppCompatActivity {

    private Button botaoVoltarUS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecnica_aplica_us);

        botaoVoltarUS = (Button) findViewById(R.id.botaoVoltarUS);

        botaoVoltarUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TecnicaAplicaUSActivity.this, UltraSomActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
