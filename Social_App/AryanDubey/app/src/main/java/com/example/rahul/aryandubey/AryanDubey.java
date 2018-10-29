package com.example.rahul.aryandubey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class AryanDubey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aryan_dubey);
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                Intent intent = new Intent(AryanDubey.this, AboutAryan.class);
                startActivity(intent);

            }
        };
        Timer t = new Timer();
        t.schedule(task, 5000);

    }
}
