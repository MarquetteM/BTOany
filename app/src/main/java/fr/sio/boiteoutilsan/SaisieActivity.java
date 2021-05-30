package fr.sio.boiteoutilsan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SaisieActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("BTO","Arrive sur page saisie");

        setContentView(R.layout.activity_saisie);
    }

    public void retour(View view) {
        intent = new Intent(SaisieActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void validation(View view) {
        //récupération du texte saisie
        //envoi du texte saisie à la page d'accueil

        //récupération du contenu saisi
        final EditText textSaisi = findViewById(R.id.textSaisiePage);
        intent = new Intent(SaisieActivity.this, MainActivity.class);
        intent.putExtra("textSaisiActivity",textSaisi.getText().toString());
        startActivity(intent);
    }
}