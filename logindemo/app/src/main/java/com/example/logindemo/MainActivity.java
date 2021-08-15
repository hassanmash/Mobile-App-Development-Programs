package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText sun,spw;
    Button su;
    String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,100}$";
    Pattern pattern;
    public  boolean isValid(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sun=findViewById(R.id.sun);
        spw=findViewById(R.id.spw);
        su=findViewById(R.id.su);
        pattern = Pattern.compile(PASSWORD_PATTERN);
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String un=sun.getText().toString();
                String pw=spw.getText().toString();
                if(isValid(pw)) {
                    Intent i = new Intent(MainActivity.this, LoginPage.class);
                    Bundle b = new Bundle();
                    b.putString("un", un);
                    b.putString("pw", pw);
                    i.putExtras(b);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid Password Format", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}