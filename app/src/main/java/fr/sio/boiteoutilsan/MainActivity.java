package fr.sio.boiteoutilsan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Intent intent, intentSaisi;
    private String textSaisi;
    private TextView affTextSaisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        affTextSaisi = findViewById(R.id.texteSaisi);
        //Retour activité saisie
        intent = getIntent();
        if (intent.hasExtra("textSaisiActivity")){
            textSaisi = intent.getStringExtra("textSaisiActivity");
            affTextSaisi.setText(textSaisi);
        }

    }

    public void pageSaisie(View view) {
        Log.i("BTO","click bouton page saisie");
        intentSaisi = new Intent(MainActivity.this, SaisieActivity.class);
        Log.i("BTO","après création intentSaisi");
        startActivity(intentSaisi);
    }

    public void saisieDateHeure(View view) {
        intent = new Intent(MainActivity.this, SaisieDate.class);
        startActivity(intent);
    }
}