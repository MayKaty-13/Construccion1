
package SEMANA01.Practico;

import java.util.ArrayList;
import java.util.Scanner;

public class EJERCICIO13 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n;
        do{
         System.out.println("Ingresa el numero de obreros:  ");
        n = leer.nextInt();   
        }while(n<0);
        ArrayList<Obrero> obreros=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Ingresa las Horas trabajadas por el obrero "+(i+1)+" :");
            int horas=leer.nextInt();
            double salario=0;
            if(horas<=40){
                salario=horas*20;
            }else{
                int horaE=horas-40;
                salario=40*20;
                salario+=(horaE*25);
            }
            Obrero ob=new Obrero(salario, horas);
            obreros.add(ob);
        }
        System.out.println("---------------------------------------------------------------------");
        mostrar(obreros);
        
    }
    public static void mostrar(ArrayList<Obrero> Obreros){
        for(int i=0;i<Obreros.size();i++){
            System.out.println("Obrero "+(i+1)+" :  -Horas Trabajadas "+Obreros.get(i).horas_trabajadas+"   -Salario: s/. "+Obreros.get(i).salario);
        }
    }
 }
class Obrero{
    double salario;
    int horas_trabajadas;

    public Obrero(double salario, int horas_trabajadas) {
        this.salario = salario;
        this.horas_trabajadas = horas_trabajadas;
    }   
}
