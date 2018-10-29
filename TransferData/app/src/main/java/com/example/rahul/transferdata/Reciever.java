package com.example.rahul.transferdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Reciever extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);
        TextView tv1 =(TextView)findViewById(R.id.tvResult);
        TextView tv2 =(TextView)findViewById(R.id.tvAge);
        Bundle extraBundle=getIntent().getExtras();
        String FullName=extraBundle.getString("strIntentFullName");
        int Age1=extraBundle.getInt("Age");
        tv2.setText("The Age of "+FullName+" "+"is-"+" "+String.valueOf(Age1));
        tv1.setText(FullName);
        Button  btnB=(Button)findViewById(R.id.btnBack);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  a = new Intent(Reciever.this,Sender.class);
                startActivity(a);

            }
        });

    }
}
