package TAREA02GestionesSEMANA2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Fabrica f = new Fabrica();
        int opcion = 0;
        
        do{
            System.out.println("\n-----MENÚ DE OPCIONES-----");
            System.out.println("1. Registrar Cliente Natural");
            System.out.println("2. Registrar Cliente Jurídico");
            System.out.println("3. Registrar Producto");
            System.out.println("4. Registrar Pedido");
            System.out.println("5. Mostrar Clientes Naturales");
            System.out.println("6. Mostrar Clientes Juridicos");
            System.out.println("7. Mostrar Productos");
            System.out.println("8. Mostrar Pedidos");
            System.out.println("9. Salir\n");
            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    f.registrarClienteNatural(); break;
                case 2:
                    f.registrarClienteJuridico(); break;
                case 3:
                    f.registrarProducto(); break;
                case 4:
                    f.registrarPedido(); break;
                case 5:
                    f.mostrarClientesNaturales(); break;
                case 6:
                    f.mostrarClientesJuridicos(); break;
                case 7:
                    f.mostrarProductos(); break;
                case 8:
                    f.mostrarPedidos(); break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while(opcion != 9);
        
    }
    
}