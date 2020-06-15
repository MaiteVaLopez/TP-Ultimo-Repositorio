package com.company.Persistencia;

import com.company.Modelado_clases.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Archivo {

    ///Archivo
    File miarchivoUsuario;
    File miarchivoAvion;
    File miarchivoDatosVuelo;

    FileOutputStream salidaAvion;

    FileOutputStream salidaDatosVuelo;

    Type typeUsuario = (Type) new TypeToken<ArrayList<Usuario>>() {}.getType();

    Type typeDatosVuelo = (Type) new TypeToken<ArrayList<DatosVuelo>>() {}.getType();

    Type typeAvion = (Type) new TypeToken<ArrayList<Avion>>() {}.getType();

    String pathAvion = "Aviones.json";

    String pathDatosVuelo = "DatosVyelo.json";

    ///Escribir archivo

    ///path es la direccion de la carpeta que contiene el archivo

    public Archivo(String pathUsuario) {

        miarchivoUsuario = new File(pathUsuario);

        miarchivoAvion = new File(pathAvion);

        miarchivoDatosVuelo = new File(pathDatosVuelo);
    }


    public String LeoUnArchivoUsuario() {


        String datosArchivoJson= null;

        try {
            if (!miarchivoUsuario.exists()) {


                System.out.println("El archivo no existe");


            }

            if (!miarchivoUsuario.isDirectory()) {


                FileInputStream fIn = new FileInputStream(miarchivoUsuario);

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


    public String LeoUnArchivoAvion() {


        String datosArchivoJson= null;

        try {
            if (!miarchivoAvion.exists()) {



                miarchivoAvion.createNewFile();



            }

            if (!miarchivoAvion.isDirectory()) {


                FileInputStream fIn = new FileInputStream(miarchivoAvion);

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


    public String LeoUnArchivoDatosVuelo() {


        String datosArchivoJson= null;

        try {
            if (!miarchivoDatosVuelo.exists()) {



                miarchivoDatosVuelo.createNewFile();



            }

            if (!miarchivoDatosVuelo.isDirectory()) {


                FileInputStream fIn = new FileInputStream(miarchivoDatosVuelo);

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
        ///Aca deberia abrir y Leer el archivo de usuario para poder ver si el DNI es valido

        ///Guardo los datos .json del archivo
        String datosArchivo = LeoUnArchivoUsuario();


        if (datosArchivo!=null) {

            Gson gson = new Gson();

            ///Paso los datos del archivo . json a lista de usuarios

            ListaUsuarios = gson.fromJson(datosArchivo, (java.lang.reflect.Type)typeUsuario);//Es para que pueda leer el arreglo de usuarios



        }

        return ListaUsuarios;

    }


    ///Devuelvo una lista de aviones leida del archivo
    public ArrayList<Avion> DevuelvoListaDeAvionesGuardada() {


        ArrayList<Avion> ListaAviones = null;

        ///Aca deberia abrir y Leer el archivo de Avion

        ///Guardo los datos .json del archivo
        String datosArchivo = LeoUnArchivoAvion();

        if (datosArchivo!=null) {

            Gson gson = new Gson();

            ///Paso los datos del archivo . json a lista de aviones

            ListaAviones = gson.fromJson(datosArchivo, (java.lang.reflect.Type)typeAvion);//Es para que pueda leer el arreglo de usuarios


        }

        return ListaAviones;

    }


    ///Devuelvo una lista de datos vuelo leida del archivo
    public ArrayList<DatosVuelo> DevuelvoListaDeDatosVueloGuardada() {


        ArrayList<DatosVuelo> ListaDatosVuelo = null;

        ///Aca deberia abrir y Leer el archivo de DatosVuelo

        ///Guardo los datos .json del archivo
        String datosArchivo = LeoUnArchivoDatosVuelo();

        if (datosArchivo!=null) {

            Gson gson = new Gson();

            ///Paso los datos del archivo . json a lista de DAtosVuelo

            ListaDatosVuelo = gson.fromJson(datosArchivo, (java.lang.reflect.Type)typeDatosVuelo);//Es para que pueda leer el arreglo de usuarios


        }

        return ListaDatosVuelo;

    }

    ///Metodo utilizado en ventana para guardar una lista .json en un archivo, el mensaje devuelve si se pudo guardar con exito o no
    public String GuardarArchivoUsuario(File archivo, String documento, FileOutputStream salida) {

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

    ///Metodo utilizado en ventana para guardar una lista .json en un archivo
    public void GuardarArchivoAvion(File archivo, String documento) {

        try {


            salidaAvion = new FileOutputStream(archivo);
            byte[] byjson = documento.getBytes();
            salidaAvion.write(byjson);


        } catch (Exception e) {
        }

    }

    public void GuardarAvionesEnLista(){


        ArrayList<Avion> ListaAviones= new ArrayList<>();

        String documento;
        Gson objGson = new Gson();



        if (miarchivoAvion.getName().endsWith("json")) {

            Avion Oro1 = new Gold("Gold1", 1500, 300, 20, 60, Propulsion.A_HELICE, true);
            Avion Oro2 = new Gold("Gold2", 1500, 300, 20, 60, Propulsion.A_HELICE, false);
            Avion Oro3 = new Gold("Gold3", 1500, 300, 20, 60, Propulsion.A_HELICE, true);


            Avion Plata1 = new Silver("Silver1", 1000, 200, 15, 40, Propulsion.A_REACCION);
            Avion Plata2 = new Silver("Silver2", 1000, 200, 15, 40, Propulsion.A_REACCION);
            Avion Plata3 = new Silver("Silver3", 1000, 200, 15, 40, Propulsion.A_REACCION);

            Avion Bronce1 = new Bronze("Bronze1", 950, 150, 10, 35, Propulsion.A_REACCION);
            Avion Bronce2 = new Bronze("Bronze2", 950, 150, 10, 35, Propulsion.A_REACCION);
            Avion Bronce3 = new Bronze("Bronze3", 950, 150, 10, 35, Propulsion.A_REACCION);


            ListaAviones.add(Oro1);
            ListaAviones.add(Oro2);
            ListaAviones.add(Oro3);

            ListaAviones.add(Plata1);
            ListaAviones.add(Plata2);
            ListaAviones.add(Plata3);

            ListaAviones.add(Bronce1);
            ListaAviones.add(Bronce2);
            ListaAviones.add(Bronce3);


            ///Pasa La lista de Aviones a .json
            documento = objGson.toJson(ListaAviones);


            GuardarArchivoAvion(miarchivoAvion, documento);

        }

    }


    ///Metodo utilizado en ventana para guardar una lista .json en un archivo
    public void GuardarArchivoDatosVuelo(File archivo, String documento) {

        try {


            salidaDatosVuelo = new FileOutputStream(archivo);
            byte[] byjson = documento.getBytes();
            salidaDatosVuelo.write(byjson);


        } catch (Exception e) {
        }

    }

    public void GuardarDatosVueloEnLista(DatosVuelo datonuevo){


        ArrayList<DatosVuelo> ListaDatosVuelo= new ArrayList<DatosVuelo>();


        String documento;
        Gson objGson = new Gson();


        if(DevuelvoListaDeDatosVueloGuardada()!= null){

            ///Cargo la lista de datos para agregarle uno mas
            ListaDatosVuelo = DevuelvoListaDeDatosVueloGuardada();

        }


        if (miarchivoDatosVuelo.getName().endsWith("json")) {

            ListaDatosVuelo.add(datonuevo);



            ///Pasa La lista de DAtos Vuelo a .json
            documento = objGson.toJson(ListaDatosVuelo);


            GuardarArchivoDatosVuelo(miarchivoDatosVuelo, documento);

        }

    }

}