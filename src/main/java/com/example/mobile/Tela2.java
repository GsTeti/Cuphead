package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2 extends AppCompatActivity {

    Button botaoVoltarHist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        botaoVoltarHist.findViewById(R.id.btnvlthist);

        botaoVoltarHist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltarhist=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(voltarhist);

            }
        });

    }
}