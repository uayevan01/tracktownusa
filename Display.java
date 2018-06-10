import javafx.scene.control.RadioButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
public class Display extends JFrame
{
    public JRadioButton at1, at2, at3;
    public JRadioButton[][] choiceMatrix = new JRadioButton[3][3];
    ButtonGroup groupAt = new ButtonGroup();
    ButtonGroup groupAbTar = new ButtonGroup();
    public static JMenuBar atBar = new JMenuBar();
    public static JMenuBar abBar = new JMenuBar();
    public static JMenuBar itBar = new JMenuBar();
    public static JMenuBar tarBar = new JMenuBar();
    JMenu atMenu = new JMenu("Attack");
    JMenu abMenu = new JMenu("Ability casting");
    JMenu itMenu = new JMenu("Item usage");
    JMenu tarMenu = new JMenu("Targeting");
    JFrame screen = new JFrame("Fight Game");
    Canvas panel = new Canvas();
    JButton attack = new JButton("Attack");
    JButton useAb = new JButton("Use Ability");
    JButton items = new JButton("Items");
    public Display(Player p, Environment e, Party team)
    {
        at1 = new JRadioButton(e.getEnemies().get(0).getName());
        at2 = new JRadioButton(e.getEnemies().get(1).getName());
        if(p.isHealer())
        {
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                {
                    JRadioButton btn = new JRadioButton(p.getAbilities().get(j).getName() + team.getActors().get(i).getName());
                    btn.addActionListener(new RadioListener(p, team, i, j, e));
                    groupAbTar.add(btn);
                    choiceMatrix[i][j] = btn;

                }
        }
        else {
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                {
                    JRadioButton btn = new JRadioButton();
                    btn.addActionListener(new RadioListener(p, team, i, j, e));
                    btn.setName(p.getAbilities().get(j).getName() + e.getEnemies().get(i).getName());
                    groupAbTar.add(btn);
                    choiceMatrix[i][j] = btn;
                }
        }
    }

    public void run()
    {
        groupAt.add(at1);
        groupAt.add(at2);
        groupAt.add(at3);

        atBar.add(atMenu);
        abBar.add(abMenu);
        tarBar.add(tarMenu);
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
            {
                tarBar.add(choiceMatrix[i][j]);
            }
        atBar.add(at1);
        atBar.add(at2);
        attack.addActionListener(new ButtonListener());
        useAb.addActionListener(new ButtonListener());
        items.addActionListener(new ButtonListener());
        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.add(panel);
        panel.add(tarBar, BorderLayout.SOUTH);
        screen.setContentPane(panel);
        screen.setPreferredSize(new Dimension(1600, 900));
        screen.add(attack);
        screen.add(useAb);
        screen.add(items);
        screen.add(atBar);
        screen.add(abBar);
        screen.add(itBar);
        screen.add(tarBar);
        atBar.setVisible(false);
        abBar.setVisible(false);
        itBar.setVisible(false);
        tarBar.setVisible(false);
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
        screen.pack();
    }
}
class Canvas extends JPanel
{
    private Rectangle scoopnum;
    BufferedImage image1;
    BufferedImage ulfeen;
    BufferedImage image3;
    public Canvas()
    {
        scoopnum = new Rectangle(25, 25, 25, 25);
        try
        {
            image1 = ImageIO.read(new File("src//souptime.jpg"));
            ulfeen = ImageIO.read(new File("src//betterulf.jpg"));
        } catch(IOException e)
        {
            e.printStackTrace();
        }
        setBackground(new Color(0, 0, 0));
        setFocusable(true);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.red);
        g2d.fill(scoopnum);
        this.getGraphics().drawImage(image1, 50,300,null);
        this.getGraphics().drawImage(ulfeen, 1000,50,null);
    }


}

