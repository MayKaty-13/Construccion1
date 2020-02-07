
package SEMANA01.Practico;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número de alumnos: ");
        int numA = leer.nextInt();
        
        Alumno18 alumnos[];
        alumnos = new Alumno18[numA];
        
        System.out.println("Ingrese los datos de cada alumno:\n");
        
       for(int i=0;i<numA;i++){
            alumnos[i] = new Alumno18();
            alumnos[i].setDni((1000+i)+"");
            System.out.println("Alumno "+(i+1));
            
            System.out.println("Nombre: ");
            alumnos[i].setNombre(leer.next());
            
            System.out.println("Edad: ");
            alumnos[i].setEdad(leer.nextInt());
            
            System.out.println("Sexo (H ó M): ");
            alumnos[i].setSexo(leer.next());
            System.out.println("------------------------");
        }
        
        int numHombres=0;
        int numMujeres=0;
        double promEH=0;//Promedio de Edades de Hombres
        double promEM=0;//Promedio de Edades de Mujeres
        double promEG=0;//Promedio de Edades General
        
        for(int i=0;i<numA;i++){
            promEG += alumnos[i].getEdad();
            if(alumnos[i].getSexo().equals("H")){
                numHombres++;
                promEH += alumnos[i].getEdad();    
            }else{
                numMujeres++;
                promEM += alumnos[i].getEdad();
            }
        }
        
        promEH = promEH/numHombres;
        promEM = promEM/numMujeres;
        promEG = promEG/numA;
        
        System.out.println("Promedio de edades de Hombres: "+promEH);
        System.out.println("Promedio de edades de Mujeres: "+promEM);
        System.out.println("Promedio general de edades de los alumnos: "+promEG);
        
    }
     
}
