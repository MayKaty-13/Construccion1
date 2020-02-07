
package SEMANA02.Practico;
class rectangulo{
  int b,a;  
  public void CalcularAreaRectangulo(int base,int altura){
    double AR=base*altura;
     System.out.println("El area del rectangulo de base "+base+" y altura "+altura+" es de: "+AR);
 }
}
class triangulo{
 int base,altura;
  public void CalcularAreaTriangulo(int base,int altura){
    double AT=(base*altura)/2;
     System.out.println("El area del triangulo de base "+base+" y altura "+altura+" es de: "+AT);
 }
}
class cuadrado{
  int lado;
 public void CalcularAreaCuadrado(int lado){
    double AC=Math.pow(2,lado);
     System.out.println("El area del cuadrado de lado "+lado+" es de: "+AC);
 }  
}
public class Ejercicio02 {
    public static void main(String[] args) {
        rectangulo rect=new rectangulo();
        triangulo tria=new triangulo();
        cuadrado cua=new cuadrado();
        
        rect.CalcularAreaRectangulo(3, 6);
        tria.CalcularAreaTriangulo(5, 2);
        cua.CalcularAreaCuadrado(4);
    }
  
}
