public class Ability
{
  private String name;
  private String desc;
  private int cost;
  private int level;
  private boolean doesDamage;
  private int code;
  public Ability(String aName, String aDesc, int mC, int lv, boolean damaging, int abilityCode)
  {
    name = aName;
    desc = aDesc;
    cost = mC;
    level = lv;
    doesDamage = damaging;
    code = abilityCode;
  }
  public String getName()
  {
    return name;
  }
  public String getDesc()
  {
    return desc;
  }
  public int getCost()
  {
    return cost;
  }
  public boolean doesDamage()
  {
    return doesDamage;
  }
  public int getCode()
  {
    return code;
  }
}