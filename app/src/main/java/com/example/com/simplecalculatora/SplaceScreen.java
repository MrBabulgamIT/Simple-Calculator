package com.example.com.simplecalculatora;


import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplaceScreen extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace_screen);
        progressBar= (ProgressBar) findViewById(R.id.progressBar_id);


        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });
        thread.start();


    }

    public void doWork(){

        for(progress=30;progress<=100;progress=progress+30)
        {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }

    }

    public void startApp(){

        Intent intent= new Intent(SplaceScreen.this,MainActivity.class);
        startActivity(intent);

    }


}
