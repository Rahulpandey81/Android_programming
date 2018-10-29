package com.example.rahul.transferdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
        Button btn1=(Button)findViewById(R.id.btnSend);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1=(EditText)findViewById(R.id.editTextName);
                EditText et2=(EditText)findViewById(R.id.editTextLastName);
                String str1,str2,strFullName;
                str1=et1.getText().toString();
                str2=et2.getText().toString();
                strFullName = str1+" "+str2;
                Intent i = new Intent(Sender.this,Reciever.class);
                i.putExtra("strIntentFullName",strFullName);
                i.putExtra("Age",25);

                startActivity(i);

            }
        });

    }
}
