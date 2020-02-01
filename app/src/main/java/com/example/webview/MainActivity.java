package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private final String url = "https://maxsop.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set view
        webView = findViewById(R.id.main_wv_id);

        // Enable javascript
        WebSettings webSetting = webView.getSettings();
        webSetting.setJavaScriptEnabled(true);

        // set web view client
        webView.setWebViewClient(new WebViewClient());

        // load url
        webView.loadUrl(url);

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
