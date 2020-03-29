package com.tallerandroid.Modelos;

/*

 *   Aplicación creada por Andrés Rivera Ceballos
 *   el 27 de marzo, 2020.
 *   Ingeniería de Ejecución en Computación e Informática.
 *   Universidad del Bío-Bío, Concepción.

 * */

import java.io.Serializable;

public class Sandwich implements Serializable {
    private String nombre;
    private String descripcion;
    private int id_imagen;
    private String precio;

    public Sandwich() {
    }

    public Sandwich(String nombre, String descripcion, int id_imagen, String precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_imagen = id_imagen;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
