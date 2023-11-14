package com.example.Vistas;

import com.example.Controladores.Controlador;
import com.example.Modelos.Constantes;
import com.example.Modelos.Modelo;

import javax.swing.*;
import java.io.File;

public class Vista {
    private Modelo modelo;

    private DialogoBusquedaArchivo dialogoBusquedaArchivo;
    private DialogoNotificacion dialogoNotificacion;

    public Vista(Modelo modelo) {
        this.modelo = modelo;
        this.dialogoBusquedaArchivo = new DialogoBusquedaArchivo();
        this.dialogoNotificacion = new DialogoNotificacion();
    }

    public File pedidoArchivo(String titulo){
        return this.dialogoBusquedaArchivo.abrirDialogoBusqueda(this.modelo, titulo);
    }
    public void mostrarDialogoNotificacion(String cuerpo, String titulo){
        dialogoNotificacion.mostrar(cuerpo, titulo);
    }
}
