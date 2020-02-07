
package SEMANA02.Teorico;

import java.util.ArrayList;


public class testDoctor {
    public static void main(String[] args) {
        ArrayList<Doctor> listaDoctor=new ArrayList<>();
        
        listaDoctor.add(new Doctor(1,"Juan"));
        listaDoctor.add(new Doctor(2,"Maria"));
        listaDoctor.add(new Doctor(3,"Antonio"));
        listaDoctor.add(new Doctor(4,"Nela"));
        
        for(Doctor datos:listaDoctor){
            System.out.println(datos.toString());
        }
    }
}
