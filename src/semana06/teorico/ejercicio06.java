/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana06.teorico;

/**
 *
 * @author BRYANROY
 */
interface Ipersisten{
    public void save(Object o);
}
class Person{
    private String name;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
}
class dataMySql implements Ipersisten{
    public void save(Object o) {
        if(o instanceof Person){
            System.out.println("La persona fue almacenada!!");
        }
    }
}
class dataoracle implements Ipersisten{
    public void save(Object o) {
        if(o instanceof Person){
            System.out.println("La persona fue almacenada!!");
        }
    }
}
class servicioPerson{
   Ipersisten ipersisten;
   void setipersistem(Ipersisten ipersisten){
       this.ipersisten=ipersisten;
   }
   void saveperson(Person p){
       ipersisten.save(p);
   }
}
public class ejercicio06 {
    public static void main(String[] args){
        Ipersisten conecmysql=new dataMySql();
        servicioPerson ser=new servicioPerson();
        ser.setipersistem(new dataoracle());
        ser.saveperson(new Person());
    }
}
