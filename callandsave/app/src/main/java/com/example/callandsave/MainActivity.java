package com.example.callandsave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,save,call,del;
    TextView res;
    EditText ip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=findViewById(R.id.res);
        save=findViewById(R.id.save);
        ip=findViewById(R.id.ip);
        b_0=findViewById(R.id.b_0);
        b_1=findViewById(R.id.b_1);
        b_2=findViewById(R.id.b_2);
        b_3=findViewById(R.id.b_3);
        b_4=findViewById(R.id.b_4);
        b_5=findViewById(R.id.b_5);
        b_6=findViewById(R.id.b_6);
        b_7=findViewById(R.id.b_7);
        b_8=findViewById(R.id.b_8);
        b_9=findViewById(R.id.b_9);
        call=findViewById(R.id.call);
        del=findViewById(R.id.del);

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText("");
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+ip.getText().toString()));

                // smsto,http
                startActivity(i);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
                intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
                intent.putExtra(ContactsContract.Intents.Insert.PHONE,
                        ip.getText().toString());
                startActivity(intent);
            }
        });

        b_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"0");
            }
        });
        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"1");

            }
        });
        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"2");

            }
        });
        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"3");

            }
        });
        b_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"4");

            }
        });
        b_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"5");

            }
        });
        b_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"6");

            }
        });
        b_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"7");

            }
        });
        b_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"8");

            }
        });
        b_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+"9");

            }
        });

    }
}