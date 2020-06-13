package com.company.Modelado_clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public final class Silver extends Avion implements Serializable {

    private final int tarifa_tipo = 4000;  //tarifa fija por categoria
    private final boolean catering = true;  //todos tienen catering

    public Silver(String identificador, int combMax, int costo_x_km, int maxPasajeros, int velMax, Propulsion propulsion, ArrayList<Date> listadoReservas) {
        super(identificador, combMax, costo_x_km, maxPasajeros, velMax, propulsion, listadoReservas);
    }

    public Silver() {
        super();
    }

    public int getTarifa_tipo() {
        return tarifa_tipo;
    }


}
