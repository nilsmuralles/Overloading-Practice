/*
 * Nombre del programa: Main
 * Autor: Nils Muralles Morales
 * Fecha de creación: 11 de agosto de 2023
 * Última modificación: 
 * Descripción: Clase principal en la que se llevará a cabo un la compra de tickets para el Eras Tour
 */

// Importar las clases necesarias
import java.util.Scanner;

// Clase Main
public class Main {

    // Método main con el menú
    public static void main(String[] args) {

        // Crear los objetos necesarios
        Scanner input = new Scanner(System.in);
        Tour ErasTour = new Tour();

        // Menú
        boolean seguir = true;
        while (seguir) {
            System.out.println("--- BIENVENIDO ---");
            System.out.println("1. Nuevo comprador");
            System.out.println("2. Nueva solicitud de boletos");
            System.out.println("3. Consultar disponibilidad total");
            System.out.println("4. Consultar disponibilidad individual");
            System.out.println("5. Reporte de caja");
            System.out.println("6. Salir");
            System.out.println("");
            System.out.print("Seleccione una opción válida: ");
            String opcion = input.nextLine();

            // Opciones del menú
            switch (opcion) {

                // Nuevo comprador
                case "1":

                    // Datos del comprador
                    System.out.println("");
                    System.out.println("--- NUEVO COMPRADOR ---");

                    System.out.print("Ingrese el nombre del nuevo comprador: ");
                    String nombre = input.nextLine();

                    System.out.print("Ingrese el email del nuevo comprador: ");
                    String correo = input.nextLine();

                    System.out.print("Ingrese la cantidad de boletos a comprar: ");
                    String cantidadDeBoletos = input.nextLine();

                    System.out.print("Ingrese su presupuesto máximo: ");
                    String presupuesto = input.nextLine();
                    System.out.println("");

                    // Validar los datos del comprador
                    try {
                        int cantidadBoletos = Integer.parseInt(cantidadDeBoletos);
                        double budget = Double.parseDouble(presupuesto);

                        // Reemplazar la instancia actual del comprador
                        ErasTour.nuevoComprador(nombre, correo, cantidadBoletos, budget);

                    } catch (Exception e) {
                        System.out.println("Uno o más datos no son válidos. Por favor vuelva a llenar el formulario");
                        System.out.println("");
                        System.out.println("Excepción: " + e.getMessage());
                    }

                    break;

                // Hacer una compra
                case "2":
                    ErasTour.comprar(ErasTour.getUsuario().getBoletosAComprar());
                    break;

                // Consultar disponibilidad total
                case "3":
                    System.out.println("");
                    System.out.println("---DISPONIBILIDAD TOTAL---");
                    ErasTour.consultarDisp();
                    break;

                // Consultar disponibilidad individual
                case "4":
                    System.out.println("");
                    System.out.println("---CONSULTAR DISPONIBILIDAD---");
                    System.out.print("Ingrese la localidad que desea consultar: ");
                    String local = input.nextLine();
                    ErasTour.consultarDispIn(local);
                    break;

                // Reporte de caja
                case "5":
                    System.out.println("");
                    System.out.println("---REPORTE DE CAJA---");
                    ErasTour.reporteLocalidades();
                    break;

                // Salir del programa
                case "6":
                    seguir = false;
                    break;

                default:
                    break;
            }
        }

    }
}