package com.example.tronku.mera_gao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class land_agri extends AppCompatActivity {

    private CardView agri, cases, maps, info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_agri);

        agri = findViewById(R.id.agriculture);
        cases = findViewById(R.id.land_cases);
        maps = findViewById(R.id.maps);
        info = findViewById(R.id.land_info);

        agri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(land_agri.this, website.class);
                intent.putExtra("website","http://upagriculture.com/Default.aspx");
                intent.putExtra("back", "land_agri");
                startActivity(intent);
            }
        });

        cases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(land_agri.this, website.class);
                intent.putExtra("website","http://vaad.up.nic.in/");
                intent.putExtra("back", "land_agri");
                startActivity(intent);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(land_agri.this, website.class);
                intent.putExtra("website","http://upbhunaksha.gov.in/09/index.html");
                intent.putExtra("back", "land_agri");
                startActivity(intent);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(land_agri.this, website.class);
                intent.putExtra("website","http://upbhulekh.gov.in/public/public_ror/Public_ROR.jsp");
                intent.putExtra("back", "land_agri");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent home = new Intent(land_agri.this, MainActivity.class);
        startActivity(home);
    }
}
