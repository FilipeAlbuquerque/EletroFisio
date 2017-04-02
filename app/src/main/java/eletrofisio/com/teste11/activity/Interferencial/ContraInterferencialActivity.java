package eletrofisio.com.teste11.activity.Interferencial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import eletrofisio.com.teste11.R;

public class ContraInterferencialActivity extends AppCompatActivity {

    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contra_interferencial);


        botaoVoltar = (Button) findViewById(R.id.botaoVoltar_Interfe_3);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ContraInterferencialActivity.this, InterferencialActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
