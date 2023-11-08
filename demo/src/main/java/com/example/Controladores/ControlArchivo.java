package com.example.Controladores;

import com.example.Modelos.Modelo;

import java.io.File;

public class ControlArchivo {
    private Modelo modelo;

    public ControlArchivo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String respuestaTipoArchivo(File file){
        StringBuilder direccionamiento = new StringBuilder(file.toString());

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
