package com.example.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button botaoVerHist, botaoVerPers, botaoVerMapa, botaoVerSite, botaoVerRedes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoVerHist = findViewById(R.id.btnVerHist);

        botaoVerHist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent verhist = new Intent(getApplicationContext(), Tela2.class);
                startActivity(verhist);

            }
        });

       botaoVerPers=findViewById(R.id.btnVerPers);

       botaoVerPers.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent verpers=new Intent(getApplicationContext(), Tela3.class);
               startActivity(verpers);

           }
       });

       botaoVerMapa=findViewById(R.id.btnmapa);

       botaoVerMapa.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent vermapa=new Intent(getApplicationContext(), Tela6.class);
               startActivity(vermapa);

           }
       });

       botaoVerSite=findViewById(R.id.btnsite);

       botaoVerSite.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent versite=new Intent(getApplicationContext(),Tela8.class);
               startActivity(versite);

           }
       });

       botaoVerRedes=findViewById(R.id.btnredes);

       botaoVerRedes.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent verredes=new Intent(getApplicationContext(), Tela9.class);
               startActivity(verredes);

           }
       });

    }
    }