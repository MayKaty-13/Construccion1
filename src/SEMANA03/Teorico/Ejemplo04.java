
package SEMANA03.Teorico;

class empresa{
    int a;
    int b;
    empleado p;
    public empresa(empleado c){
        this.p=c;
    }
}
class empleado{
    int a,b;
}
public class Ejemplo04 {
    public static void main(String[] args) {
        empresa c=new empresa(new empleado());
    }
  
}
