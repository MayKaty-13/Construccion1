package TAREA02GestionesSEMANA2;

import java.util.ArrayList;
import TAREA02EntidadesSEMANA2.ClienteJuridico;

public class GestionClientesJuridicos {
    
    private ArrayList<ClienteJuridico> cj = new ArrayList<>();

    public ArrayList<ClienteJuridico> getCj() {
        return cj;
    }

    public void setCj(ArrayList<ClienteJuridico> cj) {
        this.cj = cj;
    }
    
    public void create(String nombreT, String RUC, String telefono, String correo, String direccion){
        cj.add(new ClienteJuridico(nombreT, RUC, telefono, correo, direccion));
    }
    
    public void read(int id){
        System.out.println("Nombre de la Tienda: "+cj.get(id).getNombreT());
        System.out.println("RUC: "+cj.get(id).getRUC());
        System.out.println("Teléfono: "+cj.get(id).getTelefono());
        System.out.println("Correo: "+cj.get(id).getCorreo());
        System.out.println("Dirección: "+cj.get(id).getDireccion());
    }
    
    public void readAll(){
        for(int i=0;i<cj.size();i++){
            System.out.println("\n--------------------------------");
            System.out.println("Nombre de la Tienda: "+cj.get(i).getNombreT()+"\n");
            System.out.println("RUC: "+cj.get(i).getRUC());
            System.out.println("Teléfono: "+cj.get(i).getTelefono());
            System.out.println("Correo: "+cj.get(i).getCorreo());
            System.out.println("Dirección: "+cj.get(i).getDireccion());
        }
    }
    
    public void update(int id, String nombreT, String RUC, String telefono, String correo, String direccion){
        cj.get(id).setNombreT(nombreT);
        cj.get(id).setRUC(RUC);
        cj.get(id).setTelefono(telefono);
        cj.get(id).setCorreo(correo);
        cj.get(id).setDireccion(direccion);
    }
    
    public void delete(int id){
        cj.remove(id);
    }
    
    public void deleteAll(){
        cj.clear();
    }
    
    public int retornarID(String RUC){
        int indiceCJ = -1;
        for(int i=0;i<cj.size();i++){
            if(cj.get(i).getRUC().equals(RUC)){
                indiceCJ = i;
                break;
            }
        }
        return indiceCJ;
    }
    
}