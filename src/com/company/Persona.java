package com.company;


import com.google.gson.annotations.SerializedName;

public class Persona {

    ///Atributos

    @SerializedName("Usuario")
    private String miusuario;

    @SerializedName("Contraseña")
    private String contraseña;

    @SerializedName("nombre")
    private String nombre;

    @SerializedName("Apellido")
    private String Apellido;

    @SerializedName("DNI")
    private String DNI;

    @SerializedName("edad")
    private String edad;


///Constructor


    public Persona() {
    }

    ;

    public Persona(String usuario, String contraseña, String nombre, String apellido, String DNI, String edad) {

        this.miusuario= usuario;
        this.contraseña= contraseña;
        this.nombre = nombre;
        this.Apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
    }


    public String toString() {

        return "\nNombre: " + nombre + "\nApellido: " + Apellido + "\nEdad: " + edad + "\nDNI: " + DNI;


    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getMiusuario() {
        return miusuario;
    }

    public void setMiusuario(String miusuario) {
        this.miusuario = miusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    ///Comparo si el usuario ingresado en pantalla principal esta registrado, lo utilizo en el boton acepltar de la pantalla principal

    public int hashCode() {

        int result = getMiusuario().hashCode();

        result = result * 31 + getContraseña().hashCode();

        return result;
    }
}