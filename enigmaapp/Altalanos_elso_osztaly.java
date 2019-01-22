package com.example.lakat.enigmaapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class Altalanos_elso_osztaly extends AppCompatActivity {
    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_elso_osztaly);

        videoView =(VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList= new ArrayList<>();
        videoList.add("Összeadás alapjai!");
        videoList.add("Kivonás alapjai!");
        videoList.add("Két számjegyű számok összeadása, maradék nélkül!");
        videoList.add("Kivánás 2-es szint!");
        videoList.add("Két számjegyű számok kivonása!");
        videoList.add("Összeadás 2-es szint!");
        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/osszeadas_alapjai.mp4?alt=media&token=26d38b12-c41d-4fe5-9219-20e4ccc4c865"));break;

                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/kivonas_alapjai.mp4?alt=media&token=131aadae-1f24-4e1f-a0bc-b131e475c117"));break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/ketszamjegyuszamok_osszeadasa.mp4?alt=media&token=0d96bc20-1816-4cce-8045-f3dfb1050a53"));break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/kivonas_kettes_szint.mp4?alt=media&token=609d09af-341b-4c9e-a153-b71008f03a32"));break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/ketszamjegyuszamok_kivonasa.mp4?alt=media&token=c630c9d5-c3a9-4fcc-870a-8f1ba166306c"));break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/osszeadas_kettes_szint.mp4?alt=media&token=96f76c39-bb6f-4b8b-9679-05f6c9bc1e59"));break;


                }
                videoView.setMediaController(new MediaController(Altalanos_elso_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}
