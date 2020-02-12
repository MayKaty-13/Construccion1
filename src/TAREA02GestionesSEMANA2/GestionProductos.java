package TAREA02GestionesSEMANA2;

import java.util.ArrayList;
import TAREA02EntidadesSEMANA2.Producto;

public class GestionProductos {
    
    private ArrayList<Producto> p = new ArrayList<>();
    private int np = 1;//Codigo de Productos

    public ArrayList<Producto> getP() {
        return p;
    }

    public void setP(ArrayList<Producto> p) {
        this.p = p;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }
    
    public void create(String descripcion, double precio, int stock, String unidadMedida){
        p.add(new Producto(np, descripcion, precio, stock, unidadMedida));
        np++;
    }
    
    public void read(int id){
        System.out.println("Codigo del Producto: "+p.get(id).getCodigo());
        System.out.println("Tipo: "+p.get(id).getDescripcion());
        System.out.println("Precio: s/."+p.get(id).getPrecio());
        System.out.println("Unidad: "+p.get(id).getUnidadMedida());
        System.out.println("Stock Actual: "+p.get(id).getStock());
    }
    
    public void readAll(){
        for(int i=0;i<p.size();i++){
            System.out.println("\n--------------------------------");
            System.out.println("Codigo del Producto: "+p.get(i).getCodigo()+"\n");
            System.out.println("Tipo: "+p.get(i).getDescripcion());
            System.out.println("Precio: s/."+p.get(i).getPrecio());
            System.out.println("Unidad: "+p.get(i).getUnidadMedida());
            System.out.println("Stock Actual: "+p.get(i).getStock());
        }
    }
    
    public void update(int id, String descripcion, double precio, int stock, String unidadMedida){
        p.get(id).setDescripcion(descripcion);
        p.get(id).setPrecio(precio);
        p.get(id).setStock(stock);
        p.get(id).setUnidadMedida(unidadMedida);
    }
    
    public void delete(int id){
        p.remove(id);
    }
    
    public void deleteAll(){
        p.clear();
    }

    public boolean consultarStock(int id, int cantidad){
        
        return (cantidad<=p.get(id).getStock());
    }

    public int retornarID(int codigoProducto){
        int indiceP=-1;
        for(int i=0;i<p.size();i++){
            if(codigoProducto == p.get(i).getCodigo()){
                indiceP = i;
                break;
            }
        }
        return indiceP;
    }
    
    public void disminuirStock(int id, int cantidad){
        int stock = p.get(id).getStock();
        int newStock = p.get(id).getStock() - cantidad;
        p.get(id).setStock(newStock);
    }
    
}