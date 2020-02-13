/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03.Teorico;
interface padre{
    int CAD=14;
    //metodos son abstractos
  void dormir();
   int comer(); 
   int comer(int a);
   int comer(int p,float y);
}
abstract class canino{
    int x,y;
   abstract void comer();
    abstract void dormir();
     abstract void caminar();
     int suma(){
         return this.x+this.y;
     }
}
class perro extends canino{
   void comer(){}
   void dormir(){}
   void caminar(){}
   
}
public class Ejemplo01 {
    public static void main(String[] args) {
  //    canino p1=new canino();  
    }
   
}
