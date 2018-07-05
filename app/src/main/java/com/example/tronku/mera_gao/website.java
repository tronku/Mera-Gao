package com.example.tronku.mera_gao;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import android.widget.Toolbar;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class website extends AppCompatActivity {

    Intent website;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.back_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        website = getIntent();
        String url = website.getStringExtra("website");
        webview = findViewById(R.id.website);

        if (!DetectConnection.checkInternetConnection(this)) {
            Toast.makeText(getApplicationContext(), "No Internet!", Toast.LENGTH_SHORT).show();
        } else {
            webview.setWebViewClient(new MyBrowser());
            webview.getSettings().setLoadsImagesAutomatically(true);
            webview.getSettings().setDomStorageEnabled(true);
            webview.getSettings().setLoadWithOverviewMode(true);
            webview.getSettings().setUseWideViewPort(true);
            webview.getSettings().setJavaScriptEnabled(true);
            webview.getSettings().setBuiltInZoomControls(true);
            webview.getSettings().setDomStorageEnabled(true);
            webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
            webview.loadUrl(url);
        }

    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        if(webview.canGoBack()) {
            webview.goBack();
        } else {
            finish();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        String backPage = website.getStringExtra("back");
        Intent intent = null;
        if(backPage.equals("work_labour")){
            intent = new Intent(website.this, work_labour.class);
        }

        else if(backPage.equals("panchayat")){
            intent = new Intent(website.this, panchayat.class);
        }

        else if(backPage.equals("land_agri")){
            intent = new Intent(website.this, land_agri.class);
        }

        else if(backPage.equals("others")){
            intent = new Intent(website.this, others.class);
        }
        startActivity(intent);
        return true;
    }
}