package com.company.Modelado_clases;

import java.util.ArrayList;
import java.util.Date;

public abstract class Avion {

    private String identificador;   //para diferenciar entre aviones
    private int combMax;   //combustible maximo (pueden llegar hasta 200.000 lt)
    private int costo_x_km;  //entre 150 y 300
    private int maxPasajeros;
    private int velMax;  //hasta 1000 km/h
    private Propulsion propulsion; //clase enum


    public Avion(String identificador, int combMax, int costo_x_km, int maxPasajeros, int velMax, Propulsion propulsion) {
        this.identificador = identificador;
        this.combMax = combMax;
        this.costo_x_km = costo_x_km;
        this.maxPasajeros = maxPasajeros;
        this.velMax = velMax;
        this.propulsion = propulsion;
    }

    public Avion() {

    }


    /////////////GETTERS Y SETTERS/////////////////////////////////////////////////////


    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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


    /////////////////METODOS///////////////////////////////////////////////////////


    @Override
    public String toString() {                      //para mostrar los aviones, sin mostrar el listado de reservas
        return "Avion: " + identificador + '\'' +
                ", Combustible maximo: " + combMax +
                ", Costo por km: " + costo_x_km +
                ", Capacidad maxima: " + maxPasajeros +
                " pasajeros, Velocidad max: " + velMax +
                " km/h, Motor: " + propulsion;
    }

}
