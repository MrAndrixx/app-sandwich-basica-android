package com.tallerandroid;

/*

 *   Aplicación creada por Andrés Rivera Ceballos
 *   el 27 de marzo, 2020.
 *   Ingeniería de Ejecución en Computación e Informática.
 *   Universidad del Bío-Bío, Concepción.

 * */

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.tallerandroid.Modelos.Sandwich;

import java.util.ArrayList;

public class sandwiches extends AppCompatActivity {

    LinearLayout layout_btn_sandwiches;
    ArrayList<Sandwich> sandwiches_list;
    String[] array_nombres;
    String[] array_descripciones;
    int[] array_id_imagenes;
    String[] array_precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);

        //Buscamos el Linear Layout
        layout_btn_sandwiches = findViewById(R.id.layout_btn_sandwiches);

        //Inicializamos el ArrayList
        sandwiches_list = new ArrayList<>();

        //Obtenemos todos los arrays de los Sandwiches
        array_nombres = getResources().getStringArray(R.array.nombres_sandwiches_array);
        array_descripciones = getResources().getStringArray(R.array.descripciones_sandwiches_array);
        array_precio = getResources().getStringArray(R.array.precio_sandwiches_array);
        array_id_imagenes = new int[array_descripciones.length];
        TypedArray ta = getResources().obtainTypedArray(R.array.id_imagenes_sandwiches_array);
        for (int i = 0; i < ta.length(); i++) {
            int id = ta.getResourceId(i, 0);
            if (id != 0)
                array_id_imagenes[i] = id;
        }
        ta.recycle();

        //Creamos la lista de Sandwiches
        for(int i = 0; i < array_nombres.length; i++){
            Sandwich sandwich = new Sandwich(array_nombres[i], array_descripciones[i], array_id_imagenes[i], array_precio[i]);
            sandwiches_list.add(sandwich);
        }

        //Creamos margenes para luego asignarselo a los botones
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(30, 20, 30, 0);

        //Recorremos la lista de Sandwiches para crear los botones
        for (final Sandwich sandwich : sandwiches_list) {
            //Creamos los botones
            Button btn_sandwich = new Button(this);
            btn_sandwich.setText(sandwich.getNombre());
            btn_sandwich.setBackground(getResources().getDrawable(R.drawable.btn_style));
            btn_sandwich.setTextColor(Color.WHITE);
            btn_sandwich.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(sandwiches.this, detalles_sandwich.class).putExtra("sandwich", sandwich));
                }
            });

            //Agregamos el botón al Linear Layout
            layout_btn_sandwiches.addView(btn_sandwich, layoutParams);
        }
    }
}
