        package com.fatdevs.vector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

        public class MainActivity extends AppCompatActivity {
public WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    web =  findViewById(R.id.WebView);
    web.setWebViewClient(new WebViewClient());
    web.loadUrl("http://www.google.com");

    }
}
