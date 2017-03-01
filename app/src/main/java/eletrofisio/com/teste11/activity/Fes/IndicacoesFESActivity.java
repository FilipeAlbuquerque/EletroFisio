package eletrofisio.com.teste11.activity.Fes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class IndicacoesFESActivity extends AppCompatActivity {

    private Button botaoVoltarFes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicacoes_fes);


        botaoVoltarFes = (Button) findViewById(R.id.botaovoltar_fes);


        botaoVoltarFes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndicacoesFESActivity.this, FesActivity.class);
                startActivity( intent );
                finish();
            }
        });
    }


}
