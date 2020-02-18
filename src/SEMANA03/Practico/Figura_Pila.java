
package SEMANA03.Practico;

class node{
  figura dato;
    node sgte;
    node ante;
    public node(figura fig){
        this.dato=fig;
        this.ante=this.sgte=null;
    }
}
class figura{
    private String nombre;

    public figura(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + '}';
    }  
}

class method {
    node ultimo;
    public method(){
        this.ultimo=null;
    }
    
    void mostrar(){
    node temp=ultimo;
    while(temp!=null){
        System.out.println(temp.dato.toString());
        temp=temp.sgte;
    }
  }
    void ingresar(figura fig){
    node newnodo= new node(fig);
    if(ultimo==null){
        ultimo=newnodo;
    }
    else{
        newnodo.sgte=ultimo;
        ultimo=newnodo;
    }
  }
    void sacarPila(){
        node temp=ultimo;
        if(ultimo==null){
            System.out.println("Lista vacia!!");
        }else if(temp.sgte==null){
            ultimo=null;
        }else{
          while(temp!=null){
            if(temp.sgte.sgte==null){
                temp.sgte=null;
                break;
            }
            temp=temp.sgte;
          }  
        }
    }
}

public class Figura_Pila {
    public static void main(String[] args) {
     method metodo=new method();
     metodo.ingresar(new figura("Circulo"));
     metodo.ingresar(new figura("Triangulo"));
     metodo.ingresar(new figura("Cuadrado"));
     metodo.ingresar(new figura("Rectangulo"));
     metodo.ingresar(new figura("Rombo"));
     System.out.println("------------LISTA DE FIGURAS: ---------------");
     metodo.mostrar();
     metodo.sacarPila();
     System.out.println("\n-------------SACAR POR PILA:---------");
     metodo.mostrar();
    }
   
}
