package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText lun,lpw;
    Button lg;
    Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        lun=findViewById(R.id.lun);
        lpw=findViewById(R.id.lpw);
        lg=findViewById(R.id.lg);
        b=this.getIntent().getExtras();

        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lpw.getText().toString().equals(b.getString("pw",null))&&lun.getText().toString().equals(b.getString("un",null)))
                {
                    Toast.makeText(LoginPage.this, "You are Valid User", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(LoginPage.this, "You are not valid user", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}