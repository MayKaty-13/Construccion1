
package SEMANA03.Teorico;

import java.util.ArrayList;
import java.util.Iterator;

class bag<t> implements Iterable<t>{
    private ArrayList<t> lista =new ArrayList<>(); 
    int tope;
    
    public bag(int x){
        this.tope=x;
    }
    void add(t p){
        if(lista.size()<=tope)
            lista.add(p);
        else
            throw new RuntimeException("Esta lleno");
    }
    @Override
    public Iterator<t> iterator() {
      return lista.iterator();    
    }
}

public class Ejemplo07 {
    public static void main(String[] args) {
        bag<Golosina> bolsitag=new bag(5);
         bag<Chocolatina> bolsitac=new bag(5);
         Chocolatina c1=new Chocolatina("koka");  
        Chocolatina c2=new Chocolatina("keke");
        Chocolatina c3=new Chocolatina("koko");
        Golosina g1=new Golosina("Chicle");
        Golosina g2=new Golosina("Caramelo"); 
        Golosina g3=new Golosina("tofis"); 
        bolsitac.add(c1);
        bolsitac.add(c2);
        bolsitac.add(c3);
        bolsitag.add(g1);
        bolsitag.add(g2);
        bolsitag.add(g3);
        for(Golosina g:bolsitag){
            System.out.println(g.getMarca());
        }
        for(Chocolatina c:bolsitac){
            System.out.println(c.getNombre());
        }
    }
   
}
