package com.example.tronku.mera_gao;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class app_credits extends AppCompatActivity {

    private LinearLayout shubham_email, prabhat_email, shubham_github, prabhat_wordpress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_credits);

        shubham_email = findViewById(R.id.shubham_email);
        prabhat_email = findViewById(R.id.prabhat_email);
        shubham_github = findViewById(R.id.shubham_github);
        prabhat_wordpress = findViewById(R.id.prabhat_wordpress);

        shubham_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mail = new Intent(Intent.ACTION_SENDTO);
                mail.setData(Uri.parse("mailto:shubham.pathak2000@gmail.com"));
                mail.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                startActivity(Intent.createChooser(mail, "Select an app..."));
            }
        });

        prabhat_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mail = new Intent(Intent.ACTION_SENDTO);
                mail.setData(Uri.parse("mailto:prabhatpathak28@gmail.com"));
                mail.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                startActivity(Intent.createChooser(mail, "Select an app..."));
            }
        });

        shubham_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://github.com/tronku"));
                startActivity(intent);
            }
        });

        prabhat_wordpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://prabhatpathakblog.wordpress.com"));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent home = new Intent(app_credits.this, MainActivity.class);
        startActivity(home);
    }
}
