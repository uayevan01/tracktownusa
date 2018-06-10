import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener
{

    ButtonListener(){}
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
            if(Display.tarBar.isVisible())
            {
                Display.tarBar.setVisible(false);
            }
            else
            {
                Display.tarBar.setVisible(true);
            }
        }
        else if(e.getActionCommand().equals("Items"))
        {
            if(Display.itBar.isVisible())
                Display.itBar.setVisible(false);
            else
                Display.itBar.setVisible(true);
        }
    }

}
