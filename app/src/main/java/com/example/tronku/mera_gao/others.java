package com.example.tronku.mera_gao;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class others extends AppCompatActivity {

    private CardView online, district, election, transport, web, food, monitor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        online = findViewById(R.id.up_online);
        district = findViewById(R.id.edistrict);
        election = findViewById(R.id.election_comm);
        transport = findViewById(R.id.transport);
        web = findViewById(R.id.web_dir);
        food = findViewById(R.id.food_civil);
        monitor = findViewById(R.id.monitor_fund);

        final Intent intent = new Intent(others.this, website.class);
        intent.putExtra("back", "others");

        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("website","http://164.100.181.16/mcitizen/login/login.aspx");
                startActivity(intent);
            }
        });

        district.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("website","http://edistrict.up.nic.in/");
                startActivity(intent);
            }
        });

        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("website","http://parivahan.gov.in/");
                startActivity(intent);
            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("website","http://fcs.up.nic.in/");
                startActivity(intent);
            }
        });

        monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("website", "https://pfms.nic.in/Static/KnowYourPayment.aspx");
                startActivity(intent);
            }
        });

        election.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewDialog electionViewDialog = new ViewDialog();
                electionViewDialog.openDialog("election");
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewDialog webViewDialog = new ViewDialog();
                webViewDialog.openDialog("web");
            }
        });
    }

    public class ViewDialog{
        public void openDialog(final String cardview){
            final Dialog dialog = new Dialog(others.this);
            dialog.setContentView(R.layout.dialog);

            CardView central, state;
            central = dialog.findViewById(R.id.central);
            state = dialog.findViewById(R.id.state);


            central.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(others.this, website.class);
                    if(cardview.equals("election")){
                        intent.putExtra("website", "http://eci.nic.in/");
                    }
                    else if(cardview.equals("web")){
                        intent.putExtra("website", "http://goidirectory.nic.in/");
                    }
                    intent.putExtra("back", "others");
                    startActivity(intent);
                }
            });

            state.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(others.this, website.class);
                    if(cardview.equals("election")){
                        intent.putExtra("website", "http://sec.up.nic.in/");
                    }
                    else if(cardview.equals("web")){
                        intent.putExtra("website", "http://up.gov.in/allsites.aspx");
                    }
                    intent.putExtra("back", "others");
                    startActivity(intent);
                }
            });

            dialog.show();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent home = new Intent(others.this, MainActivity.class);
        startActivity(home);
    }
}
