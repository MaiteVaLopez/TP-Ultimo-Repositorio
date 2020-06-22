package com.company.Persistencia;


import com.company.Modelado_clases.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ArchivoAvion {

    private Gson gson;
    File aviones = new File("AvionesArchivo.json");


    public ArchivoAvion() {
        RuntimeTypeAdapterFactory<Avion> runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory
                .of(Avion.class, "type")
                .registerSubtype(Gold.class, "gold")
                .registerSubtype(Silver.class, "siver")
                .registerSubtype(Bronze.class, "bronze");

        this.gson = new GsonBuilder()
                .registerTypeAdapterFactory(runtimeTypeAdapterFactory)
                .create();
    }




    ///Pasa el archivo aviones a un arraylist. Si no existe el archivo "aviones.json", crea uno y carga una lista ya hardcodeada
    public ArrayList<Avion> LeoUnArchivoAvion() {

        Type listType = new TypeToken<ArrayList<Avion>>() {}.getType();

        ArrayList<Avion> listaretornada = new ArrayList<>();


        try{
            if(!(aviones).exists()){     ///si no existe el archivo Aviones.json, termina la funcion aca
                aviones.createNewFile();
                cargarAvionesEnArchivo();

            }

            BufferedReader bufferAvion = new BufferedReader(new FileReader(aviones));
            Gson gson = new Gson();
            listaretornada = gson.fromJson(bufferAvion, listType);
            bufferAvion.close();

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo de aviones.");
        }

        ///Devuelve un String con datos . json
        return listaretornada;
    }



    ///////////////Lo  llama la funcion de arriba///////////////////////////////////
    public void cargarAvionesEnArchivo() throws IOException{


        ArrayList<Avion> listaDeAviones= new ArrayList<>();
        Type listType = new TypeToken<ArrayList<Avion>>() {}.getType();

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



                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(aviones));

                gson.toJson(listaDeAviones, listType, bufferedWriter);
                bufferedWriter.flush();

        }

    }

}
