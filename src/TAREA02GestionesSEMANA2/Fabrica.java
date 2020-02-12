package TAREA02GestionesSEMANA2;

import java.util.Scanner;

public class Fabrica {
    Scanner leer = new Scanner(System.in);
    
    GestionProductos gproductos = new GestionProductos();
    GestionPedidos gpedidos = new GestionPedidos();
    GestionClientesNaturales gcn = new GestionClientesNaturales();
    GestionClientesJuridicos gcj = new GestionClientesJuridicos();

    public GestionProductos getGproductos() {
        return gproductos;
    }

    public void setGproductos(GestionProductos gproductos) {
        this.gproductos = gproductos;
    }

    public GestionPedidos getGpedidos() {
        return gpedidos;
    }

    public void setGpedidos(GestionPedidos gpedidos) {
        this.gpedidos = gpedidos;
    }

    public GestionClientesNaturales getGcn() {
        return gcn;
    }

    public void setGcn(GestionClientesNaturales gcn) {
        this.gcn = gcn;
    }

    public GestionClientesJuridicos getGcj() {
        return gcj;
    }

    public void setGcj(GestionClientesJuridicos gcj) {
        this.gcj = gcj;
    }
    
    public void registrarClienteNatural(){
        System.out.println("Ingrese los datos del cliente: ");
        System.out.println("DNI: ");
        String DNI = leer.next();
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido Paterno: ");
        String aPaterno = leer.next();
        System.out.println("Apellido Materno: ");
        String aMaterno = leer.next();
        System.out.println("Teléfono: ");
        String telefono = leer.next();
        System.out.println("Correo: ");
        String correo = leer.next();
        System.out.println("Dirección: ");
        String direccion = leer.next();
        
        gcn.create(DNI, nombre, aPaterno, aMaterno, telefono, correo, direccion);
        System.out.println("CLIENTE NATURAL REGISTRADO.");
    }
    
    public void registrarClienteJuridico(){
        System.out.println("Ingrese los datos del cliente: ");
        System.out.println("Nombre de la Tienda: ");
        String nombreT = leer.next();
        System.out.println("RUC: ");
        String RUC = leer.next();
        System.out.println("Teléfono: ");
        String telefono = leer.next();
        System.out.println("Correo: ");
        String correo = leer.next();
        System.out.println("Dirección: ");
        String direccion = leer.next();
        
        gcj.create(nombreT, RUC, telefono, correo, direccion);
        System.out.println("CLIENTE JURÍDICO REGISTRADO.");
    }
    
    public void registrarProducto(){
        System.out.println("Ingrese los datos del producto: ");
        System.out.println("Tipo: ");
        String descripcion = leer.next();
        System.out.println("Precio: ");
        double precio = leer.nextDouble();
        System.out.println("Stock: ");
        int stock = leer.nextInt();
        System.out.println("Unidad de Medida: ");
        String unidadMedida = leer.next();
        
        gproductos.create(descripcion, precio, stock, unidadMedida);
        System.out.println("PRODUCTO REGISTRADO.");
    }
    
    public void registrarPedido(){
        System.out.println("Ingrese los datos del producto: ");
        System.out.println("Tipo de cliente: \n1) Cliente Natural\n2) Cliente Juridico");
        int tipoCliente = leer.nextInt();
        
        switch(tipoCliente){
            case 1:
                System.out.println("Ingrese el DNI del cliente: ");
                String DNI = leer.next();
                int idClienteN = gcn.retornarID(DNI);
                if(idClienteN != -1){
                    System.out.println("Ingrese el Código del Producto: ");
                    int codigoProducto = leer.nextInt();
                    int idProducto = gproductos.retornarID(codigoProducto);
                    if(idProducto != -1){
                        System.out.println("Ingrese la cantidad: ");
                        int cantidad = leer.nextInt();
                        
                        if(cantidad < 100){
                            if(gproductos.consultarStock(idProducto, cantidad)){
                                gproductos.disminuirStock(idProducto, cantidad);
                                System.out.println("Ingrese la fecha que desea recibir el pedido: ");
                                String fecha = leer.next();
                                
                                gpedidos.create(fecha, cantidad, DNI, codigoProducto);
                                System.out.println("PEDIDO REGISTRADO");
                            }else{
                                System.out.println("La cantidad solicitada excede el Stock del producto.");
                            }
                        }else{
                            System.out.println("Los clientes naturales solo pueden solicitar una cantidad menor a 100.");
                        }
                    }else{
                        System.out.println("Producto no registrado");
                    }
                    
                }else{
                    System.out.println("Cliente Natural no registrado");
                }
                break;
            case 2:
                System.out.println("Ingrese el RUC del cliente: ");
                String RUC = leer.next();
                int idClienteJ = gcj.retornarID(RUC);
                if(idClienteJ != -1){
                    System.out.println("Ingrese el Código del Producto: ");
                    int codigoProducto = leer.nextInt();
                    int idProducto = gproductos.retornarID(codigoProducto);
                    if(idProducto != -1){
                        System.out.println("Ingrese la cantidad: ");
                        int cantidad = leer.nextInt();
                        
                        if(cantidad%100 == 0){
                            if(gproductos.consultarStock(idProducto, cantidad)){
                                gproductos.disminuirStock(idProducto, cantidad);
                                System.out.println("Ingrese la fecha que desea recibir el pedido: ");
                                String fecha = leer.next();
                                
                                gpedidos.create(fecha, cantidad, RUC, codigoProducto);
                                System.out.println("TOTAL A PAGAR: s/."+gproductos.getP().get(idProducto).getPrecio()*cantidad);
                                System.out.println("PEDIDO REGISTRADO");
                            }else{
                                System.out.println("La cantidad solicitada excede el Stock del producto.");
                            }
                        }else{
                            System.out.println("Los clientes naturales solo pueden solicitar una cantidad menor a 100.");
                        }
                    }else{
                        System.out.println("Producto no registrado");
                    }
                    
                }else{
                    System.out.println("Cliente Natural no registrado");
                }
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }
    
    public void mostrarClientesNaturales(){
        System.out.println("LISTA DE CLIENTES NATURALES");
        gcn.readAll();
    }
    
    public void mostrarClientesJuridicos(){
        System.out.println("LISTA DE CLIENTES JURÍDICOS");
        gcj.readAll();
    }
    
    public void mostrarProductos(){
        System.out.println("LISTA DE PRODUCTOS");
        gproductos.readAll();
    }
    
    public void mostrarPedidos(){
        System.out.println("LISTA DE PEDIDOS");
        gpedidos.readAll();
    }
    
}