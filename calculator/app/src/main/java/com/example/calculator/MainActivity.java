package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {
    Button b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_add,b_sub,b_mul,b_div,b_dot,b_eq,clear;
    TextView res;
    EditText ip;
    int a,b;
    boolean add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=findViewById(R.id.res);
        clear=findViewById(R.id.clear);
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
        b_add=findViewById(R.id.b_add);
        b_sub=findViewById(R.id.b_sub);
        b_div=findViewById(R.id.b_div);
        b_mul=findViewById(R.id.b_mul);
        b_dot=findViewById(R.id.b_dot);
        b_eq=findViewById(R.id.b_eq);
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
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ip==null)
                {
                    ip.setText("");
                }
                else
                {
                    a =Integer.parseInt( ip.getText().toString());
                    add=true;
                    ip.setText(null);
                }
            }
        });
        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText()+".");

            }
        });
        b_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Integer.parseInt(ip.getText().toString());
                if(add==true)
                {
                    ip.setText(a+b+"");
                    add=false;
                }
                else if(sub==true)
                {

                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText("");
            }
        });


    }
}