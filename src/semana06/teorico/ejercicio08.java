/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana06.teorico;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author BRYANROY
 */
class leer{
    InputStreamReader is=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(is);
    int leerEntero()throws Exception{
       int x=br.read();
       return x;
    }
}
public class ejercicio08 {
    
}
