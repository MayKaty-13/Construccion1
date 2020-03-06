
package SEMANA08.Practica1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CampoTexto extends JFrame {
   public CampoTexto() {
        super("CampoTexto");
        setSize(400, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiquetaPagina = new JLabel("Dirección página web: ",JLabel.RIGHT);
        JTextField direccionPagina = new JTextField("Escribe aquí", 30);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(etiquetaPagina);
        add(direccionPagina);
        setVisible(true);
        
    }

    public static void main(String[] arguments) {
        CampoTexto apli = new CampoTexto();
    }  
}
