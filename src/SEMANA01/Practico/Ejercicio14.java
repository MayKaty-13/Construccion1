
package SEMANA01.Practico;
import java.util.Scanner;

public class Ejercicio14{
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número de alumnos: ");
        int numA = leer.nextInt();
        
        Alumno14 alumnos[];
        alumnos = new Alumno14[numA];
        
        System.out.println("Ingrese los datos de cada alumno:\n");
        
        for(int i=0;i<numA;i++){
            alumnos[i] = new Alumno14();
            alumnos[i].setDni((1000+i)+"");
            System.out.println("Alumno "+(i+1));
            System.out.println("Nombre: ");
            alumnos[i].setNombre(leer.next());
            System.out.println("Sexo (H ó M): ");
            alumnos[i].setSexo(leer.next());
            System.out.println("------------------------");
        }
        
        int numHombres=0;
        int numMujeres=0;
        for(int i=0;i<numA;i++){
            if(alumnos[i].getSexo().equals("H")){
                numHombres++;
            }else{
                numMujeres++;
            }
        }
        
        System.out.println("Hombres: "+numHombres);
        System.out.println("Mujeres: "+numMujeres);
        
    }
    
}
