package com.company.Persistencia;

import com.company.Modelado_clases.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.company.Modelado_clases.Avion;

public class Archivo {

    ///Archivo
    File usuarios = new File("Usuarios.json");
    File aviones = new File("Aviones.json");
    File datosvuelo = new File("DatosVuelo.json");


    Type typeUsuario = (Type) new TypeToken<ArrayList<Usuario>>() {}.getType();

    Type typeDatosVuelo = (Type) new TypeToken<ArrayList<DatosVuelo>>() {}.getType();

    Type typeAvion = (Type) new TypeToken<ArrayList<Avion>>() {}.getType();


    ///CONSTRUCTOR

    public Archivo() {

    }





    /////////////METODOS///////////////////////////////////////////////////////////////////////////////////////////////////////////////



   ///Pasa el archivo aviones a un arraylist. Si no existe el archivo "aviones.json", crea uno y carga una lista ya hardcodeada
    public ArrayList<Avion> LeoUnArchivoAvion() {

        ArrayList<Avion> listaretornada = new ArrayList<>();


        try{
            if(!(aviones).exists()){     ///si no existe el archivo Aviones.json, termina la funcion aca
                aviones.createNewFile();
                cargarAvionesEnArchivo();

            }

            BufferedReader bufferAvion = new BufferedReader(new FileReader(aviones));
            Gson gson = new Gson();
            listaretornada = gson.fromJson(bufferAvion, typeAvion);
            bufferAvion.close();

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo de aviones.");
        }

        ///Devuelve un String con datos . json
        return listaretornada;
    }


    ///Pasa el archivo aviones a un arraylist. Si no existe el archivo "aviones.json", crea uno y carga una lista ya hardcodeada
    public ArrayList<Usuario> leoUnArchivoUsuario() {

        ArrayList<Usuario> listaretornada = new ArrayList<>();

        try{
            if(!(usuarios).exists()){     ///si no existe el archivo Aviones.json, termina la funcion aca
                usuarios.createNewFile();
                cargarUsuariosEnArchivo();
            }

            BufferedReader bufferUsuarios = new BufferedReader(new FileReader(usuarios));
            Gson gson = new Gson();
            listaretornada = gson.fromJson(bufferUsuarios, typeUsuario);
            bufferUsuarios.close();

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo de usuarios.");
        }

        ///Devuelve un String con datos . json
        return listaretornada;
    }

    public ArrayList<DatosVuelo> leoUnArchivoDatosVuelo() {

        ArrayList<DatosVuelo> listaretornada = new ArrayList<>();

        try{
            if(!(datosvuelo).exists()){     ///si no existe el archivo datosvuelo.json, lo crea VACIO
                datosvuelo.createNewFile();

            }

            BufferedReader bufferDatosVuelo = new BufferedReader(new FileReader(datosvuelo));
            Gson gson = new Gson();
            listaretornada = gson.fromJson(bufferDatosVuelo, typeDatosVuelo);
            bufferDatosVuelo.close();

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo de Datos Vuelo.");
        }

        ///Devuelve un String con datos . json
        return listaretornada;
    }






    ///Busca los vuelos de un determinado usuario y los devuelve en una lista
    public ArrayList<DatosVuelo> listarVuelosDeUsuario(Usuario usuario, ArrayList<DatosVuelo> listadoVuelos)
    {
        ArrayList<DatosVuelo> listadoVuelosUsuario= new ArrayList<>();

        if(listadoVuelos!=null)
        {
            for(DatosVuelo list: listadoVuelos)
            {
                if(usuario.equals(list.getUsuario()))
                {
                    listadoVuelosUsuario.add(list);}
            }
        }
        else
            System.out.println("Listado de vuelos vacia");

        return listadoVuelosUsuario;
    }



    ///esta funcion se ejecutará solamente si el archivo aviones no existe. Crea un arraylist de Aviones hardcodeada y lo guarda en el archivo .json
    ///Siempre tratamos a los aviones como ARRAYLIST y no como cada avion en particular
    public void cargarAvionesEnArchivo(){


        ArrayList<Avion> listaDeAviones= new ArrayList<>();


        if (aviones.getName().endsWith("json")) {

            Gold Oro1 = new Gold("Gold1", 1500, 300, 20, 800, Propulsion.A_REACCION, true);
            Gold Oro2 = new Gold("Gold2", 1500, 275, 18, 750, Propulsion.A_REACCION, false);
            Gold Oro3 = new Gold("Gold3", 1500, 250, 16, 725, Propulsion.A_HELICE, true);

            Silver Plata1 = new Silver("Silver1", 1000, 245, 17, 700, Propulsion.A_HELICE);
            Silver Plata2 = new Silver("Silver2", 1000, 225, 13, 700, Propulsion.A_REACCION);
            Silver Plata3 = new Silver("Silver3", 1000, 210, 11, 680, Propulsion.A_HELICE);

            Bronze Bronce1 = new Bronze("Bronze1", 950, 195, 12, 661, Propulsion.A_HELICE);
            Bronze Bronce2 = new Bronze("Bronze2", 950, 180, 8, 650, Propulsion.DE_PISTONES);
            Bronze Bronce3 = new Bronze("Bronze3", 950, 160, 6, 650, Propulsion.DE_PISTONES);


            listaDeAviones.add(Oro1);
            listaDeAviones.add(Oro2);
            listaDeAviones.add(Oro3);

            listaDeAviones.add(Plata1);
            listaDeAviones.add(Plata2);
            listaDeAviones.add(Plata3);

            listaDeAviones.add(Bronce1);
            listaDeAviones.add(Bronce2);
            listaDeAviones.add(Bronce3);


            try {

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(aviones));
                Gson objGson = new Gson();
                objGson.toJson(listaDeAviones, typeAvion, bufferedWriter);
                bufferedWriter.close();

            } catch (IOException e) {
                System.out.println("Error. No se pudo guardar el archivo Aviones");
            }
        }

    }

    ///Si no existia previamente el archivo de Usuarios, se cargan tres usuarios ya hardcodeados
    public void cargarUsuariosEnArchivo(){


        ArrayList<Usuario> listaDeUsuarios= new ArrayList<>();


        if (usuarios.getName().endsWith("json")) {

            Usuario usuario1 = new Usuario("Maite", "Lopez", 123, 30);
            Usuario usuario2 = new Usuario("Ayelen", "Marinoni", 321, 29);
            Usuario usuario3 = new Usuario("Agustin", "Vello", 231, 27);


            listaDeUsuarios.add(usuario1);
            listaDeUsuarios.add(usuario2);
            listaDeUsuarios.add(usuario3);



            try {

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(usuarios));
                Gson objGson = new Gson();
                objGson.toJson(listaDeUsuarios, typeUsuario, bufferedWriter);
                bufferedWriter.close();

            } catch (IOException e) {
                System.out.println("Error. No se pudo guardar el archivo Usuarios");
            }
        }

    }


    ///Toma la lista ya actualizada con la instancia DatosVuelo nueva agregada, y sobrescribe el archivo con la nueva lista
    public void guardarListaVuelos(ArrayList<DatosVuelo> listaDeVuelos){

        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(datosvuelo));
            Gson objGson = new Gson();
            objGson.toJson(listaDeVuelos, typeDatosVuelo, bufferedWriter);
            bufferedWriter.close();

        } catch (IOException e) {
           }

    }

}