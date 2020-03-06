
package SEMANA03.Practico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class ColaPrior implements Prioridad{
    
    int valor;
    ArrayList<Integer> elementos; 
    public ColaPrior(){
        elementos=new ArrayList<>(); 
    }
    
    @Override
    public int prioridad() {
        
        elementos.add(valor);
        return valor;
    }
    @Override
    public void mostrar(){
        ordenar();
        if(elementos.size()>=0){
            System.out.print("[");
            for(int i=0;i<elementos.size();i++){
                System.out.print(elementos.get(i) +" ");
            }
            System.out.print("]");
        }else{
            System.out.println("La lista esta Vacia");
        }
        
    }
    
    @Override
    public void agregar(int i){
        valor=i;
        prioridad();
    }
    public void ordenar(){
        Collections.reverse(elementos);
        
    }
    
}
 interface Prioridad{
    public int prioridad();
    public void mostrar();
    public void agregar(int numero);
}

public class Ejercicio08 {
  public static void main(String[] args) {
        Scanner ci=new Scanner(System.in);
        ColaPrior cola=new ColaPrior();
         System.out.println("\t PRIORIDAD DE VALORES");
        boolean valor=true;
        int numero=0;
        while(valor){
            System.out.println("Ingresa 1 para agregar valor");
            System.out.println("Ingrese 2 para terminar");
            numero=ci.nextInt();
            switch(numero){
                case 1:
                    System.out.println("Ingresa un valor para agregar:  ");
                    int nu1=ci.nextInt();                    
                    cola.agregar(nu1);
                    System.out.print("Prioridad: ");
                    cola.mostrar();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Prioridad Final");
                    cola.mostrar();
                    valor=false;
                    System.out.println();
                    break;
                default:
                    System.out.println("Ingreso invalido!!");
            }
        }
        
        
    }  
}
