package Demineur;

import javax.swing.*;
import java.awt.*;

public class demineur extends JFrame
{
    public demineur ()
    {
        super("DemineurV1");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        add(new JLabel("Hello World!", SwingConstants.CENTER), BorderLayout.CENTER);
    }
}
