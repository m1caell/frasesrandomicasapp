package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases = {
            "Hoje está um lindo dia!",
            "Hoje o dia está feio.",
            "Que pena, parece que irá chover."
    };



    private String escolherFraseDoArray(String[] frases) {
        Random numeroRandomico = new Random();

        return frases[numeroRandomico.nextInt(frases.length)];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);
        textoNovaFrase = findViewById(R.id.novaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textoNovaFrase.setText(escolherFraseDoArray(frases));
            }
        });
    }
}
