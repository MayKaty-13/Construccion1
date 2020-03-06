
package SEMANA08.Practica1;

import javax.swing.JFrame;


public class DosMarcos extends JFrame {
    public DosMarcos() {
        super("Primer Marco");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SecondFrame two = new SecondFrame();
        setVisible(true);
        two.setVisible(true);
    }

    public static void main(String[] arguments) {
        DosMarcos tf = new DosMarcos();
    }
}

class SecondFrame extends JFrame {
    SecondFrame() {
        super("Segundo Marco");
        setSize(150, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
