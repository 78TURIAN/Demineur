import Demineur.demineur;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new demineur().setVisible(true));
    }
}