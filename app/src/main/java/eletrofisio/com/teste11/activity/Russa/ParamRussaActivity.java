package eletrofisio.com.teste11.activity.Russa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class ParamRussaActivity extends AppCompatActivity {


    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param_russa);


        botaoVoltar = (Button) findViewById(R.id.botaoVoltarRussa_3);


        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ParamRussaActivity.this, RussaActivity.class);
                startActivity(intent);
                finish();

            }
        });




    }
}
