package com.example.Modelos;

public class Constantes {
    private String DIRECCIONAMIENTO_ORIGEN_LECTURA = new String(".");

    private String TITULO_SELECTOR_ARCHIVO_VIEJO = new String("Seleccionar el archivo con información VIEJA");

    private String TITULO_SELECTOR_ARCHIVO_NUEVO = new String("Seleccionar el archivo con información NUEVA");

    private String CSV = new String(".csv");
    private String XLS = new String(".xls");
    private String XLSX = new String(".xlsx");

    private String CANCELAR = new String("CANCELAR");

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

    public String getStringCSV(){
        return CSV;
    }

    public String getStringXLS() {
        return XLS;
    }

    public String getStringXLSX() {
        return XLSX;
    }

    public String getCANCELAR() {
        return CANCELAR;
    }
}
