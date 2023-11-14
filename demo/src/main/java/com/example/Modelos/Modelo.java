package com.example.Modelos;

public class Modelo {
    private Constantes constantes;
    private Archivo archivo;

    public Modelo() {
        this.constantes = new Constantes();
        this.archivo = new Archivo();
    }

    public String obtenerDIRECCIONAMIENTO_ORIGEN_LECTURA(){
        return this.constantes.getDIRECCIONAMIENTO_ORIGEN_LECTURA();
    }

    public String obtenerTITULO_SELECTOR_ARCHIVO_NUEVO(){
        return this.constantes.getTITULO_SELECTOR_ARCHIVO_NUEVO();
    }

    public String obtenerTITULO_SELECTOR_ARCHIVO_VIEJO(){return this.constantes.getTITULO_SELECTOR_ARCHIVO_VIEJO();}

    public String obtenerStringCSV(){
        return this.constantes.getCSV();
    }

    public String obtenerStringXLS(){
        return this.constantes.getXLS();
    }

    public String obtenerStringXLSX(){
        return this.constantes.getXLSX();
    }

    public String obtenerOpcionCancelar(){return this.constantes.getCANCELAR();}

    public String obtenerTituloTerminacion(){
        return this.constantes.getTITULO_TERMINACION();
    }

    public String obtenerCuerpoTerminacionXCancelamiento(){
        return this.constantes.getCUERPO_TERMINACION_X_CANCELAMIENTO();
    }

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
