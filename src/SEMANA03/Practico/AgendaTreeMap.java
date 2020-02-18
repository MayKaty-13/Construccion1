
package SEMANA03.Practico;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class AgendaTreeMap {
 public static void main(String args[]){
    TreeMap agenda = new TreeMap();

    agenda.put("Doctor", "(+52)-4000-5000");
    agenda.put("Casa", "(888)-4500-3400");
    agenda.put("Hermano", "(575)-2042-3233");
    agenda.put("Tio", "(421)-1010-0020");
    agenda.put("Suegros", "(334)-6105-4334");
    agenda.put("Oficina", "(304)-5205-8454");
    agenda.put("Abogado", "(756)-1205-3454");
    agenda.put("Papa", "(55)-9555-3270");
    agenda.put("Tienda", "(874)-2400-8600");

    mostrarMapa(agenda);

    SortedMap agendaAO = agenda.subMap("A", "O");
    SortedMap agendaPZ = agenda.tailMap("P");

    System.out.println("\n---- Agenda A-O: ----");
    mostrarMapa(agendaAO);

    System.out.println("\n---- Agenda P-Z :----");
    mostrarMapa(agendaPZ);
 }

 public static void mostrarMapa(Map agenda) {
    System.out.println(" AGENDA CON "+ agenda.size()+" TELEFONOS");
    for( Iterator it = agenda.keySet().iterator(); it.hasNext();) {
        String clave = (String)it.next();
        String valor = (String)agenda.get(clave);
        System.out.println(clave + "  : " + valor);
    }
 }   
}
