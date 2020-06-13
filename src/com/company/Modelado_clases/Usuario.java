package com.company.Modelado_clases;

import java.util.*;

public class Usuario {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private List<DatosVuelo> vuelosConfirmados; //Listado de vuelos confirmados por el usuario.
    private String contraseña;


    //////////////CONSTRUCTOR///////////////////////////////////////////////

    public Usuario(String nombre, String apellido, int dni, int edad, List<DatosVuelo> vuelosConfirmados, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.vuelosConfirmados = vuelosConfirmados;
        this.contraseña = contraseña;
    }

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

    public List<DatosVuelo> getVuelosConfirmados() {
        return vuelosConfirmados;
    }

    public void setVuelosConfirmados(List<DatosVuelo> vuelosConfirmados) {
        this.vuelosConfirmados = vuelosConfirmados;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    /////////////////METODOS///////////////////////////////////////////////////////

    /////Muestra listado de vuelos confirmados

    public void listarVuelosConfirmados()
    {
        for(DatosVuelo list: this.vuelosConfirmados)
        {
            System.out.println(list.toString());
        }
    }


    ///Cancelar vuelo


    ///Muestra usuario con sus atributos

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                ", vuelosConfirmados=" + vuelosConfirmados +
                '}';
    }

///// Equals and hashcode compara usuarios por su nombre apellido y contraseña
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return getNombre().equals(usuario.getNombre()) &&
                getApellido().equals(usuario.getApellido()) &&
                getContraseña().equals(usuario.getContraseña());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido(), getContraseña());
    }
}
