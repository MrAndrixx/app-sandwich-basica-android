package com.tallerandroid;

/*

 *   Aplicación creada por Andrés Rivera Ceballos
 *   el 27 de marzo, 2020.
 *   Ingeniería de Ejecución en Computación e Informática.
 *   Universidad del Bío-Bío, Concepción.

 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_sandwiches;
    Button btn_sobre_nosotros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sandwiches = findViewById(R.id.btn_sandwiches);
        btn_sobre_nosotros = findViewById(R.id.btn_sobre_nosotros);

        btn_sandwiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, sandwiches.class));
            }
        });

        btn_sobre_nosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, sobre_nosotros.class));
            }
        });
    }
}
