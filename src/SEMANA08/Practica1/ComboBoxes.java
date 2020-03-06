
package SEMANA08.Practica1;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxes  extends JFrame {
    public ComboBoxes() {
        super("Combo Boxes");
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComboBox curso = new JComboBox();
        FlowLayout dis = new FlowLayout();
        curso.addItem("Curso de Java");
        curso.addItem("Curso de C++");
        curso.addItem("Curso de PHP");
        curso.addItem("Curso de Flash");
        curso.addItem("Curso de JavaScript");
        curso.addItem("Curso de Java");
        setLayout(dis);
        add(curso);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        ComboBoxes apli = new ComboBoxes();
    }   
}
