package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela7 extends AppCompatActivity {

    Button botaoVoltarMp, botaoIrHm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela7);

        botaoVoltarMp=findViewById(R.id.btnvltmp);

        botaoVoltarMp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltarmapa=new Intent(getApplicationContext(),Tela6.class);
                startActivity(voltarmapa);

            }
        });

        botaoIrHm.findViewById(R.id.btnirhm);

        botaoIrHm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent irhm=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(irhm);

            }
        });

    }
}