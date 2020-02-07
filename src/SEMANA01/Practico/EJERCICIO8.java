
package SEMANA01.Practico;



public class EJERCICIO8 {
    public static void main(String[] args) {
        double precio,montoP,MontoTV=0;
        precio=5.5;
         montoP=0; 
        for(int i=0;i<15;i++){
         int ck=aleatorio(1,30);
          if(ck>=10){
            montoP=(double)(ck*precio)*15/100; 
            MontoTV+=montoP;
          }
          else{
                montoP=(double)(ck*precio); 
                MontoTV+=montoP;   
           
          }  
            System.out.println("Cliente "+(i+1)+" : -Cantidad de manzanas a comprar: "+ck+" Kilos   -Monto a pagar: s/. "+montoP);
        }
        System.out.println("La tienda de naranja obtuvo un monto de s/."+MontoTV);
    }
      public static int aleatorio(double max,double min){
        return (int)((max+min-1)*Math.random()+1);
    }
          
}

