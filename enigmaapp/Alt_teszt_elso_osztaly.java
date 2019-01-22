package com.example.lakat.enigmaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;


public class Alt_teszt_elso_osztaly extends AppCompatActivity {

    private TextView mScoreView;
    private TextView mQuestion;

    private Button Choise1, Choise2, Choise3, Choise4;

    private  int mScore=0;
    private int mQuestionNumber=0;
    private String Answer;



    public Alt_teszt_elso_osztaly() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alt_teszt_elso_osztaly);

        mScoreView= findViewById(R.id.score);
        mQuestion= findViewById(R.id.question);

        Choise1= findViewById(R.id.choice1);
        Choise2= findViewById(R.id.choice2);
        Choise3= findViewById(R.id.choice3);


        updateQuestion();


        Choise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Choise1.getText().equals(Answer)){

                    mScore= mScore+1;
                    updateScore(mScore);
                    updateQuestion();

                }else{
                    updateQuestion();
                }
            }
        });

        Choise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Choise2.getText().equals(Answer)){

                    mScore= mScore+1;
                    updateScore(mScore);
                    updateQuestion();

                }else{
                    updateQuestion();
                }
            }
        });

        Choise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Choise3.getText().equals(Answer)){

                    mScore= mScore+1;
                    updateScore(mScore);
                    updateQuestion();

                }else{
                    updateQuestion();
                }
            }
        });





    }

    private  void updateScore(int score){

        mScoreView.setText(getString(R.string.szunet)+ mScore);
    }

    public void updateQuestion(){

        Firebase mQuestionRef = new Firebase("https://enigma-2a729.firebaseio.com/" + mQuestionNumber + "/question");
        mQuestionRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String question=dataSnapshot.getValue(String.class);
                mQuestion.setText(question);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        Firebase mChoise1Ref = new Firebase("https://enigma-2a729.firebaseio.com/" + mQuestionNumber + "/choise1");
        mChoise1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice=dataSnapshot.getValue(String.class);
                Choise1.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        Firebase mChoise2Ref = new Firebase("https://enigma-2a729.firebaseio.com/" + mQuestionNumber + "/choise2");
        mChoise2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice=dataSnapshot.getValue(String.class);
                Choise2.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        Firebase mChoise3Ref = new Firebase("https://enigma-2a729.firebaseio.com/" + mQuestionNumber + "/choise3");
        mChoise3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice=dataSnapshot.getValue(String.class);
                Choise3.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });



        Firebase mAnswerRef = new Firebase("https://enigma-2a729.firebaseio.com/" + mQuestionNumber + "/answer");
        mAnswerRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Answer=dataSnapshot.getValue(String.class);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mQuestionNumber++;


    }
}
