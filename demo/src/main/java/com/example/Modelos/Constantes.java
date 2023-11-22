package com.example.Modelos;


public class Constantes {
    private static final String DIRECCIONAMIENTO_ORIGEN_LECTURA = new String("..");

    private static final String TITULO_SELECTOR_ARCHIVO_VIEJO = new String("Seleccionar el archivo con información VIEJA");

    private static final String TITULO_SELECTOR_ARCHIVO_NUEVO = new String("Seleccionar el archivo con información NUEVA");

    private static final String CSV = new String(".csv");
    private static final String XLS = new String(".xls");
    private static final String XLSX = new String(".xlsx");

    private static final String NO_SOPORTADO = new String("-1");

    private static final String CANCELAR = new String("CANCELAR");

    private static final String TITULO_TERMINACION = new String("Finalización del programa");

    private static final String CUERPO_TERMINACION_X_CANCELAMIENTO = new String("Programa terminado debido a cancelamiento");

    private static final String CUERPO_TERMINACION_X_ARCHIVO_ERRONEO = new String("Se ha seleccionado un tipo de archivo no soportado por el programa");

    private static final String PRIMERA_COLUMNA = new String("Nombres");
    private static final String SEGUNDA_COLUMNA = new String("Apellidos");
    private static final String TERCERA_COLUMNA = new String("Mail recién creado");
    private static final String CUARTA_COLUMNA = new String("Mail encontrado");

    public Constantes() {
    }

    public String getDIRECCIONAMIENTO_ORIGEN_LECTURA() {
        return DIRECCIONAMIENTO_ORIGEN_LECTURA;
    }

    public String getTITULO_SELECTOR_ARCHIVO_VIEJO() {
        return TITULO_SELECTOR_ARCHIVO_VIEJO;
    }

    public String getTITULO_SELECTOR_ARCHIVO_NUEVO() {
        return TITULO_SELECTOR_ARCHIVO_NUEVO;
    }

    public String getCSV(){
        return CSV;
    }

    public String getXLS() {
        return XLS;
    }

    public String getXLSX() {
        return XLSX;
    }

    public String getCANCELAR() {
        return CANCELAR;
    }

    public String getNO_SOPORTADO() {
        return NO_SOPORTADO;
    }

    public String getTITULO_TERMINACION() {
        return TITULO_TERMINACION;
    }

    public String getCUERPO_TERMINACION_X_CANCELAMIENTO() {
        return CUERPO_TERMINACION_X_CANCELAMIENTO;
    }

    public String getCUERPO_TERMINACION_X_ARCHIVO_ERRONEO() {
        return CUERPO_TERMINACION_X_ARCHIVO_ERRONEO;
    }

    public String getPRIMERA_COLUMNA() {
        return PRIMERA_COLUMNA;
    }

    public String getSEGUNDA_COLUMNA() {
        return SEGUNDA_COLUMNA;
    }

    public String getTERCERA_COLUMNA() {
        return TERCERA_COLUMNA;
    }

    public String getCUARTA_COLUMNA() {
        return CUARTA_COLUMNA;
    }
}
