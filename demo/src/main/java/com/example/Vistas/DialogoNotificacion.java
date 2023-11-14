package com.example.Vistas;

import javax.swing.*;

public class DialogoNotificacion {
    private JFrame frame;

    public DialogoNotificacion() {
    }

    public DialogoNotificacion(JFrame frame) {
        this.frame = frame;
    }

    public void mostrar(String cuerpo, String titulo){
        JOptionPane.showMessageDialog(frame, cuerpo, titulo, JOptionPane.PLAIN_MESSAGE);
    }
}
