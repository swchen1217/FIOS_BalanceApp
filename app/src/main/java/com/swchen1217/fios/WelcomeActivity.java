package com.swchen1217.fios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    ImageView logo;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wolcome);

        getSupportActionBar().hide();
        logo = findViewById(R.id.imageView);
        tv = findViewById(R.id.powerBy);

        Animation myanim = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.fadein);
        logo.startAnimation(myanim);
        tv.startAnimation(myanim);
        Thread timer = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };
        timer.start();
    }
}
