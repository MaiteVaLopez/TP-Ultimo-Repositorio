package com.company.Modelado_clases;

import java.io.Serializable;
import java.sql.SQLOutput;

public final class Bronze extends Avion implements Serializable {

    private final int costoFijo = 3000;

    public Bronze(String identificador, int combMax, int costo_x_km, int maxPasajeros, int velMax, Propulsion propulsion) {
        super(identificador, combMax, costo_x_km, maxPasajeros, velMax, propulsion);
    }

//    public Bronze() {
//        super();
//    }


    public int getCostoFijo() {
        return costoFijo;

    }


    @Override
    public String toString() {
        return "Clase Bronze. " + super.toString() + "El costo fijo es " + costoFijo;
    }


}
