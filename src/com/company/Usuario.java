package com.company;

import java.util.*;

public class Usuario {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private List<DatosVuelo> vuelosConfirmados;

    public Usuario(String nombre, String apellido, int dni, int edad, List<DatosVuelo> vuelosConfirmados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.vuelosConfirmados = vuelosConfirmados;
    }


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

    public List<DatosVuelo> getVuelosConfirmados() {
        return vuelosConfirmados;
    }

    public void setVuelosConfirmados(List<DatosVuelo> vuelosConfirmados) {
        this.vuelosConfirmados = vuelosConfirmados;
    }


}
