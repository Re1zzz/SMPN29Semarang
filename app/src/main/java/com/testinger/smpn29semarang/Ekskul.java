package com.testinger.smpn29semarang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ekskul extends AppCompatActivity {
    CardView paskibra;
    CardView pramuka;
    CardView jurnalistik;
    CardView silat;
    CardView bta;
    CardView voli;
    CardView senirupa;
    CardView paduansuara;
    CardView senitari;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        paskibra = findViewById(R.id.paskibra);

        paskibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,Paskibra.class);
                startActivity(intent);
            }
        });
        jurnalistik = findViewById(R.id.jurnalistik);

        jurnalistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,Jurnalistik.class);
                startActivity(intent);
            }
        });
        pramuka = findViewById(R.id.pramuka);

        pramuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,Pramuka.class);
                startActivity(intent);
            }
        });
        silat = findViewById(R.id.silat);

        silat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,Silat.class);
                startActivity(intent);
            }
        });
        bta = findViewById(R.id.bta);

        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,Bta.class);
                startActivity(intent);
            }
        });
        voli = findViewById(R.id.voli);

        voli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,Voli.class);
                startActivity(intent);
            }
        });
        senirupa = findViewById(R.id.senirupa);

        senirupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,SeniRupa.class);
                startActivity(intent);
            }
        });
        paduansuara = findViewById(R.id.paduansuara);

        paduansuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,PaduanSuara.class);
                startActivity(intent);
            }
        });
        paduansuara = findViewById(R.id.paduansuara);

        paduansuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,PaduanSuara.class);
                startActivity(intent);
            }
        });
        senitari = findViewById(R.id.senitari);

        senitari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ekskul.this,SeniTari.class);
                startActivity(intent);
            }
        });
    }
}