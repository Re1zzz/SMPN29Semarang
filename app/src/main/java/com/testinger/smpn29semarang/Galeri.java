package com.testinger.smpn29semarang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Galeri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
        //slider
        SliderView sliderView = findViewById(R.id.imageSlider);

        List<Integer> images=new ArrayList<>();
        images.add(R.drawable.formsatu);
        images.add(R.drawable.formdua);
        images.add(R.drawable.formtiga);


        MyAdapter myAdapter=new MyAdapter(images);

        sliderView.setSliderAdapter(myAdapter);
    }
}