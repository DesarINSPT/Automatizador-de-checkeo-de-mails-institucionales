package com.example.Modelos;

public class Modelo {
    private Constantes constantes;
    private Archivo archivo;

    public Modelo() {
    }

    public String obtenerDIRECCIONAMIENTO_ORIGEN_LECTURA(){
        return this.constantes.getDIRECCIONAMIENTO_ORIGEN_LECTURA();
    }

    public String obtenerTITULO_SELECTOR_ARCHIVO_NUEVO(){
        return this.constantes.getTITULO_SELECTOR_ARCHIVO_NUEVO();
    }

    public String obtenerTITULO_SELECTOR_ARCHIVO_VIEJO(){return this.constantes.getTITULO_SELECTOR_ARCHIVO_VIEJO();}

    public String obtenerStringCSV(){
        return this.constantes.getStringCSV();
    }

    public String obtenerStringXLS(){
        return this.constantes.getStringXLS();
    }

    public String obtenerStringXLSX(){
        return this.constantes.getStringXLSX();
    }

    public String obtenerOpcionCancelar(){return this.constantes.getCANCELAR();}

    public StringBuilder obtenerArchivoTipo(){
        return archivo.getTipo();
    }

    public void asignarArchivoTipo(StringBuilder tipo) {
        archivo.setTipo(tipo);
    }

    public StringBuilder getDireccionamiento() {
        return archivo.getDireccionamiento();
    }

    public void setDireccionamiento(StringBuilder direccionamiento) {
        archivo.setDireccionamiento(direccionamiento);
    }
}
