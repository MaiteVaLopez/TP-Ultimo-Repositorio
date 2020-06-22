package com.company.Modelado_clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public final class Gold extends Avion implements Serializable {

    private int costoFijo = 6000;  //tarifa fija por categoria
    private final boolean catering = true;  //todos tienen catering
    private boolean wifi;   //basicamente si o no

    public Gold(String identificador, int combMax, int costo_x_km, int maxPasajeros, int velMax, Propulsion propulsion, boolean wifi) {
        super(identificador, combMax, costo_x_km, maxPasajeros, velMax, propulsion);
//        this.setType("gold");
        this.wifi = wifi;
    }

//    public Gold() {
//        super();
//    }


    public boolean isCatering() {
        return catering;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public int getCostoFijo() {
        return costoFijo;
    }


    @Override
    public String toString() {
        System.out.println("Clase Gold. " + super.toString() + "Catering: Si. Wifi: ");
        if(isWifi()){
            System.out.println("Si. ");
        }
        else{
            System.out.println("No. ");
        }
        return "El costo fijo es " + costoFijo;
    }

}
