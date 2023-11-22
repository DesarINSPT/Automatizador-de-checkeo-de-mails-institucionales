package com.example.Controladores;

import com.example.Modelos.Archivo;
import com.example.Modelos.Modelo;
import com.example.Vistas.Vista;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;


public class ManejoArchivo {
    private Vista vista;
    private Modelo modelo;

    public ManejoArchivo(Modelo modelo, Vista vista) {
        this.vista=vista;
        this.modelo=modelo;
    }

    public Archivo pedirUnArchivo(Archivo archivo, String titulo){
        archivo.setDireccionamiento(new StringBuilder(new File(String.valueOf(this.vista.pedidoArchivo(titulo))).toString()));
        return archivo;
    }

    public void creadorArchivosXlsx(String nombreConExtension){
        Workbook archivoNuevo = new XSSFWorkbook(); //para crear un .xls sería HSSFWorkbook
        try {
            OutputStream archivoSalida = new FileOutputStream(nombreConExtension);

            Sheet hoja = archivoNuevo.createSheet();

            Row fila = hoja.createRow(0);

            Cell nombre = fila.createCell(0);
            nombre.setCellValue(this.modelo.obtenerPRIMERA_COLUMNA());//"Nombre"

            Cell apellido = fila.createCell(1);
            apellido.setCellValue(this.modelo.obtenerSEGUNDA_COLUMNA());//Apellido

            Cell mailRecienCreado = fila.createCell(2);
            mailRecienCreado.setCellValue(this.modelo.obtenerTERCERA_COLUMNA());//"Mail recién creado"

            Cell mailEncontrado = fila.createCell(3);
            mailEncontrado.setCellValue(this.modelo.obtenerCUARTA_COLUMNA());//"Mail encontrado"

            archivoSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            archivoNuevo.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void xlsTOcsv(Archivo archivo){

    }

    public void xlsxTOcsv(Archivo archivo) {

    }
}
