package com.company;

import java.util.ArrayList;
import java.util.Date;

public final class Gold extends Avion {
    private final int tarifa_tipo = 6000;  //tarifa fija por categoria
    private final boolean catering = true;  //todos tienen catering
    private boolean wifi;   //basicamente si o no

    public Gold(int combMax, int costo_x_km, int maxPasajeros, int velMax, Propulsion propulsion, ArrayList<Date> listadoReservas, boolean wifi) {
        super(combMax, costo_x_km, maxPasajeros, velMax, propulsion, listadoReservas);
        this.wifi = wifi;
    }

    public Gold() {
        super();
    }

    public int getTarifa_tipo() {
        return tarifa_tipo;
    }

    public boolean isCatering() {
        return catering;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

}