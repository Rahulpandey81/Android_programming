package com.example.rahul.aryandubey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutAryan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_aryan);
        Button btn1=(Button)findViewById(R.id.btnContact);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(AboutAryan.this,ContactUs.class);
            startActivity(i);
            }
        });
        Button btnSt=(Button)findViewById(R.id.btnStories);
        btnSt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutAryan.this,Stories.class);
                startActivity(i);
            }
        });

    }
}
