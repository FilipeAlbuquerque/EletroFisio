package eletrofisio.com.teste11.activity.TENS;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;
import eletrofisio.com.teste11.activity.MainActivity;

public class BurstActivity extends AppCompatActivity {
    private Button botaoVoltar1;
    private Button botaoVoltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burst);

        botaoVoltar1 = (Button) findViewById(R.id.botao_voltar1);
        botaoVoltar2 = (Button) findViewById(R.id.botao_voltar2);

        botaoVoltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BurstActivity.this, TensActivity.class);
                startActivity( intent );
                finish();
            }
        });

        botaoVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BurstActivity.this, MainActivity.class);
                startActivity( intent );
                finish();
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(getApplicationContext(), "onDestroy metodo chamado", Toast.LENGTH_SHORT).show();
    }
}
