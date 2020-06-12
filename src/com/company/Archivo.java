package com.company;


import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class Archivo {

    private ArrayList<Persona> usuarios;

    private ArrayList<TresAviones> aviones;

    private String datosArchivoJson;

    File myFileUsuarios = null;


    File myFileAviones = null;


    ///Escribir archivo

    public Archivo(String pathUsuarios, String pathAviones, ArrayList<TresAviones> aviones) {


        this.usuarios = usuarios;

        myFileUsuarios = new File(pathUsuarios);

        myFileAviones = new File(pathAviones);

        this.aviones=aviones;


    }

    public void agregarPersona(Persona usuario){this.usuarios.add(usuario);}

///Escribo Archivo usuario(no lo usamos porque lo escribimos directamente en la ventana)

    public void EscriboUnArchivoUsuarios() {


        try {

            if (!myFileUsuarios.exists()) {


                System.out.println("El archivo no existe, Creando uno...");

                myFileUsuarios.createNewFile();

                System.out.println("Archivo " + myFileUsuarios.getName() + " creado con exito");

            }

            if (!myFileUsuarios.isDirectory()) {


                ///Convierto de java a Json

                Gson objGson = new Gson();

                String s = objGson.toJson(usuarios);

                ///Escritura general

                FileOutputStream fOut = new FileOutputStream(myFileUsuarios);

                OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);

                myOutWriter.append(s);


                myOutWriter.close();

                fOut.close();


            }

        } catch (IOException e) {

            System.out.println("Debe ingresar un nombre sin numeros");
        }
    }
///Leo archivo usuario

    public String LeoUnArchivoUsuarios() {


        try {
            if (!myFileUsuarios.exists()) {


                System.out.println("El archivo no existe");


            }

            if (!myFileUsuarios.isDirectory()) {


                FileInputStream fIn = new FileInputStream(myFileUsuarios);

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

///Cargo el listado de aviones

    public ArrayList<TresAviones> CargarListadoAviones(){



        TresAviones Gold = new TresAviones("Gold",300,20,null);
        TresAviones Silver = new TresAviones("Silver",220,15,null);
        TresAviones Bronze = new TresAviones("Bronze",150,10,null);
        aviones.add(Gold);
        aviones.add(Silver);
        aviones.add(Bronze);



        return aviones;
    }

///Escribo archivo aviones

    public void EscriboUnArchivoAviones() {


        try {

            if (!myFileAviones.exists()) {


                System.out.println("El archivo no existe, Creando uno...");

                myFileAviones.createNewFile();

                System.out.println("Archivo " + myFileAviones.getName() + " creado con exito");

            }

            if (!myFileAviones.isDirectory()) {


                ///Convierto de java a Json

                Gson objGson = new Gson();

                String s = objGson.toJson(aviones);

                ///Escritura general

                FileOutputStream fOut = new FileOutputStream(myFileAviones);

                OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);

                myOutWriter.append(s);


                myOutWriter.close();

                fOut.close();


            }

        } catch (IOException e) {

            System.out.println("Debe ingresar un nombre sin numeros");
        }
    }

    ///Leo Archivo Aviones

    public String LeoUnArchivoAviones() {


        try {
            if (!myFileAviones.exists()) {


                System.out.println("El archivo no existe");


            }

            if (!myFileAviones.isDirectory()) {


                FileInputStream fIn = new FileInputStream(myFileAviones);

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