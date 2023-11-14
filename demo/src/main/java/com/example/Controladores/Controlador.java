package com.example.Controladores;

import com.example.Modelos.Archivo;
import com.example.Modelos.Modelo;
import com.example.Vistas.Vista;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Controlador {
    private final Modelo modelo;
    private final Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        Archivo archivoViejo = new Archivo(new StringBuilder(""), new StringBuilder(""));
        Archivo archivoNuevo = new Archivo(new StringBuilder(""), new StringBuilder(""));
        ManejoArchivo manejoArchivo = new ManejoArchivo(this.modelo, this.vista);
        archivoViejo = manejoArchivo.pedirUnArchivo(archivoViejo, this.modelo.obtenerTITULO_SELECTOR_ARCHIVO_VIEJO());
        if(archivoViejo.getTipo().toString().equals(this.modelo.obtenerOpcionCancelar())){
            terminar();
        }
        archivoNuevo = manejoArchivo.pedirUnArchivo(archivoNuevo, this.modelo.obtenerTITULO_SELECTOR_ARCHIVO_NUEVO());
        if(archivoNuevo.getTipo().toString().equals(this.modelo.obtenerOpcionCancelar())){
            terminar();
        }
        if(archivoViejo.getTipo().toString().equals(this.modelo.obtenerStringCSV())){

        }
        else if(archivoViejo.getTipo().toString().equals(this.modelo.obtenerStringXLS())){

        }
        else if(archivoViejo.getTipo().toString().equals(this.modelo.obtenerStringXLSX())){

        }
    }

    public void terminar(){
        this.vista.mostrarDialogoNotificacion(this.modelo.obtenerCuerpoTerminacionXCancelamiento(), this.modelo.obtenerTituloTerminacion());
        System.exit(0);
    }
}
