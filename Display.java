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
    ButtonGroup groupAt = new ButtonGroup();
    ButtonGroup groupAb = new ButtonGroup();
    public static JMenuBar atBar = new JMenuBar();
    public static JMenuBar abBar = new JMenuBar();
    public static JMenuBar itBar = new JMenuBar();
    public static JMenuBar tarBar = new JMenuBar();
    public static JMenuBar allBar = new JMenuBar();
    JMenu atMenu = new JMenu("Attack");
    JMenu abMenu = new JMenu("Ability casting");
    JMenu itMenu = new JMenu("Item usage");
    JMenu tarMenu = new JMenu("Targeting");
    JMenu allMenu = new JMenu("All targeting");
    JFrame screen = new JFrame("Fight Game");
    Canvas panel = new Canvas();
    JButton attack = new JButton("Attack");
    JButton useAb = new JButton("Use Ability");
    JButton items = new JButton("Items");
    public Display(Player p, Environment e, Party team)
    {
        for(int i = 0; i < p.getAbilities().size(); i++)
        {
            JButton btn = new JButton(p.getAbilities().get(i).getName());
            groupAb.add(btn);
            abBar.add(btn);
            btn.addActionListener(new ButtonListener());
        }

        if(p.isHealer())
        {
            for(int i = 0; i < e.getPlayers().size(); i++)
            {
                JButton btn = new JButton(e.getPlayers().get(i).getName());
                groupAt.add(btn);
                atBar.add(btn);
                btn.addActionListener(new ButtonListener());
            }
        }
        else
        {
            for(int i = 0; i < e.getEnemies().size(); i++)
            {
                JButton btn = new JButton(e.getEnemies().get(i).getName());
                groupAt.add(btn);
                atBar.add(btn);
                btn.addActionListener(new ButtonListener());
            }
        }
        JButton all = new JButton("All");
        allBar.add(all);
    }

    public void run()
    {
        atBar.add(atMenu);
        abBar.add(abMenu);
        tarBar.add(tarMenu);
        allBar.add(allMenu);
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
        screen.add(allBar);
        atBar.setVisible(false);
        abBar.setVisible(false);
        itBar.setVisible(false);
        tarBar.setVisible(false);
        allBar.setVisible(false);
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
