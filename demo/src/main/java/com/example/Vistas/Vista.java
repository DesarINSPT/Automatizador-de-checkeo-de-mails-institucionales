package com.example.Vistas;

import com.example.Controladores.Controlador;
import com.example.Modelos.Constantes;
import com.example.Modelos.Modelo;

import javax.swing.*;
import java.io.File;

public class Vista {
    private Modelo modelo;

    private DialogoBusquedaArchivo dialogoBusquedaArchivo;

    public Vista(Modelo modelo) {
        this.modelo = modelo;
        this.dialogoBusquedaArchivo = new DialogoBusquedaArchivo();
    }

    public File pedidoArchivo(String titulo){
        return this.dialogoBusquedaArchivo.abrirDialogoBusqueda(this.modelo, titulo);
    }
}
