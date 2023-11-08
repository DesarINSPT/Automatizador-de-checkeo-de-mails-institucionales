package com.example;

/*obtener a partir de dos archivos .xls dos .csv, el 1ro con los no repetidos y el 2do con los repetidos, pero modificados*/

import com.example.Controladores.Controlador;
import com.example.Modelos.Modelo;
import com.example.Vistas.Vista;

/**
 * recordar que el retorno de la app son una salida excel en formato .csv
 * y otra con un .xlsx que contenga en dos carillas diferentes los mail viejos y los repetidos
 *
 * primerNombre.apellido@inspt.utn.edu.ar
 * (insertar numeros antes del arroba en orden ascendente en caso de previa existencia)
 */

public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista(modelo);
        Controlador controlador = new Controlador(modelo, vista);
        controlador.ejecutar();
    }
}