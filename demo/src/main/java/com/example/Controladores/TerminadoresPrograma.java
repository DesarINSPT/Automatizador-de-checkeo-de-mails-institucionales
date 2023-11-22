package com.example.Controladores;

import com.example.Modelos.Modelo;
import com.example.Vistas.Vista;

public class TerminadoresPrograma {
    private Modelo modelo;
    private Vista vista;
    public TerminadoresPrograma(Modelo modelo, Vista vista) {
        this.modelo=modelo;
        this.vista=vista;
    }

    public void xCancelacion(){
        this.vista.mostrarDialogoNotificacion(this.modelo.obtenerCuerpoTerminacionXCancelamiento(), this.modelo.obtenerTituloTerminacion());
        System.exit(0);
    }
}
