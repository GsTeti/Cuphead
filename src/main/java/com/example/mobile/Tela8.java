package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela8 extends AppCompatActivity {

    Button botaoVoltarSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela8);

        botaoVoltarSite=findViewById(R.id.btnvltsite);

        botaoVoltarSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltarsite=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(voltarsite);

            }
        });

    }
}