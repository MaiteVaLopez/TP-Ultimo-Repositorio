package com.company.Modelado_clases;

import java.util.*;


public class DatosVuelo {
    private Date fecha;
    private String origen;
    private String destino;
    private int cantidadPasajeros;
    private Object avion;
    private double costoDeVuelo;

    //Constructor parametrizable de vuelos

    public DatosVuelo(Date fecha, String origen, String destino, int cantidadPasajeros, Object avion, double costoDeVuelo) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.cantidadPasajeros = cantidadPasajeros;
        this.avion = avion;
        this.costoDeVuelo = costoDeVuelo;
    }


    ///Getters y setters de los atributos

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public Object getAvion() {
        return avion;
    }

    public void setAvion(Object avion) {
        this.avion = avion;
    }

    public double getCostoDeVuelo() {
        return costoDeVuelo;
    }

    public void setCostoDeVuelo(double costoDeVuelo) {
        this.costoDeVuelo = costoDeVuelo;
    }



    ///Metodo para mostrar vuelo


    @Override
    public String toString() {
        return "DatosVuelo{" +
                "fecha=" + fecha +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", cantidadPasajeros=" + cantidadPasajeros +
                ", avion=" + avion +
                ", costoDeVuelo=" + costoDeVuelo +
                '}';
    }

}
