package com.example.texttospeechdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText ip;
    Button cts;
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ip=findViewById(R.id.ip);
        cts=findViewById(R.id.cts);
        tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status!=TextToSpeech.ERROR)
                {
                    tts.setLanguage(Locale.ENGLISH);
                }
            }
        });

        cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=ip.getText().toString();
                tts.speak(data,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }
}