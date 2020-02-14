package SEMANA03.Teorico;

import java.util.ArrayList;
import java.util.Iterator;

class bolsa implements Iterable<Object>{
 ArrayList<Object> lista =new ArrayList<>();
 int tope;
 public bolsa(int x){
     super();
     this.tope=x;
 }
 public void add(Object objeto){
    if(lista.size()<=tope){
        lista.add(objeto);
    }else{
        throw new RuntimeException("no cabe más");
    } 
 }
    @Override
    public Iterator iterator() {
     return lista.iterator();   
    }
    
}
class Golosina{
    private String Marca;

    public Golosina(String Marca) {
        this.Marca = Marca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    } 
} 
class Chocolatina{
    private String nombre;

    public Chocolatina(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
public class Ejemplo06 {
    public static void main(String[] args) {
        bolsa mercado=new bolsa(5);
     Chocolatina c1=new Chocolatina("koka");  
     Chocolatina c2=new Chocolatina("keke");
     Chocolatina c3=new Chocolatina("koko");
     Golosina g1=new Golosina("Chicle");
     Golosina g2=new Golosina("Caramelo"); 
     mercado.add(c1);
     mercado.add(c2);
     mercado.add(c3);
     mercado.add(g1);
     mercado.add(g2);
     for(Object ob:mercado){
         if(ob instanceof Chocolatina)
             System.out.println("Chocolatina de nombre: "+((Chocolatina)ob).getNombre());
         if(ob instanceof Golosina)
             System.out.println("Golosina marca: "+((Golosina)ob).getMarca());
     }
     
     
     
    }
  
}
