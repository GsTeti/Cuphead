package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela4 extends AppCompatActivity {

    Button botaoVoltarPers2, botaoIrChef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        botaoVoltarPers2.findViewById(R.id.btnvltpers2);

        botaoVoltarPers2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltarpers2=new Intent(getApplicationContext(), Tela3.class);
                startActivity(voltarpers2);

            }
        });

        botaoIrChef.findViewById(R.id.btnirchef);

        botaoIrChef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent irchef=new Intent(getApplicationContext(), Tela5.class);
                startActivity(irchef);

            }
        });

    }
}