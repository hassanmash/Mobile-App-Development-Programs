package com.example.clipdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ec,ep;
    Button copy,paste;
    ClipboardManager cbm;
    ClipData data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbm=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
        ec=findViewById(R.id.ec);
        ep=findViewById(R.id.ep);
        copy=findViewById(R.id.copy);
        paste=findViewById(R.id.paste);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=ClipData.newPlainText("text",ec.getText().toString());
                cbm.setPrimaryClip(data);
                Toast.makeText(MainActivity.this, "copieeeeeeeeeeeeed", Toast.LENGTH_SHORT).show();
            }
        });
        paste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipData hello=cbm.getPrimaryClip();
                ClipData.Item item=hello.getItemAt(0);
                ep.setText(item.getText().toString());
                Toast.makeText(MainActivity.this, "text pasted...................", Toast.LENGTH_SHORT).show();
            }
        });
    }
}