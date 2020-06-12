package com.company;

import java.util.*;

public class DatosVuelo {
    private Date fecha;
    private String origen;
    private String destino;
    private int cantidadAcompañantes;
    private Avion avion;
    private double costoDeVuelo;

    public DatosVuelo(Date fecha, String origen, String destino, int cantidadAcompañantes, Avion avion, double costoDeVuelo) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.cantidadAcompañantes = cantidadAcompañantes;
        this.avion = avion;
        this.costoDeVuelo = costoDeVuelo;
    }

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

    public int getCantidadAcompañantes() {
        return cantidadAcompañantes;
    }

    public void setCantidadAcompañantes(int cantidadAcompañantes) {
        this.cantidadAcompañantes = cantidadAcompañantes;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public double getCostoDeVuelo() {
        return costoDeVuelo;
    }

    public void setCostoDeVuelo(double costoDeVuelo) {
        this.costoDeVuelo = costoDeVuelo;
    }

    @Override
    public String toString() {
        return  "fecha=" + fecha +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", cantidadAcompañantes=" + cantidadAcompañantes +
                ", avion=" + avion +
                ", costoDeVuelo=" + costoDeVuelo;
    }
}
