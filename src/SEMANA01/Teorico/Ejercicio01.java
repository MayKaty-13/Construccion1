
package SEMANA01.Teorico;

import java.util.Scanner;


public class Ejercicio01 {
    public static void main(String[] args)  {
    Scanner leer=new Scanner(System.in);
         String n;
         int acu=0;
         System.out.println("Ingrese un numero:"); 
         n=leer.next();
         int i=n.length()-1;
         //System.out.println(i);
        while(i>=0){
//          acu+=Integer.parseInt(n.charAt(i)+""); 
         acu+=Character.getNumericValue(n.charAt(i));
          i--;
        }
        System.out.println("La suma de los digitos del numero "+n+" es: "+acu);

    }
}
