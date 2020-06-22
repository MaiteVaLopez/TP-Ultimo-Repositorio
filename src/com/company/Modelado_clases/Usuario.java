package com.company.Modelado_clases;

import com.company.Persistencia.DatosVuelo;

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

    ///Recorre el listado de vuelos confirmados y busca el mejor avion, luego devuelve un String como mensaje

   public String mejorAvion(ArrayList<DatosVuelo> vuelosConfirmados) {
        int condBronze = 0, condSilver = 0, condGold = 0;
        String mensaje=null;

        if(vuelosConfirmados !=null) {
            for (DatosVuelo list : vuelosConfirmados) {
                if (list.getAvion().getIdentificador().startsWith("Bronze"))
                    condBronze = 1;
                if (list.getAvion().getIdentificador().startsWith("Silver"))
                    condSilver = 1;
                if (list.getAvion().getIdentificador().startsWith("Gold"))
                    condGold = 1;
            }

            if (condGold == 1) {
                mensaje = "Gold";
            } else if (condSilver == 1) {
                mensaje = "Silver";
            } else if (condBronze == 1) {
                mensaje = "Bronze";
            }
        }
        else
            mensaje="El usuario no registra vuelos";

        return mensaje;
    }

    ///Recorre la lista de vuelos confirmados por el usuario y suma sus costos de vuelo
    public int costoTotalDeVuelos(ArrayList<DatosVuelo> vuelosConfirmados)
    {
        int costoTotalVuelos=0;
        if(vuelosConfirmados!=null)
        {
            for(DatosVuelo list: vuelosConfirmados)
            {
                costoTotalVuelos+=list.calcularCostoVuelo();
            }
        }
        return costoTotalVuelos;
    }



    ///Muestra usuario con sus atributos


    @Override
    public String toString() {
        return "Nombre: '" + nombre + '\'' + ", Apellido: " + apellido + '\'' + ", DNI: " + dni + ", Edad: " + edad;
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
