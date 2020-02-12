package TAREA02GestionesSEMANA2;

import java.util.ArrayList;
import TAREA02EntidadesSEMANA2.Pedido;

public class GestionPedidos {
    
    private ArrayList<Pedido> p = new ArrayList<>();
    private int np = 1;//Número de Pedido

    public ArrayList<Pedido> getP() {
        return p;
    }

    public void setP(ArrayList<Pedido> p) {
        this.p = p;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }
    
    public void create(String fechaP, int cantidad, String cliente, int producto){
        p.add(new Pedido(np,fechaP, cantidad, cliente, producto));
        np++;
    }
    
    public void read(int id){
        System.out.println("Número de Pedido: "+p.get(id).getNumeroP());
        System.out.println("Código del Cliente: "+p.get(id).getCliente());
        System.out.println("Código del Producto: "+p.get(id).getCodigoProducto());
        System.out.println("Cantidad: "+p.get(id).getCantidad());
        System.out.println("Fecha del Pedido: "+p.get(id).getFechaP());
    }
    
    public void readAll(){
        for(int i=0;i<p.size();i++){
            System.out.println("\n--------------------------------");
            System.out.println("Número de Pedido: "+p.get(i).getNumeroP()+"\n");
            System.out.println("Código del Cliente: "+p.get(i).getCliente());
            System.out.println("Código del Producto: "+p.get(i).getCodigoProducto());
            System.out.println("Cantidad: "+p.get(i).getCantidad());
            System.out.println("Fecha del Pedido: "+p.get(i).getFechaP());
        }
    }
    
    public void update(int id, String fechaP, int cantidad, String cliente, int producto){
        p.get(id).setFechaP(fechaP);
        p.get(id).setCantidad(cantidad);
        p.get(id).setCliente(cliente);
        p.get(id).setCodigoProducto(producto);
    }
    
    public void delete(int id){
        p.remove(id);
    }
    
    public void deleteAll(){
        p.clear();
    }
    
}