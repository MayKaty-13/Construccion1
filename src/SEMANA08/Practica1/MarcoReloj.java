
package SEMANA08.Practica1;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class MarcoReloj extends JFrame {
    public MarcoReloj() {
        super("Reloj");
        setSize(300, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        PanelReloj tiempo= new PanelReloj();
        add(tiempo);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        MarcoReloj reloj = new MarcoReloj();
    }
    
}
