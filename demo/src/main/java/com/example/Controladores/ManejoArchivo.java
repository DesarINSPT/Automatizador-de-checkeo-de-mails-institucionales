package com.example.Controladores;

import com.example.Modelos.Archivo;
import com.example.Modelos.Modelo;
import com.example.Vistas.Vista;

import java.io.File;
import java.util.*;


public class ManejoArchivo {
    private Modelo modelo;

    private Vista vista;

    public ManejoArchivo(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public List<Archivo> pedirVariosArchivos(Archivo archivoViejo, Archivo archivoNuevo){
        List<Archivo> archivos = new ArrayList<>();
        archivos.add(archivoViejo);
        archivos.add(archivoNuevo);
        return archivos;
    }

    public Archivo pedirUnArchivo(Archivo archivo){
        return archivo;
    }
}
