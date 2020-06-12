package com.company;

import java.util.ArrayList;
import java.util.Date;

public class TresAviones {

    private String nombre;
    private int costo_x_km;  //entre 150 y 300
    private int maxPasajeros;
    ArrayList<Date> listadoReservas;  //Listado de las fechas en las que esta reservado el avion

    public TresAviones( String nombre,int costo_x_km, int maxPasajeros, ArrayList<Date> listadoReservas) {

        this.nombre=nombre;
        this.costo_x_km = costo_x_km;
        this.maxPasajeros = maxPasajeros;

        this.listadoReservas = listadoReservas;
    }



    public int getCosto_x_km() {
        return costo_x_km;
    }

    public void setCosto_x_km(int costo_x_km) {
        this.costo_x_km = costo_x_km;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }


    public ArrayList<Date> getListadoReservas() {
        return listadoReservas;
    }

    public void setListadoReservas(ArrayList<Date> listadoReservas) {
        this.listadoReservas = listadoReservas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
