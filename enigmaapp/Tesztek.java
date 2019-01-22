package com.example.lakat.enigmaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Tesztek extends AppCompatActivity implements View.OnClickListener{

    private CardView altalanos_iskola_tesztek,kozepiskola_tesztek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tesztek);

        altalanos_iskola_tesztek = (CardView) findViewById(R.id.elsoteszt);
        kozepiskola_tesztek = (CardView) findViewById(R.id.kozep_iskola_teszt);

        altalanos_iskola_tesztek.setOnClickListener(this);
        kozepiskola_tesztek.setOnClickListener(this);
    }
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.elsoteszt : i =new Intent(this,Altalanos_tesztek.class);startActivity(i); break;
            case R.id.kozep_iskola_teszt : i =new Intent(this,Kozep_tesztek.class);startActivity(i); break;

            default:break;

        }

    }
}
