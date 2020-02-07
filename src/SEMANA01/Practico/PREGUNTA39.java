
package SEMANA01.Practico;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class PREGUNTA39 {
    public static void main(String[] args) {
        System.out.println("50 Calificaciones Generadas");
        ArrayList<Alumno> alumnos=new ArrayList<>();
        for(int i=0;i<50;i++){
            Alumno a=new Alumno("Alumno "+(i+1));
            
            BigDecimal bigDecimal = new BigDecimal(Aleatorio(20.0, 1.0)).setScale(2, RoundingMode.UP);
            a.calificacion=bigDecimal.doubleValue();  
            alumnos.add(a);
        }
        mostrar(alumnos);
        int contApro=0,contDesa=0;
        for(int i=0;i<50;i++){
            if(alumnos.get(i).calificacion>=11){
                contApro++;
            }else{
                contDesa++;
            }
        }
        
        System.out.println();
        
        System.out.println("El porcentaje de aprobados es:  "+(100*contApro)/50+"%");
        System.out.println("El porcentaje de desaprobados es:  "+(100*contDesa)/50+"%");
        
    }
    public static void mostrar(ArrayList<Alumno> a){
        for(int i=0;i<50;i++){
            System.out.println("-Nombre: "+a.get(i).nombre+" -Calificacion: "+a.get(i).calificacion);
        }
    }
    public static double Aleatorio(double max,double min){
        return (double)((max+min-1)*Math.random()+1);
    }
}
class Alumno{
    String nombre;
    double calificacion;
    
    public Alumno(String nombre){
        this.nombre=nombre;
    } 
}
