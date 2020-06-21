package com.company.Persistencia;

import com.company.Modelado_clases.Avion;
import com.company.Modelado_clases.Bronze;
import com.company.Modelado_clases.Gold;
import com.company.Modelado_clases.Silver;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;



    public class GsonAvion {

        private Gson objGsonAvion;

        public GsonAvion() {
            RuntimeTypeAdapterFactory<Avion> runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory
                    .of(Avion.class, "type")
                    .registerSubtype(Gold.class, "gold")
                    .registerSubtype(Silver.class, "silver")
                    .registerSubtype(Bronze.class, "bronze");

            this.objGsonAvion = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")
                    .registerTypeAdapterFactory(runtimeTypeAdapterFactory)
                    .create();
        }

        public void guardarAvion(ArrayList<Avion> listaAvion) throws IOException {
            File file = new File("Aviones.json");

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            objGsonAvion.toJson(listaAvion, bufferedWriter);

            bufferedWriter.flush();
        }

        public ArrayList<Avion> leoArchivoAvion() throws FileNotFoundException {
            File file = new File("Aviones.json");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            Type listType = new TypeToken<ArrayList<Avion>>() {}.getType();

            ArrayList<Avion> listaretornada = objGsonAvion.fromJson(bufferedReader, listType);
            return listaretornada;
        }
    }



