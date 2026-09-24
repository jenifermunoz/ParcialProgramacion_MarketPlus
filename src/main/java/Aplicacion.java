import java.time.LocalDate;
import java.util.Scanner;
public class Aplicacion {
    public static void main(String[] args) {

        // menu interactivo

        Scanner sc = new Scanner(System.in);

        Supermercado supermercado = new Supermercado("MarketPlus", "Carrera 19", "3178956723");
        Cliente clienteActual = null;
        Compra compraActual = null;
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

            switch (seleccion) {

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

                    Cliente cliente = new Cliente(nombreCliente, documentoCliente, telefonoCliente, correoCliente);

                    if (supermercado.registrarCliente(cliente)) {
                        System.out.println("Cliente registrado correctamente.");
                    } else {
                        System.out.println("No se pudo registrar el cliente.");
                    }

                    break;
                case 2:
                    System.out.println("\n------ Realizar Compra ------");
                    System.out.print("Ingrese el documento del cliente: ");
                    String docBuscar = sc.nextLine();

                    Cliente clienteEncontrado = null;
                    for (Cliente c : supermercado.getListaClientes()) {
                        if (c.getDocumentoIdentidad().equals(docBuscar)) {
                            clienteEncontrado = c;
                            break;
                        }
                    }

                    if (clienteEncontrado != null) {
                        System.out.print("Ingrese el código de la compra: ");
                        String codCompra = sc.nextLine();


                        System.out.println("Elija el método de pago:\n1. EFECTIVO\n2. TARJETA\n3. TRANSFERENCIA\n");
                        System.out.print("Seleccione la opción: ");
                        int opcMetodo = sc.nextInt();
                        sc.nextLine();

                        MetodoPago metodo = MetodoPago.EFECTIVO; // Valor por defecto

                        if (opcMetodo == 1) {
                            metodo = MetodoPago.EFECTIVO;
                        }
                        if (opcMetodo == 2) {
                            metodo = MetodoPago.TARJETA;
                        }
                        if (opcMetodo == 3) {
                            metodo = MetodoPago.TRANSFERENCIAS_BANCARIAS;
                        }
                        System.out.print("Ingrese el año: ");
                        int anoCom = sc.nextInt();

                        System.out.print("Ingrese el número del mes: ");
                        int mesCom = sc.nextInt();

                        System.out.print("Ingrese el día: ");
                        int diaCom = sc.nextInt();
                        LocalDate fechaCompra = LocalDate.of(anoCom, mesCom, diaCom);
                        sc.nextLine();

                        clienteActual = clienteEncontrado;
                        compraActual = new Compra(codCompra, fechaCompra, 0.0, metodo);

                        System.out.println("Compra iniciada correctamente ");
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                    break;
            case 3:
                System.out.println("\n------ Consultar Compras ------");
                System.out.print("Ingrese el documento del cliente: ");
                String docConsulta = sc.nextLine();

                Cliente cliConsulta = null;
                for (Cliente c : supermercado.getListaClientes()) {
                    if (c.getDocumentoIdentidad().equals(docConsulta)) {
                        cliConsulta = c;
                        break;
                    }
                }

                if (cliConsulta != null) {
                    System.out.println("Historial de " + cliConsulta.getNombreCompleto() + ":");

                    boolean tieneCompras = false;

                    for (Compra c : cliConsulta.consultarCompras()) {
                        System.out.println(" - Código: " + c.getCodigoCompra() + " | Fecha: " + c.getFechaRealizacion() + " | Total: $" + c.getValorTotal());
                        tieneCompras = true;
                    }

                    if (tieneCompras = true); {
                        System.out.println("El cliente tiene compras registradas.");
                    }
                } else {
                    System.out.println("Cliente no encontrado.");
                }
                break;

                case 4:
                    break;
        case 5:
        System.out.println("\n------ Registrar Producto ----");
        System.out.print("Código: ");
        String codProd = sc.nextLine();

        System.out.print("Nombre: ");
        String nomProd = sc.nextLine();

        System.out.print("Precio: ");
        double precioProd = sc.nextDouble();

        System.out.print("Cantidad en inventario: ");
        int cantProd = sc.nextInt();
        sc.nextLine();
        System.out.println("elija la categoria \n  " +
                "   1.ALIMENTOS\n" +
                "    2.BEBIDAS\n" +
                "    3.PRODUCTOS_ASEO\n" +
                "    4.CUIDADO_PERSONAL\n");
        int catProd = sc.nextInt();
            sc.nextLine();
            Categoria cat = Categoria.ALIMENTOS;
        if (catProd == 1) {
            cat = Categoria.ALIMENTOS;
        }
        if (catProd == 2) {
            cat = Categoria.BEBIDAS;
        }
        if (catProd ==3){
            cat = Categoria.PRODUCTOS_ASEO;

        }
        if (catProd ==4 ){
            cat = Categoria.CUIDADO_PERSONAL;
        }
        Producto productoNuevo = new Producto(codProd, nomProd, precioProd, cantProd,cat);
            if (supermercado.registrarProducto(productoNuevo)) {
                System.out.println("Producto registrado correctamente.");
            } else {
                System.out.println("No se pudo registrar el producto.");
            }
            break;

                case 6:
                    System.out.println("\n------ Consultar Disponibilidad de Producto ----");
                    System.out.print("Código del producto: ");
                    String codDisp = sc.nextLine();

                    System.out.print("Cantidad requerida: ");
                    int cantReq = sc.nextInt();
                    sc.nextLine();

                    Producto prodDisponibles = null;
                    for (Producto p : supermercado.getListaProductos()) {
                        if (p.getCodigo().equals(codDisp)) {
                            prodDisponibles = p;
                            break;
                        }
                    }

                    if (prodDisponibles != null) {
                        if (prodDisponibles.verificarDisponibilidad(cantReq)) {
                            System.out.println("Disponible " + prodDisponibles.getCantidadDisponible() + " unidades " );
                        } else {
                            System.out.println("Stock insuficiente (" + prodDisponibles.getCantidadDisponible() + " unidades disponibles).");
                        }
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 9:
                    System.out.println("\n------ Agregar Producto a la Compra ----");

                    if (compraActual == null) {
                        System.out.println("Primero debe iniciar una compra en la opción 2.");
                        break;
                    }

                    System.out.print("Ingrese el código del producto a agregar: ");
                    String codItem = sc.nextLine();

                    Producto prodselec = null;
                    for (Producto p : supermercado.getListaProductos()) {
                        if (p.getCodigo().equals(codItem)) {
                            prodselec= p;
                            break;
                        }
                    }

                    if (prodselec != null) {
                        System.out.print("Ingrese la cantidad a llevar: ");
                        int cantLlevar = sc.nextInt();
                        sc.nextLine();

                        if (compraActual.agregarProducto(prodselec, cantLlevar)) {
                            System.out.println("Producto agregado a la compra con éxito.");
                        } else {
                            System.out.println("No hay suficiente cantidad en inventario.");
                        }
                    } else {
                        System.out.println("El producto con ese código no existe.");
                    }
                    break;
                case 10:
                    System.out.println("\n------ Calcular Total de la Compra ----");

                    if (compraActual == null) {
                        System.out.println("No hay ninguna compra iniciada.");
                    } else {
                        double total = compraActual.calcularTotal();
                        System.out.println("El total acumulado de la compra hasta el momento es: " + total);
                    }
                    break;
                case 11:
                    System.out.println("\n------ Confirmar Compra ----");

                    if (compraActual == null || clienteActual == null) {
                        System.out.println("No hay ninguna compra  para confirmar");
                        break;
                    }
                    compraActual.confirmarCompra();
                    clienteActual.realizarCompra(compraActual);
                    supermercado.registrarCompra(compraActual);

                    System.out.println(" la compra ha sido confirmada y registrada ");
                    System.out.println("Total pagado: " + compraActual.getValorTotal());

                    compraActual = null;
                    clienteActual = null;
                    break;

                case 12:
                    System.out.println("\n------ Consultar Ventas por fecha ----");
                    System.out.print("Ingrese el año: ");
                    int ano = sc.nextInt();

                    System.out.print("Ingrese el número del mes: ");
                    int mes = sc.nextInt();

                    System.out.print("Ingrese el día: ");
                    int dia = sc.nextInt();



                    LocalDate fechaConsulta = LocalDate.of(ano, mes, dia);

                    double totalVentas = supermercado.consultarVentasPorFecha(fechaConsulta);

                    System.out.println("Las ventas totales registradas en la fecha " + fechaConsulta + " suman: " + totalVentas);
                    break;

                    }
            }while (seleccion != 0);

    }
}

