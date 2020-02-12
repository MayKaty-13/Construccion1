
package TAREA01SEMANA2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in); 
      ArrayList<Asistente> miasistente=new ArrayList<>();
      Asistente asistentes=new Asistente();
      Metodos me=new Metodos();
      Evento ev=new Evento();
      Boleto bol=new Boleto();
      int opcion;
      double GananciaA=0;
      me.generarBoleto(); 
      me.generarExpositor();
      me.generarEvento();
      do{
          System.out.println("-----------------MENU DE OPCIONES---------------");
          System.out.println("1: Mostar Evento");
          System.out.println("2: Ingresar persona asistente");
          System.out.println("3: Venta de Entradas");
          System.out.println("4: Lista Asistentes a los eventos");
          System.out.println("5: Facturas");
          System.out.println("6: Salir ");
          
          System.out.println("Ingrese una opcion: ");
          opcion=leer.nextInt();
          switch(opcion){
              case 1:
                     System.out.println("--------------LISTA DE EVENTOS:-------------");
                     me.mostrarEvento(); 
                  break;
              case 2:
                  asistentes.ingresarAsistente();
                  miasistente.add(asistentes);
                  break;
              case 3:
                  me.mostrarBoleto();
                    System.out.println("Ingrese su codigo: ");
                   String codA=leer.next();
                   System.out.println("Ingrese el codigo del evento al que desea asistir: ");
                     int codE=leer.nextInt(); 
                     System.out.println("Ingrese el codigo de la ubicacion en la que desea estar: ");
                    String codB=leer.next();
                    me.ventaEntrada(codA, codE, codB);
                  break;
              case 4:
                  System.out.println("-------------------------------------LISTA DE ASISTENTES:-------------------------");
                  for(int i=0;i<miasistente.size();i++){  
                      System.out.print("Asistente "+(i+1)+" : ");  
                      asistentes.mostrarAsistente();
                      System.out.println();
                  } 
                  break;
              case 5:
                  System.out.println("---------------------LISTA DE FACTURAS------------------------");
                  for(int i=0;i<miasistente.size();i++){  
                      System.out.print("Asistente "+(i+1)+" : ");  
                      asistentes.mostrarAsistenteDeuda();
                      System.out.println();
                  } 
                   System.out.println("---------------------------------------");
                   System.out.println("Ganancia Total: "+me.getGananciaA());
                  break;
              case 6:
                  break;
          }
      }while(opcion!=6);
    }
  
}
