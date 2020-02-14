
package SEMANA03.Practico;


import java.util.ArrayList;
import java.util.Iterator;

class operacion{
    int x,y;

    public operacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
   public void suma(){
       int suma=x+y;
       System.out.println("La suma de los numeros es: "+suma);
   } 
    public void resta(){
       int resta=x-y;
       System.out.println("La resta de los numeros es: "+resta);
   } 
     public void producto(){
       int producto=x*y;
       System.out.println("La producto de los numeros es: "+producto);
   } 
}
class operaciones<Float> implements Iterable<Float>{
    private ArrayList<Float> lista =new ArrayList<>(); 
    int tope;
    
    public operaciones(int x){
        this.tope=x;
    }
    void add(Float p){
        if(lista.size()<=tope)
            lista.add(p);
        else
            throw new RuntimeException("Esta lleno");
    }
    @Override
    public Iterator<Float> iterator() {
      return lista.iterator();    
    }
}
public class generic {
    public static void main(String[] args) {
     operaciones<operacion> op=new operaciones(5);
     operacion op1=new operacion(2,2);
     operacion op2=new operacion(4,2);
     operacion op3=new operacion(7,3);
     op1.suma();
     op2.resta();
     op3.producto();
     op.add(op1);
     op.add(op2);
     op.add(op3);
      for(operacion o:op){
            System.out.println(o);
        }
     
    }
  
}
