package com.testinger.smpn29semarang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Eperpus extends AppCompatActivity {
    ImageView but1;
    ImageView but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eperpus);
        but1 = findViewById(R.id.windows);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://kubuku.id/download/e-songli-library/setup.exe");
            }
        });
        but2 = findViewById(R.id.android);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://play.google.com/store/apps/details?id=id.kubuku.kbk1092361");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}