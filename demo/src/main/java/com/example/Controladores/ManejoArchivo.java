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

    public Archivo pedirUnArchivo(Archivo archivo, String titulo){
        archivo.setDireccionamiento(new StringBuilder(new File(String.valueOf(this.vista.pedidoArchivo(titulo))).toString()));
        archivo.setTipo(new StringBuilder(respuestaTipoArchivo(archivo.getDireccionamiento())));
        return archivo;
    }

    public String respuestaTipoArchivo(StringBuilder direccionamiento){

        if (direccionamiento.toString().equals(modelo.obtenerOpcionCancelar())){
            return modelo.obtenerOpcionCancelar();
        }
        else if(direccionamiento.substring(direccionamiento.length()-4, direccionamiento.length()).equals(modelo.obtenerStringCSV())){
            return modelo.obtenerStringCSV();
        }
        else if(direccionamiento.substring(direccionamiento.length()-4, direccionamiento.length()).equals(modelo.obtenerStringXLS())){
            return modelo.obtenerStringXLS();
        }
        else if(direccionamiento.substring(direccionamiento.length()-4, direccionamiento.length()).equals(modelo.obtenerStringXLSX())){
            return modelo.obtenerStringXLSX();
        }
        return direccionamiento.toString();
    }
}
