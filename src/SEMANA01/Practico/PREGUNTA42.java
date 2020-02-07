
package SEMANA01.Practico;

import java.util.ArrayList;

public class PREGUNTA42 {
    public static void main(String[] args) {
        System.out.println("Votos Aleatorios otorgados a los candidatos");
        Candidato c1=new Candidato("Candidato Nro1");
        Candidato c2=new Candidato("Candidato Nro2");
        Candidato c3=new Candidato("Candidato Nro3");
        
        for(int i=0;i<250000;i++){
            int votos=Aleatorio(3, 1);
            if(votos==1){  
                c1.Votos.add(1);
            }
            if(votos==2){
                c2.Votos.add(2);
            }
            if(votos==3){
                c3.Votos.add(3);
            }
        }
        
        if(c1.tamaño()>c2.tamaño()||c1.tamaño()>c3.tamaño()){
            System.out.println("El ganador es: \n"+c1.toString());
        }else{
            if(c2.tamaño()>c1.tamaño()||c2.tamaño()>c3.tamaño()){
            System.out.println("El ganador es: \n"+c2.toString());
        }else{
               if(c3.tamaño()>c1.tamaño()||c3.tamaño()>c2.tamaño()){
            System.out.println("El ganador es: \n"+c3.toString());
        } 
            }
        }    
    }
    public static int Aleatorio(int max,int min){
        return  (int)((max+min-1)*Math.random()+min);
    }
}
class Candidato{
    String Nombre;
    ArrayList<Integer> Votos=new ArrayList<>();

    public Candidato(String Nombre) {
        this.Nombre = Nombre;
    }
    public int tamaño(){
        return Votos.size();
    }

    @Override
    public String toString() {
        return "Nombre:  "+Nombre+"  Cantidad de Votos: " + this.tamaño() ;
    } 
}
    
