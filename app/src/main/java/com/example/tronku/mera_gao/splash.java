package com.example.tronku.mera_gao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    TextView mera, gao;
    ImageView bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mera = findViewById(R.id.mera);
        gao = findViewById(R.id.gao);
        bg = findViewById(R.id.bg);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        mera.startAnimation(animation);
        gao.startAnimation(animation);
        bg.startAnimation(animation);

        final Intent intent = new Intent(this, MainActivity.class);
        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}
