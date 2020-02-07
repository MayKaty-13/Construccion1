
package SEMANA02.Teorico;
class operaciones{
  double potencia(double x,double y){
      return Math.pow(x, y);
  } 
  double factorial(double x){
      double fact=1;
      for(double i=1;i<=x;i++){
        fact*=i;  
      }
      return fact;
  }
  double raiz_cuadrada (double x){
      return Math.sqrt(x);
  }
}

public class testOperaciones {
    public static void main(String[] args) {
     operaciones ope=new operaciones(); 
        System.out.println("El factorial del numero es:"+ope.factorial(3));
    }   
}
