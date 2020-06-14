package com.company.Persistencia;

import com.company.Modelado_clases.Avion;
import com.company.Modelado_clases.Usuario;

import java.util.*;


public class DatosVuelo {
    private Usuario usuario; //Se asocia el usuario que va a contratar el vuelo que ya se eligio con anterioridad
    private Date fecha;      //Se guardara la fecha del vuelo aqui y se deberia quitar el listado en la clase vuelos
    private String origen;
    private String destino;
    private int cantidadPasajeros;
    private Avion avion;
    private double costoDeVuelo;

    ////////////////////CONSTRUCTOR PARAMETRIZABLE/////////////////////////////

    public DatosVuelo(Usuario usuario, Date fecha, String origen, String destino, int cantidadPasajeros, Avion avion, double costoDeVuelo) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.cantidadPasajeros = cantidadPasajeros;
        this.avion = avion;
        this.costoDeVuelo = costoDeVuelo;
    }


    //////////////////////GETTERS Y SETTERS ///////////////////////////////////////////

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public double getCostoDeVuelo() {
        return costoDeVuelo;
    }

    public void setCostoDeVuelo(double costoDeVuelo) {
        this.costoDeVuelo = costoDeVuelo;
    }



   ////////////////METODOS//////////////////////////////

    ///Metodo para mostrar vuelo

    @Override
    public String toString() {
        return "DatosVuelo{" +
                "usuario=" + usuario +
                ", fecha=" + fecha +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", cantidadPasajeros=" + cantidadPasajeros +
                ", avion=" + avion +
                ", costoDeVuelo=" + costoDeVuelo +
                '}';
    }

    ///Metodo equals y hashcode compara vuelos segun usuario y fecha ya que un usuario no puede hacer dos vuelos en una misma fecha

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatosVuelo)) return false;
        DatosVuelo that = (DatosVuelo) o;
        return getUsuario().equals(that.getUsuario()) &&
                getFecha().equals(that.getFecha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsuario(), getFecha());
    }
}
