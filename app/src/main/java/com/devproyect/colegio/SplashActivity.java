package com.devproyect.colegio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    public static long tiempo =3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,clsPrincipal.class));
            }
        };
        Timer timer= new Timer();
        timer.schedule(timerTask,tiempo);


    }
}
