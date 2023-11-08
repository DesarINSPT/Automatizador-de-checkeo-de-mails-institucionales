package com.example.Controladores;

import com.example.Modelos.Archivo;
import com.example.Modelos.Modelo;
import com.example.Vistas.Vista;

import java.io.File;

public class Controlador {
    private final Modelo modelo;
    private final Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        ControlArchivo controlArchivo = new ControlArchivo(modelo);
        Archivo archivoViejo = new Archivo(new StringBuilder(""), new StringBuilder(""));
        Archivo archivoNuevo = new Archivo(new StringBuilder(""), new StringBuilder(""));
        ManejoArchivo manejoArchivo = new ManejoArchivo(modelo, vista);
        //new File(this.vista.pedidoArchivo(modelo.obtenerTITULO_SELECTOR_ARCHIVO_NUEVO()).toString()
        //new File(this.vista.pedidoArchivo(modelo.obtenerTITULO_SELECTOR_ARCHIVO_VIEJO()).toString()
    }
}
