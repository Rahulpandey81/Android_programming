package com.example.rahul.aryandubey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Stories extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        myWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://aryandubey123.wordpress.com/");
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.setVisibility(View.VISIBLE);


    }

    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        }else {
            super.onBackPressed();

        }



    }
}
