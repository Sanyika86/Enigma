package com.example.lakat.enigmaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Altalanos_tesztek extends AppCompatActivity implements View.OnClickListener{

    private CardView elso_teszt,masodik_teszt,harmadik_teszt,negyedik_teszt,otodik_teszt,hatodik_teszt,hetedik_teszt,nyolcadik_teszt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_tesztek);

         elso_teszt =(CardView) findViewById(R.id.altalanos_teszt_elso);
         masodik_teszt =(CardView) findViewById(R.id.altalanos_iskola_masodik);
         harmadik_teszt =(CardView)  findViewById(R.id.altalanos_iskola_harmadik);
         negyedik_teszt =(CardView)  findViewById(R.id.altalanos_iskola_negyedik);
         otodik_teszt =(CardView)  findViewById(R.id.altalanos_iskola_otodik);
         hatodik_teszt =(CardView)  findViewById(R.id.altalanos_iskola_hatodik);
         hetedik_teszt =(CardView)  findViewById(R.id.altalanos_iskola_hetedik);
         nyolcadik_teszt =(CardView)  findViewById(R.id.altalanos_iskola_nyolcadik);

        elso_teszt.setOnClickListener(this);
        masodik_teszt.setOnClickListener(this);
        harmadik_teszt.setOnClickListener(this);
        negyedik_teszt.setOnClickListener(this);
        otodik_teszt.setOnClickListener(this);
        hatodik_teszt.setOnClickListener(this);
        hetedik_teszt.setOnClickListener(this);
        nyolcadik_teszt.setOnClickListener(this);
    }
    public void onClick(View view){

        Intent i;

        switch (view.getId()){

            case R.id.altalanos_teszt_elso : i=new Intent(this,Alt_teszt_elso_osztaly.class);startActivity(i);break;


        }


    }
}
