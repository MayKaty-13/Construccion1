
package semana06.practico;

import java.util.ArrayList;


interface Iimpresion{
    public void imprimir(Object o);
}
class persona{
    private String name;
    private double sueldo;
    
    public persona(String n, double suel){
        this.name=n;
        this.sueldo=suel;
    }

}
class tinta implements Iimpresion{
    
    public void imprimir(Object o){
        System.out.println("Imprimiendo a Tinta");
    }
}
class laser implements Iimpresion{
    public void imprimir(Object o){
        System.out.println("Imprimiendo a Laser");
    }
}
class termica implements Iimpresion{
    public void imprimir(Object o){
        System.out.println("Imprimiendo a Termica");
    }
}
class servicioImprimir{
   Iimpresion imprimir;
   void setimprimir(Iimpresion imprimir){
       this.imprimir=imprimir;
   }
   void saveimprimir(ArrayList<persona> p){
       imprimir.imprimir(p);
   }
}
class padron{
    ArrayList<persona> pers=new ArrayList<>();
    void agregarpersona(){
        pers.add(new persona("Manuel",700));
    }
}
public class ejercicio01 {
    
    public static void main(String[] args){
        Iimpresion impri=new tinta();
        servicioImprimir imp=new servicioImprimir();
        imp.setimprimir(new tinta());
        //imp.saveimprimir());
    }
}
