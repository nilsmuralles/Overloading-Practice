/*
 * @author: Nils Muralles Morales
 * @Version: 1.0
 * @since: 08-11-2023
 * @lastModified: 08-14-2023
 * Clase Boleto que contiene el ticket que se le vende al usuario
 */

// Importar clases necesarias
import java.util.Random;

// Clase Boleto
public class Boleto {

    // Atributos de Boleto
    private int numero;
    private boolean apto;
    private Localidad localidadActual = new Localidad(20, 0, 0);
    private Localidad localidad1 = new Localidad(20, 100, 1);
    private Localidad localidad5 = new Localidad(20, 500, 5);
    private Localidad localidad10 = new Localidad(20, 1000, 10);
    Random random = new Random();

    // Constructor de Boleto
    public Boleto() {

    }

    // Setters y getters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public Localidad getNoDeLocalidad() {
        return localidadActual;
    }

    public void setNoDeLocalidad(Localidad noDeLocalidad) {
        this.localidadActual = noDeLocalidad;
    }

    // Método validar boleto
    public void validarBoleto(int numeroAValidar) {

        // Rango de números para comprar un ticket
        int a = random.nextInt(15000) + 1;
        int b = random.nextInt(15000) + 1;

        // Validar que el número esté dentro del rango permitido
        if (numeroAValidar >= a && numeroAValidar <= b) {
            apto = true;

            // Asignar la localidad
            int[] posiblesLocalidades = { 1, 5, 10 };
            int localidadAsignada = posiblesLocalidades[random.nextInt(3)];

            // Asignar el precio por boleto en función de la localidad
            switch (localidadAsignada) {
                case 1:
                    localidadActual = localidad1;
                    break;

                case 5:
                    localidadActual = localidad5;
                    break;

                case 10:
                    localidadActual = localidad10;
                    break;

                default:
                    break;
            }
            System.out.println("");
            System.out.println("--- SOLICITUD DE COMPRA ---");
            System.out.println("No. De ticket: " + numeroAValidar);
            System.out.println("Localidad asignada: " + localidadAsignada);
            System.out
                    .println("Esta localidad cuenta con un precio de: $" + localidadActual.getPrecio() + " por boleto");

        } else {
            apto = false;
            System.out.println("");
            System.out.println("El número de ticket " + numeroAValidar + " no es apto para comprar boletos");
        }
    }

    public void disp1() {
        System.out.println("");
        System.out.println("---LOCALIDAD 1---");
        System.out.println("Boletos disponibles: " + localidad1.getEspacios());
        System.out.println("");
    }

    public void disp5() {
        System.out.println("");
        System.out.println("---LOCALIDAD 5---");
        System.out.println("Boletos disponibles: " + localidad5.getEspacios());
        System.out.println("");
    }

    public void disp10() {
        System.out.println("");
        System.out.println("---LOCALIDAD 10---");
        System.out.println("Boletos disponibles: " + localidad10.getEspacios());
        System.out.println("");
    }

    public void reporte(String localidadAReportar) {
        switch (localidadAReportar) {
            case "1":
                System.out.println("Localidad 1: " + localidad1.getTotalVendido());
                break;
            case "5":
                System.out.println("Localidad 5: " + localidad5.getTotalVendido());
                break;
            case "10":
                System.out.println("Localidad 10: " + localidad10.getTotalVendido());
                break;
            default:
                break;

        }
    }
}