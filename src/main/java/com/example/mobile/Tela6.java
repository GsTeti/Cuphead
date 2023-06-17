package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela6 extends AppCompatActivity {

    Button botaoProx, botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);

        botaoProx=findViewById(R.id.btnprox2);

        botaoProx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent proxima=new Intent(getApplicationContext(),Tela7.class);
                startActivity(proxima);

            }
        });

        botaoVoltar=findViewById(R.id.btnsairmap);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltar=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(voltar);

            }
        });

    }
}