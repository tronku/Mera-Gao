package com.example.tronku.mera_gao;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;

public class panchayat extends AppCompatActivity {

    CardView plannings, reports, pension, fund;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panchayat);

        plannings = findViewById(R.id.planning);
        reports = findViewById(R.id.reporting);
        pension = findViewById(R.id.pensions);
        fund = findViewById(R.id.funds);

        plannings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(panchayat.this, website.class);
                intent.putExtra("website", "http://www.planningonline.gov.in/");
                intent.putExtra("back", "panchayat");
                startActivity(intent);
            }
        });

        reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(panchayat.this, website.class);
                intent.putExtra("website", "http://www.reportingonline.gov.in/");
                intent.putExtra("back", "panchayat");
                startActivity(intent);
            }
        });

        pension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewDialog viewDialog = new ViewDialog();
                viewDialog.openDialog(panchayat.this);
            }
        });

        fund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://accountingonline.gov.in/"));
                startActivity(intent);
            }
        });
    }


    public class ViewDialog{
        public void openDialog(Activity activity){
            final Dialog dialog = new Dialog(activity);
            dialog.setContentView(R.layout.dialog);

            CardView central, state;
            central = dialog.findViewById(R.id.central);
            state = dialog.findViewById(R.id.state);

            central.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(panchayat.this, website.class);
                    intent.putExtra("website", "http://www.nsap.nic.in/");
                    intent.putExtra("back", "panchayat");
                    startActivity(intent);
                }
            });

            state.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(panchayat.this, website.class);
                    intent.putExtra("website", "http://sspy-up.gov.in/index.aspx");
                    intent.putExtra("back", "panchayat");
                    startActivity(intent);
                }
            });

            dialog.show();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent home = new Intent(panchayat.this, MainActivity.class);
        startActivity(home);
    }
}
