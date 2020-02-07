
package SEMANA01.Practico;
public class EJERCICIO10 {
    public static void main(String[] args) {
       int pc[]= new int[30];
       int PFall=0,PLog=0,suma=0;
       double promedio;
       for(int i=0;i<10;i++){
          pc[i]=aleatorio(1,18);
          System.out.println("Prueba "+(i+1)+" : "+pc[i]+" minutos");
          suma+=pc[i];
           if(pc[i]<=16){
             PLog+=1;
           }else{
               PFall+=1;
           }
       }
       promedio=suma/10;
       System.out.println("El promedio de todas sus pruebas es: "+promedio);
       if(promedio<=15 || PLog==9 || PFall==1){
        System.out.println("El atleta es apto para la prueba de 5 Kilómetros, obtuvo un promedio de: "+promedio+" durante todas las pruebas de los dias establecidos"); 
        System.out.println("Logró "+PLog+" pruebas menores a 17 minutos");
        System.out.println("Falló "+PFall+" pruebas con tiempo mayores a 16 minutos");
       }
       else{
           System.out.println("El atleta no es apto la prueba de 5 Kilómetros");
       }
    } 
     public static int aleatorio(double max,double min){
        return (int)((max+min-1)*Math.random()+1);
    }
}
