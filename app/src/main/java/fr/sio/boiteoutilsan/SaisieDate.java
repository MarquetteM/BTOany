package fr.sio.boiteoutilsan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SaisieDate extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_date);
    }

    public void saisieDateHeure(View view) {
        intent = new Intent(SaisieDate.this, MainActivity.class);
        startActivity(intent);
    }

}