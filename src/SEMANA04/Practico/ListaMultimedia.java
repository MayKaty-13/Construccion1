
package SEMANA04.Practico;

import java.util.ArrayList;

class Disco extends Formato{
    private String titulo;
    private String autor;
   public Disco(){
       super();
   }
    public Disco(String titulo, String autor, String formato, String genero, double precio) {
        super(formato, genero, precio);
        this.titulo = titulo;
        this.autor = autor;
    }


    @Override
    public String toString() {
        return "\nDISCO :" + "  titulo=" + titulo + "   autor=" + autor +this.toStringFormato()+this.toStringGenero()+this.toStringValor();
    }
   
   
}
class Formato extends Genero{
 private String formato;
    public Formato(){
        super();
        formato=null;
    }
    public Formato(String formato, String genero, double precio) {
        super(genero, precio);
        this.formato = formato;
    }
    
    public String toStringFormato() {
        super.toStringGenero();
        return  "         formato=" + formato;
        
    }
   
    
}
class Genero extends Valor{
 private String genero;
   public Genero(){
       super();
      genero=null;
   }
    public Genero(String genero, double precio) {
        super(precio);
        this.genero = genero;
    }

    public String toStringGenero() {
         super.toStringValor();
        return  "      genero=" + genero;
    }
  
}
class Valor{
    private double precio;
  public Valor(){
     precio=0; 
  }
    public Valor(double precio) {
        this.precio = precio;
    }

    public String toStringValor() {
        return  "       precio=" + precio ;
    }

}
public class ListaMultimedia {
  ArrayList<Disco> ld=new ArrayList<>();
      public void agregarDisco(Disco d){
      ld.add(d);
     }
     public void mostrarLista(){
        System.out.println("------------------------------------------LISTA DE DISCOS:---------------------------------------------");
        System.out.println(ld.toString());
     }     
    public static void main(String[] args) {
      ListaMultimedia lm=new ListaMultimedia(); 
      lm.agregarDisco(new Disco("LA PRIMAVERA"," Jose Salvador"," Serenata","mp3",10.00));
      lm.agregarDisco(new Disco("TE AMO AMOR"," Joan Silvestre"," Romantico","mp4",15.00)); 
      lm.agregarDisco(new Disco("LAS ROSAS"," Dennis Montero "," Cumbia","mp3",12.00)); 
      lm.mostrarLista();

       
    }
}
