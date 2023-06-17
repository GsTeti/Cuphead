package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3 extends AppCompatActivity {

    Button botaoVoltarPers, botaoIrPers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        botaoVoltarPers.findViewById(R.id.btnvltpers);

        botaoVoltarPers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltarpers=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(voltarpers);

            }
        });

        botaoIrPers.findViewById(R.id.btnirpers);

        botaoIrPers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent irpers=new Intent(getApplicationContext(), Tela4.class);
                startActivity(irpers);

            }
        });

    }
}