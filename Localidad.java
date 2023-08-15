/*
 * @author: Nils Muralles Morales
 * @Version: 1.0
 * @since: 08-11-2023
 * @lastModified: 08-14-2023
 * Clase Localidad que contiene la localidad asignada al usuario
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