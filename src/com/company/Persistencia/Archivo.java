package com.company.Persistencia;

import com.company.Modelado_clases.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.naming.Context;
import javax.swing.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Archivo {

    ///Archivo
    File myFile;

    Type type = (Type) new TypeToken<ArrayList<Usuario>>() {}.getType();


    ///Escribir archivo

    ///path es la direccion de la carpeta que contiene el archivo

    public Archivo(String path) {

        myFile = new File(path);

    }


    public String LeoUnArchivo() {


        String datosArchivoJson= null;

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

                datosArchivoJson = aBuffer;
            }
        } catch (IOException e) {

            System.out.println("No se pudo leer");


        }

        ///Devuelve un String con datos . json
        return datosArchivoJson;
    }

    ///Devuelvo una lista de usuarios leida del archivo
    public ArrayList<Usuario> DevuelvoListaDeUsuariosGuardada() {

        ///Aca guarda los usuarios
        ArrayList<Usuario> ListaUsuarios=null;
        ///Aca deberia abrir y Leer el archivo de usuario para poder ver si el usuario y contraseña ingresados son validos

        ///Guardo los datos .json del archivo
        String datosArchivo = LeoUnArchivo();

        if (datosArchivo!=null) {

            Gson gson = new Gson();

            ///Paso los datos del archivo . json a lista de usuarios

            ListaUsuarios = gson.fromJson(datosArchivo, (java.lang.reflect.Type)type);//Es para que pueda leer el arreglo de usuarios



        }

        return ListaUsuarios;

    }

    ///Metodo utilizado en ventana para guardar una lista .json en un archivo, el mensaje devuelve si se pudo guardar con exito o no
    public String GuardarArchivo(File archivo, String documento,FileOutputStream salida) {

        String mensaje = null;

        try {


            salida = new FileOutputStream(archivo);
            byte[] byjson = documento.getBytes();
            salida.write(byjson);
            mensaje = "Usuario Registrado Con Éxito";


        } catch (Exception e) {
        }

        return mensaje;


    }
}