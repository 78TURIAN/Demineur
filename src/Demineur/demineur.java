package Demineur;

import javax.swing.*;
import java.awt.*;

public class demineur extends JFrame
{

    private static final int LIGNES = 10;
    private static final int COLONNES = 10;
    private final JButton[][] bouttons = new JButton[LIGNES][COLONNES];

    public demineur ()
    {
        super("DemineurV2");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(LIGNES, COLONNES));

        JPanel grid = new JPanel(new GridLayout(LIGNES, COLONNES));

        grid.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));

        //création des bouttons et affichage de ceux ci
        for(int i = 0; i < LIGNES; i++)
        {
            for(int j = 0; j < COLONNES; j++)
            {
                JButton b = new JButton();
                b.setFocusPainted(false);
                b.setMargin(new Insets(10,10,0,0));
                bouttons[i][j] = b;
                grid.add(b);
            }
        }
        add(grid, BorderLayout.CENTER);
        pack();//adapte la taille de la fenetre aux composants de cette dernière, ici la grille du jeu.
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
