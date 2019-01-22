package com.example.lakat.enigmaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Oktatoanyag extends AppCompatActivity implements View.OnClickListener{
    private CardView altalanos,kozep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oktatoanyag);

        altalanos = (CardView) findViewById(R.id.altalanos_iskola);
        kozep = (CardView) findViewById(R.id.kozep_iskola);

        altalanos.setOnClickListener(this);
        kozep.setOnClickListener(this);
    }

    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.altalanos_iskola : i =new Intent(this,Altalanos.class);startActivity(i); break;
            case R.id.kozep_iskola : i =new Intent(this,Kozep.class);startActivity(i); break;
            default:break;

        }

    }
}
