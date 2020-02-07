
package SEMANA02.Teorico;


public class Doctor {
  private int id;
  private String name;

  public Doctor(int x, String cad){
      this.id=x;
      this.name=cad;
  }
    @Override
    public String toString() {
        return  "ID=" + id + ", Nombre=" + name ;
    }

}
