
package SEMANA01.Practico;

public class EJERCICIO9 {
   public static void main(String[] args) {
       int pc[]= new int[30];
       int suma,mayorC,menorC,indiceAMeC,indiceAMaC;
       double promedio;
        suma=0;
        
        for(int i=1;i<=25;i++){
          pc[i]=aleatorio(1,30);
          System.out.print(pc[i]+" ");
          suma=suma+pc[i];
        }
        mayorC=0;
        indiceAMaC=0;
        for(int i=1;i<=25;i++){
         if(mayorC<pc[i]){
            mayorC=pc[i];
            indiceAMaC=i;
          }
         }
        menorC=50;
        indiceAMeC=0;
        for(int i=1;i<=25;i++){
         if(menorC>pc[i]){
             menorC=pc[i];
             indiceAMeC=i;
          }
         }
        promedio=suma/25;
        System.out.println("\nEl promedio de puntos contaminantes de los 25 autos es: "+promedio);
        System.out.println("El auto que menos contamino fue el numero: "+indiceAMeC);
        System.out.println("El auto que más contamino fue el numero: "+indiceAMaC);
    }
      public static int aleatorio(double max,double min){
        return (int)((max+min-1)*Math.random()+1);
    }
            
}
