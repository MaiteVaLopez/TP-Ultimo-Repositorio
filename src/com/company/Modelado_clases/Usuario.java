package com.company.Modelado_clases;

import java.util.*;

public class Usuario {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;

    //////////////CONSTRUCTOR///////////////////////////////////////////////

    public Usuario(String nombre, String apellido, int dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }


///Constructor Default
    public Usuario(){};

    /////////////GETTERS Y SETTERS/////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    /////////////////METODOS///////////////////////////////////////////////////////

    /////Muestra listado de vuelos confirmados

  /*  public void listarVuelosConfirmados()
    {
        for(DatosVuelo list: this.vuelosConfirmados)
        {
            System.out.println(list.toString());
        }
    }*/ //Queda deprecado porq ya no hay lista de vuelos dentro del usuario, hay que generar un listado al leer un archivo

    ///Recorre el listado de vuelos confirmados y busca el mejor avion, luego devuelve un String como mensaje
   /*
    public String mejorAvion() {
        int condBronze = 0, condSilver = 0, condGold = 0;
        String mensaje=null;

        for (DatosVuelo list : this.vuelosConfirmados) {
            if (list.getAvion() instanceof Bronze)
                condBronze = 1;
            if (list.getAvion() instanceof Silver)
                condSilver = 1;
            if (list.getAvion() instanceof Gold)
                condGold = 1;
        }

        if (condGold == 1) {
            mensaje="El mejor avion fue un GOLD";
        } else if (condSilver == 1) {
            mensaje="El mejor avion fue un Silver";
        }else if(condBronze==1)
        {
            mensaje="El mejor avion fue un Bronze";
        }else{
            mensaje = "El usuario no registra vuelos";   //agregué esta linea
        }
        return mensaje;
    }*/

    ///Cancelar vuelo


    ///Muestra usuario con sus atributos


    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", dni=" + dni + ", edad=" + edad;
    }

    ///// Equals and hashcode compara usuarios por su dni considerando que el dni es unico por persona


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return getDni() == usuario.getDni();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }
}
