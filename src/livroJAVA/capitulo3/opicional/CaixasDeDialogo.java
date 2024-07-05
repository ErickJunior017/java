package livroJAVA.capitulo3.opicional;

import javax.swing.JOptionPane;

public class CaixasDeDialogo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what's your name?");
        String message = String.format("Welcome, %s, to Java Programming", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
