package com.company;


import com.google.gson.Gson;

import javax.naming.Context;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Archivo {

    private ArrayList<Persona> usuarios;

    private String datosArchivoJson;

    File myFile = null;



    ///Escribir archivo

    public Archivo(String path) {


        this.usuarios = usuarios;

        myFile = new File(path);



    }

    public void agregarPersona(Persona usuario){this.usuarios.add(usuario);}



    public void EscriboUnArchivo() {


        try {

            if (!myFile.exists()) {


                System.out.println("El archivo no existe, Creando uno...");

                myFile.createNewFile();

                System.out.println("Archivo " + myFile.getName() + " creado con exito");

            }

            if (!myFile.isDirectory()) {


                ///Convierto de java a Json

                Gson objGson = new Gson();

                String s = objGson.toJson(usuarios);

                ///Escritura general

                FileOutputStream fOut = new FileOutputStream(myFile);

                OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);

                myOutWriter.append(s);


                myOutWriter.close();

                fOut.close();


            }

        } catch (IOException e) {

            System.out.println("Debe ingresar un nombre sin numeros");
        }
    }

    public String LeoUnArchivo() {


        try {
            if (!myFile.exists()) {


                System.out.println("El archivo no existe");


            }

            if (!myFile.isDirectory()) {


                FileInputStream fIn = new FileInputStream(myFile);

                BufferedReader myReader = new BufferedReader(new InputStreamReader(fIn));


                String aDataRow = "";

                String aBuffer = ""; //Holds the text

                while ((aDataRow = myReader.readLine()) != null) {
                    aBuffer += aDataRow;

                }


                myReader.close();

                datosArchivoJson=aBuffer;
            }
        } catch (IOException e) {

            System.out.println("No se pudo leer");


        }

        return datosArchivoJson;
    }
}