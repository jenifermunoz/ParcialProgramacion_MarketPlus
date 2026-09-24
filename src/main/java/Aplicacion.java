import java.time.LocalDate;
import java.util.Scanner;
public class Aplicacion {
    static void main() {

        // menu interactivo

        Scanner sc= new Scanner(System.in);

        Supermercado supermercado=new Supermercado("MarketPlus", "Carrera 19", "3178956723");

        int seleccion;
        do {
            System.out.println("\n====== Supermercado MarketPlus =======");
            System.out.println("-------Cliente-------");
            System.out.println("1. Registrar Cliente.");
            System.out.println("2. Realizar Compra.");
            System.out.println("3. Consultar Compras .");

            System.out.println("--------Producto-----------");
            System.out.println("5. Registrar Producto.");
            System.out.println("6. Consultar disponibilidad de producto.");

            System.out.println("--------Compra-----------");
            System.out.println("9. Agregar producto a la compra.");
            System.out.println("10. Calcular total de la compra.");
            System.out.println("11. Confirmar compra.");
            System.out.println("12. Consultar ventas por fecha.");

            System.out.println("0. Salir.");

            System.out.print("Seleccione la opción: ");
            seleccion = sc.nextInt();
            sc.nextLine();

            switch (seleccion){

                //=============Cliente=============
                case 1:
                    System.out.println("\n------Registrar Cliente----");

                    System.out.print("Nombre Completo: ");
                    String nombreCliente = sc.nextLine();

                    System.out.print("Documento de identidad: ");
                    String documentoCliente = sc.nextLine();

                    System.out.print("Telefono: ");
                    String telefonoCliente = sc.nextLine();

                    System.out.print("Correo: ");
                    String correoCliente = sc.nextLine();

                    Cliente cliente = new Cliente (nombreCliente,documentoCliente,telefonoCliente, correoCliente);

                    if (supermercado.registrarCliente(cliente)) {
                        System.out.println("Cliente registrado correctamente.");
                    } else {
                        System.out.println("No se pudo registrar el cliente.");
                    }

                    break;

    }
}
