package com.tallerandroid;

/*

 *   Aplicación creada por Andrés Rivera Ceballos
 *   el 27 de marzo, 2020.
 *   Ingeniería de Ejecución en Computación e Informática.
 *   Universidad del Bío-Bío, Concepción.

 * */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.tallerandroid.Modelos.Sandwich;

public class detalles_sandwich extends AppCompatActivity {

    Sandwich sandwich;
    ImageView imagen;
    TextView nombre;
    TextView descripcion;
    TextView precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_sandwich);

        //Obtenemos todas las Views
        imagen = findViewById(R.id.imagen_principal);
        nombre = findViewById(R.id.txt_nombre);
        descripcion = findViewById(R.id.txt_descripcion);
        precio = findViewById(R.id.txt_precio);

        //Obtenemos el objeto Sandwich
        sandwich = (Sandwich) getIntent().getSerializableExtra("sandwich");

        //Cambiamos el título de la activity
        String titulo = getString(R.string.detalle_sandwich) + " "+sandwich.getNombre();
        setTitle(titulo);

        //Seteamos los atributos del Sandwich en los Views
        imagen.setImageResource(sandwich.getId_imagen());
        nombre.setText(sandwich.getNombre());
        descripcion.setText(sandwich.getDescripcion());
        String s_precio = getString(R.string.precio)+sandwich.getPrecio();
        precio.setText(s_precio);
    }
}
