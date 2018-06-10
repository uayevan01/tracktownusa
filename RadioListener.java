import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioListener implements ActionListener
{
    Player acting;
    Party actingParty;
    int axisX;
    int axisY;
    Environment env;
    public RadioListener(Player p, Party team, int x, int y, Environment e)
    {
        acting = p;
        actingParty = team;
        axisX = x;
        axisY = y;
        env = e;
    }
    public void actionPerformed(ActionEvent e)
    {

    }
}
