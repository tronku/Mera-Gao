package com.example.tronku.mera_gao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private CardView panchayat, work, land, other, credits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panchayat = findViewById(R.id.panchayat);
        panchayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNext = new Intent(MainActivity.this, panchayat.class);
                startActivity(openNext);
            }
        });

        land = findViewById(R.id.land_agri);
        land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNext = new Intent(MainActivity.this, land_agri.class);
                startActivity(openNext);
            }
        });

        work = findViewById(R.id.work);
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNext = new Intent(MainActivity.this, work_labour.class);
                startActivity(openNext);
            }
        });

        other = findViewById(R.id.others);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNext = new Intent(MainActivity.this, others.class);
                startActivity(openNext);
            }
        });

        credits = findViewById(R.id.credits);
        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNext = new Intent(MainActivity.this, app_credits.class);
                startActivity(openNext);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}
