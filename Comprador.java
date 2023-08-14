/*
 * Nombre del programa: Comprador
 * Autor: Nils Muralles Morales
 * Fecha de creación: 11 de agosto de 2023
 * Última modificación: 
 * Descripción: Clase Comprador que contiene al usuario que maneja el programa
 */

public class Comprador {

    // Atributos de Comprador
    private String nombre;
    private String email;
    private int boletosAComprar;
    private double presupuesto;
    private Boleto ticket = new Boleto();

    // Constructor de Comprador
    public Comprador(String nombre, String email, int boletosAComprar, double presupuesto) {
        this.nombre = nombre;
        this.email = email;
        this.boletosAComprar = boletosAComprar;
        this.presupuesto = presupuesto;
    }

    // Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBoletosAComprar() {
        return boletosAComprar;
    }

    public void setBoletosAComprar(int boletosAComprar) {
        this.boletosAComprar = boletosAComprar;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Boleto getTicket() {
        return ticket;
    }

    public void setTicket(Boleto ticket) {
        this.ticket = ticket;
    }

}