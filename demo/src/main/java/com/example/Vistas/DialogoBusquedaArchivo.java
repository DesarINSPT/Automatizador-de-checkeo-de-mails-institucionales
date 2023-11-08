package com.example.Vistas;

import com.example.Modelos.Modelo;

import javax.swing.*;
import java.io.File;

public class DialogoBusquedaArchivo {
    private JFileChooser jFileChooser;

    public File abrirDialogoBusqueda(Modelo modelo, String titulo){
        int respuesta;

        File direccionamiento = new File("");

        this.jFileChooser = new JFileChooser();

        this.jFileChooser.setCurrentDirectory(new File(modelo.obtenerDIRECCIONAMIENTO_ORIGEN_LECTURA()));

        this.jFileChooser.setDialogTitle(titulo);

        respuesta= jFileChooser.showOpenDialog(null);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            direccionamiento = new File(jFileChooser.getSelectedFile().getAbsolutePath());
        }
        else if (respuesta == JFileChooser.CANCEL_OPTION){
            direccionamiento = new File(modelo.obtenerOpcionCancelar());
        }
        return direccionamiento;
    }
}
