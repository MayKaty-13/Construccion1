
package SEMANA01.Teorico;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class BufferReader {
      public static void main(String[] args) throws IOException {        
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    
//3- Saludo utilizando su nombre(bufferReader) 
/*         System.out.println("Ingrese su nombre:");
          String nombre= bf.readLine();
          System.out.println("Hola "+ nombre);
*/

//4- Sumar dos numeros(bufferReader) 
        int a,b,suma;
        System.out.println("Ingrese el primer numero:");
        a=Integer.parseInt(bf.readLine());
        System.out.println("Ingrese el segundo numero:");
        b=Integer.parseInt(bf.readLine());
        suma=a+b;
        System.out.println("La suma de los numeros es: "+suma);


      }

}
