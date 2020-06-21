package com.company.Modelado_clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public final class Silver extends Avion implements Serializable {


    private int costoFijo = 4000;  //tarifa fija por categoria
    private final boolean catering = true;  //todos tienen catering

    public Silver(String identificador, int combMax, int costo_x_km, int maxPasajeros, int velMax, Propulsion propulsion) {
        super(identificador, combMax, costo_x_km, maxPasajeros, velMax, propulsion);
//        this.setType("Silver");
    }
//
//    public Silver() {
//        super();
//    }


    public int getCostoFijo() {
        return costoFijo;
    }



    @Override
    public String toString() {
        return "Clase Silver. " + super.toString() + "Catering: Si. El costo fijo es " + costoFijo;
    }

}
