
package SEMANA03.Practico;

import java.util.*;

class Producto_treeSet implements Comparable{
 private String nombre;
 private int cantidad;

 public Producto_treeSet(String nombre, int x) {
    this.nombre = nombre;
    this.cantidad = x;
 }

  @Override
 public String toString(){
  return ("PRODUCTO: -Nombre: "+nombre+"   -Cantidad: "+cantidad);
 }

 public String getNombre() {
  return this.nombre;
 }

 public boolean equals( Object objeto ) {
   if (objeto == null) return false;
  Producto_treeSet producto = (Producto_treeSet)objeto;
   if (this.getNombre().equals(producto.getNombre()) ) return true;

   return false;
 }

 public int hashCode() {
  return this.getNombre().hashCode();
 }

 public int compareTo( Object objeto ) {
  Producto_treeSet producto = (Producto_treeSet)objeto;
  String nombreObjeto = producto.getNombre().toLowerCase();
  String nombreThis = this.getNombre().toLowerCase();

  return( nombreThis.compareTo( nombreObjeto ) );
 }
}
public class MercadoTreeSet {
 public static void main(String args[]){

    Producto_treeSet pan = new Producto_treeSet("Pan", 6);
    Producto_treeSet leche = new Producto_treeSet("Leche", 4);
    Producto_treeSet manzanas = new Producto_treeSet("Manzanas", 5);
    Producto_treeSet brocoli = new Producto_treeSet("Brocoli", 2);
    Producto_treeSet carne = new Producto_treeSet("Carne", 3);
    Producto_treeSet res = new Producto_treeSet("Res", 8);

    TreeSet lista = new TreeSet();
    lista.add(pan);
    lista.add(leche);
    lista.add(manzanas);
    lista.add(brocoli);
    lista.add(carne);
    lista.add(res);

    System.out.println("--------LISTA DE PRODUCTOS DEL MERCADO:----------");
    mostrarLista(lista);
 }

 public static void mostrarLista(Collection lista) {
    for( Iterator it = lista.iterator(); it.hasNext();) {
        Producto_treeSet producto = (Producto_treeSet)it.next();
        System.out.println(producto);
    }
 }   
}
