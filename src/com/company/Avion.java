package com.company;

import java.util.ArrayList;
import java.util.Date;

public abstract class Avion {

    private int combMax;   //combustible maximo (pueden llegar hasta 200.000 lt)
    private int costo_x_km;  //entre 150 y 300
    private int maxPasajeros;
    private int velMax;  //hasta 1000 km/h
    private Propulsion propulsion; //clase enum
    ArrayList<Date> listadoReservas;  //Listado de las fechas en las que esta reservado el avion

    public Avion(int combMax, int costo_x_km, int maxPasajeros, int velMax, Propulsion propulsion, ArrayList<Date> listadoReservas) {
        this.combMax = combMax;
        this.costo_x_km = costo_x_km;
        this.maxPasajeros = maxPasajeros;
        this.velMax = velMax;
        this.propulsion = propulsion;
        this.listadoReservas = listadoReservas;
    }

    public Avion() {

    }

    public int getCombMax() {
        return combMax;
    }

    public void setCombMax(int combMax) {
        this.combMax = combMax;
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

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public Propulsion getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(Propulsion propulsion) {
        this.propulsion = propulsion;
    }

    public ArrayList<Date> getListadoReservas() {
        return listadoReservas;
    }

    public void setListadoReservas(ArrayList<Date> listadoReservas) {
        this.listadoReservas = listadoReservas;
    }


}
