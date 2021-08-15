package com.example.changewallperdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    Thread t;
    int[] images=new int[]{R.drawable.abd,R.drawable.dhoni,R.drawable.gayle,R.drawable.vk};

    @Override
    protected void onResume() {
        super.onResume();
        t.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        t=new Thread()
        {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(30000);
                    SetWallPaper();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetWallPaper();
            }
        });
    }

    private void SetWallPaper()
    {
        int arylength = images.length;
        Random random = new Random();
        int rnum = random.nextInt(arylength);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),images[rnum]);
        WallpaperManager manager =
                WallpaperManager.getInstance(getApplicationContext());
        try {
            manager.setBitmap(bitmap);
            Toast.makeText(this,"Wall Paper changed",Toast.LENGTH_SHORT).show();
        }
        catch(IOException e)
        {
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }
}