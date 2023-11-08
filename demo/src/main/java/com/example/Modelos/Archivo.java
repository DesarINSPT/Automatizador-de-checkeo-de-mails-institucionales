package com.example.Modelos;

public class Archivo {
    private StringBuilder tipo;
    private StringBuilder direccionamiento;

    public Archivo(StringBuilder tipo, StringBuilder direccionamiento) {
        this.tipo = tipo;
        this.direccionamiento = direccionamiento;
    }

    public StringBuilder getTipo() {
        return tipo;
    }

    public void setTipo(StringBuilder tipo) {
        this.tipo = new StringBuilder(tipo);
    }

    public StringBuilder getDireccionamiento() {
        return direccionamiento;
    }

    public void setDireccionamiento(StringBuilder direccionamiento) {
        this.direccionamiento = new StringBuilder(direccionamiento);
    }
}
