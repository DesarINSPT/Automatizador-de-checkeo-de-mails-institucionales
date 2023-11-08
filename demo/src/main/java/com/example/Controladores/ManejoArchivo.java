package com.example.Controladores;

import com.example.Modelos.Archivo;
import com.example.Modelos.Modelo;
import com.example.Vistas.Vista;

import java.io.File;


public class ManejoArchivo {
    private Modelo modelo;

    private Vista vista;

    public ManejoArchivo(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public Archivo pedirArchivos(Archivo archivo){

        return archivo;
    }
}
