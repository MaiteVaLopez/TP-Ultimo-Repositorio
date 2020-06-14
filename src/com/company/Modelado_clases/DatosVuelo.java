package com.company.Modelado_clases;

import java.util.*;


public class DatosVuelo {
    private Ciudad origen;
    private Ciudad destino;
    private Usuario usuario; //Se asocia el usuario que va a contratar el vuelo que ya se eligio con anterioridad
    private Date fecha;      //Se guardara la fecha del vuelo aqui y se deberia quitar el listado en la clase vuelos
    private int cantidadPasajeros;
    private Avion avion;
    private double costoDeVuelo;
    private int kmsRuta;

    //Constructor parametrizable de vuelos
    //No es necesario agregar costovuelo ni kmsruta en el constructor
    public DatosVuelo(Date fecha, Ciudad origen, Ciudad destino, int cantidadPasajeros, Avion avion) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.cantidadPasajeros = cantidadPasajeros;
        this.avion = avion;
    }


    //////////////////////GETTERS Y SETTERS ///////////////////////////////////////////

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
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

    public int getKmsRuta() {
        return kmsRuta;
    }

    public void setKmsRuta(int kmsRuta) {
        this.kmsRuta = kmsRuta;
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


    public int calcularKms(){            //calcula los kilometros entre las ciudades.
        int kmsFinales = 0;
        if((this.origen.equals(Ciudad.BUENOS_AIRES) && this.destino.equals(Ciudad.CORDOBA)) ||  (this.origen.equals(Ciudad.CORDOBA) && this.destino.equals(Ciudad.BUENOS_AIRES))){
            kmsFinales = 695;
        }else if((this.origen.equals(Ciudad.BUENOS_AIRES) && this.destino.equals(Ciudad.SANTIAGO)) ||  (this.origen.equals(Ciudad.SANTIAGO) && this.destino.equals(Ciudad.BUENOS_AIRES))){
            kmsFinales = 1400;
        }else if((this.origen.equals(Ciudad.BUENOS_AIRES) && this.destino.equals(Ciudad.MONTEVIDEO)) ||  (this.origen.equals(Ciudad.MONTEVIDEO) && this.destino.equals(Ciudad.BUENOS_AIRES))){
            kmsFinales = 950;
        }else if((this.origen.equals(Ciudad.CORDOBA) && this.destino.equals(Ciudad.MONTEVIDEO)) ||  (this.origen.equals(Ciudad.MONTEVIDEO) && this.destino.equals(Ciudad.CORDOBA))){
            kmsFinales = 1190;
        }else if((this.origen.equals(Ciudad.CORDOBA) && this.destino.equals(Ciudad.SANTIAGO)) ||  (this.origen.equals(Ciudad.SANTIAGO) && this.destino.equals(Ciudad.CORDOBA))){
            kmsFinales = 1050;
        }else if((this.origen.equals(Ciudad.MONTEVIDEO) && this.destino.equals(Ciudad.SANTIAGO)) ||  (this.origen.equals(Ciudad.SANTIAGO) && this.destino.equals(Ciudad.MONTEVIDEO))){
            kmsFinales = 2100;
        }else{
            System.out.println("No se pudo calcular la distancia del vuelo.");   //hacer exception??????????????????????
        }

        return kmsFinales;
    }



    // TOTALMENTE rustico, si lo quieren cambiar o mejorar para mi esta ok. no sabia como llegar a la variable costoFijo de cada subclase
    //calcula el costo total del vuelo.
    public int calcularCostoVuelo() {
        int costoTotal=0;
        costoTotal = (kmsRuta * avion.getCosto_x_km()) + (cantidadPasajeros * 3500);
        if(getAvion() instanceof Bronze){
            costoTotal = costoTotal + 3000;
        }else if (getAvion() instanceof Silver){
            costoTotal = costoTotal + 4000;
        }else if (getAvion() instanceof Gold){
            costoTotal = costoTotal + 6000;
        }
        return costoTotal;
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
