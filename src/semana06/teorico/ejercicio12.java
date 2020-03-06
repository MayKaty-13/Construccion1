/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana06.teorico;

/**
 *
 * @author BRYANROY
 */
public class ejercicio12 {
    public static void main(String[] args){
        int x=0;
        int y=5;
        try{
            int resp=x+y;
        }catch(Exception e){   
        }finally{
            System.out.println("Ejecuto el finally!!");
        }
    }
}
