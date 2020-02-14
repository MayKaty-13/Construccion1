
package SEMANA03.Practico;
class CPU{
  private String tipo;
  public CPU(){
      tipo="";
  }

    public CPU(String tipo) {
        this.tipo = tipo;
    }
  
  public void mostrarCPU(){
      System.out.println("Cuenta con un tipo de CPU :"+tipo);
  }  
}
class Pantalla{
  private String marca;
  public Pantalla(){
      marca="";
  }

    public Pantalla(String marca) {
        this.marca = marca;
    }
  
  public void mostrarPantalla(){
      System.out.println("Cuenta con una marca de Pantalla : "+marca);
  }  
}
class Teclado{
  private String tamaño;
  public Teclado(){
      tamaño="";
  }

    public Teclado(String tamaño) {
        this.tamaño = tamaño;
    }
  
  public void mostrarTeclado(){
      System.out.println("Cuenta con un tipo de tamaño de Teclado : "+tamaño);
  }  
}
class Mouse{
  private String color;
  public Mouse(){
      color="";
  }

    public Mouse(String color) {
        this.color = color;
    }
  
  public void mostrarMouse(){
      System.out.println("Cuenta con un tipo de color de Mouse: "+color);
  }  
}
public class Ordenador5 {
   private CPU cpu;
   private Pantalla pantalla;
   private Teclado teclado;
   private Mouse mouse;

    public Ordenador5(){
        cpu=new CPU("Parado");
        pantalla=new Pantalla("LCD");
        teclado=new Teclado(" Grande");
        mouse=new Mouse("Negro");
    }
    public void MostrarOrdenador(){
        System.out.println("El ORDENADOR CUENTA CON:");
        cpu.mostrarCPU();
        pantalla.mostrarPantalla();
        teclado.mostrarTeclado();
        mouse.mostrarMouse();
    }
   
    public static void main(String[] args) {
      Ordenador5 or=new Ordenador5();
      or.MostrarOrdenador();
    }
}
