
package SEMANA02.Practico;
class suma{
  int a,b;
 
  public void calcularSuma(int a,int b){
     int suma=a+b; 
      System.out.println("La suma de "+a+" + "+b+" es: "+suma);
  }  
}
class multiplicacion{
  int a,b;
 public void calcularMultiplicacion(int x,int y){
   int multiplicacion= x*y;
       System.out.println("La multiplicacion de "+x+" * "+y+" es: "+multiplicacion);
 }  
}
class division{
   int a,b;
 public void calcularDivision(int x,int y){
   double division= x/y;
   System.out.println("La division de "+x+" / "+y+" es: "+division);
 }   
}
public class Ejercicio01 {
    public static void main(String[] args) {
       suma sum=new suma();
       multiplicacion mul=new multiplicacion();
       division div=new division();
       
       sum.calcularSuma(3, 7);
       mul.calcularMultiplicacion(2, 8);
       div.calcularDivision(15, 3);
    }
 
}
