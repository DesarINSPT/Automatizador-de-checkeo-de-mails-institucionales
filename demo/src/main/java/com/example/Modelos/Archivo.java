package com.example.Modelos;

import java.io.File;

public class Archivo {
    private StringBuilder direccionamiento;

    public Archivo() {
    }

    public Archivo(StringBuilder direccionamiento) {
        this.direccionamiento = direccionamiento;
    }

    public StringBuilder getDireccionamiento() {
        return this.direccionamiento;
    }

    public void setDireccionamiento(StringBuilder direccionamiento) {
        this.direccionamiento = new StringBuilder(direccionamiento);
    }
    public File getArchivo(){
        return new File(getDireccionamiento().toString());
    }

    public String getTipo(){
        Constantes constantes = new Constantes();
        //System.out.println(this.direccionamiento.getClass());
        //System.out.println(constantes.getNO_SOPORTADO().getClass());
        if(this.direccionamiento.toString().equals(constantes.getNO_SOPORTADO())){
            return constantes.getNO_SOPORTADO();
        }
        else if (this.direccionamiento.toString().equals(constantes.getCANCELAR())){
            return constantes.getCANCELAR();
        }
        else if(this.direccionamiento.substring(this.direccionamiento.length()-4, this.direccionamiento.length()).equals(constantes.getCSV())){
            return constantes.getCSV();
        }
        else if(this.direccionamiento.substring(this.direccionamiento.length()-4, this.direccionamiento.length()).equals(constantes.getXLS())){
            return constantes.getXLS();
        }
        else if(this.direccionamiento.substring(this.direccionamiento.length()-4, this.direccionamiento.length()).equals(constantes.getXLSX())){
            return constantes.getXLSX();
        }
        else{
            return constantes.getNO_SOPORTADO();
        }
    }
}
