package com.tallerandroid;

/*

 *   Aplicación creada por Andrés Rivera Ceballos
 *   el 27 de marzo, 2020.
 *   Ingeniería de Ejecución en Computación e Informática.
 *   Universidad del Bío-Bío, Concepción.

 * */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

public class sobre_nosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_nosotros);

        setTitle(R.string.fast_food);
    }
}
