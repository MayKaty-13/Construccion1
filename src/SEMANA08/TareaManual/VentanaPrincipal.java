package SEMANA08.TareaManual;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal{
    
    private ArrayList<Alumno> a = new ArrayList<>();
    private DefaultListModel model = new DefaultListModel();
    private JFrame ventanaPrincipal;
    private JDialog ventanaSecundaria;
    
    public VentanaPrincipal(){       
        VP();
    }
    
    private void VP(){
        //Ventana principal
        ventanaPrincipal = new JFrame("Ventana principal");
        ventanaPrincipal.setSize(553, 360);
        
        Container contenedor = ventanaPrincipal.getContentPane();
        JPanel panel1 = new JPanel(new GridLayout(3, 1));
        JPanel panel2 = new JPanel(new FlowLayout());
        JPanel panel3 = new JPanel(new FlowLayout());
        JPanel panel4 = new JPanel(new FlowLayout());
        
        JLabel etiqueta1 = new JLabel("ALUMNOS REGISTRADOS");
        
        JList lista = new JList();
        //Rellenar lista de Alumnos
        lista.setModel(model);
        for(int i=0;i<a.size();i++){
            model.addElement(a.get(i).toString());
        }
        
        JButton btRegistrar = new JButton("Registrar Alumno");
        
        contenedor.add(panel1);
        
        panel1.add(panel2);
        panel1.add(panel3);
        panel1.add(panel4);
        panel2.add(etiqueta1);
        panel3.add(lista);
        panel4.add(btRegistrar);
        
        //Ventana secundaria
        ventanaSecundaria = new JDialog(ventanaPrincipal,"Ventana secundaria");
        ventanaSecundaria.setSize(330, 480);
        
        Container contenedorV2 = ventanaSecundaria.getContentPane();
        
        JPanel panel1V2 = new JPanel(new GridLayout(7, 1));
        JPanel panel2V2 = new JPanel(new FlowLayout());
        JPanel panel3V2 = new JPanel(new FlowLayout());
        JPanel panel4V2 = new JPanel(new FlowLayout());
        JPanel panel5V2 = new JPanel(new FlowLayout());
        JPanel panel6V2 = new JPanel(new FlowLayout());
        JPanel panel7V2 = new JPanel(new FlowLayout());
        JPanel panel8V2 = new JPanel(new FlowLayout());
        
        panel1V2.add(panel2V2);
        panel1V2.add(panel3V2);
        panel1V2.add(panel4V2);
        panel1V2.add(panel5V2);
        panel1V2.add(panel6V2);
        panel1V2.add(panel7V2);
        panel1V2.add(panel8V2);

        JLabel lbTitle = new JLabel("REGISTRO DE ALUMNO");
        JLabel lbCodigo = new JLabel("Código");
        JLabel lbNombre = new JLabel("Nombre");
        JLabel lbApellido = new JLabel("Apellido");
        JLabel lbCarrera = new JLabel("Carrera");
        
        JTextField txtCodigo = new JTextField(15);
        JTextField txtNombre = new JTextField(15);
        JTextField txtApellido = new JTextField(15);
        JTextField txtCarrera = new JTextField(15);
        
        JButton btRegistrarV2 = new JButton("Registrar");
        JButton btCancelar = new JButton("Cancelar");
        
        panel2V2.add(lbTitle);
        panel3V2.add(lbCodigo);
        panel3V2.add(txtCodigo);
        panel4V2.add(lbNombre);
        panel4V2.add(txtNombre);
        panel5V2.add(lbApellido);
        panel5V2.add(txtApellido);
        panel6V2.add(lbCarrera);
        panel6V2.add(txtCarrera);
        panel7V2.add(btRegistrarV2);
        panel8V2.add(btCancelar);

        contenedorV2.add(panel1V2);
        //Eventos
        
        //Abrir ventana secundaria
        btRegistrar.addActionListener((ActionEvent e) -> {
            ventanaPrincipal.setVisible(false);
            ventanaSecundaria.setVisible(true);
        });
        
        //Registrar Alumno
        btRegistrarV2.addActionListener((ActionEvent e) -> {
            String codigo, nombre, apellido, carrera;
            codigo = txtCodigo.getText();
            nombre = txtNombre.getText();
            apellido = txtApellido.getText();
            carrera = txtCarrera.getText();

            a.add(new Alumno(codigo, nombre, apellido, carrera));
            JOptionPane.showMessageDialog(null, "Alumno Registrado.");
            
            txtCodigo.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtCarrera.setText("");
                
            model.clear();
            for(int i=0;i<a.size();i++){
                model.addElement(a.get(i).toString());
            }
                
            ventanaPrincipal.setVisible(true);
            ventanaSecundaria.setVisible(false);
        });
        
        //Cancelar Registro
        btCancelar.addActionListener((ActionEvent e) -> {
            txtCodigo.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtCarrera.setText("");
            
            model.clear();
            for(int i=0;i<a.size();i++){
                model.addElement(a.get(i).toString());
            }
            
            ventanaPrincipal.setVisible(true);
            ventanaSecundaria.setVisible(false);
        });
        
        //Cerrar ventana secundaria
        ventanaSecundaria.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                txtCodigo.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtCarrera.setText("");
                
                model.clear();
                for(int i=0;i<a.size();i++){
                    model.addElement(a.get(i).toString());
                }
                
                ventanaPrincipal.setVisible(true);
                ventanaSecundaria.setVisible(false);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                txtCodigo.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtCarrera.setText("");
                
                model.clear();
                for(int i=0;i<a.size();i++){
                    model.addElement(a.get(i).toString());
                }
                
                ventanaPrincipal.setVisible(true);
                ventanaSecundaria.setVisible(false);
            }
        });
        
        ventanaPrincipal.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
        ventanaPrincipal.setVisible(true);
    }
    
    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal1 = new VentanaPrincipal();
    }
    
}