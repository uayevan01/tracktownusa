import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Attack"))
        {
            if(Display.atBar.isVisible())
                Display.atBar.setVisible(false);
            else
                Display.atBar.setVisible(true);
        }
        else if(e.getActionCommand().equals("Use Ability"))
        {
            if(Display.abBar.isVisible())
            {
                Display.abBar.setVisible(false);
            }
            else
            {
                Display.abBar.setVisible(true);
            }
        }


    }

}
