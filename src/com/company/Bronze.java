package com.company;

import java.util.ArrayList;
import java.util.Date;

public final class Bronze extends Avion {

    private final int tarifa_tipo = 3000;  //tarifa fija por categoria

    public Bronze(int combMax, int costo_x_km, int maxPasajeros, int velMax, Propulsion propulsion, ArrayList<Date> listadoReservas) {
        super(combMax, costo_x_km, maxPasajeros, velMax, propulsion, listadoReservas);
    }

    public Bronze() {
        super();
    }

    public int getTarifa_tipo() {
        return tarifa_tipo;
    }

}
