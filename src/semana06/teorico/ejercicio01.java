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
interface Ianimal{
    
}
class animal implements Ianimal{
    void correr(){   
    }
}
class tortuga implements Ianimal{
//    @Override
//    void correr(){
//        throw new RuntimeException("La tortuga no puede correr");
//    }
}
public class ejercicio01 {
    public static void main(String[] args){
        Ianimal a=new animal();
        Ianimal b=new tortuga();
    }
}
