package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Constructor {

    Type type = (Type) new TypeToken<ArrayList<Persona>>() {}.getType();
    ArrayList<Persona> Usuarios = null;
    Archivo DAOUsuarios =null;


    public Constructor(Archivo DAOUsuarios){


        this.DAOUsuarios = DAOUsuarios;


    }



    ///Leer los archivos de Ventana
//
//    public ArrayList<Persona> pasarUsuariosDeArchivo(Archivo DAO){
//
//        ///Donde se guarden los usuarios
//        ArrayList<Persona> listadoUsuarios=null;
/////     Donde se guardan los archivos . json
//        String datosArchivoJson;
//
//        ///Leo el archivo
//        datosArchivoJson=DAO.LeoUnArchivoUsuarios();
//
//        Gson gson = new Gson();
//
//        ///Pasar archivo . json a arreglo
//       // listadoUsuarios = gson.fromJson(datosArchivoJson, (java.lang.reflect.Type) type);
//
//        return listadoUsuarios;
//
//    }

    public ArrayList<Persona> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Persona> usuarios) {
        Usuarios = usuarios;
    }


    ///Leer los archivos de archivos

    public ArrayList<TresAviones> ListaAvionesDeArchivo(Archivo DAO){

        ///Donde se guarden los aviones
        ArrayList<TresAviones> listadoAviones;
///     Donde se guardan los archivos . json
        String datosArchivoJson;

        ///Leo el archivo
        datosArchivoJson=DAOUsuarios.LeoUnArchivoAviones();

        Gson gson = new Gson();

        ///Pasar archivo . json a arreglo
        listadoAviones = gson.fromJson(datosArchivoJson, (java.lang.reflect.Type) type);

        return listadoAviones;

    }
    ///Guardarlos en un Arreglo aviones
    ///Mandarle el Arreglo a Ventana



    public Archivo getDAOUsuarios() {
        return DAOUsuarios;
    }

    public void setDAOUsuarios(Archivo DAOUsuarios) {
        this.DAOUsuarios = DAOUsuarios;
    }


}
