package com.testinger.smpn29semarang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Profile extends AppCompatActivity {

    Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        but1 = findViewById(R.id.buttonnext);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, visimisi.class);
                startActivity(intent);
            }
        });


    }
}