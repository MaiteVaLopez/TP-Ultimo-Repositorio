package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Constructor {

    Type type = (Type) new TypeToken<ArrayList<Persona>>() {}.getType();
    ArrayList<Persona> Usuarios = null;
    Archivo DAO=null;

    public Constructor(Archivo DAO){


        this.DAO=DAO;

    }



    ///Leer los archivos de Ventana

    public ArrayList<Persona> pasarUsuariosDeArchivo(Archivo DAO){

        ///Donde se guarden los usuarios
        ArrayList<Persona> listadoUsuarios=null;
///     Donde se guardan los archivos . json
        String datosArchivoJson;

        ///Leo el archivo
        datosArchivoJson=DAO.LeoUnArchivo();

        Gson gson = new Gson();

        ///Pasar archivo . json a arreglo
        listadoUsuarios = gson.fromJson(datosArchivoJson, (java.lang.reflect.Type) type);

        return listadoUsuarios;

    }
    ///Guardarlos en un Arreglo
    ///Mandarle el Arreglo a Ventana

    public ArrayList<Persona> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Persona> usuarios) {
        Usuarios = usuarios;
    }




    public Archivo getDAO() {
        return DAO;
    }

    public void setDAO(Archivo DAO) {
        this.DAO = DAO;
    }


}
