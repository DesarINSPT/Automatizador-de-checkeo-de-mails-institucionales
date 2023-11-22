package com.example.Controladores;

import com.example.Modelos.Archivo;
import com.example.Modelos.Modelo;
import com.example.Vistas.Vista;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        //inicializacion
        Archivo archivoViejo = new Archivo(new StringBuilder(modelo.obtenerStringNoSoportado()));
        Archivo archivoNuevo = new Archivo(new StringBuilder(modelo.obtenerStringNoSoportado()));
        ManejoArchivo manejoArchivo = new ManejoArchivo(this.modelo, this.vista);
        TerminadoresPrograma terminadoresPrograma = new TerminadoresPrograma(this.modelo, this.vista);

        //pedido de los archivos y confirmacion de seleccion
        while (archivoViejo.getTipo().equals(this.modelo.obtenerStringNoSoportado())){
            archivoViejo = manejoArchivo.pedirUnArchivo(archivoViejo, this.modelo.obtenerTITULO_SELECTOR_ARCHIVO_VIEJO());
            if(archivoViejo.getTipo().equals(this.modelo.obtenerOpcionCancelar())){
                terminadoresPrograma.xCancelacion();
            }
            else if(archivoViejo.getTipo().equals(this.modelo.obtenerStringNoSoportado())){
                this.vista.mostrarDialogoNotificacion(this.modelo.obtenerCuerpoTerminacionXArchivoErroneo(), this.modelo.obtenerTituloTerminacion());
            }
        }
        while (archivoNuevo.getTipo().equals(this.modelo.obtenerStringNoSoportado())){
            archivoNuevo = manejoArchivo.pedirUnArchivo(archivoNuevo, this.modelo.obtenerTITULO_SELECTOR_ARCHIVO_NUEVO());
            if(archivoNuevo.getTipo().equals(this.modelo.obtenerOpcionCancelar())){
                terminadoresPrograma.xCancelacion();
            }
            else if(archivoNuevo.getTipo().equals(this.modelo.obtenerStringNoSoportado())){
                this.vista.mostrarDialogoNotificacion(this.modelo.obtenerCuerpoTerminacionXArchivoErroneo(), this.modelo.obtenerTituloTerminacion());
            }
        }

        /*
        * a partir de aca se asume el correcto formato de los archivos
        * y se procede a la transformacion de los mismos
        * */
        if(archivoViejo.getTipo().equals(this.modelo.obtenerStringCSV())){

        }
        else if(archivoViejo.getTipo().equals(this.modelo.obtenerStringXLS())){
            manejoArchivo.xlsTOcsv(archivoViejo);
        }
        else if(archivoViejo.getTipo().equals(this.modelo.obtenerStringXLSX())){
            manejoArchivo.xlsxTOcsv(archivoViejo);
        }
    }
}
