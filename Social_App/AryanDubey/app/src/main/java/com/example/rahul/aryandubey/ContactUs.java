package com.example.rahul.aryandubey;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        ImageButton call =( ImageButton)findViewById(R.id.imgCall);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"+91 7081151617"));
                startActivity(i);

            }
        });
        ImageButton whatsApp =(ImageButton)findViewById(R.id.btnWhatsApp);
        whatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+"+91 7081151617"));
                startActivity(i);
            }
        });
        ImageButton fb =(ImageButton)findViewById(R.id.btnFb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/maryandubey/"));
                startActivity(i);

            }
        });
        ImageButton gmail=(ImageButton)findViewById(R.id.btnMail);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
