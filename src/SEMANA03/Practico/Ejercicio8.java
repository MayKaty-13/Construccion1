
package SEMANA03.Practico;

import java.text.DecimalFormat;
import java.util.ArrayList;

class worker{
    DecimalFormat fo=new DecimalFormat("###.##");
    private String codigo;
    private String nombre;
    private String areaLaboral;
    private double sueldo;
    private int hextras;
    private String afiliacion;

    public worker(String codigo, String nombre, String areaLaboral, double sueldo, int hextras, String afiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaLaboral = areaLaboral;
        this.sueldo = sueldo;
        this.hextras = hextras;
        this.afiliacion = afiliacion;
    }

    public String getAreaLaboral() {
        return areaLaboral;
    }

    public String getNombre() {
        return nombre;
    }
    
    public double montoHextras(){
      return (sueldo*hextras)/240;  
    }
    public double montoseguro(){
       if(afiliacion.equals("AFP"))
           return sueldo*0.17;
       else
           return sueldo*0.05;
    }
    public double montoessalud(){
     return sueldo*0.03;   
    }
    public double montodescuento(){
        return this.montoseguro()+this.montoessalud();
    }
    public double montosueldobruto(){
        return this.sueldo+this.montoHextras();
    }
    public double sueldoneto(){
        return this.montosueldobruto()-this.montodescuento();
    }

    @Override
    public String toString() {
        return  "\nEMPLEADO:  codigo=" + codigo + ", nombre=" + nombre + ", areaLaboral=" + areaLaboral + ", sueldo=" + sueldo + ", hextras=" + hextras + ", afiliacion=" + afiliacion 
                +"\n-Horas Extra: "+fo.format(montoHextras())+"  -Monto seguro: "+ fo.format(montoseguro())+"  -MontoEssalud: "+fo.format(montoessalud())+"  -MontoDescuento: "+fo.format(montodescuento())+"  -MontoSueldoBruto: "+fo.format(montosueldobruto())+"  -SueldoNeto: "+fo.format(sueldoneto());
    }
}
class Persona{
  ArrayList<worker> miworker=new ArrayList<>();
  public void generarDatos(){
     String laboral[]={"Sistemas","Administracion","Marketing"};
      String afi[]={"AFP","SNP"};
      miworker.add(new worker("1","Jose",laboral[aleatorio(0,3)],2000,10,afi[aleatorio(0,2)])); 
      miworker.add(new worker("2","Marcos",laboral[aleatorio(0,3)],3000,15,afi[aleatorio(0,2)]));
      miworker.add(new worker("3","Juan",laboral[aleatorio(0,3)],3500,20,afi[aleatorio(0,2)]));
      miworker.add(new worker("4","Luis",laboral[aleatorio(0,3)],2500,5,afi[aleatorio(0,2)]));
      miworker.add(new worker("5","Daniel",laboral[aleatorio(0,3)],2700,17,afi[aleatorio(0,2)]));
  }
  public void mostrarDatos(){
      System.out.println("-----------------LISTA DE EMPLEADOS:------------------------------");  
      System.out.println(miworker.toString());      
      
  }
  static int aleatorio(int min,int max){
      return (int)(Math.random()*(max+min-1)+min);
  } 
}

public class Ejercicio8 {
    public static void main(String[] args) {   
     Persona per=new Persona();
     per.generarDatos();
     per.mostrarDatos();
    }
}
