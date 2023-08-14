/*
 * Nombre del programa: Localidad
 * Autor: Nils Muralles Morales
 * Fecha de creación: 11 de agosto de 2023
 * Última modificación: 
 * Descripción: Clase Localidad que contiene la localidad asignada al usuario
 */

// Clase Localidad
public class Localidad {

    // Atributos de localidad
    private int noDeLocalidad;
    private double precio;
    private int espacios;
    private double totalVendido;

    // Constructor de Localidad
    public Localidad(int espaciosTotales, int precio, int noDeLocalidad) {
        this.espacios = espaciosTotales;
        this.precio = precio;
        this.noDeLocalidad = noDeLocalidad;
    }

    // Setters y getters
    public int getNoDeLocalidad() {
        return noDeLocalidad;
    }

    public void setNoDeLocalidad(int noDeLocalidad) {
        this.noDeLocalidad = noDeLocalidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }
}