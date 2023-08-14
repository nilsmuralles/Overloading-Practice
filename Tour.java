/*
 * Nombre del programa: Tour
 * Autor: Nils Muralles Morales
 * Fecha de creación: 11 de agosto de 2023
 * Última modificación: 
 * Descripción: Clase Tour que ejecuta la lógica del programa
 */

// Importar las clases necesarias
import java.util.Scanner;
import java.util.Random;

// Clase Tour
public class Tour {

    // Atributos de Tour
    private Comprador usuario = new Comprador(null, null, 0, 0);
    private Localidad localidad = new Localidad(20, 0, 0);
    private Boleto ticket = new Boleto();
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    // Constructor de Tour
    public Tour() {

    }

    // Setters y getters
    public Comprador getUsuario() {
        return usuario;
    }

    public void setUsuario(Comprador usuario) {
        this.usuario = usuario;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Boleto getTicket() {
        return ticket;
    }

    public void setTicket(Boleto ticketUsuario) {
        this.ticket = ticketUsuario;
    }

    // Nuevo comprador
    public void nuevoComprador(String nombreComprador, String correoComprador, int boletosComprador,
            double presComprador) {
        Comprador usuarioNuevo = new Comprador(nombreComprador, correoComprador, boletosComprador, presComprador);
        usuario = usuarioNuevo;
    }

    // Nueva compra
    public void comprar(int boletosComprar) {

        // Validación del ticket
        int numeroDeTicket = random.nextInt(15000) + 1;
        ticket.validarBoleto(numeroDeTicket);
        double total = boletosComprar * ticket.getNoDeLocalidad().getPrecio();

        // Validar el presupuesto del usuario
        if (ticket.isApto()) {
            if (usuario.getPresupuesto() < total) {
                System.out.println("Lo sentimos. No se le pueden vender los boletos por falta de presupuesto");
                System.out.println("");

            } else { // Si no se excede el presupuestos

                // Validar los espacios
                if (ticket.getNoDeLocalidad().getEspacios() < usuario.getBoletosAComprar()) {
                    System.out.println("No tenemos espacio suficiente para completar su solicitud");
                    System.out.println("");

                } else { // Si hay espacios
                    System.out.println("Nombre del comrpador: " + usuario.getNombre());
                    System.out.println("Email del comprador: " + usuario.getEmail());
                    System.out.println("Boletos a comprar: " + usuario.getBoletosAComprar());
                    System.out.println("Prespupuesto del comprador: " + usuario.getPresupuesto());
                    System.out.println("Total: " + total);
                    System.out.println("¡Compra realizada con éxito! Muchas gracias por confiar en nosotros");
                    System.out.println("");

                    usuario.setPresupuesto(usuario.getPresupuesto() - total);
                    ticket.getNoDeLocalidad()
                            .setEspacios(ticket.getNoDeLocalidad().getEspacios() - usuario.getBoletosAComprar());
                    ticket.getNoDeLocalidad().setTotalVendido(ticket.getNoDeLocalidad().getTotalVendido() + total);
                }

            }
        } else {
            System.out.println("Intentelo de nuevo");
            System.out.println("");
        }
    }

    // Consultar disponibilidad total
    public void consultarDisp() {
        ticket.disp1();
        ticket.disp5();
        ticket.disp10();
    }

    // Consultar disponibilidad individual
    public void consultarDispIn(String numeroAConsultar) {
        switch (numeroAConsultar) {
            case "1":
                ticket.disp1();
                break;

            case "5":
                ticket.disp5();
                break;

            case "10":
                ticket.disp10();
                break;

            default:
                break;
        }
    }

    public void reporteLocalidades() {
        ticket.reporte("1");
        ticket.reporte("5");
        ticket.reporte("10");
        System.out.println("");
    }
}