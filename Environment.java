import java.util.*;
public class Environment
{
    Party party;
    List<Actor> players=new ArrayList<Actor>();
    List<Enemy> enemies=new ArrayList<Enemy>();
    public Environment(Party p, List<Enemy> e)
    {
        for(int i=0;i<e.size();i++)
        {
            enemies.add(e.get(i));
        }
        for(int i=0;i<p.getActors().size();i++)
        {
            players.add(p.getActors().get(i));
        }
        party=p;
    }
    public List<Actor> getPlayers()
    {
        return players;
    }
    public List<Enemy> getEnemies()
    {
        return enemies;
    }
}
