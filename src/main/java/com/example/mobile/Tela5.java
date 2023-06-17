package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela5 extends AppCompatActivity {

    Button botaoVltChef, botaoSairChef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        botaoVltChef.findViewById(R.id.btnvltchef);

        botaoVltChef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent vltchef=new Intent(getApplicationContext(), Tela4.class);
                startActivity(vltchef);

            }
        });

        botaoSairChef.findViewById(R.id.btnsairchef);

        botaoSairChef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sairchef=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(sairchef);

            }
        });

    }
}