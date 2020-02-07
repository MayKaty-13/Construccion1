
package SEMANA02.Teorico;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio06  {
    public static void main(String[] args) throws Exception{
        System.out.println("Ingresar Nombre: ");
        String cad=lectura();
    }
  static String lectura() throws Exception{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String cad=br.readLine(); 
      return cad;
  }
    
}
