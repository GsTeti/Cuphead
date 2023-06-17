package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela9 extends AppCompatActivity {

    Button botaoVoltarRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela9);

        botaoVoltarRS.findViewById(R.id.btnvltrd);

        botaoVoltarRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltarrd=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(voltarrd);

            }
        });

    }
}