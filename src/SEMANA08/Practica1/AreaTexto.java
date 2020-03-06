
package SEMANA08.Practica1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class AreaTexto extends JFrame{
 public AreaTexto(){
     super("Area Texto");
     setSize(500,180);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JTextArea comentario=new JTextArea(8,40);
     FlowLayout dis=new FlowLayout();
     setLayout(dis);
     add(comentario);
     setVisible(true);
 }
    public static void main(String[] args) {
        AreaTexto app=new AreaTexto();
    }
}
