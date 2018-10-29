package com.example.rahul.webviewtest;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnS = (Button) findViewById(R.id.buttonSearch);
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 = (EditText) findViewById(R.id.editTextSearch);
                String str1;

                str1 = et1.getText().toString();

                WebView myWebView = (WebView) findViewById(R.id.web);
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.loadUrl(str1);
                myWebView.setWebViewClient(new WebViewClient());
                myWebView.setVisibility(View.VISIBLE);
            }
        });
        Button btD = (Button) findViewById(R.id.buttonDial);
        btD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+917398377354"));
                startActivity(i);
            }
        });
        Button btnCal1l = (Button) findViewById(R.id.btnCall);
        btnCal1l.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent calling = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+8126123639"));
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(calling);

            }

        });

    }
}
