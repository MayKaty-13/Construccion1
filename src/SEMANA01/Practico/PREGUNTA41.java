
package SEMANA01.Practico;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class PREGUNTA41 {
    public static void main(String[] args) {
        ArrayList<alumno> alumnos=new ArrayList<>();
        for(int i=0;i<40;i++){
            alumno a=new alumno("Alumno "+(i+1), obtenernota(), obtenernota(), obtenernota(), obtenernota(), obtenernota());
            alumnos.add(a);
        }
        System.out.println("\t DATOS DE TODOS LOS ALUMNOS");
        for(int i=0;i<40;i++){
            System.out.println(alumnos.get(i).toString());
        }
        
        System.out.println("");
        System.out.println("ALUMNOS CON DERECHO A NIVELACION");
        int cont=0;
        for(int i=0;i<40;i++){
            if(alumnos.get(i).promedio()<11.0){
                System.out.println("Nombre: "+ alumnos.get(i).nombre+"  Promedio: "+alumnos.get(i).promedio);
                cont++;
            }
        }
        System.out.println("TOTAL DE ALUMNOS CON DERECHO A NIVELACION:  "+cont);
        System.out.println("");
        System.out.println("ALUMNOS QUE NO TIENEN DERECHO A NIVELACION");
        cont=0;
        for(int i=0;i<40;i++){
            if(alumnos.get(i).promedio()>=11.0){
                System.out.println("Nombre: "+ alumnos.get(i).nombre+"  Promedio: "+alumnos.get(i).promedio);
                cont++;
            }
        }
        System.out.println("TOTAL DE ALUMNOS QUE NO TINENEN DERECHO A NIVELACION:  "+cont);
    }
    
    public static double obtenernota(){
        BigDecimal bigDecimal = new BigDecimal(calificacion(20.0, 1.0)).setScale(2, RoundingMode.UP);
        double nota=bigDecimal.doubleValue();
        return nota;
    }
    
    public static double calificacion(double max,double min){
        return (double)((max+min-1)*Math.random()+1);
    }
}
class alumno{
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double nota5;
    double promedio;

    public alumno(String nombre, double nota1, double nota2, double nota3, double nota4, double nota5) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }
    
    public double promedio(){
        promedio=(nota1+nota2+nota3+nota4+nota5)/5;
        BigDecimal bigDecimal = new BigDecimal(promedio).setScale(2, RoundingMode.UP);
        promedio=bigDecimal.doubleValue();
        return promedio;
    }

    public String toString() {
        return "Nombre:  " + nombre + "         Nota1: " + nota1 + "         Nota2: " + nota2 + "           Nota3: " + nota3 + "          Nota4: " + nota4 + "           Nota5: " + nota5+"           Promedio: "+promedio();
    }
    
    
}
