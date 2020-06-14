package com.company.Persistencia;

import com.company.Modelado_clases.Avion;
import com.company.Modelado_clases.Usuario;

import java.util.Date;

public class DatoVuelo {

    private Usuario usuario;

    private Avion avion;

    private Date fecha;

    private int acompañantes;

    public DatoVuelo(Usuario usuario, Avion avion, Date fecha, int acompañantes) {
        this.usuario = usuario;
        this.avion = avion;
        this.fecha = fecha;
        this.acompañantes = acompañantes;
    }


    
}
