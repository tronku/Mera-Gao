package com.example.tronku.mera_gao;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class work_labour extends AppCompatActivity {

    private CardView water, clean, nrega, housing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_labour);

        water = findViewById(R.id.water);
        clean = findViewById(R.id.clean_india);
        nrega = findViewById(R.id.mgnrega);
        housing = findViewById(R.id.housing);

        final Intent intent = new Intent(work_labour.this, website.class);
        intent.putExtra("back", "work_labour");

        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("website", "http://indiawater.gov.in/");
                startActivity(intent);
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("website", "http://swachhbharatmission.gov.in/sbmcms/index.htm");
                startActivity(intent);
            }
        });

        nrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("website", "http://nrega.nic.in/netnrega/home.aspx");
                startActivity(intent);
            }
        });

        housing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("website", "https://www.iay.nic.in/");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent home = new Intent(work_labour.this, MainActivity.class);
        startActivity(home);
    }
}
