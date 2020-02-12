package TAREA02GestionesSEMANA2;

import java.util.ArrayList;
import TAREA02EntidadesSEMANA2.ClienteNatural;

public class GestionClientesNaturales {
    
    ArrayList<ClienteNatural> cn = new ArrayList<>();

    public ArrayList<ClienteNatural> getCn() {
        return cn;
    }

    public void setCn(ArrayList<ClienteNatural> cn) {
        this.cn = cn;
    }
    
    public void create(String DNI, String nombre, String aPaterno, String aMaterno, String telefono, String correo, String direccion){
        cn.add(new ClienteNatural(DNI, nombre, aPaterno, aMaterno, telefono, correo, direccion));
    }
    
    public void read(int id){
        System.out.println("DNI: "+cn.get(id).getDNI());
        System.out.println("Nombre: "+cn.get(id).getNombre());
        System.out.println("Apellidos: "+cn.get(id).getaPaterno()+" "+cn.get(id).getaMaterno());
        System.out.println("Teléfono: "+cn.get(id).getTelefono());
        System.out.println("Correo: "+cn.get(id).getCorreo());
        System.out.println("Dirección: "+cn.get(id).getDireccion());
    }
    
    public void readAll(){
        for(int i=0;i<cn.size();i++){
            System.out.println("\n--------------------------------");
            System.out.println("DNI: "+cn.get(i).getDNI()+"\n");
            System.out.println("Nombre: "+cn.get(i).getNombre());
            System.out.println("Apellidos: "+cn.get(i).getaPaterno()+" "+cn.get(i).getaMaterno());
            System.out.println("Teléfono: "+cn.get(i).getTelefono());
            System.out.println("Correo: "+cn.get(i).getCorreo());
            System.out.println("Dirección: "+cn.get(i).getDireccion());
        }
    }
    
    public void update(int id, String DNI, String nombre, String aPaterno, String aMaterno, String telefono, String correo, String direccion){
        cn.get(id).setDNI(DNI);
        cn.get(id).setNombre(nombre);
        cn.get(id).setaPaterno(aPaterno);
        cn.get(id).setaMaterno(aMaterno);
        cn.get(id).setTelefono(telefono);
        cn.get(id).setCorreo(correo);
        cn.get(id).setDireccion(direccion);
    }
    
    public void delete(int id){
        cn.remove(id);
    }
    
    public void deleteAll(){
        cn.clear();
    }

    public int retornarID(String DNI){
        int indiceCN = -1;
        for(int i=0;i<cn.size();i++){
            if(cn.get(i).getDNI().equals(DNI)){
                indiceCN = i;
                break;
            }
        }
        return indiceCN;
    }
    
}